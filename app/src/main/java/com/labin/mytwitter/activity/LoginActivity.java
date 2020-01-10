package com.labin.mytwitter.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.labin.mytwitter.R;
import com.labin.mytwitter.TwiteerDashActivity;
import com.labin.mytwitter.api.API;
import com.labin.mytwitter.model.CreateUser;
import com.labin.mytwitter.serverresponse.SignUpResponse;
import com.labin.mytwitter.url.BaseUrl;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    Button btnSignin;
    TextView btnSignup;
    EditText etPhone, etPassword;
    String user,pass,status;
    public static  String userr,token;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignin = findViewById(R.id.btnSignin);
        btnSignup = findViewById(R.id.btnSignup1);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);



        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user=etPhone.getText().toString().trim();

                pass=etPassword.getText().toString().trim();


                if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(pass)) {

                    String username=null,password=pass,email=null,phone=null,profileImage=null,bio=null,interest=null;
                    if(TextUtils.isDigitsOnly(user)){
                        phone=user;
                    }
                    else if (android.util.Patterns.EMAIL_ADDRESS.matcher(user).matches()){
                        email=user;
                    }else{
                        username=user;
                        //Toast.makeText(LoginActivity.this, ""+username, Toast.LENGTH_SHORT).show();
                    }
                    CreateUser createUser =new CreateUser(username,password,phone,email,profileImage,bio,interest);

                    BaseUrl baseUrl = new BaseUrl();
                    Call<SignUpResponse> call = baseUrl.getInstance().create(API.class).login(createUser);
                    StrictMode();

                    try {
                        Response<SignUpResponse> loginResponsesResponse = call.execute();
                        status=loginResponsesResponse.body().getStatus();
                        token=loginResponsesResponse.body().getUsertoken();
                        userr=loginResponsesResponse.body().getUsername();

                        if(status.equals("202")){
                            Intent intent = new Intent(LoginActivity.this, TwiteerDashActivity.class);
                            startActivity(intent);
                        }
                    } catch (IOException e) {
                        Toast.makeText(LoginActivity.this, "Error" + e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        e.printStackTrace();

                    }

                } else {
                    if (TextUtils.isEmpty(user)) {
                        etPhone.setError("Enter Username");
                    }
                    if (TextUtils.isEmpty(pass)) {
                        etPassword.setError("Enter Password");
                    }
                    return;
                }
            }
        });



    }
    private void StrictMode(){
        StrictMode.ThreadPolicy policy= new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

}
