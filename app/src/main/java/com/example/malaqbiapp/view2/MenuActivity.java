package com.example.malaqbiapp.view2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.adapter.MenuAdapter;
import com.example.malaqbiapp.model.MenuModel;
import com.example.malaqbiapp.model.sampelModel;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private Toolbar toolbarMenu;
    List<MenuModel> lsMenu;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbarMenu=findViewById(R.id.toolbarMenu);
        toolbarMenu.setTitle("Daerah Sulbar");
        setSupportActionBar(toolbarMenu);
        toolbarMenu.setNavigationIcon(R.drawable.btn_back);
        toolbarMenu.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent go=getIntent();
        i=getIntent();
        change(i);

    }
    public void change(Intent i){
        switch (i.getStringExtra("Menu")){
            case "Bhs":
                getSupportActionBar().setTitle("Bahasa Daerah Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Bahasa Mandar", R.string.bhs1, R.drawable.suku1));
                lsMenu.add(new MenuModel("Bahasa Baras", R.string.bhs2, R.drawable.suku2));
                lsMenu.add(new MenuModel("Bahasa Benggaulu", R.string.bhs3, R.drawable.suku3));
                lsMenu.add(new MenuModel("Bahasa Budong-Budong", R.string.bhs4, R.drawable.suku4));
                lsMenu.add(new MenuModel("Bahasa Kone-Konee", R.string.bhs5, R.drawable.suku4));
                lsMenu.add(new MenuModel("Bahasa Mamasa", R.string.bhs6, R.drawable.suku4));
                lsMenu.add(new MenuModel("Bahasa Mamuju", R.string.bhs7, R.drawable.suku4));
                lsMenu.add(new MenuModel("Bahasa Pannei", R.string.bhs8, R.drawable.suku4));
                lsMenu.add(new MenuModel("Bahasa Topoiyo", R.string.bhs9, R.drawable.suku4));

                RecyclerView myrvBhs=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterBhs=new MenuAdapter(this, lsMenu);
                myrvBhs.setLayoutManager(new GridLayoutManager(this, 1));
                myrvBhs.setAdapter(myAdapterBhs);
            break;

            case "Suku":
                getSupportActionBar().setTitle("Suku didaerah Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Suku Mandar", R.string.desc_suku1, R.drawable.suku1));
                lsMenu.add(new MenuModel("Suku Pattae", R.string.desc_suku2, R.drawable.suku2));
                lsMenu.add(new MenuModel("Suku Pannei", R.string.desc_suku3, R.drawable.suku3));
                lsMenu.add(new MenuModel("Suku Pattijo", R.string.desc_suku4, R.drawable.suku4));

                RecyclerView myrvSuku=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterSuku=new MenuAdapter(this, lsMenu);
                myrvSuku.setLayoutManager(new GridLayoutManager(this, 1));
                myrvSuku.setAdapter(myAdapterSuku);
            break;

            case "Tari":
                getSupportActionBar().setTitle("Tarian Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Tari Bulu Londong", R.string.desc_tari1, R.drawable.tari1));
                lsMenu.add(new MenuModel("Tari Mappande Banua (Macceraq Banua)", R.string.desc_tari2, R.drawable.tari2));
                lsMenu.add(new MenuModel("Tari Patuddu", R.string.desc_tari3, R.drawable.tari3));
                lsMenu.add(new MenuModel("Tari Salabose Daeng Poralle", R.string.desc_tari4, R.drawable.tari4));
                lsMenu.add(new MenuModel("Tari Bamba Manurung", R.string.desc_tari5, R.drawable.tari5));
                lsMenu.add(new MenuModel("Tari Toerang Batu", R.string.desc_tari6, R.drawable.tari6));
                lsMenu.add(new MenuModel("Tari Sayyang Pattuqduq", R.string.desc_tari7, R.drawable.tari7));
                lsMenu.add(new MenuModel("Tari Ma’Bundu", R.string.desc_tari8, R.drawable.tari8));

                RecyclerView myrvTari=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterTari=new MenuAdapter(this, lsMenu);
                myrvTari.setLayoutManager(new GridLayoutManager(this, 1));
                myrvTari.setAdapter(myAdapterTari);
            break;

            case "Hand":
                getSupportActionBar().setTitle("Karajinan Tangan Khas Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Kerajian 1", R.string.desc_tari1, R.drawable.tari1));
                lsMenu.add(new MenuModel("Kerajian 2", R.string.desc_tari2, R.drawable.tari2));
                lsMenu.add(new MenuModel("Kerajian 3", R.string.desc_tari3, R.drawable.tari3));
                lsMenu.add(new MenuModel("Kerajian 4", R.string.desc_tari4, R.drawable.tari4));
                lsMenu.add(new MenuModel("Kerajian 5", R.string.desc_tari5, R.drawable.tari5));

                RecyclerView myrvHand=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterHand=new MenuAdapter(this, lsMenu);
                myrvHand.setLayoutManager(new GridLayoutManager(this, 1));
                myrvHand.setAdapter(myAdapterHand);
            break;

            case "Baju":
                getSupportActionBar().setTitle("Pakaian Adat Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Baju 1", R.string.desc_tari1, R.drawable.tari1));
                lsMenu.add(new MenuModel("Baju 2", R.string.desc_tari2, R.drawable.tari2));
                lsMenu.add(new MenuModel("Baju 3", R.string.desc_tari3, R.drawable.tari3));
                lsMenu.add(new MenuModel("Baju 4", R.string.desc_tari4, R.drawable.tari4));
                lsMenu.add(new MenuModel("Baju 5", R.string.desc_tari5, R.drawable.tari5));

                RecyclerView myrvBaju=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterBaju=new MenuAdapter(this, lsMenu);
                myrvBaju.setLayoutManager(new GridLayoutManager(this, 1));
                myrvBaju.setAdapter(myAdapterBaju);
            break;

            case "Senjata":
                getSupportActionBar().setTitle("Senjata Khas Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Alat 1", R.string.desc_tari1, R.drawable.tari1));
                lsMenu.add(new MenuModel("Alat 2", R.string.desc_tari2, R.drawable.tari2));
                lsMenu.add(new MenuModel("ALat 3", R.string.desc_tari3, R.drawable.tari3));
                lsMenu.add(new MenuModel("Alat 4", R.string.desc_tari4, R.drawable.tari4));
                lsMenu.add(new MenuModel("Alat 5", R.string.desc_tari5, R.drawable.tari5));

                RecyclerView myrvSenjata=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterSenjata=new MenuAdapter(this, lsMenu);
                myrvSenjata.setLayoutManager(new GridLayoutManager(this, 1));
                myrvSenjata.setAdapter(myAdapterSenjata);
            break;

            case "Makan":
                getSupportActionBar().setTitle("Makanan Khas Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Kue 1", R.string.desc_tari1, R.drawable.tari1));
                lsMenu.add(new MenuModel("Kue 2", R.string.desc_tari2, R.drawable.tari2));
                lsMenu.add(new MenuModel("Kue 3", R.string.desc_tari3, R.drawable.tari3));
                lsMenu.add(new MenuModel("Kue 4", R.string.desc_tari4, R.drawable.tari4));
                lsMenu.add(new MenuModel("Kue 5", R.string.desc_tari5, R.drawable.tari5));

                RecyclerView myrvKue=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterKue=new MenuAdapter(this, lsMenu);
                myrvKue.setLayoutManager(new GridLayoutManager(this, 1));
                myrvKue.setAdapter(myAdapterKue);
            break;
        }
    }
}