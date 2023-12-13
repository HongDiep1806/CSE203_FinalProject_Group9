/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;
import javax.swing.table.AbstractTableModel;
import utils.UserManagement;

/**
 *
 * @author Asus
 */
public class UserTableModel extends AbstractTableModel {

    public UserTableModel() {
        for (User user : UserManagement.getListUser()) {
            Object[] row = new Object[]{user.getID(),
                user.getPassword(), user.getFullname(),
                user.getAge()};

            listRow.add(row);
        }
    }
    private List<Object[]> listRow = new ArrayList<Object[]>();
    private String[] columnHeader = {"ID", "Password", "Fullname", "Age"};

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

    public User getUserAtRow(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < UserManagement.getListUser().size()) {
            return UserManagement.getListUser().get(rowIndex);
        }
        return null;
    }
}
