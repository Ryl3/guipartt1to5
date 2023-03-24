/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restogui;

import config.dbconnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SCC COMPLAB
 */
public class reportonedataadd extends javax.swing.JFrame {

    /**
     * Creates new form reportonedataadd
     */
    public reportonedataadd() {
        initComponents();
    }
    
    public void displaydata(){
        
        try{
            
        dbconnector dbc = new dbconnector();
        ResultSet rs = dbc.getData("SELECT * FROM tbl_customer");
        Tablecustomer.setModel(DbUtils.resultSetToTableModel(rs));
        
            }catch(SQLException ex){
                System.out.println("Error Message:"+ex);
         }
    }
    
    public void clear(){
            id.setText("");
            name.setText("");
            fee.setText("");
            status.setText("");
            contact.setText("");
            address.setText("");
    }

        Color navcol = new Color(178,34,34);
        Color headercol = new Color(255,0,0);
        Color mainbodcol = new Color(128,0,0);
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        display = new javax.swing.JButton();
        fee = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        status = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablecustomer = new javax.swing.JTable();
        contact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        done = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        minus = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        close = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Address:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 20));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Status:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("ID: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Fee:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 20));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Contact #:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 20));

        delete.setBackground(new java.awt.Color(178, 34, 34));
        delete.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 43, 80, 30));

        clear1.setBackground(new java.awt.Color(178, 34, 34));
        clear1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        clear1.setText("clear");
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        jPanel1.add(clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 90, 50));

        update.setBackground(new java.awt.Color(178, 34, 34));
        update.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 43, 80, 30));

        display.setBackground(new java.awt.Color(178, 34, 34));
        display.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 43, 80, 30));

        fee.setBackground(new java.awt.Color(178, 34, 34));
        fee.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        fee.setForeground(new java.awt.Color(240, 240, 240));
        fee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feeActionPerformed(evt);
            }
        });
        jPanel1.add(fee, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 20));

        id.setBackground(new java.awt.Color(178, 34, 34));
        id.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        id.setForeground(new java.awt.Color(240, 240, 240));
        id.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 20));

        add.setBackground(new java.awt.Color(178, 34, 34));
        add.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, 50));

        status.setBackground(new java.awt.Color(178, 34, 34));
        status.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        status.setForeground(new java.awt.Color(240, 240, 240));
        status.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, 20));

        name.setBackground(new java.awt.Color(178, 34, 34));
        name.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 180, 20));

        Tablecustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablecustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tablecustomer);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 430, 390));

        contact.setBackground(new java.awt.Color(178, 34, 34));
        contact.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        contact.setForeground(new java.awt.Color(240, 240, 240));
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 180, 20));

        address.setBackground(new java.awt.Color(178, 34, 34));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        address.setForeground(new java.awt.Color(240, 240, 240));
        address.setRows(5);
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 270, 110));

        done.setBackground(new java.awt.Color(178, 34, 34));
        done.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doneMouseExited(evt);
            }
        });
        done.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Done");
        done.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 30));

        jPanel1.add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 90, 50));

        clear.setBackground(new java.awt.Color(178, 34, 34));
        clear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clear");
        clear.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 30));

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, 50));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Name: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/silres-removebg-preview-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 620, 340));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/Falling-Confetti-PNG-Clipart-Background-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 720, 330));

        minus.setBackground(new java.awt.Color(128, 0, 0));
        minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minusMouseExited(evt);
            }
        });
        minus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("—");
        minus.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        jPanel1.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 40, 30));

        close.setBackground(new java.awt.Color(128, 0, 0));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("x");
        close.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/Falling-Confetti-PNG-Clipart-Background-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseClicked
        home bd = new home();
        this.dispose();
        bd.setVisible(true);  
    }//GEN-LAST:event_doneMouseClicked

    private void doneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseEntered
        done.setBackground(mainbodcol);
    }//GEN-LAST:event_doneMouseEntered

    private void doneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseExited
        done.setBackground(navcol);
    }//GEN-LAST:event_doneMouseExited

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(mainbodcol);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(navcol);
    }//GEN-LAST:event_clearMouseExited

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusMouseClicked

    private void minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseEntered
        minus.setBackground(navcol);
    }//GEN-LAST:event_minusMouseEntered

    private void minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseExited
        minus.setBackground(headercol);
    }//GEN-LAST:event_minusMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        home bd = new home();
        this.dispose();
        bd.setVisible(true); 
        
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(navcol);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(headercol);
    }//GEN-LAST:event_closeMouseExited

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        displaydata();
    }//GEN-LAST:event_displayActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = Tablecustomer.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "pili sa table dong mura man kag wtf!");
        }else{
            TableModel model = Tablecustomer.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"sure oii?");
            if(a==JOptionPane.YES_OPTION){
                dbconnector dbc = new dbconnector();
                dbc.deleteData(Integer.parseInt(id));
                displaydata();
                clear();
            }

        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        dbconnector dbc = new dbconnector();

        dbc.insertData("INSERT INTO tbl_customer (ID, Name, Status, Fee, Contact, Adress) "

            + "VALUES ('"+name.getText()+"', '"+status.getText()+"','"+fee.getText()+"','"+contact.getText()+"','"+address.getText()+"')");

        displaydata();
        clear();
    }//GEN-LAST:event_addActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
        clear();
    }//GEN-LAST:event_clear1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        dbconnector dbc = new dbconnector();
        int num = dbc.updateData("UPDATE tbl_customer "
            + "SET c_name = '"+name.getText()+"', c_address='"+address.getText()+"', "
            + "c_contact ='"+contact.getText()+"', c_status='"+status.getText()+"'  "
            +"c_fee ='"+fee.getText()+ "WHERE c_id = '"+id.getText()+"'");

        if(num == 0){

        }else{
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
            displaydata();
            clear();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void TablecustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablecustomerMouseClicked
         int rowindex = Tablecustomer.getSelectedRow();
       if(rowindex<0){
       
       }else{
            TableModel model = Tablecustomer.getModel();
                id.setText(""+model.getValueAt(rowindex, 0));
                name.setText(""+model.getValueAt(rowindex, 1));
                status.setText(""+model.getValueAt(rowindex, 2));
                fee.setText(""+model.getValueAt(rowindex, 3));
                contact.setText(""+model.getValueAt(rowindex, 4));
                address.setText(""+model.getValueAt(rowindex, 5));
                
       }
    }//GEN-LAST:event_TablecustomerMouseClicked

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
            java.util.logging.Logger.getLogger(reportonedataadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reportonedataadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reportonedataadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reportonedataadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reportonedataadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablecustomer;
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.JPanel clear;
    private javax.swing.JButton clear1;
    private javax.swing.JPanel close;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JPanel done;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel minus;
    private javax.swing.JTextField name;
    private javax.swing.JTextField status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
