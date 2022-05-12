package com.example.myapplicationvip.CustomAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplicationvip.Model.Contact;
import com.example.myapplicationvip.R;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;
    private  ArrayList<Contact> arrContact;
    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arrContact = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item_contact,parent,false);
        // Khởi tạo 3 view
        TextView tv_color = (TextView) convertView.findViewById(R.id.tv_color);
        TextView tv_thongbao = (TextView) convertView.findViewById(R.id.tv_thongbao);
        TextView tv_noidung = (TextView) convertView.findViewById(R.id.tv_noidung);

        Contact contact = arrContact.get(position);

        tv_color.setBackgroundColor(contact.getmColor());
        tv_color.setText((position+1)+"");
        tv_thongbao.setText(contact.getmName());
        tv_noidung.setText(contact.getmNumber());
        return convertView;
    }
}
