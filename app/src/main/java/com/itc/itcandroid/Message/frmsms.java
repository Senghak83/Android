package com.itc.itcandroid.Message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmsms extends BaseActivi {

    private EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmsms);

        t = findViewById(R.id.txtsms);
    }

    public void sendSMS(View view) {
        String sms = t.getText().toString();
        if(sms.isEmpty())return;
        Intent in = new Intent(this,frmgetSMS.class);
        in.putExtra("s",sms);
        startActivity(in);
    }
}
