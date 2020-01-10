package com.labin.mytwitter.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.labin.mytwitter.R;

public class AggActivity extends AppCompatActivity {
    Button btn_cus_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agg);
        btn_cus_next=findViewById(R.id.btn_cus_next);


        btn_cus_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AggActivity.this,FinalRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}