package com.bawei.redchild.home.home_activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bawei.redchild.R;
import com.bawei.redchild.home.baseadapter.H_listview_adapter;
import com.bawei.redchild.home.bean.ChatMessage;

import com.bawei.redchild.home.h_url_f1.HttpUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
*日期:2017/5/31
 * 时间:9:36
 * 作者：高伟振
*类描述：消息页面主要是练习图灵机器人，实现和客服的对话
*/
public class H_xiaoxi_Activity extends AppCompatActivity implements View.OnClickListener {

    private ListView xiaoxi_listview;
    private EditText xiaoxi_ed_xinxi;
    private Button xiaoxi_but_fasong;
    private RelativeLayout activity_h_xiaoxi_;




    private List<ChatMessage> list;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            ChatMessage chatMessage= (ChatMessage) msg.obj;
            list.add(chatMessage);
            mH_listview_adapter.notifyDataSetChanged();

        }
    };
    private H_listview_adapter mH_listview_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_xiaoxi_);
        initView();
        initData();

    }

    private void initData() {
        list = new ArrayList<>();
        ChatMessage messages=new ChatMessage();
        messages.setMsg("你好");
        messages.setDate(new Date());
        messages.setType(ChatMessage.Type.INCOMING);
        list.add(messages);
        mH_listview_adapter = new H_listview_adapter(list, H_xiaoxi_Activity.this);
        xiaoxi_listview.setAdapter(mH_listview_adapter);
    }


    private void initView() {
        xiaoxi_listview = (ListView) findViewById(R.id.xiaoxi_listview);
        xiaoxi_ed_xinxi = (EditText) findViewById(R.id.xiaoxi_ed_xinxi);
        xiaoxi_but_fasong = (Button) findViewById(R.id.xiaoxi_but_fasong);
        activity_h_xiaoxi_ = (RelativeLayout) findViewById(R.id.activity_h_xiaoxi_);

        xiaoxi_but_fasong.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.xiaoxi_but_fasong:
submit();

                break;
        }
    }

    private void submit() {
        // validate
        String xinxi = xiaoxi_ed_xinxi.getText().toString().trim();
        if (TextUtils.isEmpty(xinxi)) {
            Toast.makeText(this, "空消息不能发送", Toast.LENGTH_SHORT).show();
            return;
        }
        final String info = xiaoxi_ed_xinxi.getText().toString().trim();
        ChatMessage sendMessage=new ChatMessage();
        sendMessage.setType(ChatMessage.Type.OUTCOMING);
        sendMessage.setDate(new Date());
        sendMessage.setMsg(info);
        list.add(sendMessage);
        xiaoxi_ed_xinxi.setText("");
        new Thread() {
            @Override
            public void run() {
                super.run();
                ChatMessage chatMessage = HttpUtils.sendMessage(info);
                Message message = new Message();
                message.obj = chatMessage;
                handler.sendMessage(message);
            }
        }.start();



    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        list.clear();
    }
}
