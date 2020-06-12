package com.example.malaqbiapp.model;

public class Daerah_model {
    private String Title;
    private int Descripsi;
    private String Kode;
    private int foto;

    public Daerah_model(String title, int descripsi, String Kode, int foto) {
        Title = title;
        Descripsi = descripsi;
        this.Kode = Kode;
        this.foto = foto;
    }

    public String getKode() {
        return Kode;
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

    public void setKode(String kode) {
        this.Kode = kode;
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
}
