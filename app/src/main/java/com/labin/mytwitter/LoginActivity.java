package com.labin.mytwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.labin.mytwitter.serverresponse.SignUpResponse;

public class LoginActivity extends AppCompatActivity {
     Button btnLogin;
     EditText et_username, etpassword;
     TextView tvSignup;
     public static String Token="";
     int i= 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_username = findViewById(R.id.et_username);
        etpassword = findViewById(R.id.et_password);
        tvSignup = findViewById(R.id.tv_sign_up);
        btnLogin = findViewById(R.id.btn_login);


        tvSignup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, CreateAccountActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login(); }
        });
    }
    private void login() {
        String username = et_username.getText().toString();
        String password = etpassword.getText().toString();

       // loginBLL loginBLL = new LoginBLL();

       // StrictModeClass.StrictMode();
        //if (loginBLL.checkUser(username, password)) {
           // Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            //startActivity(intent);
            //finish();
        //} else {
            Toast.makeText(this, "Either username or password is incorrect", Toast.LENGTH_SHORT).show();
            et_username.requestFocus();
        }
    }

