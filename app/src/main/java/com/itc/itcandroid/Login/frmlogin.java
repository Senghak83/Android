package com.itc.itcandroid.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmlogin extends BaseActivi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmlogin);
    }

    public void logins(View view) {
        Intent fs = new Intent(frmlogin.this,frmsowlogin.class);
        startActivity(fs);
    }

    public void Cencel(View view) {
        onBackPressed();
    }

    public void Regist(View view) {
       Intent fr = new Intent(frmlogin.this,frmregistor.class);
       startActivity(fr);
    }
}
