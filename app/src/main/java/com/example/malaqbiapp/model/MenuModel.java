package com.example.malaqbiapp.model;

public class MenuModel {
    private String Title;
    private int Descripsi;
    private String Kode;
    private int foto;

    public MenuModel(String title, int descripsi, String kode, int foto) {
        Title = title;
        Descripsi = descripsi;
        Kode=kode;
        this.foto = foto;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String kode) {
        Kode = kode;
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
