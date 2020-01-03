package com.itc.itcandroid.Message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmgetSMS extends BaseActivi {

    private TextView lbl ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmget_sms);
        lbl = findViewById(R.id.lblDisplay);
        Intent in = getIntent();
        String str = in.getStringExtra("s");
        lbl.setText(str.toString());
    }
}
