package com.sina.sinavideo.sinaappluncherlib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.GridView;

import java.util.List;

/**
 * Created by sinash94857 on 2016/1/7.
 */
public class SALDialogFragment extends DialogFragment {

    private SALAutoHeightGrid mGridView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        setStyle(STYLE_NO_TITLE, 0);
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.sal_dialog_fragment,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mGridView = (SALAutoHeightGrid) view.findViewById(R.id.sal_gridview);
        List<SALInfo> data = Utils.getTestData();
        Utils.checkApkExist(getActivity(), data);
        mGridView.setAdapter(new SALAdaper(getActivity(), data));
    }
}
