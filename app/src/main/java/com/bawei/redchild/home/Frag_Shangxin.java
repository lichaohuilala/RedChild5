package com.bawei.redchild.home;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bawei.redchild.R;
import com.bawei.redchild.home.baseadapter.H_shanxin_adapter;
import com.bawei.redchild.home.bean.Home_frag1_bean;
import com.bawei.redchild.home.h_url_f1.Tianhenxian;

import java.util.List;
/**
*日期:2017/5/31
 * 时间:9:34
 * 作者：高伟振
*类描述：主要显示上新页面的布局显示（也就是活动页面）
*/
public class Frag_Shangxin extends Fragment {
public List<Home_frag1_bean.DataBean> sxin_path;
private RecyclerView recview_home_nbuxs_shangxin1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.frag__shangxin, container, false);
   recview_home_nbuxs_shangxin1= (RecyclerView) inflate.findViewById(R.id.recview_home_nbuxs_shangxin1);
        recview_home_nbuxs_shangxin1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        initview();

        return inflate;
    }

    private void initview() {
        H_shanxin_adapter h_shanxin_adapter = new H_shanxin_adapter(sxin_path, getActivity());
        recview_home_nbuxs_shangxin1.setAdapter(h_shanxin_adapter);
        recview_home_nbuxs_shangxin1.addItemDecoration(new Tianhenxian(getActivity(),Tianhenxian.VERTICAL_LIST));
    }


}
