package com.jiafeimao.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RiskMainActivity extends AppCompatActivity {

    ImageButton button = null;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.risk_main);
        button = (ImageButton)findViewById(R.id.riskreportingButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskMainActivity.this,RiskReportingActivity.class);
                startActivity(intent);
            }
        });
    }
}
