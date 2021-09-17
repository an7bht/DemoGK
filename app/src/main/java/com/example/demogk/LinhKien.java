package com.example.demogk;

import java.io.Serializable;

public class LinhKien implements Serializable {

    private int imgGiac;
    private int tvPrice;
    private String tvName;
    private int soluong;

    public LinhKien(int imgGiac, int tvPrice, String tvName, int soluong) {
        this.imgGiac = imgGiac;
        this.tvPrice = tvPrice;
        this.tvName = tvName;
        this.soluong = soluong;
    }

    public int getImgGiac() {
        return imgGiac;
    }

    public void setImgGiac(int imgGiac) {
        this.imgGiac = imgGiac;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
