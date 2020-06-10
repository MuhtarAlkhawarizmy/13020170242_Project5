package com.example.malaqbiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {
    private Button btn_daftar2, btn_login2, btn_fb2, btn_google2;
    String id, pass;
    private TextInputLayout txtid, txtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_daftar2=findViewById(R.id.btnDaftar2);
        btn_login2=findViewById(R.id.btnMasuk2);
        btn_fb2=findViewById(R.id.btnFacebook2);
        btn_google2=findViewById(R.id.btnGoogle2);
        txtid=findViewById(R.id.txtId2);
        txtpass=findViewById(R.id.txtPass2);

        btn_daftar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goDaftar= new Intent(login.this, daftar.class);
                startActivity(goDaftar);
            }
        });

        btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id=txtid.getEditText().toString();
                pass=txtpass.getEditText().toString();
                if (txtid.getEditText().getText().toString().equals("4637") && (txtpass.getEditText().getText().toString().equals("4637"))){
                    Intent goMain=new Intent(login.this, MainActivity.class);
                    startActivity(goMain);
                }
                else {
                    Toast.makeText(login.this, "User_Id atau Password Anda Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_google2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this,"Maaf periksa konkesi anda!.. Silahkan Login manual ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this, "Maaf periksa konkesi anda!.. Silahkan buat Login manual ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}