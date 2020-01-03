package com.itc.itcandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.itc.itcandroid.Login.frmlogin;
import com.itc.itcandroid.Message.frmsms;
import com.itc.itcandroid.SendObject.frmmail;
import com.itc.itcandroid.ScrollText.frmScroll;
import com.itc.itcandroid.Share_Menu.frmShare;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        Intent in = new Intent(MainActivity.this, frmlogin.class);
        startActivity(in);
        //finish();
    }

    public void sendText(View view) {
        Intent frsms = new Intent(this, frmsms.class);
        startActivity(frsms);
    }

    public void sendObject(View view) {
        startActivity(new Intent(this, frmmail.class));
    }

    public void ScrollText(View view) {
        startActivity(new Intent(this,frmScroll.class));

    }

    public void goShare(View view) {
        startActivity(new Intent(this, frmShare.class));
    }
}
