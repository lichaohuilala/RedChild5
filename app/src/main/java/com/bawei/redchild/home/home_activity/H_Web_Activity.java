package com.bawei.redchild.home.home_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.RelativeLayout;

import com.bawei.redchild.R;
/**
*日期:2017/5/31
 * 时间:9:37
 * 作者：高伟振
*类描述：主要显示webview的跳转实现
*/
public class H_Web_Activity extends AppCompatActivity {

    private WebView h_web_zhuye_xians;
    private RelativeLayout activity_h__web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h__web);
        initView();
        Intent intent = getIntent();
        String path1 = intent.getStringExtra("path1");


        h_web_zhuye_xians.loadUrl(path1);
    }

    private void initView() {
        h_web_zhuye_xians = (WebView) findViewById(R.id.h_web_zhuye_xians);
        activity_h__web = (RelativeLayout) findViewById(R.id.activity_h__web);
    }
}
