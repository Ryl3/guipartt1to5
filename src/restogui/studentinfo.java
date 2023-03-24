/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restogui;

import config.dbconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SCC COMPLAB
 */
public class studentinfo extends javax.swing.JFrame {

    /**
     * Creates new form studentinfo
     */
    public studentinfo() {
        initComponents();
    }
    
    public void clear(){
            id.setText("");
            name.setText("");
            address.setText("");
            status.setText("");
            contact.setText("");
     
    }
    
 public void displaydata(){
        
        try{
            
        dbconnector dbc = new dbconnector();
        ResultSet rs = dbc.getData("SELECT * FROM tbl_customer");
        tblstudent.setModel(DbUtils.resultSetToTableModel(rs));
        
            }catch(SQLException ex){
                System.out.println("Error Message:"+ex);
         }
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        display = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblstudent.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        tblstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstudent);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 0, 590, 510));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 30));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 30));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, 30));

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 30));

        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        display.setText("Display");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 70, -1));

        clear.setText("clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 60, -1));

        id.setEditable(false);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 190, 30));

        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 860, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
       displaydata();
    }//GEN-LAST:event_displayActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        dbconnector dbc = new dbconnector();

        dbc.insertData("INSERT INTO tbl_customer (st_name, st_address, st_contact, st_status) "

                + "VALUES ('"+name.getText()+"', '"+address.getText()+"','"+contact.getText()+"','"+status.getText()+"')");

        displaydata();
        clear();
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clear();
    }//GEN-LAST:event_clearActionPerformed

    private void tblstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseClicked
       int rowindex = tblstudent.getSelectedRow();
       if(rowindex<0){
       
       }else{
            TableModel model = tblstudent.getModel();
                id.setText(""+model.getValueAt(rowindex, 0));
                name.setText(""+model.getValueAt(rowindex, 1));
                address.setText(""+model.getValueAt(rowindex, 2));
                contact.setText(""+model.getValueAt(rowindex, 3));
                status.setText(""+model.getValueAt(rowindex, 4));

       }
    }//GEN-LAST:event_tblstudentMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = tblstudent.getSelectedRow();
       
       
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "pili sa table dong mura man kag wtf!");
       }else{
            TableModel model = tblstudent.getModel();
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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       dbconnector dbc = new dbconnector();
        int num = dbc.updateData("UPDATE tbl_student "
                + "SET st_name = '"+name.getText()+"', st_address='"+address.getText()+"', "
                        + "st_contact ='"+contact.getText()+"', st_status='"+status.getText()+"'  "
                                + "WHERE st_id = '"+id.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displaydata();
           clear();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

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
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField status;
    private javax.swing.JTable tblstudent;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
