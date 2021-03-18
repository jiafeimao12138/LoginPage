package com.jiafeimao.loginpage;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FriendsChatList extends LittleFrameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_theme_1);
    }


    public void gotoCommon(View view) {
        gotoActivity(FriendsChatCommon.class);
    }

    public void gotoPrivate(View view) {
        gotoActivity(FriendsChatPrivate.class);
    }
}