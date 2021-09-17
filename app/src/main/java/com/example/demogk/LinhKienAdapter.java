package com.example.demogk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LinhKienAdapter extends RecyclerView.Adapter<LinhKienAdapter.ViewHolder> {
    private OnClickListener listener;
    ArrayList<LinhKien>mLinhKiens;

    public LinhKienAdapter(ArrayList<LinhKien> mLinhKiens, OnClickListener listener) {
        this.mLinhKiens = mLinhKiens;
        this.listener=listener;
    }

    @NonNull
    @Override
    public LinhKienAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_linhkien,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LinhKienAdapter.ViewHolder holder, int position) {
        LinhKien linhKien = mLinhKiens.get(position);
        holder.imgLinhKien.setImageResource(linhKien.getImgGiac());
        holder.tvPrice.setText(linhKien.getTvPrice()+"");
        holder.tvName.setText(linhKien.getTvName());

        holder.mLinhKien=mLinhKiens.get(position);


    }
    @Override
    public int getItemCount() {
        return mLinhKiens.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinhKien mLinhKien;
        ImageView imgLinhKien;
        TextView tvName, tvPrice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgLinhKien = itemView.findViewById(R.id.imgGiac);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    listener.itemClick(mLinhKien);
                }
            });

        }
    }
}
