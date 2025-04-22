package palette;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class Table_custom extends JPanel {

    private JTable table; // Simpan JTable sebagai field
    private DefaultTableModel model;

    public Table_custom() {
        initComponents();
    }

    private void initComponents() {
        // Data awal
        String[][] data = {
                {"101", "Alice", "18", "A"},
                {"102", "Bob", "19", "B"},
                {"103", "Carol", "20", "A"},
                {"104", "David", "21", "C"}
        };

        // Kolom awal
        String[] columnNames = {"ID", "Name", "Age", "Grade"};

        // Model tabel
        model = new DefaultTableModel(data, columnNames);

        // JTable
        table = new JTable(model) {
            @Override
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component c = super.prepareRenderer(renderer, row, column);
                if (!isRowSelected(row)) {
                    c.setBackground(row % 2 == 0 ? new Color(220, 220, 220) : Color.WHITE);
                } else {
                    c.setBackground(new Color(184, 207, 229));
                }
                return c;
            }
        };

        // Header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("SansSerif", Font.BOLD, 16));
        header.setBackground(new Color(72, 81, 84));
        header.setForeground(Color.WHITE);

        // Properti JTable
        table.setRowHeight(25);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.setGridColor(Color.LIGHT_GRAY);

        // Scroll Pane
        JScrollPane scrollPane = new JScrollPane(table);
        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
    }

    public void setTableData(String[][] data, String[] columnNames) {
        model.setDataVector(data, columnNames); // Update model tabel
        table.revalidate();
        table.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Custom JTable Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 300);
            Table_custom tableCustom = new Table_custom();
            frame.add(tableCustom);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Contoh mengganti data tabel
            String[][] newData = {
                {"201", "Eve", "22", "A"},
                {"202", "Frank", "23", "B"},
                {"203", "Grace", "24", "A"}
            };
            String[] newColumns = {"ID", "Name", "Age", "Grade"};
            tableCustom.setTableData(newData, newColumns); 
        });
    }
}
