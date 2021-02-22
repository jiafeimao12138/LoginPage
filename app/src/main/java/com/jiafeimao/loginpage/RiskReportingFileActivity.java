package com.jiafeimao.loginpage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RiskReportingFileActivity extends AppCompatActivity {
    ImageButton button1 = null;
    ImageButton button2 = null;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riskreportingtwo);
        button1 = (ImageButton)findViewById(R.id.EvaluatingButton4);
        button2 = (ImageButton)findViewById(R.id.riskrankingButton4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskReportingFileActivity.this, EvaluatingActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(RiskReportingFileActivity.this, RiskRankingActivity.class);
                startActivity(intent);
            }
        });
    }
}
