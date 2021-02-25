package com.jiafeimao.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RiskReportingActivity extends AppCompatActivity {
    ImageButton button1 = null;
    ImageButton button2 = null;
    ImageButton button3 = null;
    ImageButton button4 = null;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riskreporting);
        button1 = (ImageButton)findViewById(R.id.riskalarmButton2);
        button2 = (ImageButton)findViewById(R.id.evaluatingButton2);
        button3 = (ImageButton)findViewById(R.id.ascButton);
        button4 = (ImageButton)findViewById(R.id.riskrankingButton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskReportingActivity.this, RiskMainActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskReportingActivity.this, EvaluatingActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskReportingActivity.this,RiskReportingFileActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskReportingActivity.this,RiskRankingActivity.class);
                startActivity(intent);
            }
        });
    }
}
