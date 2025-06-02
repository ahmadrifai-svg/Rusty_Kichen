package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.ModelMeja;

public class tableModelMeja extends AbstractTableModel {
    
    private List<ModelMeja> list = new ArrayList<>();
    
    public ModelMeja getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelMeja> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(ModelMeja meja){
        list.add(meja);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan ");
    }
    public void updateData(int row, ModelMeja meja){
        list.set(row, meja);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil DiPerbarui ");
    }
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus ");
    }
            
    private String[] columnNames = {"ID", "Nama Meja"};
    

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
        ModelMeja menu = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return menu.getIdMeja(); // Menggunakan getIdMenu() jika ini sesuai dengan ModelMeja
            case 1: return menu.getNomor();
           
            default: 
                return null;
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
