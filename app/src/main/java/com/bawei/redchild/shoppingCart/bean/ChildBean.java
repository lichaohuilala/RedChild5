package com.bawei.redchild.shoppingCart.bean;

/**
 * date: 2017/5/28
 * author:侯亮亮候亮亮
 */

public class ChildBean  {
    private String name;
    private boolean isChoesed;

    private String imageUrl;
    private String desc;
    private double price;
    private int conut;
    private int position;//绝对位置，只有在listview中删除时有效

    public ChildBean() {
    }

    public ChildBean(String name, String imageUrl, double price, String desc, int conut) {
        this.name=name;
        this.imageUrl = imageUrl;
        this.price = price;
        this.desc = desc;
        this.conut = conut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChoesed() {
        return isChoesed;
    }

    public void setChoesed(boolean choesed) {
        isChoesed = choesed;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getConut() {
        return conut;
    }

    public void setConut(int conut) {
        this.conut = conut;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
