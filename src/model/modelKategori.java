package model;

public class modelKategori {
    private int idKategori;
    private String namaKategori;
    private String jenis;
    
    public modelKategori(int id, String nama, String jenis) {
    this.idKategori = id;
    this.namaKategori = nama;
    this.jenis = jenis;
}


    public modelKategori() {}

    public int getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getnamaKategori() {
        return namaKategori;
    }

    public void setnamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }
    public String getjenis() {
        return jenis;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
}
