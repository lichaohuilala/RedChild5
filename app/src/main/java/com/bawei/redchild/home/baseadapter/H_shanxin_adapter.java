package com.bawei.redchild.home.baseadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bawei.redchild.MainActivity;
import com.bawei.redchild.R;
import com.bawei.redchild.home.bean.Home_frag1_bean;
import com.bawei.redchild.home.bean.Home_frag1_bena_nbu;
import com.bawei.redchild.home.h_url_f1.Tianhenxian;
import com.bawei.redchild.home.h_url_f1.Url;
import com.bawei.redchild.home.home_activity.H_Web_Activity;
import com.bawei.redchild.home.home_activity.SeekActivity;
import com.bumptech.glide.Glide;

import java.util.List;
import java.util.zip.Inflater;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

import static com.bumptech.glide.Glide.with;

/**
 * 类描述：
 * data:2017/5/25
 * author:高伟振(lenovo)
 */

public class H_shanxin_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Home_frag1_bean.DataBean> list;
    private Context mContext;
    private int SXTIAO1=0;
    private int SXTIAO2=1;
    private int SXTIAO3=2;
    private int SXTIAO4=3;
    private int SXTIAO5=4;
    private int SXTIAO6=5;


    public H_shanxin_adapter(List<Home_frag1_bean.DataBean> list, Context context) {
        this.list = list;
        mContext = context;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return SXTIAO1;
        }else if (position == 1) {
         return SXTIAO2;
        }else if (position == 2) {
            return SXTIAO3;
        }else if (position == 3) {
            return SXTIAO4;
        }else if (position == 4) {
            return SXTIAO5;
        }else {
            return SXTIAO6;
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == SXTIAO1) {
            View itenView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_shangin_recyview_1, parent, false);
            ViewHolder1_1 viewHolder = new ViewHolder1_1(itenView);
            return viewHolder;
        }else if (viewType==SXTIAO2){
            View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_recyview2, parent, false);
            ViewHolder1_2 viewHolder1_2 = new ViewHolder1_2(itemView);
            return viewHolder1_2;
        }else if (viewType==SXTIAO3){
            View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_shangin_recyview_2, parent, false);
            ViewHolder1_3 viewHolder1_3 = new ViewHolder1_3(itemView);
            return viewHolder1_3;

        }else if (viewType==SXTIAO4){
            View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_shangin_recyview_3, parent, false);
            ViewHolder1_4 viewHolder1_4 = new ViewHolder1_4(itemView);
            return viewHolder1_4;
        }else if (viewType==SXTIAO5){
            View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_recyview4, parent, false);
            ViewHolder1_5 viewHolder1_5 = new ViewHolder1_5(itemView);
            return viewHolder1_5;
        }else if (viewType==SXTIAO6){
            View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_recyview5, parent, false);
            ViewHolder1_6 viewHolder1_6 = new ViewHolder1_6(itemView);
            return viewHolder1_6;
        }
    return null;
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {


        if (holder instanceof ViewHolder1_1) {
            ViewHolder1_1 view1 = (ViewHolder1_1) holder;
            //实现自定义点击跳转的方法，需要传入控件和路径
             OnItem(view1.img1_1,list.get(0).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(1).getTag().get(0).getPicUrl())
                    .into(view1.img1_1);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view1.img1_2,list.get(2).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(2).getTag().get(0).getPicUrl())
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(view1.img1_2);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view1.img1_3,list.get(2).getTag().get(1).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(2).getTag().get(1).getPicUrl())
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(view1.img1_3);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view1.img1_4,list.get(2).getTag().get(2).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(2).getTag().get(2).getPicUrl())
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(view1.img1_4);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view1.img1_5,list.get(2).getTag().get(3).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(2).getTag().get(3).getPicUrl())
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(view1.img1_5);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view1.img1_6,list.get(2).getTag().get(4).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(2).getTag().get(4).getPicUrl())
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(view1.img1_6);
            //给所有的textview赋值
            view1.tv1_1.setText(list.get(2).getTag().get(0).getElementName());
            view1.tv1_2.setText(list.get(2).getTag().get(1).getElementName());
            view1.tv1_3.setText(list.get(2).getTag().get(2).getElementName());
            view1.tv1_4.setText(list.get(2).getTag().get(3).getElementName());
            view1.tv1_5.setText(list.get(2).getTag().get(4).getElementName());

        }else if (holder instanceof ViewHolder1_2) {
            ViewHolder1_2 view11_2= (ViewHolder1_2) holder;
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view11_2.img1_2,list.get(3).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(3).getTag().get(0).getPicUrl())
                    .into(view11_2.img1_2);
            //找到你的布局管理类定义recyclerview的类型和显示格式
            view11_2.mRecyclerView1_2.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
            //实例化一个适配器并传入相应的参数
            H_frag_recyclervi_shangxin_adapter h_frag_recyclervi_shangxin_adapter = new H_frag_recyclervi_shangxin_adapter(list, mContext);
            //给recyclerview添加适配器
            view11_2.mRecyclerView1_2.setAdapter(h_frag_recyclervi_shangxin_adapter);
        }else if (holder instanceof ViewHolder1_3) {
           ViewHolder1_3 view3= (ViewHolder1_3) holder;
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view3.img1_3_1,list.get(5).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(5).getTag().get(0).getPicUrl())
                    .into(view3.img1_3_1);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view3.img1_3_2,list.get(6).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(6).getTag().get(0).getPicUrl())
                    .into(view3.img1_3_2);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view3.img1_3_3,list.get(6).getTag().get(1).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(6).getTag().get(1).getPicUrl())
                    .into(view3.img1_3_3);
        }else if (holder instanceof ViewHolder1_4){
            ViewHolder1_4 view4= (ViewHolder1_4) holder;
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_1,list.get(8).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(8).getTag().get(0).getPicUrl())
                    .into(view4.img1_4_1);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_2,list.get(9).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(9).getTag().get(0).getPicUrl())
                    .into(view4.img1_4_2);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_3,list.get(9).getTag().get(1).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(9).getTag().get(1).getPicUrl())
                    .into(view4.img1_4_3);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_4,list.get(10).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(10).getTag().get(0).getPicUrl())
                    .into(view4.img1_4_4);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_5,list.get(10).getTag().get(1).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(10).getTag().get(1).getPicUrl())
                    .into(view4.img1_4_5);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_6,list.get(11).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(11).getTag().get(0).getPicUrl())
                    .into(view4.img1_4_6);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view4.img1_4_7,list.get(11).getTag().get(1).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin + list.get(11).getTag().get(1).getPicUrl())
                    .into(view4.img1_4_7);
        }else if (holder instanceof ViewHolder1_5){
           ViewHolder1_5 view5= (ViewHolder1_5) holder;
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view5.img1_5_1,list.get(13).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin+list.get(13).getTag().get(0).getPicUrl())
                    .into(view5.img1_5_1);
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view5.img1_5_2,list.get(14).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin+list.get(14).getTag().get(0).getPicUrl())
                    .into(view5.img1_5_2);
            view5.mRecyclerView1_5.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
            H_frag_recyclervi_nbu__shangxin_pinpai_adapter h_frag_recyclervi_nbu__shangxin_pinpai_adapter = new H_frag_recyclervi_nbu__shangxin_pinpai_adapter(list, mContext);
            view5.mRecyclerView1_5.setAdapter(h_frag_recyclervi_nbu__shangxin_pinpai_adapter);
            //添加条目点击的横线
            view5.mRecyclerView1_5.addItemDecoration(new Tianhenxian(mContext,Tianhenxian.VERTICAL_LIST));

        }else if (holder instanceof ViewHolder1_6) {
            ViewHolder1_6 view66= (ViewHolder1_6) holder;
            //实现自定义点击跳转的方法，需要传入控件和路径
            OnItem(view66.img1_6,list.get(16).getTag().get(0).getLinkUrl());
            //给图片控件赋值
            Glide.with(mContext)
                    .load(Url.tupin+list.get(16).getTag().get(0).getPicUrl())
                    .into(view66.img1_6);
            view66.mRecyclerView1_6.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false));
            H_frag_recyclervi_nbu__shangxin_yuer_adapter h_frag_recyclervi_nbu__shangxin_yuer_adapter = new H_frag_recyclervi_nbu__shangxin_yuer_adapter(list, mContext);
            view66.mRecyclerView1_6.setAdapter(h_frag_recyclervi_nbu__shangxin_yuer_adapter);
            view66.mRecyclerView1_6.addItemDecoration(new Tianhenxian(mContext,Tianhenxian.VERTICAL_LIST));
        }

    }

    @Override
    public int getItemCount() {
        return 6;
    }
    public class ViewHolder1_1 extends RecyclerView.ViewHolder {
        private ImageView img1_1,img1_2,img1_3,img1_4,img1_5,img1_6;
        private TextView tv1_1,tv1_2,tv1_3,tv1_4,tv1_5;

        public ViewHolder1_1(View itemView) {
            super(itemView);
          img1_1= (ImageView) itemView.findViewById(R.id.img_fr1_adap_shanxin_review1);
        img1_2= (ImageView) itemView.findViewById(R.id.img1_1_fr1_adap_shanxin_review1);
            img1_3= (ImageView) itemView.findViewById(R.id.img2_fr1_adap_shanxin_review1);
            img1_4= (ImageView) itemView.findViewById(R.id.img3_fr1_adap_shanxin_review1);
            img1_5= (ImageView) itemView.findViewById(R.id.img4_fr1_adap_shanxin_review1);
            img1_6= (ImageView) itemView.findViewById(R.id.img5_fr1_adap_shanxin_review1);
          tv1_1= (TextView) itemView.findViewById(R.id.tv1_fr1_adap_shanxin_review1);
            tv1_2= (TextView) itemView.findViewById(R.id.tv2_fr1_adap_shanxin_review1);
            tv1_3= (TextView) itemView.findViewById(R.id.tv3_fr1_adap_shanxin_review1);
            tv1_4= (TextView) itemView.findViewById(R.id.tv4_fr4_adap_shanxin_review1);
            tv1_5= (TextView) itemView.findViewById(R.id.tv5_fr4_adap_shanxin_review1);
        }
    }
    public class ViewHolder1_2 extends RecyclerView.ViewHolder {
        private ImageView img1_2;
        private RecyclerView mRecyclerView1_2;

        public ViewHolder1_2(View itemView) {
            super(itemView);
            img1_2= (ImageView) itemView.findViewById(R.id.img2_fr1_adap_review2);
            mRecyclerView1_2= (RecyclerView) itemView.findViewById(R.id.hon_nbu_recyview_sd);
        }
    }
    public class ViewHolder1_3 extends RecyclerView.ViewHolder {
        private ImageView img1_3_1,img1_3_2,img1_3_3;


        public ViewHolder1_3(View itemView) {
            super(itemView);
            img1_3_1= (ImageView) itemView.findViewById(R.id.img1_fr1_adap_shanxin_review2);
            img1_3_2= (ImageView) itemView.findViewById(R.id.img2_fr1_adap_shanxin_review2);
          img1_3_3= (ImageView) itemView.findViewById(R.id.img3_fr1_adap_shanxin_review2);
        }
    }
    public class ViewHolder1_4 extends RecyclerView.ViewHolder {
        private ImageView img1_4_1,img1_4_2,img1_4_3,img1_4_4,img1_4_5,img1_4_6,img1_4_7;


        public ViewHolder1_4(View itemView) {
            super(itemView);
            img1_4_1= (ImageView) itemView.findViewById(R.id.img1_fr1_adap_shanxin_review3);
            img1_4_2= (ImageView) itemView.findViewById(R.id.img2_fr1_adap_shanxin_review3);
            img1_4_3= (ImageView) itemView.findViewById(R.id.img3_fr1_adap_shanxin_review3);
            img1_4_4= (ImageView) itemView.findViewById(R.id.img4_fr1_adap_shanxin_review3);
            img1_4_5= (ImageView) itemView.findViewById(R.id.img5_fr1_adap_shanxin_review3);
            img1_4_6= (ImageView) itemView.findViewById(R.id.img6_fr1_adap_shanxin_review3);
            img1_4_7= (ImageView) itemView.findViewById(R.id.img7_fr1_adap_shanxin_review3);
        }
    }
    public class ViewHolder1_5 extends RecyclerView.ViewHolder {
        private ImageView img1_5_1,img1_5_2;
        private RecyclerView mRecyclerView1_5;
        public ViewHolder1_5(View itemView) {
            super(itemView);
            img1_5_1= (ImageView) itemView.findViewById(R.id.img1_fr1_adap_review4);
            img1_5_2= (ImageView) itemView.findViewById(R.id.img2_fr1_adap_review4);
            mRecyclerView1_5= (RecyclerView) itemView.findViewById(R.id.hon_nbu_recyview4444_sd4);
        }
    }
    public class ViewHolder1_6 extends RecyclerView.ViewHolder {
        private ImageView img1_6;
        private RecyclerView mRecyclerView1_6;
        public ViewHolder1_6(View itemView) {
            super(itemView);
            img1_6= (ImageView) itemView.findViewById(R.id.img2_fr1_adap_review5);
            mRecyclerView1_6= (RecyclerView) itemView.findViewById(R.id.hon_nbu_recyview5_sd);
        }
    }
    //点击监听跳转的方法
    public void OnItem(final ImageView img, final String path){
      img.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              //点击跳转事件
              Intent intent = new Intent(mContext, H_Web_Activity.class);
              intent.putExtra("path1",path);

              mContext.startActivity(intent);
          }
      });
    }
}
