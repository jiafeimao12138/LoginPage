package com.jiafeimao.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class RiskMainActivity extends AppCompatActivity {

    ImageButton button1 = null;
    ImageButton button2 = null;
    ImageButton button3 = null;
    ImageButton button4 = null;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.risk_main);
        button1 = (ImageButton)findViewById(R.id.riskreportingButton1);
        button2 = (ImageButton)findViewById(R.id.riskalarmButton1);
        button3 = (ImageButton)findViewById(R.id.evaluatingButton1);
        button4 = (ImageButton)findViewById(R.id.riskrankingButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskMainActivity.this,RiskReportingActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskMainActivity.this,RiskMainActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskMainActivity.this,EvaluatingActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskMainActivity.this,RiskRankingActivity.class);
                startActivity(intent);
            }
        });
    }
}
