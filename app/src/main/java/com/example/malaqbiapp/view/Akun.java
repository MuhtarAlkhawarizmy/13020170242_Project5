package com.example.malaqbiapp.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.behind.flipper;
import com.example.malaqbiapp.model.AkunModel;
import com.example.malaqbiapp.view2.edit_akun;

public class Akun extends Fragment {
    TextView id3, nama3, pass3, alamat3, telp3, note3;

    private Toolbar toolbarEdit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_akun, container, false);

        id3=view.findViewById(R.id.textId3);
        nama3=view.findViewById(R.id.textNama3);
        pass3=view.findViewById(R.id.textPass3);
        alamat3=view.findViewById(R.id.textAlamat3);
        telp3=view.findViewById(R.id.textTelp3);
        note3=view.findViewById(R.id.textNote3);


        toolbarEdit=view.findViewById(R.id.profileToolbar);
        toolbarEdit.setOverflowIcon(getResources().getDrawable(R.drawable.ic_more_vert_white_24dp));
        toolbarEdit.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.idChangePicture:
                        Toast.makeText(getActivity(),"Maaf menu belum tersedia", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.idChangeProfile:
                        startActivity(new Intent(getActivity(), edit_akun.class));
                        break;
                    case R.id.idSignOut:
                        startActivity(new Intent(getActivity(), flipper.class));
                        break;
                    case R.id.idAbout:
                        startActivity(new Intent(getActivity(), about.class));
                        break;
                }
                return true;
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        setDataAkun();
    }

    public void setDataAkun(){
        id3.setText(AkunModel.id_utm);
        nama3.setText(AkunModel.nama_utm);
        pass3.setText(AkunModel.pass_utm);
        alamat3.setText(AkunModel.alamat_utm);
        telp3.setText(AkunModel.telp_utm);
        note3.setText(AkunModel.note_utm);

    }
}