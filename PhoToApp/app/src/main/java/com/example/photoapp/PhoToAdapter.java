package com.example.photoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class PhoToAdapter extends BaseAdapter {
    private ArrayList<PhoTo> phoTos;
    private Context context;

    public PhoToAdapter(ArrayList<PhoTo> phoTos, Context context) {
        this.phoTos = phoTos;
        this.context = context;
    }
    @Override
    public int getCount() {
        return phoTos.size();
    }

    @Override
    public Object getItem(int position) {
        return phoTos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return phoTos.get(position).getId_photo();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final MyView dataitem;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            dataitem =new MyView();
            convertView = layoutInflater.inflate(R.layout.item_photo,null);
            dataitem.imageView= convertView.findViewById(R.id.image);
            dataitem.sub=convertView.findViewById(R.id.image_sub);
            dataitem.title =convertView.findViewById(R.id.image_title);
            convertView.setTag(dataitem);
        }else {
            dataitem= (MyView) convertView.getTag();
        }
//        dataitem.sub.setText(phoTos.get(position).getSub_photo());
        dataitem.title.setText(phoTos.get(position).getTitle_photo());
        Picasso.with(context).load(phoTos.get(position).getSource_photo()).into(dataitem.imageView);
        return convertView;
    }
    public static class MyView{
        ImageView imageView;
        TextView sub;
        TextView title;
    }
}
