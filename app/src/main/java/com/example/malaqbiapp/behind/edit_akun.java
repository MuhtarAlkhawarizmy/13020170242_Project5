package com.example.malaqbiapp.behind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.malaqbiapp.R;

public class edit_akun extends AppCompatActivity {
    private Toolbar toolbarEditAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_akun);

        toolbarEditAkun=findViewById(R.id.toolbarEditAkun);
        toolbarEditAkun.setTitle("Edit Akun");
        setSupportActionBar(toolbarEditAkun);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}