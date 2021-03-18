package com.jiafeimao.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BusinessMain extends FrameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplychaintransaction);
    }


    public void gotoFinance(View view) {
        gotoActivity(BusinessFinance.class);
    }
}
