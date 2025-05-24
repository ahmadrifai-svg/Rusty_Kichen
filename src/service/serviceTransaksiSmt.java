package service;

import java.util.List;
import model.modelTransaksiSmt;

public interface serviceTransaksiSmt {
    void tambahData(modelTransaksiSmt model);
    void perbaruiData(modelTransaksiSmt model);
    void hapusData (modelTransaksiSmt model);
    
    List<modelTransaksiSmt> tampilData();
}