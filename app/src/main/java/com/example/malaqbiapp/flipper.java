package com.example.malaqbiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class flipper extends AppCompatActivity {
    private Button btn_Daftar, btn_Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);

        btn_Daftar=findViewById(R.id.btnGoDaftar);
        btn_Login=findViewById(R.id.btnGoLogin);

        btn_Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goDaftar1= new Intent(flipper.this, daftar.class);
                startActivity(goDaftar1);
            }
        });

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin1=new Intent(flipper.this, login.class);
                startActivity(goLogin1);
            }
        });
    }
}