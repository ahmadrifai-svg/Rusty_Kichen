package service;

import java.util.List;
import model.modelPelanggan;

public interface servicePelanggan {
    void tambahData(modelPelanggan model);
    void updateData(modelPelanggan model);
    void hapusData(modelPelanggan model);
    
    
    List<modelPelanggan> tampilData();
    List<modelPelanggan> pencarianData(String Id);
    List<modelPelanggan> ambilPelanggan();
}