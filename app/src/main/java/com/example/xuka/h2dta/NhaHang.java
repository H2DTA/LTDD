package com.example.xuka.h2dta;

/**
 * Created by xuka on 10/12/2017.
 */

public class NhaHang {
    private String Ten;
    private String DiaChi;
    private  int Hinh;

    public NhaHang(String ten, String diaChi, int hinh) {
        Ten = ten;
        DiaChi = diaChi;
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
