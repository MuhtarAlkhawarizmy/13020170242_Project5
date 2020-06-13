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
import com.example.malaqbiapp.model.TarianModel;

import java.util.List;

public class TariAdapter extends RecyclerView.Adapter<TariAdapter.MyViewHolder> {
    private Context mContext;
    private List<TarianModel> mData;

    public TariAdapter(Context mContext, List<TarianModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater miInflater=LayoutInflater.from(mContext);
        view=miInflater.inflate(R.layout.cardview_tari, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_tari_title.setText(mData.get(position).getTitle());
        holder.tv_tari_desc.setText(mData.get(position).getDescripsi());
        holder.img_tari.setImageResource(mData.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_tari_title, tv_tari_desc;
        ImageView img_tari;
        CardView cardViewTari;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_tari_title=(TextView) itemView.findViewById(R.id.tvNamaTari);
            tv_tari_desc=(TextView) itemView.findViewById(R.id.tvDeskTari);
            img_tari=(ImageView) itemView.findViewById(R.id.imgTari);
            cardViewTari=(CardView) itemView.findViewById(R.id.cardview_id_tari);

        }
    }
}
