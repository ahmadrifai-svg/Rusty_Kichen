package model;

public class modelTransaksi{

    private String idTransaksi;
    private modelUser modelUser;
    private ModelMenu modelMenu;
    private modelPelanggan modelPelanggan;
    private ModelMeja modelMeja;
    private String tanggal;
    private Double totalHarga;
    private Double bayar;
    private Double diskon;
    private Double kembali;

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
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

    public ModelMeja getModelMeja() {
        return modelMeja;
    }

    public void setModelMeja(ModelMeja modelMeja) {
        this.modelMeja = modelMeja;
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
    
}