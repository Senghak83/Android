package com.itc.itcandroid.SendObject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

import java.util.Date;

public class frmgetmail extends BaseActivi {

    private TextView lmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmgetmail);

        lmail = findViewById(R.id.lgetmaile);
        Intent in = getIntent();
        clsMail mail = (clsMail)in.getSerializableExtra("o");
        //Date d = mail.getDate();

        String ma = "From < "+ mail.getSendto() +"> \n Topic : "+
                mail.getTopic() +"\n\n "+mail.getSms();
        lmail.setText(ma);
    }
}
