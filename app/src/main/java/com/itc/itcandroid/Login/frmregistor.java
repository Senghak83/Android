package com.itc.itcandroid.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmregistor extends BaseActivi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmregistor);
    }

    public void Ris(View view) {
        onBackPressed();
    }
}
