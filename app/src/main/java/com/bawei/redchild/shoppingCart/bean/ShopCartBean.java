package com.bawei.redchild.shoppingCart.bean;

import java.util.ArrayList;

/**
 * date: 2017/5/28
 * author:侯亮亮候亮亮
 *
 * 数据集合
 */

public class ShopCartBean {

    //组 名称
    private String groupName;
    private boolean isChecked;

    //子 集合
    private ArrayList<ChildBean> childList;

    public ShopCartBean(String groupName, ArrayList<ChildBean> childList) {
        this.groupName = groupName;
        this.childList = childList;
    }

    public ShopCartBean() {
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public ArrayList<ChildBean> getChildList() {
        return childList;
    }

    public void setChildList(ArrayList<ChildBean> childList) {
        this.childList = childList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    //    public static class ChildShopCartBean{
//
//        private String childName;
//
//        public ChildShopCartBean(String childName) {
//            this.childName = childName;
//        }
//
//        public String getChildName() {
//            return childName;
//        }
//
//        public void setChildName(String childName) {
//            this.childName = childName;
//        }
//    }

}
