package com.example.malaqbiapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.model.MenuModel;
import com.example.malaqbiapp.view2.desc_Menu;

import java.util.List;

public class DaerahAdapter extends RecyclerView.Adapter<DaerahAdapter.MyViewHolder> {

    private Context mContext;
    private List<MenuModel> mData;

    public DaerahAdapter(Context mContext, List<MenuModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_menu, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv_daerah_title.setText(mData.get(position).getTitle());
        holder.tv_daerah_desc.setText(mData.get(position).getDescripsi());
        holder.img_daerah.setImageResource(mData.get(position).getFoto());
        holder.cardViewd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goDescDaerah=new Intent(mContext, desc_Menu.class);

                goDescDaerah.putExtra("Title", mData.get(position).getTitle());
                goDescDaerah.putExtra("Descripsi", mData.get(position).getDescripsi());
                goDescDaerah.putExtra("Kode", mData.get(position).getKode());
                goDescDaerah.putExtra("foto", mData.get(position).getFoto());
                mContext.startActivity(goDescDaerah);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_daerah_title, tv_daerah_desc;
        ImageView img_daerah;
        CardView cardViewd;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_daerah_title=(TextView) itemView.findViewById(R.id.tvNamaMenu);
            tv_daerah_desc=(TextView) itemView.findViewById(R.id.tvDeskMenu);
            img_daerah=(ImageView) itemView.findViewById(R.id.imgMenu);
            cardViewd=(CardView) itemView.findViewById(R.id.cardview_id_menu);
        }
    }
}
