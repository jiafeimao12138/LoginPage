package com.jiafeimao.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class FrameActivity extends AppCompatActivity {
    protected void gotoActivity(Class activityClass){
        Intent intent = new Intent();
        intent.setClass(this,activityClass);
        startActivity(intent);
    }

    public void gotoUser(MenuItem item) {
        gotoActivity(MyBusinessCardActivity.class);
    }

    public void gotoFriends(MenuItem item) {
        gotoActivity(FriendsMainActivity.class);
    }

    public void gotoBusiness(MenuItem item) {
        gotoActivity(BusinessMain.class);
    }
}
