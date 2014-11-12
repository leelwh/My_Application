package com.example.apuser.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by apuser on 11/10/14.
 */
public class TimeAxisWidget extends LinearLayout {

    public TimeAxisWidget(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        View datetime = inflate(context, R.id.timeaxis_datetime, null);
        ImageView timeIcon = new ImageView(context);
        timeIcon.setImageResource(R.drawable.list_time);
        addView(datetime);
        addView(timeIcon);
    }

    public TimeAxisWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimeAxisWidget(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
