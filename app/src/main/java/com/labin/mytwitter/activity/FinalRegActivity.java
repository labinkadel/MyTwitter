package com.labin.mytwitter.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.labin.mytwitter.R;

public class FinalRegActivity extends AppCompatActivity {
    TextView email_final,username_final;
    Button btn_FS_signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_reg);
        email_final=findViewById(R.id.email_final);
        username_final=findViewById(R.id.username_final);
        btn_FS_signup= findViewById(R.id.btn_FS_signup);
        username_final.setText(CreateAccountActivity.Ruser);
        email_final.setText(CreateAccountActivity.Remail);
        btn_FS_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FinalRegActivity.this,verifiActivity.class);
                startActivity(intent);
            }
        });
    }
}
