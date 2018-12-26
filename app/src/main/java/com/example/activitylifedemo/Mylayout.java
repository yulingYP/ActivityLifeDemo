package com.example.activitylifedemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by 羽翎 on 2018/9/13.
 */

public class Mylayout extends LinearLayout {
    public Mylayout(Context context) {
        super(context);
    }

    public Mylayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Mylayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("onTouch"," onTouchEvent");
        return super.onTouchEvent(event);
    }
}
