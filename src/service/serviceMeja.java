package service;

import java.util.List;
import model.ModelMeja;

public interface serviceMeja {
    void tambahData(ModelMeja model);
    void updateData(ModelMeja model);
    void hapusData(ModelMeja model);
    
    
    List<ModelMeja> tampilData();
    List<ModelMeja> pencarianData(String Id);
    List<ModelMeja> ambilMeja();
    
}