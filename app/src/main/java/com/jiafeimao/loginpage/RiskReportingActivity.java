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
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riskreporting);
        button1 = (ImageButton)findViewById(R.id.RiskAlarmingButton);
        button2 = (ImageButton)findViewById(R.id.evaluatingButton3);
        button3 = (ImageButton)findViewById(R.id.ascButton);
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
    }
}
