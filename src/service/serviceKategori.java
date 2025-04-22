/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.modelKategori;

/**
 *
 * @author MyBook Hype AMD
 */
public interface serviceKategori {
    void tambahData(modelKategori kategori);
    void updateData(modelKategori kategori);
    void hapusData(int id);
    List<modelKategori> tampilData();
    List<modelKategori> pencarianData(String keyword);
}
