package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.ModelMenu;

public class tableModelMenu extends AbstractTableModel {
    
    private List<ModelMenu> list = new ArrayList<>();
    
    public ModelMenu getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelMenu> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(ModelMenu menu){
        list.add(menu);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan ");
    }
    public void updateData(int row, ModelMenu menu){
        list.set(row, menu);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil DiPerbarui ");
    }
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus ");
    }
            
    private String[] columnNames = {"ID", "Nama Menu", "Harga", "Barcode", "id Kategori"};
    

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
        ModelMenu menu = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return menu.getIdMenu(); // Menggunakan getIdMenu() jika ini sesuai dengan ModelMenu
            case 1: return menu.getNamaMenu();
            case 2: long hargaBulatan = Math.round(menu.getHarga());
                    return String.valueOf(hargaBulatan);
            case 3: return menu.getBarcode();
            case 4: return menu.getIdKategori(); // Menggunakan getNamaKategori() jika ini sesuai dengan ModelMenu
           
            default: 
                return null;
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
