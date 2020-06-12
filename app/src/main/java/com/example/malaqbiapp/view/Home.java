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

public class Home extends Fragment {
    List<Daerah_model> lsHomeDaerah;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        lsHomeDaerah=new ArrayList<>();
        lsHomeDaerah.add(new Daerah_model("Polewali Mandar", R.string.decs_polman,"Kode Wilayah : 76.04", R.drawable.polman));
        lsHomeDaerah.add(new Daerah_model("Mamasa", R.string.decs_mamasa,"Kode Wilayah : 76.03", R.drawable.mamasa));
        lsHomeDaerah.add(new Daerah_model("Majene", R.string.decs_majene, "Kode Wilayah : 76.05", R.drawable.majene));
        lsHomeDaerah.add(new Daerah_model("Mamuju", R.string.decs_mamuju,"Kode Wilayah : 76.02" , R.drawable.mamuju));
        lsHomeDaerah.add(new Daerah_model("Mamuju Utara", R.string.decs_mamut,"Kode Wilayah : 76.01" ,R.drawable.mamut));
        lsHomeDaerah.add(new Daerah_model("Mamuju Tengah", R.string.decs_mateng,"Kode Wilayah : 76.06" ,R.drawable.mateng));

        RecyclerView myrv2=(RecyclerView) view.findViewById(R.id.recyclerHome_Daerah);
        Adapter_daerah myAdapter2=new Adapter_daerah(getContext(),lsHomeDaerah);
        myrv2.setLayoutManager(new GridLayoutManager(getContext(),1));
        myrv2.setAdapter(myAdapter2);
        return view;
    }
}