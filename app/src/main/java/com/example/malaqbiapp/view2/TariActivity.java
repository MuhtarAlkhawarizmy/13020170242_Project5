package com.example.malaqbiapp.view2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.adapter.TariAdapter;
import com.example.malaqbiapp.model.TarianModel;

import java.util.ArrayList;
import java.util.List;

public class TariActivity extends AppCompatActivity {
    private Toolbar toolbarTari;
    List<TarianModel> lsTari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tari);

        toolbarTari=findViewById(R.id.toolbarTari);
        toolbarTari.setTitle("Tarian Sulbar");
        setSupportActionBar(toolbarTari);
        toolbarTari.setNavigationIcon(R.drawable.btn_back);
        toolbarTari.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        lsTari=new ArrayList<>();
        lsTari.add(new TarianModel("Tari Bulu Londong", R.string.desc_tari1, R.drawable.tari1));
        lsTari.add(new TarianModel("Tari Mappande Banua (Macceraq Banua)", R.string.desc_tari2, R.drawable.tari2));
        lsTari.add(new TarianModel("Tari Patuddu", R.string.desc_tari3, R.drawable.tari3));
        lsTari.add(new TarianModel("Tari Salabose Daeng Poralle", R.string.desc_tari4, R.drawable.tari4));
        lsTari.add(new TarianModel("Tari Bamba Manurung", R.string.desc_tari5, R.drawable.tari5));
        lsTari.add(new TarianModel("Tari Toerang Batu", R.string.desc_tari6, R.drawable.tari6));
        lsTari.add(new TarianModel("Tari Sayyang Pattuqduq", R.string.desc_tari7, R.drawable.tari7));
        lsTari.add(new TarianModel("Tari Ma’Bundu", R.string.desc_tari8, R.drawable.tari8));

        RecyclerView myrvTari=(RecyclerView) findViewById(R.id.recyclerTari);
        TariAdapter myAdapterTari=new TariAdapter(this, lsTari);
        myrvTari.setLayoutManager(new GridLayoutManager(this, 1));
        myrvTari.setAdapter(myAdapterTari);

    }
}