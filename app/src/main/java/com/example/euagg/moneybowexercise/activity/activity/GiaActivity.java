package com.example.euagg.moneybowexercise.activity.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.euagg.moneybowexercise.R;
import com.example.euagg.moneybowexercise.activity.InternetConnection;
import com.example.euagg.moneybowexercise.activity.Variables;
import com.example.euagg.moneybowexercise.activity.model.NewMoneyboxValue;
import com.example.euagg.moneybowexercise.activity.model.RequestInvest;
import com.google.gson.Gson;
import com.shashank.sony.fancytoastlib.FancyToast;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

public class GiaActivity extends Activity {

    // Activity variables
    TextView gia_stock,gia_moneybox;
    ProgressBar progressBar;
    NumberFormat format;
    String bearer_token, investorProductId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gia);

        gia_stock = (TextView)findViewById(R.id.giaStock);
        gia_moneybox = (TextView)findViewById(R.id.gia_moneyBox);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        // Get token and object values from previous activity
        Intent intent = getIntent();
        String request = intent.getExtras().getString("productObject");
        bearer_token = intent.getExtras().getString("BearerToken");

        // Convert string to JSONObject
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(request);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        final RequestInvest m = gson.fromJson(jsonObject.toString(),RequestInvest.class);

        // Format integer to currency format
        format = NumberFormat.getCurrencyInstance(Locale.UK);
        String giaStock = format.format(m.getProducts().get(1).getPreviousMoneybox());
        String giaMoney = format.format(m.getProducts().get(1).getMoneybox());

        investorProductId = m.getProducts().get(1).getInvestorProductId().toString();

        gia_stock.setText(giaStock);
        gia_moneybox.setText(getResources().getString(R.string.your_moneybox)+giaMoney);
    }

    // Method when user press the button to make a payment
    public void AddMoneyToGIA(View view) throws IOException, InterruptedException {
        if(InternetConnection.isConnected()) {
            new AddMoneyToGia().execute();
        }else
        {
            FancyToast.makeText(this,getResources().getString(R.string.no_internet),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
        }
    }

    // Code when backpressed
    @Override
    public void onBackPressed(){

        Intent intent = new Intent(GiaActivity.this, UserAccountActivity.class);
        intent.putExtra("BearerToken",bearer_token);
        startActivity(intent);
        finish();
    }


    private class AddMoneyToGia extends AsyncTask<Void,Void,Response>{
        @Override
        protected void onPreExecute(){
            super.onPreExecute();

            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Response doInBackground(Void... voids) {

            // make the web call to make 10 pound payment
            try{
                OkHttpClient client = new OkHttpClient();

                MediaType mediaType = MediaType.parse(Variables.Content_Type);
                RequestBody body = RequestBody.create(mediaType, "Amount="+Variables.AddingValue+"&InvestorProductId="+investorProductId);
                Request request = new Request.Builder()
                        .url(Variables.base_url+Variables.payment_url)
                        .post(body)
                        .addHeader("AppId", Variables.AppId)
                        .addHeader("Content-Type", Variables.Content_Type)
                        .addHeader("appVersion", Variables.appVersion)
                        .addHeader("apiVersion", Variables.apiVersion)
                        .addHeader("Authorization", bearer_token)
                        .addHeader("Cache-Control", "no-cache")
                        .build();

                Response response = client.newCall(request).execute();

                return response;

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Response result) {
            super.onPostExecute(result);

            // code when the web call is correct
            if(result.code()== 200){
                if(!(result == null)){
                    try{
                        String request = result.body().string();

                        JSONObject jsonObject = new JSONObject(request);
                        Gson gson = new Gson();
                        final NewMoneyboxValue m = gson.fromJson(jsonObject.toString(),NewMoneyboxValue.class);

                        String value = format.format(m.getMoneybox());
                        gia_moneybox.setText(getResources().getString(R.string.your_moneybox)+value);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
            }else {

                // Display AlertDialog when token expired
                new AlertDialog.Builder(GiaActivity.this)
                        .setTitle(getResources().getString(R.string.logout))
                        .setMessage(getResources().getString(R.string.connection_over))
                        .setIcon(R.drawable.ic_logout_warning)
                        .setPositiveButton(getResources().getString(R.string.continue_),
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent intent = new Intent(GiaActivity.this, LoginActivity.class);

                                        startActivity(intent);
                                        finish();
                                    }
                                }).show();
            }

            progressBar.setVisibility(View.GONE);
        }
    }
}
