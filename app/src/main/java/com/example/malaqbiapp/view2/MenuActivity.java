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
                lsMenu.add(new MenuModel("Bahasa Mandar", R.string.bhs1, "Bahasa daerah", R.drawable.suku1));
                lsMenu.add(new MenuModel("Bahasa Baras", R.string.bhs2, "Bahasa daerah", R.drawable.suku2));
                lsMenu.add(new MenuModel("Bahasa Benggaulu", R.string.bhs3,"Bahasa daerah", R.drawable.suku3));
                lsMenu.add(new MenuModel("Bahasa Budong-Budong", R.string.bhs4,"Bahasa daerah", R.drawable.suku4));
                lsMenu.add(new MenuModel("Bahasa Kone-Konee", R.string.bhs5, "Bahasa daerah", R.drawable.suku1));
                lsMenu.add(new MenuModel("Bahasa Mamasa", R.string.bhs6, "Bahasa daerah", R.drawable.suku1));
                lsMenu.add(new MenuModel("Bahasa Mamuju", R.string.bhs7,"Bahasa daerah", R.drawable.suku1));
                lsMenu.add(new MenuModel("Bahasa Pannei", R.string.bhs8,"Bahasa daerah", R.drawable.suku1));
                lsMenu.add(new MenuModel("Bahasa Topoiyo", R.string.bhs9, "Bahasa daerah", R.drawable.suku1));

                RecyclerView myrvBhs=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterBhs=new MenuAdapter(this, lsMenu);
                myrvBhs.setLayoutManager(new GridLayoutManager(this, 1));
                myrvBhs.setAdapter(myAdapterBhs);
            break;

            case "Suku":
                getSupportActionBar().setTitle("Suku didaerah Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Suku Mandar", R.string.desc_suku1, "Suku Sulawesi Barat", R.drawable.suku1));
                lsMenu.add(new MenuModel("Suku Pattae", R.string.desc_suku2, "Suku Sulawesi Barat", R.drawable.suku2));
                lsMenu.add(new MenuModel("Suku Pannei", R.string.desc_suku3, "Suku Sulawesi Barat", R.drawable.suku3));
                lsMenu.add(new MenuModel("Suku Pattijo", R.string.desc_suku4, "Suku Sulawesi Barat", R.drawable.suku4));

                RecyclerView myrvSuku=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterSuku=new MenuAdapter(this, lsMenu);
                myrvSuku.setLayoutManager(new GridLayoutManager(this, 1));
                myrvSuku.setAdapter(myAdapterSuku);
            break;

            case "Tari":
                getSupportActionBar().setTitle("Tarian Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Tari Bulu Londong", R.string.desc_tari1, "Budaya Sulawesi Barat", R.drawable.tari1));
                lsMenu.add(new MenuModel("Tari Mappande Banua (Macceraq Banua)", R.string.desc_tari2, "Budaya Sulawesi Barat", R.drawable.tari2));
                lsMenu.add(new MenuModel("Tari Patuddu", R.string.desc_tari3, "Budaya Sulawesi Barat", R.drawable.tari3));
                lsMenu.add(new MenuModel("Tari Salabose Daeng Poralle", R.string.desc_tari4, "Budaya Sulawesi Barat", R.drawable.tari4));
                lsMenu.add(new MenuModel("Tari Bamba Manurung", R.string.desc_tari5, "Budaya Sulawesi Barat", R.drawable.tari5));
                lsMenu.add(new MenuModel("Tari Toerang Batu", R.string.desc_tari6, "Budaya Sulawesi Barat", R.drawable.tari6));
                lsMenu.add(new MenuModel("Tari Sayyang Pattuqduq", R.string.desc_tari7, "Budaya Sulawesi Barat", R.drawable.tari7));
                lsMenu.add(new MenuModel("Tari Ma’Bundu", R.string.desc_tari8, "Budaya Sulawesi Barat", R.drawable.tari8));

                RecyclerView myrvTari=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterTari=new MenuAdapter(this, lsMenu);
                myrvTari.setLayoutManager(new GridLayoutManager(this, 1));
                myrvTari.setAdapter(myAdapterTari);
            break;

            case "Hand":
                getSupportActionBar().setTitle("Karajinan Tangan Khas Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Kerajinan Marmer", R.string.hand1, "Buah Tangan Sulawesi Barat", R.drawable.hand1));
                lsMenu.add(new MenuModel("Sarung Tenun Sutra Dari Mandar", R.string.hand2, "Buah Tangan Sulawesi Barat", R.drawable.hand2));
                lsMenu.add(new MenuModel("Tenun Mamasa", R.string.hand3, "Buah Tangan Sulawesi Barat", R.drawable.hand3));
                lsMenu.add(new MenuModel("Tenun Ikat Sekomandi", R.string.hand4, "Buah Tangan Sulawesi Barat", R.drawable.hand4));

                RecyclerView myrvHand=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterHand=new MenuAdapter(this, lsMenu);
                myrvHand.setLayoutManager(new GridLayoutManager(this, 1));
                myrvHand.setAdapter(myAdapterHand);
            break;

            case "Baju":
                getSupportActionBar().setTitle("Pakaian Adat Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Pakaian Utama", R.string.baju1, "Budaya Sulawesi Barat", R.drawable.baju1));
                lsMenu.add(new MenuModel("Penghias Kepala", R.string.baju2, "Budaya Sulawesi Barat", R.drawable.baju2));
                lsMenu.add(new MenuModel("Pakaian Adat Laki-laki", R.string.baju3, "Budaya Sulawesi Barat", R.drawable.baju3));

                RecyclerView myrvBaju=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterBaju=new MenuAdapter(this, lsMenu);
                myrvBaju.setLayoutManager(new GridLayoutManager(this, 1));
                myrvBaju.setAdapter(myAdapterBaju);
            break;

            case "Senjata":
                getSupportActionBar().setTitle("Senjata Khas Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Badik", R.string.badik1, "Senjata Khas Sulawesi Barat", R.drawable.badik1));
                lsMenu.add(new MenuModel("Keris (Gayang)", R.string.badik2, "Senjata Khas Sulawesi Barat", R.drawable.badik2));
                lsMenu.add(new MenuModel("Kandawulo (Parang Panjang)", R.string.badik3,"Senjata Khas Sulawesi Barat",  R.drawable.badik3));

                RecyclerView myrvSenjata=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterSenjata=new MenuAdapter(this, lsMenu);
                myrvSenjata.setLayoutManager(new GridLayoutManager(this, 1));
                myrvSenjata.setAdapter(myAdapterSenjata);
            break;

            case "Makan":
                getSupportActionBar().setTitle("Makanan Khas Sulbar");
                lsMenu=new ArrayList<>();
                lsMenu.add(new MenuModel("Bau Peapi", R.string.kue1, "Kuliner Khas Sulawesi Barat", R.drawable.kue1));
                lsMenu.add(new MenuModel("Roti Pawa", R.string.kue2, "Kuliner Khas Sulawesi Barat", R.drawable.kue2));
                lsMenu.add(new MenuModel("Kue Paso", R.string.kue3, "Kuliner Khas Sulawesi Barat", R.drawable.kue3));
                lsMenu.add(new MenuModel("Bolu Paranggi", R.string.kue4, "Kuliner Khas Sulawesi Barat", R.drawable.kue4));
                lsMenu.add(new MenuModel("Kue Tetu", R.string.kue5, "Kuliner Khas Sulawesi Barat", R.drawable.kue5));
                lsMenu.add(new MenuModel("Jepa", R.string.kue6, "Kuliner Khas Sulawesi Barat", R.drawable.kue6));
                lsMenu.add(new MenuModel("Kue Kui Kui", R.string.kue7, "Kuliner Khas Sulawesi Barat", R.drawable.kue7));
                lsMenu.add(new MenuModel("Kue Cucur", R.string.kue8, "Kuliner Khas Sulawesi Barat", R.drawable.kue8));

                RecyclerView myrvKue=(RecyclerView) findViewById(R.id.recyclerMenu);
                MenuAdapter myAdapterKue=new MenuAdapter(this, lsMenu);
                myrvKue.setLayoutManager(new GridLayoutManager(this, 1));
                myrvKue.setAdapter(myAdapterKue);
            break;
        }
    }
}