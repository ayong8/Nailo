package com.example.nailo;

import android.app.*;
import android.os.*;
import android.view.*;



public class Mymenu extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mymenu, menu);
        return true;
    }
}
