package com.example.malaqbiapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.model.SukuModel;

import java.util.List;

public class SukuAdapter extends RecyclerView.Adapter<SukuAdapter.MyViewHolder> {
    private Context mContext;
    private List<SukuModel> mData;

    public SukuAdapter(Context mContext, List<SukuModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater miInflater=LayoutInflater.from(mContext);
        view=miInflater.inflate(R.layout.cardview_suku, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_suku_title.setText(mData.get(position).getTitle());
        holder.tv_suku_desc.setText(mData.get(position).getDescripsi());
        holder.img_suku.setImageResource(mData.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_suku_title, tv_suku_desc;
        ImageView img_suku;
        CardView cardViewSuku;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_suku_title=(TextView) itemView.findViewById(R.id.tvNamaSuku);
            tv_suku_desc=(TextView) itemView.findViewById(R.id.tvDeskSuku);
            img_suku=(ImageView) itemView.findViewById(R.id.imgSuku);
            cardViewSuku=(CardView) itemView.findViewById(R.id.cardview_id_suku);
        }
    }
}
