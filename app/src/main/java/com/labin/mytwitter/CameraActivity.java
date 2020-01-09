package com.labin.mytwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
    ImageView Iv_profile;
    Button getBtn_login;
    ImageView iv_profile;
    Button btn_login;
    String password, email, username, imageName;
    String imagePath = "";
    public static String token = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }
}
