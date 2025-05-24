package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.modelTransaksiSmt;

public class tableModelTransaksiSmt extends AbstractTableModel {
    
    private List<modelTransaksiSmt> list = new ArrayList<>();
    
    public modelTransaksiSmt getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<modelTransaksiSmt> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(modelTransaksiSmt model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan ");
    }
    public void updateData(int row, modelTransaksiSmt model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil DiPerbarui ");
    }
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus ");
    }
            
    private String[] columnNames = {"No","Id Menu", "Barcode", "Nama Menu" ,"Harga", "Jumlah","Sub Total"};
    

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
        modelTransaksiSmt model = list.get(rowIndex);
        if(columnIndex == 0){
            return "   " + (rowIndex + 1);
        }else {
            switch (columnIndex) {
                case 1: return model.getModelMenu().getIdMenu(); // Menggunakan getIdmodel() jika ini sesuai dengan modelTransaksiSmt
                case 2: return model.getModelMenu().getBarcode();
                case 3: return model.getModelMenu().getNamaMenu();
                case 4: return model.getModelMenu().getHarga();
                case 5: return model.getModelTranDet().getJumlah();
                case 6: return model.getModelTranDet().getSubtotal();
                default: 
                    return null;
            }
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
