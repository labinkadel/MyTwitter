package com.labin.mytwitter.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.labin.mytwitter.R;

public class CameraActivity extends AppCompatActivity {

    ImageView profile;
    Button btn_c_login;
    Uri ImageUri;
    String Phone,Email,status,ProfileImage,Bio,Interest, Password=PasswordActivity.Password,Username=CreateAccountActivity.Ruser,EmailORPhone=CreateAccountActivity.Remail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }
}
