package com.example.nailo;

import android.os.Bundle;
import android.app.Activity;
import android.content.*;
import android.view.*;

public class Schedule extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // buttonbar 레이아웃 출
        LayoutInflater inflater = (LayoutInflater)this.getSystemService(LAYOUT_INFLATER_SERVICE);
        ViewGroup layout_schedule = (ViewGroup)inflater.inflate(R.layout.activity_schedule, null);       
        ViewGroup buttonBar = (ViewGroup) inflater.inflate(R.layout.buttonbar, null);        
        layout_schedule.addView(buttonBar, 2);
        setContentView(layout_schedule);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_schedule, menu);
        return true;
    }
    
    public void OnClickChoongbuk(View v) {
    	Intent intent2 = new Intent(this, Choongbuk.class);
    	startActivity(intent2);
    }
    
    public void OnClickMyMenu(View v) {
    	Intent intent = new Intent(this, Mymenu.class);
    	startActivity(intent);
    }
}
