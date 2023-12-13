/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utils.BookManagement;

/**
 *
 * @author Asus
 */
public class BookTableModel extends AbstractTableModel {

    public BookTableModel() {
        for (Book book : BookManagement.getListBook()) {
            Object[] row = new Object[]{book.getTitle(),
                book.getType(), book.getyOR(),
                book.getyOR()};

            listRow.add(row);
        }
    }
    private List<Object[]> listRow = new ArrayList<Object[]>();
    private String[] columnHeader = {"Title", "Type", "Year of release", "Price"};

    @Override
    public int getRowCount() {
        return this.listRow.size();
    }

    @Override
    public int getColumnCount() {
        return this.listRow.get(0).length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.listRow.get(rowIndex)[columnIndex];

    }
     @Override
    public String getColumnName(int column) {
        return this.columnHeader[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return this.listRow.get(0)[columnIndex].getClass();
    }
     public Book getBookAtRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < BookManagement.getListBook().size()) {
            return BookManagement.getListBook().get(rowIndex);
        }
        return null;
    }

}
