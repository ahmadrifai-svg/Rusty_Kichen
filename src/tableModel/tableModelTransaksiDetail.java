package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.modelTransaksiDetail;

public class tableModelTransaksiDetail extends AbstractTableModel {
    
    private List<modelTransaksiDetail> list = new ArrayList<>();
    
    public modelTransaksiDetail getData(int index) {
        if (index < 0 || index >= list.size()) {
            return null; // Hindari IndexOutOfBoundsException
        }
        return list.get(index);
    }
    
    public void clear() {
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<modelTransaksiDetail> list) {
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(modelTransaksiDetail model) {
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, modelTransaksiDetail model) {
        if (row < 0 || row >= list.size()) {
            JOptionPane.showMessageDialog(null, "Baris tidak valid untuk diperbarui!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        list.set(row, model);
        fireTableRowsUpdated(row, row); // Lebih spesifik daripada fireTableDataChanged
        JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
    }
    
    public void deleteData(int row) {
        if (row < 0 || row >= list.size()) {
            JOptionPane.showMessageDialog(null, "Baris tidak valid untuk dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
            
    private String[] columnNames = {"No", "Id Transaksi", "Id Menu", "Nama Menu", "Jumlah",  "Subtotal"};

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
        // Pengecekan indeks baris
        if (rowIndex < 0 || rowIndex >= list.size()) {
            return null; // Hindari IndexOutOfBoundsException
        }
        if (columnIndex < 0 || columnIndex >= columnNames.length) {
            return null; // Hindari akses kolom yang tidak valid
        }

        modelTransaksiDetail model = list.get(rowIndex);
        try {
            switch (columnIndex) {
                case 0: 
                    return rowIndex + 1; // Nomor urut tanpa spasi berlebih
                case 1: 
                    return model.getModelTransaksi() != null ? model.getModelTransaksi().getIdTransaksi(): "-";
                case 2: 
                    return model.getModelMenu() != null ? model.getModelMenu().getIdMenu() : "-";
                case 3: 
                    return model.getModelMenu() != null ? model.getModelMenu().getNamaMenu() : "-";
                case 4: 
                    return model.getJumlah();
                case 5: 
                    return model.getSubtotal();
                default: 
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Error di getValueAt: " + e.getMessage());
            return "-"; // Kembalikan nilai default jika terjadi error
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}