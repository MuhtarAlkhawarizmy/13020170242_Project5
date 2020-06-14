package com.example.malaqbiapp.model;

public class MusicModel {
    private String Title;
    private int Descripsi;
    private String Lagu;
    private int foto;

    public MusicModel(String title, int descripsi, String lagu, int foto) {
        Title = title;
        Descripsi = descripsi;
        Lagu = lagu;
        this.foto = foto;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescripsi(int descripsi) {
        Descripsi = descripsi;
    }

    public void setLagu(String lagu) {
        Lagu = lagu;
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

    public String getLagu() {
        return Lagu;
    }

    public int getFoto() {
        return foto;
    }
}
