package com.example.activitylifedemo;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Activity = "MainActivity:";
        findViewById(R.id.text1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.layout1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mydemo1","layout1");
            }
        });
        findViewById(R.id.layout2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("mydemo1","layout2");
            }
        });


        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Utils.showDialog(v.getContext()).show();

            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getRequestedOrientation()==ActivityInfo.SCREEN_ORIENTATION_PORTRAIT){
                    Log.d("mydemo","切换");
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                }
                else{
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);//竖屏
                    Log.d("mydemo","切换");
                }

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
