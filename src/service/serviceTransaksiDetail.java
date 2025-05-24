package service;

import java.util.List;
import model.modelTransaksiDetail;

public interface serviceTransaksiDetail {
    void tambahData (modelTransaksiDetail model);
    void sumTotal   (modelTransaksiDetail model);
    void hapusDataSementara ();
    
    List<modelTransaksiDetail> tampilData(String Id);
    List<modelTransaksiDetail> pencarianData(String Id, String kataKunci);
     
}