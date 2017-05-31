package com.bawei.redchild.home.baseadapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.bawei.redchild.home.Frag_Shangxin;
import com.bawei.redchild.home.H_Frag_nbu1;
import com.bawei.redchild.home.bean.Home_frag1_bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述：
 * data:2017/5/19
 * author:高伟振(lenovo)
 */

public class H_frag_base extends FragmentPagerAdapter {

   private List<Home_frag1_bean.DataBean.TagBean> list;
    private List<Home_frag1_bean.DataBean> mlist;
private List<String> tilename=new ArrayList<>();
    public H_frag_base(FragmentManager fm, List<Home_frag1_bean.DataBean.TagBean>list,List<Home_frag1_bean.DataBean> mlist) {
        super(fm);
        this.list = list;
        this.mlist=mlist;
    }


    @Override
    public Fragment getItem(int position) {
        if (position==0) {
            Frag_Shangxin frag_shangxin = new Frag_Shangxin();
            frag_shangxin.sxin_path=mlist;
            return frag_shangxin;
        }else {
            H_Frag_nbu1 h_frag_nbu1 = new H_Frag_nbu1();
            h_frag_nbu1.path=list.get(position-1).getElementDesc();
            return h_frag_nbu1;
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
       tilename.add("上新");
        for (int i = 0; i <list.size(); i++) {
            String elementName = list.get(i).getElementName();
            tilename.add(elementName);
        }
        tilename.add("");
        return tilename.get(position%tilename.size());
    }

    @Override
    public int getCount() {
        return 6;
    }
}
