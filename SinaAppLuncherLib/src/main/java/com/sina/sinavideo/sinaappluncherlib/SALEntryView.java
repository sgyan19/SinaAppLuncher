package com.sina.sinavideo.sinaappluncherlib;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

/**
 * Created by sinash94857 on 2016/1/7.
 */
public class SALEntryView extends FrameLayout implements View.OnClickListener{

    private Button mMainBtn;


    public SALEntryView(Context context){
        super(context);
        init(context);
    }

    public SALEntryView(Context context, @Nullable AttributeSet attrs){
        super(context,attrs);
        init(context);
    }

    private void init(Context context){
        LayoutInflater.from(context).inflate(R.layout.sal_entry, this, true);
        mMainBtn = (Button) findViewById(R.id.main_button);
        mMainBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        SALDialogFragment f = new SALDialogFragment();
        f.show(((FragmentActivity)getContext()).getSupportFragmentManager(),"SALDialogFragment");
    }
}
