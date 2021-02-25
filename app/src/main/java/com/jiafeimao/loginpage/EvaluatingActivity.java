package com.jiafeimao.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class EvaluatingActivity extends AppCompatActivity {
    ImageButton button1 = null;
    ImageButton button2 = null;
    ImageButton button3 = null;
    ImageButton button4 = null;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evaluating);
        button1 = (ImageButton)findViewById(R.id.riskreportingButton4);
        button2 = (ImageButton)findViewById(R.id.riskalarmButton4);
        button3 = (ImageButton)findViewById(R.id.evaluatingButton4);
        button4 = (ImageButton)findViewById(R.id.riskrankingButton2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EvaluatingActivity.this,RiskReportingActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EvaluatingActivity.this,RiskMainActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EvaluatingActivity.this,EvaluatingActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(EvaluatingActivity.this,RiskRankingActivity.class);
                startActivity(intent);
            }
        });
    }
}
