package com.example.malaqbiapp.view2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.adapter.SukuAdapter;
import com.example.malaqbiapp.adapter.TariAdapter;
import com.example.malaqbiapp.model.SukuModel;
import com.example.malaqbiapp.model.TarianModel;

import java.util.ArrayList;
import java.util.List;

public class SukuActivity extends AppCompatActivity {
    private Toolbar toolbarSuku;
    List<SukuModel> lsSuku;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suku);

        toolbarSuku=findViewById(R.id.toolbarSuku);
        toolbarSuku.setTitle("Suku didaerah Sulbar");
        setSupportActionBar(toolbarSuku);
        toolbarSuku.setNavigationIcon(R.drawable.btn_back);
        toolbarSuku.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent go=getIntent();
        i=getIntent();
        change(i);

    }
    private void change(Intent i){
        switch (i.getStringExtra("Menu")){
            case "Bhs":
                getSupportActionBar().setTitle("Bahasa daerah diSulbar");
                lsSuku=new ArrayList<>();
                lsSuku.add(new SukuModel("Bahasa Mandar", R.string.desc_suku1, R.drawable.suku1));
                lsSuku.add(new SukuModel("Bahasa Pattae", R.string.desc_suku2, R.drawable.suku2));
                lsSuku.add(new SukuModel("Bahasa Pannei", R.string.desc_suku3, R.drawable.suku3));
                lsSuku.add(new SukuModel("Bahasa Pattijo", R.string.desc_suku4, R.drawable.suku4));
                RecyclerView myrvBhs=(RecyclerView) findViewById(R.id.recyclerSuku);
                SukuAdapter myAdapterBhs=new SukuAdapter(this, lsSuku);
                myrvBhs.setLayoutManager(new GridLayoutManager(this, 1));
                myrvBhs.setAdapter(myAdapterBhs);
            break;

            case "Suku":
                getSupportActionBar().setTitle("Bahasa daerah diSulbar");
                lsSuku=new ArrayList<>();
                lsSuku.add(new SukuModel("Suku Mandar", R.string.desc_suku1, R.drawable.suku1));
                lsSuku.add(new SukuModel("Suku Pattae", R.string.desc_suku2, R.drawable.suku2));
                lsSuku.add(new SukuModel("Suku Pannei", R.string.desc_suku3, R.drawable.suku3));
                lsSuku.add(new SukuModel("Suku Pattijo", R.string.desc_suku4, R.drawable.suku4));

                RecyclerView myrvSuku=(RecyclerView) findViewById(R.id.recyclerSuku);
                SukuAdapter myAdapterSuku=new SukuAdapter(this, lsSuku);
                myrvSuku.setLayoutManager(new GridLayoutManager(this, 1));
                myrvSuku.setAdapter(myAdapterSuku);

        }
    }
}