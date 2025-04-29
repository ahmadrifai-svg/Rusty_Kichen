package service;

import java.util.List;
import model.ModelMenu;

public interface serviceMenu {
    void tambahData(ModelMenu menu);
    void updateData(ModelMenu menu);
    void hapusData(ModelMenu menu);
    
    
    List<ModelMenu> tampilData();
    List<ModelMenu> pencarianData(String Id);
}