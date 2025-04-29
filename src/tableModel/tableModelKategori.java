/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.ModelMenu;
import model.modelKategori;
/**
 *
 * @author MyBook Hype AMD
 */
public class tableModelKategori extends AbstractTableModel{
    private List<modelKategori> data;
    private String[] columnNames = {"ID", "Nama Kategori","Sub Kategori"};
    
    public tableModelKategori() {
        data = new ArrayList<>();
    }

    public void setData(List<modelKategori> data) {
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
        modelKategori kategori = data.get(rowIndex);
        switch (columnIndex) {
            case 0: return kategori.getIdKategori(); 
            case 1: return kategori.getnamaKategori();
            case 2: return kategori.getjenis();
            default: return null;
        }
    }
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
