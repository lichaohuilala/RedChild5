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

import static java.lang.System.load;

/**
 * 类描述：
 * data:2017/5/23
 * author:高伟振(lenovo)
 */

public class H_frag_recyclervi_shangxin_adapter extends RecyclerView.Adapter<H_frag_recyclervi_shangxin_adapter.ViewHolder> {
    private List<Home_frag1_bean.DataBean> mList;
    private Context mContext;

    public H_frag_recyclervi_shangxin_adapter(List<Home_frag1_bean.DataBean> list, Context context) {
        mList = list;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.home_fr1_adapter_recyview_nbu_img, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,  int position) {
        ++position;

            Glide.with(mContext)
                    .load(Url.tupin+mList.get(3).getTag().get(position).getPicUrl())
                    .into(holder.review_img_nbu);
          holder.review_tv_nbu.setText("￥48.80");
        //定义一个常量 来记录position传点击事件
   final int as=position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             //点击跳转事件
             Intent intent = new Intent(mContext, SeekActivity.class);
             intent.putExtra("path",mList.get(3).getTag().get(as).getPicUrl());
             intent.putExtra("name",mList.get(3).getTag().get(as).getElementName());
             mContext.startActivity(intent);
         }
     });
    }

    @Override
    public int getItemCount() {
        return mList.get(3).getTag().size()-1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView review_img_nbu;
        private TextView review_tv_nbu;
        public ViewHolder(View itemView) {
            super(itemView);
            review_img_nbu= (ImageView) itemView.findViewById(R.id.img_fr1_adap_review_imgnbu2);
            review_tv_nbu= (TextView) itemView.findViewById(R.id.tv_fr1_adap_review_itvnbu2);
        }

    }

}
