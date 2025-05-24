package service;

import java.util.List;
import model.modelTransaksi;

public interface serviceTransaksi {
    void tambahData(modelTransaksi menu);
    
    List<modelTransaksi> tampilData();
    List<modelTransaksi> pencarianData(String Id);
    
    String noTransaksi();
}