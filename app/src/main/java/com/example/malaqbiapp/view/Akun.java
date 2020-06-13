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
import android.widget.Toast;

import com.example.malaqbiapp.R;
import com.example.malaqbiapp.behind.flipper;
import com.example.malaqbiapp.view2.edit_akun;

public class Akun extends Fragment {
    private Button btn_edit;
    private Toolbar toolbarEdit;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_akun, container, false);


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
}