package com.example.myapplicationvip;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplicationvip.CustomAdapter.CustomAdapter;
import com.example.myapplicationvip.Model.Contact;

import java.util.ArrayList;

public class CustomLayout extends AppCompatActivity {
    ListView lvThongBao;
    ArrayList<String> dulieu;
    private ListView lvcontact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_layout);
        lvcontact = findViewById(R.id.lv_contact);
        ArrayList<Contact> arrayList = new ArrayList<>();

        Contact contact1 = new Contact(Color.BLUE,"Tin tức 1","Mô tả 1");
        Contact contact2 = new Contact(Color.YELLOW,"Tin tức 2","Mô tả 2");
        Contact contact3 = new Contact(Color.WHITE,"Tin tức 3","Mô tả 3");
        Contact contact4 = new Contact(Color.GRAY,"Tin tức 4","Mô tả 4");
        Contact contact5 = new Contact(Color.GREEN,"Tin tức 5","Mô tả 5");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);

        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.item_contact,arrayList);
        lvcontact.setAdapter(customAdapter);
    }

}