package com.example.malaqbiapp.view2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.malaqbiapp.R;

public class desc_Menu extends AppCompatActivity {
    private Toolbar toolbarDescDaerah;
    private TextView tvTitle, tvDesc, tvKode;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_menu);

        toolbarDescDaerah=findViewById(R.id.toolbar_DescDaerah);
        toolbarDescDaerah.setTitle("Detail Daerah");
        setSupportActionBar(toolbarDescDaerah);
        toolbarDescDaerah.setNavigationIcon(R.drawable.btn_back);
        toolbarDescDaerah.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tvTitle=findViewById(R.id.txtTitleDaerah);
        tvKode=findViewById(R.id.txtCatDaerah);
        tvDesc=findViewById(R.id.txtDescDaerah);
        img=findViewById(R.id.daerahThumbail);

        Intent getDescDaerah=getIntent();
        String Title=getDescDaerah.getExtras().getString("Title");
        int Descripsi=getDescDaerah.getExtras().getInt("Descripsi");
        String Kode=getDescDaerah.getExtras().getString("Kode");
        int image=getDescDaerah.getExtras().getInt("foto");

        tvTitle.setText(Title);
        tvDesc.setText(Descripsi);
        tvKode.setText(Kode);
        img.setImageResource(image);
    }
}