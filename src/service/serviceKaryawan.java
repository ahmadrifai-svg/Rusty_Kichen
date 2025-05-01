/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.ModelKaryawan;
import java.util.List;

public interface serviceKaryawan {
    void tambahData     (ModelKaryawan model);
    void perbaruiData   (ModelKaryawan model);
    void hapusData     (ModelKaryawan model);
    
    List<ModelKaryawan> tampilData();
    List<ModelKaryawan> pencarianData(String id);
    
    String generateSHA256(String password);
}
