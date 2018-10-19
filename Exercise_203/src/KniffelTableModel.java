
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class KniffelTableModel extends AbstractTableModel{

    private static String[] colNames = {"Spiel", "Wahl", "Punkte"};
    private ArrayList<KniffelRow> row = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return row.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int ro, int col) {
        KniffelRow kr = row.get(ro);
        return kr;
    }
    
}
