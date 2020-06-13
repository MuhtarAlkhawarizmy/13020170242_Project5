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
import com.example.malaqbiapp.model.MenuModel;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder> {
    private Context mContext;
    private List<MenuModel> mData;

    public MenuAdapter(Context mContext, List<MenuModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater miInflater=LayoutInflater.from(mContext);
        view=miInflater.inflate(R.layout.cardview_item_menu, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_menu_title.setText(mData.get(position).getTitle());
        holder.tv_menu_desc.setText(mData.get(position).getDescripsi());
        holder.img_menu.setImageResource(mData.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_menu_title, tv_menu_desc;
        ImageView img_menu;
        CardView cardViewMenu;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_menu_title=(TextView) itemView.findViewById(R.id.tvNamaMenu);
            tv_menu_desc=(TextView) itemView.findViewById(R.id.tvDeskMenu);
            img_menu=(ImageView) itemView.findViewById(R.id.imgMenu);
            cardViewMenu=(CardView) itemView.findViewById(R.id.cardview_id_menu);
        }
    }
}
