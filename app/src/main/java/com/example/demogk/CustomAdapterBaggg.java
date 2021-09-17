package com.example.demogk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapterBaggg extends RecyclerView.Adapter<CustomAdapterBaggg.ViewHolder> {
    ArrayList<LinhKien> linhKiens;

    public CustomAdapterBaggg(ArrayList<LinhKien> linhKiens) {

        this.linhKiens = linhKiens;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bag,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {

        return linhKiens.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_bag;
        TextView tvname_Bag, tvprice_Bag,tvso_Bag;
        ImageButton imgbtn_TRU, imgbnt_CONG;
        public ViewHolder(@NonNull  View itemView) {
            super(itemView);

            img_bag =  itemView.findViewById(R.id.img_bag);
            tvname_Bag = itemView.findViewById(R.id.tvNameBag);
            tvprice_Bag = itemView.findViewById(R.id.tvPriceBag);
            tvso_Bag = itemView.findViewById(R.id.tvSobag);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull  CustomAdapterBaggg.ViewHolder holder, int position) {
        LinhKien linhKien = linhKiens.get(position);
        holder.img_bag.setImageResource(linhKien.getImgGiac());
        holder.tvname_Bag.setText(linhKien.getTvName());
        holder.tvprice_Bag.setText(linhKien.getTvPrice()+"");
        holder.tvso_Bag.setText(linhKien.getSoluong()+"");
    }
}
