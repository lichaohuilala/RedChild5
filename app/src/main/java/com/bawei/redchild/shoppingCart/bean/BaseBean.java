package com.bawei.redchild.shoppingCart.bean;

/**
 * date: 2017/5/28
 * author:侯亮亮候亮亮
 */

public class BaseBean {
    private int id;
    private String name;
    private boolean isChoosed;

    public BaseBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BaseBean() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }
}
