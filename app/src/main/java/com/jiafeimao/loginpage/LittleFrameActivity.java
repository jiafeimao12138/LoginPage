package com.jiafeimao.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class LittleFrameActivity extends FrameActivity {
    public void gotoFiles(MenuItem item) {
        gotoActivity(FriendsUpload.class);
    }

    public void gotoChat(MenuItem item) {
        gotoActivity(FriendsChatList.class);
    }

    public void gotoMembers(MenuItem item) {
        gotoActivity(FriendsMemberList.class);
    }
}
