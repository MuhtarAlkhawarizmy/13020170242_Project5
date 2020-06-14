package com.example.malaqbiapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.model.MusicModel;
import com.example.malaqbiapp.view2.MusicActivity;

import java.io.IOException;
import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {
    private Context mContext;
    private List<MusicModel> mData;

    public MusicAdapter(Context mContext, List<MusicModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater miInflater=LayoutInflater.from(mContext);
        view=miInflater.inflate(R.layout.cardview_menu, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tv_music_title.setText(mData.get(position).getTitle());
        holder.tv_music_desc.setText(mData.get(position).getDescripsi());
        try {
            holder.play_music.setDataSource(mData.get(position).getLagu());
        } catch (IOException e) {
            e.printStackTrace();
        }
        holder.img_music.setImageResource(mData.get(position).getFoto());
        holder.cardViewMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goPlayMusic=new Intent(mContext, MusicActivity.class);

                goPlayMusic.putExtra("Title", mData.get(position).getTitle());
                goPlayMusic.putExtra("Descripsi", mData.get(position).getDescripsi());
                goPlayMusic.putExtra("Lagu", mData.get(position).getLagu());
                goPlayMusic.putExtra("foto", mData.get(position).getFoto());
                mContext.startActivity(goPlayMusic);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_music_title, tv_music_desc;
        ImageView img_music;
        MediaPlayer play_music;
        CardView cardViewMusic;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_music_title=(TextView) itemView.findViewById(R.id.tvNamaMenu);
            tv_music_desc=(TextView) itemView.findViewById(R.id.tvDeskMenu);
            img_music=(ImageView) itemView.findViewById(R.id.imgMenu);
            cardViewMusic=(CardView) itemView.findViewById(R.id.cardview_id_menu);
        }
    }
}
