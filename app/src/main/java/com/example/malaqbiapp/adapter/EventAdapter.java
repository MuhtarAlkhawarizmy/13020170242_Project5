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

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private Context mContext;
    private List<MenuModel> mData;

    public EventAdapter(Context mContext, List<MenuModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater miInflater=LayoutInflater.from(mContext);
        view=miInflater.inflate(R.layout.cardview_event, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv_event_title.setText(mData.get(position).getTitle());
        holder.tv_event_desc.setText(mData.get(position).getDescripsi());
        holder.img_event.setImageResource(mData.get(position).getFoto());
        holder.cardViewE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goDescEvent=new Intent(mContext, desc_Menu.class);

                goDescEvent.putExtra("Title", mData.get(position).getTitle());
                goDescEvent.putExtra("Descripsi", mData.get(position).getDescripsi());
                goDescEvent.putExtra("Kode", mData.get(position).getKode());
                goDescEvent.putExtra("foto", mData.get(position).getFoto());
                mContext.startActivity(goDescEvent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_event_title, tv_event_desc;
        ImageView img_event;
        CardView cardViewE;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_event_title=(TextView) itemView.findViewById(R.id.tvNamaEvent);
            tv_event_desc=(TextView) itemView.findViewById(R.id.tvDeskEvent);
            img_event=(ImageView) itemView.findViewById(R.id.imgEvent);
            cardViewE=(CardView) itemView.findViewById(R.id.cardview_id2);
        }
    }
}
