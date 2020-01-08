package com.itc.itcandroid.Share_Menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.itc.itcandroid.R;
import com.itc.itcandroid.storeclass.BaseActivi;

public class frmShare extends BaseActivi {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_share);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menufile,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.sh_b:
                //Intent sha = new Intent(Intent.ACTION_SEND_MULTIPLE);
                String mimeType = "text/plain";
//                sha.setType("text/plian");
//                String st1 = "Title";
//                String st2 = "Body";
//                sha.putExtra(Intent.EXTRA_TEXT,st1);
//                sha.putExtra(Intent.EXTRA_SUBJECT,st2);
//                startActivity(Intent.createChooser(sha,"Share"));

                ShareCompat.IntentBuilder builder = ShareCompat.IntentBuilder.from(this)
                        .setText("Hi ")
                        .setType(mimeType)
                        .setChooserTitle("Share with:");
                //----------------------Send Direct--------
                Intent shareIntent = builder.getIntent();
                //shareIntent.setPackage("org.telegram.messenger");

                startActivity(Intent.createChooser(shareIntent, "Share with:"));

                break;

        }


        return super.onOptionsItemSelected(item);
    }
}
