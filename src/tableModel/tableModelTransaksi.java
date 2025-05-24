package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.modelTransaksi;

public class tableModelTransaksi extends AbstractTableModel {
    
    private List<modelTransaksi> list = new ArrayList<>();
    
    public modelTransaksi getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<modelTransaksi> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(modelTransaksi model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan ");
    }
    public void updateData(int row, modelTransaksi model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil DiPerbarui ");
    }
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil DiHapus ");
    }
            
    private String[] columnNames = {"No","Id Transaksi", "Nama User" ,"Id Pelanggan", "Nama Pelanggan","Tanggal", "Harga","Bayar", "Kembali", "Diskon"};
    

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
        modelTransaksi model = list.get(rowIndex);
        if(columnIndex == 0){
            return "   " + (rowIndex + 1);
        }else {
            switch (columnIndex) {
                case 1: return model.getidTransaksi(); // Menggunakan getIdmodel() jika ini sesuai dengan modelTransaksi
                case 2: return model.getModelUser().getUsername();
                case 3: return model.getModelPelanggan().getIdPelanggan();
                case 4: return model.getModelPelanggan().getNamaPelanggan();
                case 5: return model.getTanggal();  
                case 6: return model.getTotalHarga();
                case 7: return model.getBayar();
                case 8: return model.getKembali();
                case 9: return model.getDiskon();
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
