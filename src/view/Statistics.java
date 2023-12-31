package view;


import view.Edit_User;
import view.Edit_Book;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Book;
import model.BookTableModel;
import model.User;
import model.UserTableModel;
import utils.BookDAO;
import utils.BookManagement;
import utils.UserDAO;
import utils.UserManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class Statistics extends javax.swing.JFrame {

    public UserTableModel userTableModel;
    public BookTableModel bookTableModel;

    /**
     * Creates new form statistics
     */
    public Statistics() {
        initComponents();
        this.pack();
        this.setTitle("Statistics of User & Book");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        ArrayList<User> userList = UserDAO.reStoreUSERFromFile();
        this.userTableModel = new UserTableModel();
        this.userTable.setModel(userTableModel);
        ArrayList<Book> bookList = BookDAO.reStoreBookFromFile();
        this.bookTableModel = new BookTableModel();
        this.bookTable.setModel(bookTableModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user_tab = new javax.swing.JTabbedPane();
        background_small = new javax.swing.JPanel();
        scrollBarUser = new javax.swing.JScrollBar();
        scrollPaneUser = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        deleteUser_button = new javax.swing.JButton();
        refreshUser_button = new javax.swing.JButton();
        searchUser_label = new javax.swing.JLabel();
        searchUser_TF = new javax.swing.JTextField();
        backgroundTableUser_label = new javax.swing.JLabel();
        table_panel = new javax.swing.JPanel();
        scroolPaneBook = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        scrollBarBook = new javax.swing.JScrollBar();
        deleteBook_button = new javax.swing.JButton();
        refreshBook_button = new javax.swing.JButton();
        searchBook_label = new javax.swing.JLabel();
        searchBook_TF = new javax.swing.JTextField();
        backgroundTableBook_label = new javax.swing.JLabel();
        backgroundPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background_small.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        background_small.add(scrollBarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 20, 220));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        scrollPaneUser.setViewportView(userTable);

        background_small.add(scrollPaneUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 220));

        deleteUser_button.setText("Delete");
        deleteUser_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUser_buttonActionPerformed(evt);
            }
        });
        background_small.add(deleteUser_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 70, 20));

        refreshUser_button.setText("Refresh");
        refreshUser_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshUser_buttonActionPerformed(evt);
            }
        });
        background_small.add(refreshUser_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 20));

        searchUser_label.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        searchUser_label.setForeground(new java.awt.Color(0, 0, 0));
        searchUser_label.setText("Searching User :");
        background_small.add(searchUser_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        searchUser_TF.setBackground(new java.awt.Color(255, 255, 255));
        searchUser_TF.setForeground(new java.awt.Color(0, 0, 0));
        searchUser_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchUser_TFKeyReleased(evt);
            }
        });
        background_small.add(searchUser_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 370, 30));

        backgroundTableUser_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pastelBG.jpg"))); // NOI18N
        background_small.add(backgroundTableUser_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

        user_tab.addTab("User", background_small);

        table_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        bookTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                bookTableKeyReleased(evt);
            }
        });
        scroolPaneBook.setViewportView(bookTable);

        table_panel.add(scroolPaneBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 470, 220));
        table_panel.add(scrollBarBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 220));

        deleteBook_button.setText("Delete");
        deleteBook_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBook_buttonActionPerformed(evt);
            }
        });
        table_panel.add(deleteBook_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 275, -1, 20));

        refreshBook_button.setText("Refresh");
        refreshBook_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBook_buttonActionPerformed(evt);
            }
        });
        table_panel.add(refreshBook_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 275, -1, 20));

        searchBook_label.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        searchBook_label.setForeground(new java.awt.Color(0, 0, 0));
        searchBook_label.setText("Searching Book :");
        table_panel.add(searchBook_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        searchBook_TF.setBackground(new java.awt.Color(255, 255, 255));
        searchBook_TF.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        searchBook_TF.setForeground(new java.awt.Color(0, 0, 0));
        searchBook_TF.setCaretColor(new java.awt.Color(0, 0, 0));
        searchBook_TF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBook_TFKeyReleased(evt);
            }
        });
        table_panel.add(searchBook_TF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 370, 30));

        backgroundTableBook_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pastelBG.jpg"))); // NOI18N
        table_panel.add(backgroundTableBook_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        user_tab.addTab("Book", table_panel);

        getContentPane().add(user_tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 330));

        backgroundPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pastelBG.jpg"))); // NOI18N
        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteUser_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUser_buttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow >= 0) {
            User selectedUser = userTableModel.getUserAtRow(selectedRow);
            UserManagement.deleteUser(selectedUser);
            UserDAO.saveUserListBy_Char(UserManagement.getListUser());
            JOptionPane.showMessageDialog(null, "User deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_deleteUser_buttonActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int selectedRow = userTable.getSelectedRow();
            Object cellValue = userTable.getValueAt(selectedRow, 0); // Assuming the first column index is 0
            if (cellValue != null) {
                String text = cellValue.toString();
                Edit_User editFrame = new Edit_User(text);
                editFrame.setVisible(true);
            }
        }
    }//GEN-LAST:event_userTableMouseClicked

    private void refreshUser_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshUser_buttonActionPerformed
        // TODO add your handling code here:
        this.userTable.setModel(new UserTableModel());
    }//GEN-LAST:event_refreshUser_buttonActionPerformed

    private void deleteBook_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBook_buttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = bookTable.getSelectedRow();

        if (selectedRow >= 0) {
            Book selectedBook = bookTableModel.getBookAtRow(selectedRow);
            BookManagement.deleteBook(selectedBook);
            BookDAO.saveBookListBy_Char(BookManagement.getListBook());
            JOptionPane.showMessageDialog(null, "Book deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_deleteBook_buttonActionPerformed

    private void refreshBook_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBook_buttonActionPerformed
        // TODO add your handling code here:
        this.bookTable.setModel(new BookTableModel());

    }//GEN-LAST:event_refreshBook_buttonActionPerformed

    private void bookTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTableKeyReleased

    private void searchBook_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBook_TFKeyReleased
        // TODO add your handling code here:
        BookTableModel obj = (BookTableModel) bookTable.getModel();
        TableRowSorter<BookTableModel> tableRowSort = new TableRowSorter<>(obj);
        bookTable.setRowSorter(tableRowSort);
        tableRowSort.setRowFilter(RowFilter.regexFilter(searchBook_TF.getText()));
    }//GEN-LAST:event_searchBook_TFKeyReleased

    private void searchUser_TFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUser_TFKeyReleased
        // TODO add your handling code here:
         UserTableModel obj = (UserTableModel) userTable.getModel();
        TableRowSorter<UserTableModel> tableRowSort = new TableRowSorter<>(obj);
        userTable.setRowSorter(tableRowSort);
        tableRowSort.setRowFilter(RowFilter.regexFilter(searchUser_TF.getText()));
        
    }//GEN-LAST:event_searchUser_TFKeyReleased

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        // TODO add your handling code here:
          if (evt.getClickCount() == 2) {
            int selectedRow = bookTable.getSelectedRow();
            Object cellValue = bookTable.getValueAt(selectedRow, 0); // Assuming the first column index is 0
            if (cellValue != null) {
                String text = cellValue.toString();
                Edit_Book editFrame = new Edit_Book(text);
                editFrame.setVisible(true);
            }
        }
    }//GEN-LAST:event_bookTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statistics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundPanel;
    private javax.swing.JLabel backgroundTableBook_label;
    private javax.swing.JLabel backgroundTableUser_label;
    private javax.swing.JPanel background_small;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton deleteBook_button;
    private javax.swing.JButton deleteUser_button;
    private javax.swing.JButton refreshBook_button;
    private javax.swing.JButton refreshUser_button;
    private javax.swing.JScrollBar scrollBarBook;
    private javax.swing.JScrollBar scrollBarUser;
    private javax.swing.JScrollPane scrollPaneUser;
    private javax.swing.JScrollPane scroolPaneBook;
    private javax.swing.JTextField searchBook_TF;
    private javax.swing.JLabel searchBook_label;
    private javax.swing.JTextField searchUser_TF;
    private javax.swing.JLabel searchUser_label;
    private javax.swing.JPanel table_panel;
    private javax.swing.JTable userTable;
    private javax.swing.JTabbedPane user_tab;
    // End of variables declaration//GEN-END:variables
}
