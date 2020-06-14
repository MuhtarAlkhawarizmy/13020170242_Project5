package com.example.malaqbiapp.behind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.model.AkunModel;
import com.example.malaqbiapp.view.MainActivity;
import com.google.android.material.textfield.TextInputLayout;

public class login extends AppCompatActivity {
    private Button btn_login2, btn_fb2, btn_google2;
    String id, pass;
    private TextView text_daftar2;
    private TextInputLayout txtid, txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        text_daftar2=findViewById(R.id.textDaftar2);
        btn_login2=findViewById(R.id.btnMasuk2);
        btn_fb2=findViewById(R.id.btnFacebook2);
        btn_google2=findViewById(R.id.btnGoogle2);
        txtid=findViewById(R.id.txtId2);
        txtpass=findViewById(R.id.txtPass2);

        text_daftar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goDaftar= new Intent(login.this, daftar.class);
                startActivity(goDaftar);
            }
        });

//        Toast.makeText(login.this, "id : "+AkunModel.id_utm+" pass : "+AkunModel.pass_utm+" ", Toast.LENGTH_SHORT).show();
        btn_login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (txtid.getEditText().getText().toString().equals("") || txtpass.getEditText().getText().toString().equals("")){
                    Toast.makeText(login.this, "User_Id atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
                else if (txtid.getEditText().getText().toString().equals("4637") && txtpass.getEditText().getText().toString().equals("4637")){
                    Toast.makeText(login.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent goMain=new Intent(login.this, MainActivity.class);
                    startActivity(goMain);
                }
                else if (txtid.getEditText().getText().toString().equals(AkunModel.id_utm) && txtpass.getEditText().getText().toString().equals(AkunModel.pass_utm)){
                    Toast.makeText(login.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent goMain=new Intent(login.this, MainActivity.class);
                    startActivity(goMain);
                }
                else if ((txtid.getEditText().getText().toString()!=AkunModel.id_utm) || (txtpass.getEditText().getText().toString()!=AkunModel.pass_utm) || (txtid.getEditText().getText().toString()!="4637") || (txtpass.getEditText().getText().toString()!="4637")){
                    Toast.makeText(login.this, "User_Id atau Password salah", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(login.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_google2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this,"Cek konkesi anda!.. atau buat akun manual", Toast.LENGTH_SHORT).show();
            }
        });

        btn_fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(login.this, "Cek konkesi anda!.. atau buat akun manual", Toast.LENGTH_SHORT).show();
            }
        });
    }

}