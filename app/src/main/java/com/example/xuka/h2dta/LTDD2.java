package com.example.xuka.h2dta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LTDD2 extends AppCompatActivity {
    ListView lvNhaHang;
    ArrayList<NhaHang> arrayNhaHang;
    NhaHangAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltdd2);

        AnhXa();

        adapter = new NhaHangAdapter(this, R.layout.nha_hang, arrayNhaHang);
        lvNhaHang.setAdapter(adapter);
    }

    private void AnhXa() {
        lvNhaHang = (ListView) findViewById(R.id.listviewnhahang);
        arrayNhaHang = new ArrayList<>();

        arrayNhaHang.add(new NhaHang("Nhà hàng Aloha", "20 Thanh Sơn - Đà Nẵng", R.drawable.aloha));
        arrayNhaHang.add(new NhaHang("Nhà hàng Hương Việt", "53 Trần Quốc Toản - Đà Nẵng", R.drawable.huongviet));
        arrayNhaHang.add(new NhaHang("Nhà hàng Đông Dương", "18 Trần Phú - Đà Nẵng", R.drawable.dongduong));
        arrayNhaHang.add(new NhaHang("Nhà hàng Nam Hoa Viên", "100 Tiểu La - Đà Nẵng", R.drawable.namhoavien));
        arrayNhaHang.add(new NhaHang("Nhà hàng Cội Nguồn", "Lô 1A43, khu đảo Xanh - Đà Nẵng", R.drawable.coinguon));
        arrayNhaHang.add(new NhaHang("Nhà hàng Cá Voi Xanh", "Lô 5, 6 đường Trường Sa - Đà Nẵng", R.drawable.cavoixanh));
        arrayNhaHang.add(new NhaHang("Nhà hàng Tulip", "174 đường 2/9 - Đà Nẵng", R.drawable.tulip));
        arrayNhaHang.add(new NhaHang("Nhà hàng Chay Khai Tâm", "352 Phan Châu Trinh - Đà Nẵng", R.drawable.chaykhaitam));
        arrayNhaHang.add(new NhaHang("Nhà hàng Apsara", "222 Trần Phú - Đà Nẵng", R.drawable.apsara));
        arrayNhaHang.add(new NhaHang("Nhà hàng Âu Lạc Việt", "25 Yên Bái - Đà Nẵng", R.drawable.aulacviet));
        arrayNhaHang.add(new NhaHang("Nhà hàng Phố Biển", "231 Nguyễn Tất Thành - Đà Nẵng", R.drawable.phobien));
        arrayNhaHang.add(new NhaHang("Nhà hàng Xiên Nướng Banjiro", "23 Nguyễn Chí Thanh - Đà Nẵng", R.drawable.xiennuong));
        arrayNhaHang.add(new NhaHang("Nhà hàng Mặt Trời Mọc", "51B Nguyễn Chí Thanh - Đà Nẵng", R.drawable.mattroimoc));
        arrayNhaHang.add(new NhaHang("Nhà hàng Bread Of Lifr", "04 Đống Đa - Đà Nẵng", R.drawable.breadoflife));
        arrayNhaHang.add(new NhaHang("Nhà hàng Mumtaz", "231 Trần Phú - Đà Nẵng", R.drawable.mumtaz));
    }
}
