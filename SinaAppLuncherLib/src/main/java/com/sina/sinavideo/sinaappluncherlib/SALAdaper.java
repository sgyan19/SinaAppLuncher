package com.sina.sinavideo.sinaappluncherlib;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sinash94857 on 2016/1/7.
 */
public class SALAdaper extends BaseArrayAdapter<SALInfo,SALGridItem>{


    public SALAdaper(Context context,List<SALInfo> objects){
        super(context,R.layout.sal_grid_item,objects);
    }

    @Override
    protected SALGridItem createHolder() {
        return new SALGridItem();
    }

    @Override
    protected void initHolder(int position, View v, SALGridItem holder) {
        holder.mIconView = (ImageView)v.findViewById(R.id.icon);
        holder.mNameView = (TextView) v.findViewById(R.id.name);
        holder.mCheckableView = (CheckableLayout) v.findViewById(R.id.container);
    }

    @Override
    protected void initParamsHolder(int position, SALGridItem holder, SALInfo item) {
    }

    @Override
    protected void bundleValue(int position, SALGridItem holder, SALInfo item) {
        holder.mIconView.setBackgroundResource(item.appIcon);
        holder.mNameView.setText(item.appName);
        holder.mCheckableView.setChecked(item.isInstall);
    }
}
