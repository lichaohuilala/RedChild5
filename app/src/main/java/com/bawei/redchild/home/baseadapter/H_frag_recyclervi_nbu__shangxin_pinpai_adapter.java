package com.bawei.redchild.home.baseadapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.redchild.R;
import com.bawei.redchild.home.bean.Home_frag1_bean;
import com.bawei.redchild.home.bean.Home_frag1_bena_nbu;
import com.bawei.redchild.home.h_url_f1.Url;
import com.bawei.redchild.home.home_activity.SeekActivity;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * 类描述：
 * data:2017/5/24
 * author:高伟振(lenovo)
 */

public class H_frag_recyclervi_nbu__shangxin_pinpai_adapter extends RecyclerView.Adapter<H_frag_recyclervi_nbu__shangxin_pinpai_adapter.ViewHolder> {
    private List<Home_frag1_bean.DataBean> mList;
    private Context mContext;

    public H_frag_recyclervi_nbu__shangxin_pinpai_adapter(List<Home_frag1_bean.DataBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_recyview_nbu_haoqi_img, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Glide.with(mContext)
                .load(Url.tupin+mList.get(15).getTag().get(position).getPicUrl())
                .into(holder.img_fr1_adap_review_imgnbu2_haoqi);
        String elementName = mList.get(15).getTag().get(position).getElementName();
        if (elementName.length() >= 7) {
            String substring = elementName.substring(0, 7);
            holder.tv_fr1_adap_review_itvnbu2_haoqi.setText(substring+"..."+"\n\t"+"￥ 100元");
        }else {
            holder.tv_fr1_adap_review_itvnbu2_haoqi.setText(elementName+"\n\t"+"￥ 100元");
        }
   holder.itemView.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           //点击跳转事件
           Intent intent = new Intent(mContext, SeekActivity.class);
           intent.putExtra("path",mList.get(15).getTag().get(position).getPicUrl());
           intent.putExtra("name",mList.get(15).getTag().get(position).getElementName());
           mContext.startActivity(intent);
       }
   });

    }

    @Override
    public int getItemCount() {
        return mList.get(15).getTag().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_fr1_adap_review_imgnbu2_haoqi;
        private TextView tv_fr1_adap_review_itvnbu2_haoqi;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_fr1_adap_review_itvnbu2_haoqi= (TextView) itemView.findViewById(R.id.tv_fr1_adap_review_itvnbu2_haoqi);
            img_fr1_adap_review_imgnbu2_haoqi= (ImageView) itemView.findViewById(R.id.img_fr1_adap_review_imgnbu2_haoqi);


        }
    }
}
