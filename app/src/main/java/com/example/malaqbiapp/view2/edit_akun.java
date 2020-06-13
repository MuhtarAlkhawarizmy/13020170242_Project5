package com.example.malaqbiapp.view2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

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
        toolbarEditAkun.setNavigationIcon(R.drawable.btn_back);
        toolbarEditAkun.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}