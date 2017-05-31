package com.bawei.redchild.home.home_activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bawei.redchild.MainActivity;
import com.bawei.redchild.R;
import com.bawei.redchild.home.h_url_f1.Url;
import com.bumptech.glide.Glide;

import static android.R.id.list;
/**
*日期:2017/5/31
 * 时间:9:36
 * 作者：高伟振
*类描述：本类主要是显示详情页面展示和点击加入购物车
*/
public class SeekActivity extends AppCompatActivity implements View.OnClickListener {


    private LinearLayout activity_seek;
    private ImageView img0_xiangqing_ye1,img0_0_xiangqi_ye1;
    private ImageView img1_xiangqing_ye1;
    private ImageView img2_xiangqing_ye1;
    private ImageView img3_xiangqing_ye1;
    private Button but1_xiangqing_ye1_nbu;
    private Button but2_xiangqing_ye1_nbu;
    private TextView tv0_0_xiangqi_ye1,tv1_1_xiangqi_ye1;
    private String mPath;
    private String mName;
    int asd = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);
        //初始化控件
        initView();
        //得到一个intent，并获取我们传来的数据
        Intent intent = getIntent();
        mPath = intent.getStringExtra("path");
        mName = intent.getStringExtra("name");
//给控件赋值
        Glide.with(this)
                .load(Url.tupin+ mPath)
                .into(img0_0_xiangqi_ye1);
        tv0_0_xiangqi_ye1.setText(mName);
        tv1_1_xiangqi_ye1.setText("48.00");
    }

    /**
     * 初始化控件并设置监听事件
     */
    private void initView() {
        activity_seek = (LinearLayout) findViewById(R.id.activity_seek);
        img0_xiangqing_ye1 = (ImageView) findViewById(R.id.img0_xiangqing_ye1);
        img0_xiangqing_ye1.setOnClickListener(this);
        img1_xiangqing_ye1 = (ImageView) findViewById(R.id.img1_xiangqing_ye1);
        img1_xiangqing_ye1.setOnClickListener(this);
        img2_xiangqing_ye1 = (ImageView) findViewById(R.id.img2_xiangqing_ye1);
        img2_xiangqing_ye1.setOnClickListener(this);
        img3_xiangqing_ye1 = (ImageView) findViewById(R.id.img3_xiangqing_ye1);
        img3_xiangqing_ye1.setOnClickListener(this);
        but1_xiangqing_ye1_nbu = (Button) findViewById(R.id.but1_xiangqing_ye1_nbu);
        but1_xiangqing_ye1_nbu.setOnClickListener(this);
        but2_xiangqing_ye1_nbu = (Button) findViewById(R.id.but2_xiangqing_ye1_nbu);
        but2_xiangqing_ye1_nbu.setOnClickListener(this);
        img0_0_xiangqi_ye1= (ImageView) findViewById(R.id.img0_0_xiangqing_ye1);
        tv0_0_xiangqi_ye1= (TextView) findViewById(R.id.tv0_0_xiangqing_ye1);
        tv1_1_xiangqi_ye1= (TextView) findViewById(R.id.tv1_1_xiangqing_ye1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but1_xiangqing_ye1_nbu:
                break;
            case R.id.but2_xiangqing_ye1_nbu:
                   //点击button跳转页面显示一个dialog，定义他的格式
                final Dialog dialog = new Dialog(this, R.style.Theme_Light_Dialog);
                //显示dialog
                dialog.show();
//                实例化view并指定布局
                LayoutInflater inflater = LayoutInflater.from(this);
                View viewDialog = inflater.inflate(R.layout.adapter_list_dialog, null);
 //           根据view找控件
                ImageView dialog_img= (ImageView) viewDialog.findViewById(R.id.img_h_jia_gche);
                TextView dailog_tv= (TextView) viewDialog.findViewById(R.id.tv1_0_h_jia_gche);
                ImageView dialog_img_dele_yemian= (ImageView) viewDialog.findViewById(R.id.img1_h_tjia_shujuku_shanc);
                TextView dailog_tv1= (TextView) viewDialog.findViewById(R.id.tv1_h_tjia_shujuku);
                final TextView dailog_tv2= (TextView) viewDialog.findViewById(R.id.tv2_h_tjia_shujuku);
                TextView dailog_tv3= (TextView) viewDialog.findViewById(R.id.tv3_h_tjia_shujuku);
             //调用glide来显示图片
                Glide.with(this)
                        .load(Url.tupin+ mPath)
                        .into(dialog_img);
                dailog_tv.setText(mName);
               //实现点击监听事件
                dialog_img_dele_yemian.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //销毁dialog
                        dialog.dismiss();
                        asd=1;
                    }
                });
                //实现点击事件
                dailog_tv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //点击的时候加判断让变量大于1的时候才能减1
                        if (asd > 1) {
                            //让变量减1
                            asd--;
                            //给textview赋值
                            dailog_tv2.setText(""+asd);
                        }else {//如果他小于或就会吐司一句话
                               Toast.makeText(SeekActivity.this,"数据最少有一条",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                //设置点击监听事件
                dailog_tv3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //让变量加1
                      asd++;
                        //给textview赋值
                        dailog_tv2.setText(""+asd);
                    }
                });

                //定义dialog的宽高
                Display display = this.getWindowManager().getDefaultDisplay();
                int width = display.getWidth();
                int height = display.getHeight();
//设置dialog的宽高为屏幕的宽高
                ViewGroup.LayoutParams layoutParams = new  ViewGroup.LayoutParams(width, height);
                dialog.setContentView(viewDialog, layoutParams);
                break;

            case R.id.img0_xiangqing_ye1:
            finish();
            break;
        }
    }

}
