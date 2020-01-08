package com.itc.itcandroid.Infor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmInfor extends BaseActivi {

    private EditText url;
    private ImageView iview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_infor);
        url = findViewById(R.id.urlandroid);
        iview = findViewById(R.id.photo);

    }

    public void OepWB(View view) {
        Uri wb = Uri.parse(url.getText().toString());
        //Uri wb = Uri.parse("http://google.com");
        Intent op = new Intent(Intent.ACTION_VIEW,wb);
        if (op.resolveActivity(getPackageManager())!=null) {
            startActivity(op);
        }

    }

    public void OpenLocation(View view) {
        Uri lo = Uri.parse("geo:11,104?q="+"Schools");
        Intent lc = new Intent(Intent.ACTION_VIEW,lo);
        if (lc.resolveActivity(getPackageManager())!=null) {
            startActivity(lc);
        }
        //startActivity(lc);

    }

    public void OpMamar(View view) {
        Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(in.resolveActivity(getPackageManager())!=null){
            startActivityForResult(in,1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       if(requestCode== 1 && resultCode == RESULT_OK){
           Bundle imag = data.getExtras();
           Bitmap bmage = (Bitmap) imag.get("data");
           iview.setImageBitmap(bmage);
       }

    }

//        public void openBrowser(View view) {
//        Uri andr = Uri.parse(url.getText().toString());
//        Intent epnwb = new Intent(Intent.ACTION_VIEW,andr);
//        if (epnwb.resolveActivity(getPackageManager())!= null) {
//            startActivity(epnwb);
//        }
//        else
//        {
//
//        }
//
//    }
}
