package com.jiafeimao.loginpage;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FriendsChainA extends FrameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_chain_a);
    }

    public void gotoTopic(View view) {
        gotoActivity(FriendsUpload.class);
    }
}
