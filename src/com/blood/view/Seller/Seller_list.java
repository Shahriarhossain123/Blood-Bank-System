package com.blood.view.Seller;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class Seller_list extends javax.swing.JInternalFrame {

    Connection con;
    String url;

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    int tabrow;
    int Table_click_phone;

    public Seller_list() {
        super("Seller List");
        initComponents();
        database();
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_seller_list = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_new = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        combo_type = new javax.swing.JComboBox<String>();
        btn_search1 = new javax.swing.JButton();
        btn_reload = new javax.swing.JButton();
        btn_delete1 = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        btn_close.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/cancel.png"))); // NOI18N
        btn_close.setText("Close");
        btn_close.setToolTipText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Seller List");

        table_seller_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Seller Name", "Age", "Gender", "Blood Type", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_seller_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_seller_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_seller_list);
        if (table_seller_list.getColumnModel().getColumnCount() > 0) {
            table_seller_list.getColumnModel().getColumn(0).setMinWidth(50);
            table_seller_list.getColumnModel().getColumn(0).setMaxWidth(50);
            table_seller_list.getColumnModel().getColumn(2).setMinWidth(50);
            table_seller_list.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Search:");

        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.setToolTipText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/edit.png"))); // NOI18N
        btn_delete.setText("Update");
        btn_delete.setToolTipText("Update");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_new.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/add_students.png"))); // NOI18N
        btn_new.setText("New");
        btn_new.setToolTipText("New Seller");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/print.png"))); // NOI18N
        btn_print.setText("Print");
        btn_print.setToolTipText("Print Seller List");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Blood Type:");

        combo_type.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        combo_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B-", "B+", "O+", "O-", "AB+", "AB-" }));
        combo_type.setToolTipText("Select Blood Type");

        btn_search1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_search1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/search.png"))); // NOI18N
        btn_search1.setText("Search");
        btn_search1.setToolTipText("Search");
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });

        btn_reload.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_reload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/refresh.png"))); // NOI18N
        btn_reload.setText("Reload");
        btn_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reloadActionPerformed(evt);
            }
        });

        btn_delete1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btn_delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/delete.png"))); // NOI18N
        btn_delete1.setText("Delete");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search1))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(159, 159, 159)
                        .addComponent(btn_reload, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_delete1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_search))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(btn_search)
                        .addComponent(btn_search1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_delete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 850, 443);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        New_seller nd = new New_seller();
        this.getDesktopPane().add(nd);
        dispose();
        nd.setVisible(true);
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        Edit_seller ed = new Edit_seller();
        this.getDesktopPane().add(ed);
        dispose();
        ed.setVisible(true);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reloadActionPerformed
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_btn_reloadActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        // TODO add your handling code here:
        searchTable();
    }//GEN-LAST:event_btn_search1ActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        searchTable();
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        search_type();
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
        // TODO add your handling code here:
        deleteData();
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void table_seller_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_seller_listMouseClicked
        // TODO add your handling code here:
        tabrow = table_seller_list.getSelectedRow();
        Table_click_phone = (int) (table_seller_list.getModel().getValueAt(tabrow, 5));
        Edit_seller es = new Edit_seller();
        es.select_phone = Table_click_phone;
    }//GEN-LAST:event_table_seller_listMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_reload;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private javax.swing.JComboBox<String> combo_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_seller_list;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    public void database() {
        try {
            url = "jdbc:ucanaccess://blood.mdb";
            con = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println("Could Not Connect to Database" + e);
        }
    }

    private void updateTable() {

        try {

            String sql = "Select ID, seller_name, seller_age, seller_gender, blood_type, seller_phone from seller Order By ID";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            table_seller_list.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void searchTable() {

        try {
            String sql = "SELECT ID, seller_name, seller_age, seller_gender, blood_type, seller_phone FROM seller WHERE seller_phone LIKE ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, txt_search.getText());
            rs = pst.executeQuery();
            table_seller_list.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error TO collection data from Student Table");
        }
    }

    private void search_type() {
        String type = (String) combo_type.getSelectedItem();

        //search only depertment
        try {
            String sql = "SELECT ID, seller_name, seller_age, seller_gender, blood_type, seller_phone FROM seller WHERE blood_type LIKE ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, (String) combo_type.getSelectedItem());
            rs = pst.executeQuery();
            table_seller_list.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error TO collection data from Student Table By search");
        }
    }

    private void deleteData() {
        try {
            String sql = "Delete from seller where seller_phone = '" + Table_click_phone + "'";

            st = con.createStatement();
            st.executeUpdate(sql);
            con.commit();
            updateTable();
            JOptionPane.showMessageDialog(null, "Seller Deleted.");

        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
