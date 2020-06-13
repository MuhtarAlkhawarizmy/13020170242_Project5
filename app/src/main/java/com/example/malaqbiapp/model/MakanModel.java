package com.example.malaqbiapp.model;

public class MakanModel {
    private String Title;
    private int Descripsi;
    private int foto;

    public MakanModel(String title, int descripsi, int foto) {
        Title = title;
        Descripsi = descripsi;
        this.foto = foto;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setDescripsi(int descripsi) {
        Descripsi = descripsi;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getTitle() {
        return Title;
    }

    public int getDescripsi() {
        return Descripsi;
    }

    public int getFoto() {
        return foto;
    }
}
