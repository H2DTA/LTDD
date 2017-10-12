package com.example.xuka.h2dta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by xuka on 10/12/2017.
 */

public class NhaHangAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<NhaHang> nhaHanglist;

    public NhaHangAdapter(Context context, int layout, List<NhaHang> nhaHanglist) {
        this.context = context;
        this.layout = layout;
        this.nhaHanglist = nhaHanglist;
    }

    @Override
    public int getCount() {
        return nhaHanglist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater ìnlater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = ìnlater.inflate(layout, null);

        //ánh xạ view
        TextView textTen = (TextView) view.findViewById(R.id.txtTen);
        TextView textDiaChi = (TextView) view.findViewById(R.id.txtDiaChi);
        ImageView imageHinh = (ImageView) view.findViewById(R.id.imgHinh);

        //gán giá trị
        NhaHang nhaHang = nhaHanglist.get(i);

        textTen.setText(nhaHang.getTen());
        textDiaChi.setText((nhaHang.getDiaChi()));
        imageHinh.setImageResource(nhaHang.getHinh());

        return view;
    }
}
