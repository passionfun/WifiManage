package com.xalianhui.wifimanage.control.activity;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.xalianhui.wifimanage.R;
import com.xalianhui.wifimanage.consts.Consts;
import com.xalianhui.wifimanage.control.BaseActivityControl;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;


public class XiansuAppControl extends BaseActivityControl {

//	@ViewInject(R.id.et_wifi_name)
//	private EditText etName;
	@ViewInject(R.id.green_bianzhun)
	private ImageView etPassword;
//
//	private MntDialog mntDialog;
	@Override
	public void onInit(View rootView, Context context) {
		super.onInit(rootView, context);
		x.view().inject(this, rootView);
		initView();
	}


    @Override
	public void onRecycle() {

	}


	private void initView() {
		setTopView(Consts.TopPage.PAGE);
		setTitle(getResString(R.string.smart_priority));
		etPassword.setSelected(true);
	}







}
