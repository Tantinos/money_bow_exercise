package com.example.euagg.moneybowexercise.activity.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.euagg.moneybowexercise.R;
import com.example.euagg.moneybowexercise.activity.InternetConnection;
import com.example.euagg.moneybowexercise.activity.Variables;
import com.example.euagg.moneybowexercise.activity.model.Product;
import com.example.euagg.moneybowexercise.activity.model.RequestInvest;
import com.example.euagg.moneybowexercise.activity.model.RequestModel;
import com.google.gson.Gson;
import com.shashank.sony.fancytoastlib.FancyToast;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class UserAccountActivity extends Activity {

    // Activity parameters
    static String bearerToken;
    static boolean requestCode200;
    static String requestResponse,email,password;
    RelativeLayout isaLayout, generalLayout;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_user_account);

        isaLayout = (RelativeLayout)findViewById(R.id.isaAccount);
        generalLayout = (RelativeLayout)findViewById(R.id.generalAccount);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        // Get token, email and password from previous activity
        Intent intent = getIntent();
        bearerToken = intent.getExtras().getString("BearerToken");
        email = intent.getExtras().getString("email");
        password = intent.getExtras().getString("password");

        try {
            // Check for internet connection
            if(InternetConnection.isConnected()) {
                new RetrieveAccountDetails().execute();
            }else {
                FancyToast.makeText(this,getResources().getString(R.string.no_internet),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Button when user press button to navigate to ISA Activity
    public void NavigateToIsaDetails(View view) {

        try {
            if(InternetConnection.isConnected()) {
                if(requestCode200){
                    Intent intent = new Intent(UserAccountActivity.this, IsaActivity.class);
                    intent.putExtra("productObject", String.valueOf(requestResponse));
                    intent.putExtra("BearerToken",bearerToken);
                    startActivity(intent);
                    finish();
                }
            }else {
                FancyToast.makeText(this,getResources().getString(R.string.no_internet),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Button when user press button to navigate to GIA Activity
    public void NavigateToGiaDetails(View view) {
        try {
            if(InternetConnection.isConnected()) {
                if(requestCode200){
                    Intent intent = new Intent(UserAccountActivity.this, GiaActivity.class);
                    intent.putExtra("productObject", String.valueOf(requestResponse));
                    intent.putExtra("BearerToken",bearerToken);
                    startActivity(intent);
                    finish();
                }
            }else {
                FancyToast.makeText(this,getResources().getString(R.string.no_internet),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Code when backpressed
    @Override
    public void onBackPressed(){
         // Display AlertDialog to logout
        new AlertDialog.Builder(UserAccountActivity.this)
                .setTitle(getResources().getString(R.string.logout))
                .setMessage(getResources().getString(R.string.question_logout))
                .setIcon(R.drawable.ic_logout_warning)
                .setPositiveButton(getResources().getString(R.string.yes),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                try {
                                    if(InternetConnection.isConnected()) {
                                        new ProcessLogout().execute();
                                    }else {
                                        Intent intent = new Intent(UserAccountActivity.this,LoginActivity.class);
                                        startActivity(intent);
                                        android.os.Process.killProcess(android.os.Process.myPid());
                                        finish();
                                    }
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                        })
                .setNegativeButton(getResources().getString(R.string.no),
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
    }

    public class ProcessLogout extends  AsyncTask<Void,Void,Void>{

        @Override
        protected void onPreExecute(){
            super.onPreExecute();

            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            // make the web call to logout
            try{
                OkHttpClient client = new OkHttpClient();

                MediaType mediaType = MediaType.parse(Variables.Content_Type);
                RequestBody body = RequestBody.create(mediaType, "Email="+email+"&Password="+password);
                Request request = new Request.Builder()
                        .url(Variables.base_url+Variables.logout_url)
                        .post(body)
                        .addHeader("AppId", Variables.AppId)
                        .addHeader("Content-Type", Variables.Content_Type)
                        .addHeader("appVersion", Variables.appVersion)
                        .addHeader("apiVersion", Variables.apiVersion)
                        .addHeader("Authorization", bearerToken)
                        .addHeader("Cache-Control", "no-cache")
                        .build();

                Response response = client.newCall(request).execute();

                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Request request, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Response response) throws IOException {
                        Intent intent = new Intent(UserAccountActivity.this,LoginActivity.class);
                        startActivity(intent);
                        //progressBar.setVisibility(View.GONE);
                        finish();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    public class RetrieveAccountDetails extends AsyncTask<Void,Void,Response>{

        @Override
        protected void onPreExecute(){
            super.onPreExecute();

            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Response doInBackground(Void... voids) {
            // make payment to get account details
            try{
                OkHttpClient client = new OkHttpClient();

                MediaType mediaType = MediaType.parse(Variables.Content_Type);
                RequestBody body = RequestBody.create(mediaType, "Email="+email+"&Password="+password);
                Request request = new Request.Builder()
                        .url(Variables.base_url+Variables.invest_url)
                        .get()
                        .addHeader("AppId", Variables.AppId)
                        .addHeader("Content-Type", Variables.Content_Type)
                        .addHeader("appVersion", Variables.appVersion)
                        .addHeader("apiVersion", Variables.apiVersion)
                        .addHeader("Authorization", bearerToken)
                        .addHeader("Cache-Control", "no-cache")
                        .build();

                Response response = client.newCall(request).execute();

                client.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Request request, IOException e) {
                        e.printStackTrace();
                    }

                    @Override
                    public void onResponse(Response response) throws IOException {
                        if (!response.isSuccessful()) {
                            UserAccountActivity.this.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    FancyToast.makeText(UserAccountActivity.this,getResources().getString(R.string.no_valid_connection),FancyToast.LENGTH_SHORT,FancyToast.ERROR,false).show();
                                }
                            });
                            throw new IOException("Unexpected code " + response);

                        } else{
                        }
                    }
                });

                return response;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Response result) {
            super.onPostExecute(result);

            if(result.code() == 200){
                requestCode200 = true;
                try{
                    String request = result.body().string();
                    requestResponse = request;

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                requestCode200 = false;
                FancyToast.makeText(UserAccountActivity.this,getResources().getString(R.string.connection_over),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
            }
            progressBar.setVisibility(View.GONE);
        }
    }
}
