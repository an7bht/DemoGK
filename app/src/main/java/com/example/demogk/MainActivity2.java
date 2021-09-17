package com.example.demogk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgGiacDt;
    TextView tvNameDt, tvPriceDt, tvSodt;
    Button btn_addbag;
    LinhKien mLinhKien;
    ImageButton imgbtn_truDt, imgbtn_congDt;
    static ArrayList<LinhKien> linhKiens;
    static int tong;
    static {
        linhKiens = new ArrayList<>();
        tong = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgbtn_congDt = findViewById(R.id.imgbtn_CongDt);
        imgbtn_truDt = findViewById(R.id.imgbtn_truDt);
        btn_addbag = findViewById(R.id.btn_addbag);
        imgGiacDt = findViewById(R.id.imgGiacDt);
        tvNameDt = findViewById(R.id.tvNameDt);
        tvPriceDt = findViewById(R.id.tvPriceDt);
        tvSodt = findViewById(R.id.tv_SoDt);
        Intent intent = getIntent();
        if(intent!=null){
            mLinhKien = (LinhKien) intent.getSerializableExtra("key1");
            imgGiacDt.setImageResource(mLinhKien.getImgGiac());
            tvPriceDt.setText(mLinhKien.getTvPrice()+"");
            tvNameDt.setText(mLinhKien.getTvName());
        }

        btn_addbag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                linhKiens.add(mLinhKien);
                tong=0;
                for (LinhKien d:linhKiens){
                    tong+=d.getTvPrice()*d.getSoluong();
                }
                startActivity(intent1);
            }
        });
        imgbtn_congDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLinhKien.setSoluong(mLinhKien.getSoluong()+1);
                tvSodt.setText(mLinhKien.getSoluong()+"");
            }
        });
        imgbtn_truDt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLinhKien.setSoluong(mLinhKien.getSoluong()-1);
                tvSodt.setText(mLinhKien.getSoluong()+"");
            }
        });
    }
}