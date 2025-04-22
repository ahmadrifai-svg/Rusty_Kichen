package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ModelMenu;

public class tableModelMenu extends AbstractTableModel {
    private List<ModelMenu> data;
    private String[] columnNames = {"ID", "Nama Menu", "Harga", "Kategori"};

    public tableModelMenu() {
        data = new ArrayList<>();
    }

    public void setData(List<ModelMenu> data) {
        this.data = data;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelMenu menu = data.get(rowIndex);
        switch (columnIndex) {
            case 0: return menu.getIdMenu(); // Menggunakan getIdMenu() jika ini sesuai dengan ModelMenu
            case 1: return menu.getNamaMenu();
            case 2: return menu.getHarga();
            case 3: return menu.getNamaKategori(); // Menggunakan getNamaKategori() jika ini sesuai dengan ModelMenu
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
