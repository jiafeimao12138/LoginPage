package com.jiafeimao.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FriendsMainActivity extends FrameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_mainpage);
    }


    public void gotoChainA(View view) {
        gotoActivity(FriendsChainA.class);
    }
}
