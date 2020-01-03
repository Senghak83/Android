package com.itc.itcandroid.ScrollText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmScroll extends BaseActivi {

    private TextView sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_scroll);

        sc = findViewById(R.id.lblSc);
        String s = getString(R.string.infor);
        for(int i =0 ; i<50 ; i++)
            sc.append(s);
        sc.setMovementMethod(new ScrollingMovementMethod());
        //sc.append(s+"");
    }
}
