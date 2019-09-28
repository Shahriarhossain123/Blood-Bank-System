package com.blood.view;

import com.blood.view.backupORrestore.BackupORrestore;
import com.blood.view.blood.*;
import com.blood.view.Buyer.*;
import com.blood.view.Seller.*;
import com.blood.view.sell.*;
import com.blood.view.buy.*;
import javax.swing.JInternalFrame;
import com.blood.view.help.About;
import java.awt.Toolkit;

/**
 *
 * @author Shishir
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        super("Blood Bank Management Software");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("blood.png")));
    }

    private void allclose() {
        for (JInternalFrame jfin : desktopPane.getAllFrames()) {
            jfin.dispose();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_donor = new javax.swing.JButton();
        btn_customer = new javax.swing.JButton();
        btn_sell = new javax.swing.JButton();
        btn_backup_restore = new javax.swing.JButton();
        btn_blood_list = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_buy = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu_user = new javax.swing.JMenu();
        menuItem_log_out = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menu_donor = new javax.swing.JMenu();
        menuItem_donor_new = new javax.swing.JMenuItem();
        menuItem_donor_edit = new javax.swing.JMenuItem();
        menuItem_donor_list = new javax.swing.JMenuItem();
        menu_customer = new javax.swing.JMenu();
        menuItem_new_customer = new javax.swing.JMenuItem();
        menuItem_edit_customer = new javax.swing.JMenuItem();
        menuItem_customer_list = new javax.swing.JMenuItem();
        menu_blood = new javax.swing.JMenu();
        menuItem_blood_setting = new javax.swing.JMenuItem();
        menuItem_blood_list = new javax.swing.JMenuItem();
        menu_sell = new javax.swing.JMenu();
        menuItem_sell = new javax.swing.JMenuItem();
        menuItem_sell_list = new javax.swing.JMenuItem();
        menuItem_sell_edit = new javax.swing.JMenuItem();
        menu_donate = new javax.swing.JMenu();
        menuItem_buy = new javax.swing.JMenuItem();
        menuItem_buy_list = new javax.swing.JMenuItem();
        menuItem_buy_edit = new javax.swing.JMenuItem();
        menu_backup_restore = new javax.swing.JMenu();
        me_backup_restore = new javax.swing.JMenuItem();
        menu_help = new javax.swing.JMenu();
        menuItem_about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_donor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_donor.setText("New Seller");
        btn_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_donorActionPerformed(evt);
            }
        });

        btn_customer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_customer.setText("New Buyer");
        btn_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customerActionPerformed(evt);
            }
        });

        btn_sell.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_sell.setText("Blood Sell");
        btn_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sellActionPerformed(evt);
            }
        });

        btn_backup_restore.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_backup_restore.setText("Backup or Restore");
        btn_backup_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backup_restoreActionPerformed(evt);
            }
        });

        btn_blood_list.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_blood_list.setText("Blood List");
        btn_blood_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blood_listActionPerformed(evt);
            }
        });

        btn_logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/logoutBig.png"))); // NOI18N
        btn_logout.setToolTipText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_buy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_buy.setText("Blood Buy");
        btn_buy.setToolTipText("");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_donor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_backup_restore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_blood_list)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_donor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_backup_restore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_blood_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        desktopPane.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/blood_bd.jpg"))); // NOI18N
        jLabel1.setIconTextGap(0);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        menuBar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menu_user.setMnemonic('f');
        menu_user.setText("User");
        menu_user.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_log_out.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_log_out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/logout.png"))); // NOI18N
        menuItem_log_out.setMnemonic('o');
        menuItem_log_out.setText("Log Out");
        menuItem_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_log_outActionPerformed(evt);
            }
        });
        menu_user.add(menuItem_log_out);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/exit.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menu_user.add(exitMenuItem);

        menuBar.add(menu_user);

        menu_donor.setMnemonic('e');
        menu_donor.setText("Seller");
        menu_donor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_donor_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItem_donor_new.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_donor_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/add_students.png"))); // NOI18N
        menuItem_donor_new.setText("New Seller");
        menuItem_donor_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_donor_newActionPerformed(evt);
            }
        });
        menu_donor.add(menuItem_donor_new);

        menuItem_donor_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_donor_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/edit.png"))); // NOI18N
        menuItem_donor_edit.setMnemonic('y');
        menuItem_donor_edit.setText("Edit Seller");
        menuItem_donor_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_donor_editActionPerformed(evt);
            }
        });
        menu_donor.add(menuItem_donor_edit);

        menuItem_donor_list.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_donor_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/list.png"))); // NOI18N
        menuItem_donor_list.setMnemonic('y');
        menuItem_donor_list.setText("Seller List");
        menuItem_donor_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_donor_listActionPerformed(evt);
            }
        });
        menu_donor.add(menuItem_donor_list);

        menuBar.add(menu_donor);

        menu_customer.setText("Buyer");
        menu_customer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_new_customer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItem_new_customer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_new_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/add_students.png"))); // NOI18N
        menuItem_new_customer.setText("New Buyer");
        menuItem_new_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_new_customerActionPerformed(evt);
            }
        });
        menu_customer.add(menuItem_new_customer);

        menuItem_edit_customer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_edit_customer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/edit.png"))); // NOI18N
        menuItem_edit_customer.setText("Edit Buyer");
        menuItem_edit_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_edit_customerActionPerformed(evt);
            }
        });
        menu_customer.add(menuItem_edit_customer);

        menuItem_customer_list.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_customer_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/list.png"))); // NOI18N
        menuItem_customer_list.setText("Buyer List");
        menuItem_customer_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_customer_listActionPerformed(evt);
            }
        });
        menu_customer.add(menuItem_customer_list);

        menuBar.add(menu_customer);

        menu_blood.setMnemonic('h');
        menu_blood.setText("Blood");
        menu_blood.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_blood_setting.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItem_blood_setting.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_blood_setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/setting.png"))); // NOI18N
        menuItem_blood_setting.setMnemonic('c');
        menuItem_blood_setting.setText("Blood Setting");
        menuItem_blood_setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_blood_settingActionPerformed(evt);
            }
        });
        menu_blood.add(menuItem_blood_setting);

        menuItem_blood_list.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_blood_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/list.png"))); // NOI18N
        menuItem_blood_list.setMnemonic('c');
        menuItem_blood_list.setText("Blood List");
        menuItem_blood_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_blood_listActionPerformed(evt);
            }
        });
        menu_blood.add(menuItem_blood_list);

        menuBar.add(menu_blood);

        menu_sell.setText("Blood Sell");
        menu_sell.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_sell.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_sell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/Buy.png"))); // NOI18N
        menuItem_sell.setText("Blood Sell");
        menuItem_sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_sellActionPerformed(evt);
            }
        });
        menu_sell.add(menuItem_sell);

        menuItem_sell_list.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_sell_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/list.png"))); // NOI18N
        menuItem_sell_list.setText("Blood Sell List");
        menuItem_sell_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_sell_listActionPerformed(evt);
            }
        });
        menu_sell.add(menuItem_sell_list);

        menuItem_sell_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_sell_edit.setText("Blood Sell Edit");
        menuItem_sell_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_sell_editActionPerformed(evt);
            }
        });
        menu_sell.add(menuItem_sell_edit);

        menuBar.add(menu_sell);

        menu_donate.setText("Blood Buy");
        menu_donate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_buy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_buy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/Buy.png"))); // NOI18N
        menuItem_buy.setText("Blood Buy");
        menuItem_buy.setToolTipText("");
        menuItem_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_buyActionPerformed(evt);
            }
        });
        menu_donate.add(menuItem_buy);

        menuItem_buy_list.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_buy_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/list.png"))); // NOI18N
        menuItem_buy_list.setText("Blood Buy List");
        menuItem_buy_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_buy_listActionPerformed(evt);
            }
        });
        menu_donate.add(menuItem_buy_list);

        menuItem_buy_edit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_buy_edit.setText("Blood Buy Edit");
        menuItem_buy_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_buy_editActionPerformed(evt);
            }
        });
        menu_donate.add(menuItem_buy_edit);

        menuBar.add(menu_donate);

        menu_backup_restore.setText("Backup/Restore");
        menu_backup_restore.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        me_backup_restore.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        me_backup_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/Backup.png"))); // NOI18N
        me_backup_restore.setText("Database Backup Or Restore");
        me_backup_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                me_backup_restoreActionPerformed(evt);
            }
        });
        menu_backup_restore.add(me_backup_restore);

        menuBar.add(menu_backup_restore);

        menu_help.setText("Help");
        menu_help.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        menuItem_about.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        menuItem_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/blood/photos/support.png"))); // NOI18N
        menuItem_about.setText("About");
        menuItem_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem_aboutActionPerformed(evt);
            }
        });
        menu_help.add(menuItem_about);

        menuBar.add(menu_help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane))
        );

        setSize(new java.awt.Dimension(1018, 820));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void menuItem_buy_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_buy_listActionPerformed
        // TODO add your handling code here:
        allclose();
        Buy_list do1 = new Buy_list();
        this.desktopPane.add(do1);
        do1.setVisible(true);
    }//GEN-LAST:event_menuItem_buy_listActionPerformed

    private void menuItem_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_log_outActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login sl = new Login();
        sl.setVisible(true);
    }//GEN-LAST:event_menuItem_log_outActionPerformed

    private void menuItem_donor_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_donor_newActionPerformed
        // TODO add your handling code here
        allclose();
        New_seller dl = new New_seller();
        this.desktopPane.add(dl);
        dl.setVisible(true);
    }//GEN-LAST:event_menuItem_donor_newActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login sl = new Login();
        sl.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_donorActionPerformed
        // TODO add your handling code here:
        allclose();
        New_seller dl = new New_seller();
        this.desktopPane.add(dl);
        dl.setVisible(true);
    }//GEN-LAST:event_btn_donorActionPerformed

    private void menuItem_donor_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_donor_editActionPerformed
        // TODO add your handling code here:
        allclose();
        Edit_seller d2 = new Edit_seller();
        this.desktopPane.add(d2);
        d2.setVisible(true);
    }//GEN-LAST:event_menuItem_donor_editActionPerformed

    private void menuItem_donor_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_donor_listActionPerformed
        // TODO add your handling code here:
        allclose();
        Seller_list d3 = new Seller_list();
        this.desktopPane.add(d3);
        d3.setVisible(true);

    }//GEN-LAST:event_menuItem_donor_listActionPerformed

    private void btn_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customerActionPerformed
        // TODO add your handling code here:
        allclose();
        New_Buyer c1 = new New_Buyer();
        this.desktopPane.add(c1);
        c1.setVisible(true);
    }//GEN-LAST:event_btn_customerActionPerformed

    private void menuItem_new_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_new_customerActionPerformed
        // TODO add your handling code here:
        allclose();
        New_Buyer c2 = new New_Buyer();
        this.desktopPane.add(c2);
        c2.setVisible(true);
    }//GEN-LAST:event_menuItem_new_customerActionPerformed

    private void menuItem_customer_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_customer_listActionPerformed
        // TODO add your handling code here:
        allclose();
        Buyer_list c3 = new Buyer_list();
        this.desktopPane.add(c3);
        c3.setVisible(true);
    }//GEN-LAST:event_menuItem_customer_listActionPerformed

    private void menuItem_blood_settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_blood_settingActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_setting b1 = new Blood_setting();
        this.desktopPane.add(b1);
        b1.setVisible(true);
    }//GEN-LAST:event_menuItem_blood_settingActionPerformed

    private void menuItem_blood_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_blood_listActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_list b2 = new Blood_list();
        this.desktopPane.add(b2);
        b2.setVisible(true);
    }//GEN-LAST:event_menuItem_blood_listActionPerformed

    private void menuItem_edit_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_edit_customerActionPerformed
        // TODO add your handling code here:
        allclose();
        Edit_Buyer c2 = new Edit_Buyer();
        this.desktopPane.add(c2);
        c2.setVisible(true);
    }//GEN-LAST:event_menuItem_edit_customerActionPerformed

    private void me_backup_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_me_backup_restoreActionPerformed
        // TODO add your handling code here:
        allclose();
        BackupORrestore br1 = new BackupORrestore();
        this.desktopPane.add(br1);
        br1.setVisible(true);
    }//GEN-LAST:event_me_backup_restoreActionPerformed

    private void btn_backup_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backup_restoreActionPerformed
        // TODO add your handling code here:
        allclose();
        BackupORrestore br1 = new BackupORrestore();
        this.desktopPane.add(br1);
        br1.setVisible(true);
    }//GEN-LAST:event_btn_backup_restoreActionPerformed

    private void menuItem_buy_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_buy_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem_buy_editActionPerformed

    private void btn_blood_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blood_listActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_list bl = new Blood_list();
        this.desktopPane.add(bl);
        bl.setVisible(true);
    }//GEN-LAST:event_btn_blood_listActionPerformed

    private void menuItem_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_aboutActionPerformed
        // TODO add your handling code here:
        allclose();
        About ab = new About();
        this.desktopPane.add(ab);
        ab.setVisible(true);
    }//GEN-LAST:event_menuItem_aboutActionPerformed

    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_Buy bb = new Blood_Buy();
        this.desktopPane.add(bb);
        bb.setVisible(true);
    }//GEN-LAST:event_btn_buyActionPerformed

    private void btn_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sellActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_sell bs = new Blood_sell();
        this.desktopPane.add(bs);
        bs.setVisible(true);
    }//GEN-LAST:event_btn_sellActionPerformed

    private void menuItem_sell_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_sell_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem_sell_editActionPerformed

    private void menuItem_sell_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_sell_listActionPerformed
        // TODO add your handling code here:
        allclose();
        Sell_list do1 = new Sell_list();
        this.desktopPane.add(do1);
        do1.setVisible(true);
    }//GEN-LAST:event_menuItem_sell_listActionPerformed

    private void menuItem_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_buyActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_Buy bb = new Blood_Buy();
        this.desktopPane.add(bb);
        bb.setVisible(true);
    }//GEN-LAST:event_menuItem_buyActionPerformed

    private void menuItem_sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem_sellActionPerformed
        // TODO add your handling code here:
        allclose();
        Blood_sell bsn = new Blood_sell();
        this.desktopPane.add(bsn);
        bsn.setVisible(true);
    }//GEN-LAST:event_menuItem_sellActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backup_restore;
    private javax.swing.JButton btn_blood_list;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_customer;
    private javax.swing.JButton btn_donor;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_sell;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem me_backup_restore;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItem_about;
    private javax.swing.JMenuItem menuItem_blood_list;
    private javax.swing.JMenuItem menuItem_blood_setting;
    private javax.swing.JMenuItem menuItem_buy;
    private javax.swing.JMenuItem menuItem_buy_edit;
    private javax.swing.JMenuItem menuItem_buy_list;
    private javax.swing.JMenuItem menuItem_customer_list;
    private javax.swing.JMenuItem menuItem_donor_edit;
    private javax.swing.JMenuItem menuItem_donor_list;
    private javax.swing.JMenuItem menuItem_donor_new;
    private javax.swing.JMenuItem menuItem_edit_customer;
    private javax.swing.JMenuItem menuItem_log_out;
    private javax.swing.JMenuItem menuItem_new_customer;
    private javax.swing.JMenuItem menuItem_sell;
    private javax.swing.JMenuItem menuItem_sell_edit;
    private javax.swing.JMenuItem menuItem_sell_list;
    private javax.swing.JMenu menu_backup_restore;
    private javax.swing.JMenu menu_blood;
    private javax.swing.JMenu menu_customer;
    private javax.swing.JMenu menu_donate;
    private javax.swing.JMenu menu_donor;
    private javax.swing.JMenu menu_help;
    private javax.swing.JMenu menu_sell;
    private javax.swing.JMenu menu_user;
    // End of variables declaration//GEN-END:variables

}
