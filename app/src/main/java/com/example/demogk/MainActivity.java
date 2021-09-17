package com.example.demogk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    ArrayList<LinhKien> mLinhKiens;
    RecyclerView rcv_linhkien;
    LinhKienAdapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mLinhKiens = new ArrayList<>();
        rcv_linhkien = findViewById(R.id.rcv_linhkien);
        mLinhKiens.add(new LinhKien(R.drawable.dauchuyendoi,10,"Dau chuyen doi",1));
        mLinhKiens.add(new LinhKien(R.drawable.carbusbtops2_1,10,"Dau chuyen doi",1));
        mLinhKiens.add(new LinhKien(R.drawable.daucam,10,"Dau chuyen doi",1));
        mLinhKiens.add(new LinhKien(R.drawable.dauchuyendoipsps21,10,"Dau chuyen doi",1));
        mLinhKiens.add(new LinhKien(R.drawable.daynguon1,10,"Dau chuyen doi",1));
        mLinhKiens.add(new LinhKien(R.drawable.giacchuyen1,20,"Dau chuyen doi20",1));

        adt=new LinhKienAdapter(mLinhKiens, this);
        rcv_linhkien.setHasFixedSize(true);
        rcv_linhkien.setAdapter(adt);
        rcv_linhkien.setLayoutManager(new GridLayoutManager(this,2));
        //        2 cot//////
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        rcvThing.setLayoutManager(gridLayoutManager);

//        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
//        rcvThing.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void itemClick(LinhKien mLinhKien) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("key1",mLinhKien);
        startActivity(intent);
    }
}