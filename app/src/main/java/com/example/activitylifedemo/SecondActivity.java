package com.example.activitylifedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {

    String Activity;
    Mylayout mylayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Activity = "SecondActivity:";
        findViewById(R.id.text2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        mylayout = (Mylayout)findViewById(R.id.mylayout);
        mylayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("onTouch","layout1 onTouch");
                return false;
            }
        });

        mylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onTouch","layout1 onClick");
            }
        });

        findViewById(R.id.mylayout2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("onTouch","layout2");
            }
        });
        Log.d("mydemo",Activity+"onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mydemo",Activity+"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mydemo",Activity+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mydemo",Activity+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mydemo",Activity+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mydemo",Activity+"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mydemo",Activity+"onRestart");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d("mydemo",Activity+"onNewIntent");
    }
}
