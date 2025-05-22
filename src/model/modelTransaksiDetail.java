package model;

public class modelTransaksiDetail{
    private modelTransaksi modelTransaksi;
    private ModelMenu modelMenu;
    private int jumlah;
    private double Subtotal;

    public modelTransaksi getModelTransaksi() {
        return modelTransaksi;
    }

    public void setModelTransaksi(modelTransaksi modelTransaksi) {
        this.modelTransaksi = modelTransaksi;
    }

    public ModelMenu getModelMenu() {
        return modelMenu;
    }

    public void setModelMenu(ModelMenu modelMenu) {
        this.modelMenu = modelMenu;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }
    
}