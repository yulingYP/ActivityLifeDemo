package com.example.activitylifedemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;


/**
 * Created by 羽翎 on 2018/9/11.
 */

public class Utils  {

    public static android.support.v7.app.AlertDialog showDialog(Context context){
        FrameLayout view = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.dialog,null);
        view.measure(0,0);
        RelativeLayout relativeLayout = view.findViewById(R.id.relativeLayout);
        relativeLayout.measure(0,0);
        @SuppressLint("RestrictedApi")
        final android.support.v7.app.AlertDialog alertDialog = new android.support.v7.app.AlertDialog.Builder(context,R.style.dialog)
               // .setView(view,0,0,0,(getScreenSize(context)[1]-frameLayout.getMeasuredHeight())/2)
                .setView(view,0,0,0,(view.getMeasuredHeight()-relativeLayout.getMeasuredHeight())/2)
                //.setView(view)
                .setCancelable(false)
                .create();
        Log.d("mydemo2",""+getScreenSize(context)[1]+" "+view.getMeasuredHeight());
        view.findViewById(R.id.text_yes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        view.findViewById(R.id.text_no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        return  alertDialog;
    }

    public static int[] getScreenSize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return new int[]{outMetrics.widthPixels, outMetrics.heightPixels};
    }

}
