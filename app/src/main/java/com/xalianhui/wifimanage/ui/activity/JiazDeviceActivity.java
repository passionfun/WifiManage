package com.xalianhui.wifimanage.ui.activity;

import android.view.View;

import com.xalianhui.wifimanage.R;
import com.xalianhui.wifimanage.control.activity.JiazDeviceControl;
import com.xalianhui.wifimanage.control.activity.SelectLoginControl;
import com.xalianhui.wifimanage.ui.BaseActivity;


public class JiazDeviceActivity extends BaseActivity{

    private JiazDeviceControl control;

    @Override
    protected int addLayout() {
        control = new JiazDeviceControl();
        return R.layout.activity_jiaz_device;
    }

    @Override
    protected void initView(View xmlRoot) {
        if (control != null) {
            control.onInit(xmlRoot, this);
        }
    }


    @Override
    protected void recycleView() {
        if (control != null) {
            control.onRecycle();
            control = null;
        }
    }


}
