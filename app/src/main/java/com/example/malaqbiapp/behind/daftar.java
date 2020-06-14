package com.example.malaqbiapp.behind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.model.AkunModel;
import com.google.android.material.textfield.TextInputLayout;

public class daftar extends AppCompatActivity {
    private Button btn_daftar1, btn_fb1, btn_google1;
    private TextInputLayout txt_id1, txt_nama1, txtpass1;
    private TextView txt_login1;
    private EditText e1, e2, e3;
    String id, nama,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        AkunModel akun1;

        btn_daftar1=findViewById(R.id.btnDaftar1);
        txt_login1=findViewById(R.id.textMasuk1);
//        btn_login1=findViewById(R.id.btnMasuk1);
        btn_fb1=findViewById(R.id.btnFacebook1);
        btn_google1=findViewById(R.id.btnGoogle1);
        txt_id1=findViewById(R.id.txtId1);
        txt_nama1=findViewById(R.id.txtNama1);
        txtpass1=findViewById(R.id.txtPass1);
        e1=findViewById(R.id.c1);
        e2=findViewById(R.id.c2);
        e3=findViewById(R.id.c3);


        txt_login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goLogin=new Intent(daftar.this, login.class);
                startActivity(goLogin);
            }
        });

        btn_daftar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt_id1.getEditText().getText().toString().equals("") || txt_nama1.getEditText().getText().toString().equals("") || txtpass1.getEditText().getText().toString().equals("")){
                    Toast.makeText(daftar.this, "semua form Wajib diisi !", Toast.LENGTH_SHORT).show();
                }
                else {
                    AkunModel.id_utm=txt_id1.getEditText().getText().toString();
                    AkunModel.nama_utm=txt_nama1.getEditText().getText().toString();
                    AkunModel.pass_utm=txtpass1.getEditText().getText().toString();

                    Toast.makeText(daftar.this, "Akun : "+AkunModel.id_utm+" : berhasil dibuat, silahkan Login untuk Masuk", Toast.LENGTH_SHORT).show();
                    bersih();
                    Intent goLogin=new Intent(daftar.this, login.class);
                    startActivity(goLogin);
                }
            }
        });

        btn_google1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(daftar.this,"Cek konkesi anda!.. atau buat akun manual", Toast.LENGTH_SHORT).show();
            }
        });

        btn_fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(daftar.this, "Cek konkesi anda!.. atau buat akun manual", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void bersih(){
        e1.setText("");
        e2.setText("");
        e3.setText("");
    }
}