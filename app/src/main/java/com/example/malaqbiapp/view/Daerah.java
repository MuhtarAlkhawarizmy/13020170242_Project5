package com.example.malaqbiapp.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.adapter.Adapter_daerah;
import com.example.malaqbiapp.model.Daerah_model;

import java.util.ArrayList;
import java.util.List;

public class Daerah extends Fragment {
    List<Daerah_model> lsDaerah;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daerah, container, false);

        lsDaerah=new ArrayList<>();
        lsDaerah.add(new Daerah_model("Polewali Mandar", R.string.decs_polman,"Kode Wilayah : 76.04", R.drawable.polman));
        lsDaerah.add(new Daerah_model("Mamasa", R.string.decs_mamasa,"Kode Wilayah : 76.03", R.drawable.mamasa));
        lsDaerah.add(new Daerah_model("Majene", R.string.decs_majene, "Kode Wilayah : 76.05", R.drawable.majene));
        lsDaerah.add(new Daerah_model("Mamuju", R.string.decs_mamuju,"Kode Wilayah : 76.02" , R.drawable.mamuju));
        lsDaerah.add(new Daerah_model("Mamuju Utara", R.string.decs_mamut,"Kode Wilayah : 76.01" ,R.drawable.mamut));
        lsDaerah.add(new Daerah_model("Mamuju Tengah", R.string.decs_mateng,"Kode Wilayah : 76.06" ,R.drawable.mateng));

        RecyclerView myrv=(RecyclerView) view.findViewById(R.id.recyclerDaerah);
        Adapter_daerah myAdapter=new Adapter_daerah(getContext(), lsDaerah);
        myrv.setLayoutManager(new GridLayoutManager(getContext(), 1));
        myrv.setAdapter(myAdapter);
        return view;
    }
}