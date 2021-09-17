package com.example.demogk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    //ArrayList<LinhKien> mLinhKiens;
    RecyclerView rcv_bag;
    CustomAdapterBaggg adt;
    TextView tvsub, tvtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //mLinhKiens = new ArrayList<>();
        rcv_bag = findViewById(R.id.rcv_bag);
        tvsub  =findViewById(R.id.tvSub);
        tvtotal = findViewById(R.id.tvTotal);

        tvsub.setText(MainActivity2.tong+"");
        tvtotal.setText(MainActivity2.tong+"");
        adt=new CustomAdapterBaggg(MainActivity2.linhKiens);

        rcv_bag.setHasFixedSize(true);
        rcv_bag.setAdapter(adt);
        rcv_bag.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }
}