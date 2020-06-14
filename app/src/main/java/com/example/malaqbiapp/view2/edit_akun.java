package com.example.malaqbiapp.view2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.behind.login;
import com.example.malaqbiapp.model.AkunModel;
import com.example.malaqbiapp.view.Akun;
import com.example.malaqbiapp.view.MainActivity;
import com.google.android.material.textfield.TextInputLayout;

public class edit_akun extends AppCompatActivity {
    private Toolbar toolbarEditAkun;
    EditText eId, eNama, ePass, eAlamat, eTelp, eNote;
    TextInputLayout z1, z2, z3, z4, z5, z6;
    private Button btnSImpan;
    String a,b,c,d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_akun);

        eId=findViewById(R.id.tvId);
        eNama=findViewById(R.id.tvNama);
        ePass=findViewById(R.id.tvPass);
        eAlamat=findViewById(R.id.tvAlamat);
        eTelp=findViewById(R.id.tvTelp);
        eNote=findViewById(R.id.tvNote);

        z1=findViewById(R.id.z1);
        z2=findViewById(R.id.z2);
        z3=findViewById(R.id.z3);
        z4=findViewById(R.id.z4);
        z5=findViewById(R.id.z5);
        z6=findViewById(R.id.z6);

        btnSImpan=findViewById(R.id.btnSimpan);

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
        eId.setText(AkunModel.id_utm);
        eNama.setText(AkunModel.nama_utm);
        ePass.setText(AkunModel.pass_utm);
        eAlamat.setText(AkunModel.alamat_utm);
        eTelp.setText(AkunModel.telp_utm);
        eNote.setText(AkunModel.note_utm);

        btnSImpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                AkunModel.id_utm=z1.getEditText().getText().toString();
                AkunModel.nama_utm=z2.getEditText().getText().toString();
                AkunModel.pass_utm=z3.getEditText().getText().toString();
                AkunModel.alamat_utm=z4.getEditText().getText().toString();
                AkunModel.telp_utm=z5.getEditText().getText().toString();
                AkunModel.note_utm=z6.getEditText().getText().toString();

                Toast.makeText(edit_akun.this, "Profil Berhasil di Update", Toast.LENGTH_SHORT).show();
                Intent goAkun1=new Intent(edit_akun.this, MainActivity.class);
                startActivity(goAkun1);
//                finish();
            }
        });

    }
}