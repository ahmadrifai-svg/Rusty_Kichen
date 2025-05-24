package model;

public class modelTransaksi{

    public String getidTransaksi() {
        return idTransaksi;
    }

    public void setidTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public modelUser getModelUser() {
        return modelUser;
    }

    public void setModelUser(modelUser modelUser) {
        this.modelUser = modelUser;
    }

    public ModelMenu getModelMenu() {
        return modelMenu;
    }

    public void setModelMenu(ModelMenu modelMenu) {
        this.modelMenu = modelMenu;
    }

    public modelPelanggan getModelPelanggan() {
        return modelPelanggan;
    }

    public void setModelPelanggan(modelPelanggan modelPelanggan) {
        this.modelPelanggan = modelPelanggan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(Double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Double getBayar() {
        return bayar;
    }

    public void setBayar(Double bayar) {
        this.bayar = bayar;
    }

    public Double getDiskon() {
        return diskon;
    }

    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }

    public Double getKembali() {
        return kembali;
    }

    public void setKembali(Double kembali) {
        this.kembali = kembali;
    }
    private String idTransaksi;
    private modelUser modelUser;
    private ModelMenu modelMenu;
    private modelPelanggan modelPelanggan;
    private String tanggal;
    private Double totalHarga;
    private Double bayar;
    private Double diskon;
    private Double kembali;
    
}