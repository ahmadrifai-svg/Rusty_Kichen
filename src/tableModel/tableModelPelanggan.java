package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.modelPelanggan;

public class tableModelPelanggan extends AbstractTableModel {
    
    private List<modelPelanggan> list = new ArrayList<>();
    
    public modelPelanggan getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<modelPelanggan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(modelPelanggan model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan ");
    }
    public void updateData(int row, modelPelanggan model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil DiPerbarui ");
    }
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus ");
    }
            
    private String[] columnNames = {"ID", "Nama Pelanggan", "Alamat", "No Telp"};
    

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override   
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        modelPelanggan model = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return model.getIdPelanggan(); // Menggunakan getIdMenu() jika ini sesuai dengan modelPelanggan
            case 1: return model.getNamaPelanggan();
            case 2: return model.getAlamat();
            case 3: return model.getTelepon(); // Menggunakan getNamaKategori() jika ini sesuai dengan modelPelanggan
           
            default: 
                return null;
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
