/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpages;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author ellan
 */
public class reportwo extends javax.swing.JInternalFrame {

    /**
     * Creates new form reportwo
     */
    public reportwo() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI)this.getUI();
        bif.setNorthPane(null);
    }

        Color buttoncol = new Color(0,153,0);
        Color prebuttoncol = new Color(0,204,51);
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        showreceipt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        saveoption = new javax.swing.JPanel();
        screenshot = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        download = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showreceipt.setEditable(false);
        showreceipt.setColumns(20);
        showreceipt.setRows(5);
        jScrollPane1.setViewportView(showreceipt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 500, 340));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Receipt");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, -1));

        saveoption.setBackground(new java.awt.Color(0, 0, 102));
        saveoption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screenshot.setBackground(new java.awt.Color(0, 153, 0));
        screenshot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        screenshot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                screenshotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                screenshotMouseExited(evt);
            }
        });
        screenshot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Screenshot");
        screenshot.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        saveoption.add(screenshot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 40));

        download.setBackground(new java.awt.Color(0, 153, 0));
        download.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        download.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downloadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                downloadMouseExited(evt);
            }
        });
        download.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Download");
        download.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        saveoption.add(download, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        print.setBackground(new java.awt.Color(0, 153, 0));
        print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Print");
        print.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 20));

        saveoption.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        jPanel1.add(saveoption, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 140, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(prebuttoncol);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(buttoncol);
    }//GEN-LAST:event_printMouseExited

    private void downloadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadMouseEntered
        download.setBackground(prebuttoncol);
    }//GEN-LAST:event_downloadMouseEntered

    private void downloadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downloadMouseExited
        download.setBackground(buttoncol);
    }//GEN-LAST:event_downloadMouseExited

    private void screenshotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenshotMouseEntered
       screenshot.setBackground(prebuttoncol);
    }//GEN-LAST:event_screenshotMouseEntered

    private void screenshotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenshotMouseExited
        screenshot.setBackground(buttoncol);
    }//GEN-LAST:event_screenshotMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel download;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel print;
    private javax.swing.JPanel saveoption;
    private javax.swing.JPanel screenshot;
    private javax.swing.JTextArea showreceipt;
    // End of variables declaration//GEN-END:variables
}
