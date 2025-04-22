package service;

import java.util.List;
import model.ModelMenu;

public interface serviceMenu {
    void tambahData(ModelMenu menu);
    void updateData(ModelMenu menu);
    void hapusData(int id);
    List<ModelMenu> tampilData();
    List<ModelMenu> pencarianData(String keyword);
}