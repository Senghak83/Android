package com.itc.itcandroid.SendObject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

import java.util.Date;

public class frmmail extends BaseActivi {

    private EditText tTo, tMa,tSm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmmail);
        //----------
        tTo = findViewById(R.id.txtTo);
        tMa = findViewById(R.id.txtTo);
        tSm = findViewById(R.id.txtsms);
        //setTittle("back");
    }


    public void sedObject(View view) {
        String t = tTo.getText().toString();
        String m = tMa.getText().toString();
        String s = tSm.getText().toString();
        if(t.isEmpty() || m.isEmpty() || s.isEmpty())return;

        Date d = new Date();
        Intent fobject = new Intent(this,frmgetmail.class);
        fobject.putExtra("o",new clsMail(m,t,s,d));
        startActivity(fobject);
    }
}
