package com.sina.sinavideo.sinaappluncherlib;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.jar.Attributes;

/**
 * Created by sinash94857 on 2016/1/8.
 */
public class SALAutoHeightGrid extends GridView {

    private SALAdaper adaper;
    private int mMaxHeight = 0;

    public SALAutoHeightGrid(Context context) {
        super(context);
    }

    public SALAutoHeightGrid(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setAdapter(SALAdaper adapter) {
        this.adaper = adapter;
        adaper.
        super.setAdapter(adapter);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int newHeightMeasureSpec = heightMeasureSpec;
        if (mMaxHeight <= 0) {
            if (adaper != null && adaper.getItemSize() > 0) {
                mMaxHeight = adaper.getItemSize() * 4;
            }
        }
        int size = MeasureSpec.getSize(heightMeasureSpec);
        if (size > adaper.getItemSize()) {
            newHeightMeasureSpec = MeasureSpec.makeMeasureSpec(mMaxHeight, MeasureSpec.EXACTLY);
        }
        super.onMeasure(widthMeasureSpec, newHeightMeasureSpec);
    }
}
