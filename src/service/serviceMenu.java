package service;

import java.util.List;
import model.ModelMenu;

public interface serviceMenu {
    void tambahData(ModelMenu model);
    void updateData(ModelMenu model);
    void hapusData(ModelMenu model);
    
    
    List<ModelMenu> tampilData();
    List<ModelMenu> pencarianData(String Id);
    List<ModelMenu> pencarianDataByBarcode(String Id);
    
}