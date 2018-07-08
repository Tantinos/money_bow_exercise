package com.example.euagg.moneybowexercise.activity.activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.euagg.moneybowexercise.R;
import com.example.euagg.moneybowexercise.activity.InternetConnection;
import com.example.euagg.moneybowexercise.activity.Variables;
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

import java.net.URLEncoder;


public class LoginActivity extends AppCompatActivity {

    // Activity parameters
    EditText email, password;
    Button loginBtn;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText)findViewById(R.id.input_email);
        password = (EditText)findViewById(R.id.input_password);
        loginBtn = (Button)findViewById(R.id.login);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);

    }

    // Method to login
    public void LoginBtn(View view) throws IOException, InterruptedException {

        // Check if email field is empty
        if(email.getText().toString().isEmpty()){
            FancyToast.makeText(this,getResources().getString(R.string.empty_email),FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();
        }
        // Check if password field is empty
        else if(password.getText().toString().isEmpty()){
            FancyToast.makeText(this,getResources().getString(R.string.empty_password),FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();
        }
        // Check if email has no valid format
        else if(!CheckEmailFormat(email.getText().toString())){
            FancyToast.makeText(this,getResources().getString(R.string.email_no_valid),FancyToast.LENGTH_LONG,FancyToast.WARNING,false).show();
        }
        else{
            if(InternetConnection.isConnected()) {
                new RetrieveAuthedication().execute();
            }
            else {
                FancyToast.makeText(this,getResources().getString(R.string.no_internet),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
            }
        }
    }

    public class RetrieveAuthedication extends AsyncTask<Void,Void,Response>{

        @Override
        protected void onPreExecute(){
            super.onPreExecute();

            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Response doInBackground(Void... voids) {
            // Make call to login
            try{
                OkHttpClient client = new OkHttpClient();

                MediaType mediaType = MediaType.parse(Variables.Content_Type);
                RequestBody body = RequestBody.create(mediaType,
                        "Email="+URLEncoder.encode(email.getText().toString(),"UTF-8")+
                                "&Password="+URLEncoder.encode(password.getText().toString(),"UTF-8"));
                Request request = new Request.Builder()
                        .url(Variables.base_url+Variables.login_url)
                        .post(body)
                        .addHeader("AppId", Variables.AppId)
                        .addHeader("Content-Type", Variables.Content_Type)
                        .addHeader("appVersion", Variables.appVersion)
                        .addHeader("apiVersion", Variables.apiVersion)
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
                            LoginActivity.this.runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    FancyToast.makeText(LoginActivity.this,getResources().getString(R.string.no_valid_connection),FancyToast.LENGTH_SHORT,FancyToast.ERROR,false).show();
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

             // If response is correct
            if(result.code() == 200){
                try{
                    String request = result.body().string();

                    JSONObject jsonObject = new JSONObject(request);
                    Gson gson = new Gson();
                    final RequestModel m = gson.fromJson(jsonObject.toString(),RequestModel.class);

                    // Navigate to User Account Activity
                    Intent intent = new Intent(LoginActivity.this, UserAccountActivity.class);
                    intent.putExtra("BearerToken","Bearer "+m.getSession().getBearerToken());
                    intent.putExtra("email",URLEncoder.encode(email.getText().toString(),"UTF-8"));
                    intent.putExtra("password",URLEncoder.encode(password.getText().toString(),"UTF-8"));
                    startActivity(intent);
                    finish();

                    Log.i("token",m.getSession().getBearerToken());
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                FancyToast.makeText(LoginActivity.this,getResources().getString(R.string.no_valid_connection),FancyToast.LENGTH_LONG,FancyToast.ERROR,false).show();
            }

            progressBar.setVisibility(View.GONE);
        }
    }

    // Code when backpressed
    @Override
    public void onBackPressed(){
        android.os.Process.killProcess(android.os.Process.myPid());
    }

    // Method to check if email is in correct format
    private boolean CheckEmailFormat(String emailText) {

        return android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches();
    }
}
