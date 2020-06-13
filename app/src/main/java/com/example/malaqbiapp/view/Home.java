package com.example.malaqbiapp.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.adapter.DaerahAdapter;
import com.example.malaqbiapp.adapter.EventAdapter;
import com.example.malaqbiapp.model.DaerahModel;
import com.example.malaqbiapp.model.EventModel;
import com.example.malaqbiapp.view2.SukuActivity;
import com.example.malaqbiapp.view2.TariActivity;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    List<DaerahModel> lsHomeDaerah;
    List<EventModel> lsHomeEvent;
    ImageView imgTari, imgSuku, imgBhs, imgHand, imgMusic, imgBaju, imgSenjata, imgMakan;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);

        imgTari=view.findViewById(R.id.imgTari);
//        imgSuku=view.findViewById(R.id.imgSuku);
//        imgBhs=view.findViewById(R.id.imgBhs);
        imgHand=view.findViewById(R.id.imgHand);
        imgMusic=view.findViewById(R.id.imgLagu);
        imgBaju=view.findViewById(R.id.imgBaju);
        imgSenjata=view.findViewById(R.id.imgSenjata);
        imgMakan=view.findViewById(R.id.imgMakan);

        imgTari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TariActivity.class));
            }
        });
//        imgSuku.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getActivity(), SukuActivity.class));
//            }
//        });

        lsHomeDaerah=new ArrayList<>();
        lsHomeDaerah.add(new DaerahModel("Polewali Mandar", R.string.decs_polman,"Kode Wilayah : 76.04", R.drawable.polman));
        lsHomeDaerah.add(new DaerahModel("Mamasa", R.string.decs_mamasa,"Kode Wilayah : 76.03", R.drawable.mamasa));
        lsHomeDaerah.add(new DaerahModel("Majene", R.string.decs_majene, "Kode Wilayah : 76.05", R.drawable.majene));
        lsHomeDaerah.add(new DaerahModel("Mamuju", R.string.decs_mamuju,"Kode Wilayah : 76.02" , R.drawable.mamuju));
        lsHomeDaerah.add(new DaerahModel("Mamuju Utara", R.string.decs_mamut,"Kode Wilayah : 76.01" ,R.drawable.mamut));
        lsHomeDaerah.add(new DaerahModel("Mamuju Tengah", R.string.decs_mateng,"Kode Wilayah : 76.06" ,R.drawable.mateng));

        RecyclerView myrv2=(RecyclerView) view.findViewById(R.id.recyclerHome_Daerah);
        DaerahAdapter myAdapter2=new DaerahAdapter(getContext(),lsHomeDaerah);
        myrv2.setLayoutManager(new GridLayoutManager(getContext(),1));
        myrv2.setAdapter(myAdapter2);

        lsHomeEvent=new ArrayList<>();
        lsHomeEvent.add(new EventModel("Festival Sandeq Race", R.string.desc_sandeq, R.drawable.sandeq));
        lsHomeEvent.add(new EventModel("Maulid Nabi Muhammad", R.string.desc_sandeq, R.drawable.polewali));
        lsHomeEvent.add(new EventModel("Kota Mamuju", R.string.desc_sandeq, R.drawable.mamuju4));

        RecyclerView myrv3=(RecyclerView) view.findViewById(R.id.recyclerHome_Event);
        EventAdapter myAdapter=new EventAdapter(getContext(),lsHomeEvent);
        myrv3.setLayoutManager(new GridLayoutManager(getContext(),1));
        myrv3.setAdapter(myAdapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, true);
        myrv3.setLayoutManager(layoutManager);

        return view;
    }

    public void ClikBhs(View view){
        Intent i=new Intent(getContext(), SukuActivity.class);
        i.putExtra("Menu", "Bhs");
        startActivity(i);
    }

    public void ClikSuku(View view){
        Intent i=new Intent(getContext(), SukuActivity.class);
        i.putExtra("Menu", "Suku");
        startActivity(i);
    }

}