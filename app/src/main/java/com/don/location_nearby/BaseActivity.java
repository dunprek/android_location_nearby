package com.don.location_nearby;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by gideon on 15,May,2019
 * dunprek@gmail.com
 * Jakarta - Indonesia
 */
public class BaseActivity extends AppCompatActivity {

    protected void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
