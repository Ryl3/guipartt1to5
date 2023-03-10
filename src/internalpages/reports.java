package internalpages;

import java.awt.Color;

import javax.swing.plaf.basic.BasicInternalFrameUI;


public class reports extends javax.swing.JInternalFrame {

    
    public reports() {
        initComponents();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI)this.getUI();
        bif.setNorthPane(null);
        
    }
    
        Color navcol = new Color(178,34,34);
        Color headercol = new Color(255,0,0);
        Color mainbodcol = new Color(128,0,0);
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        receipt = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        status = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        transhistory = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reportbod = new javax.swing.JDesktopPane();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(178, 34, 34));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receipt.setBackground(new java.awt.Color(178, 34, 34));
        receipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                receiptMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                receiptMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                receiptMouseExited(evt);
            }
        });
        receipt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receipt");
        receipt.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 28));

        jPanel2.add(receipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 240, 50));

        status.setBackground(new java.awt.Color(178, 34, 34));
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statusMouseExited(evt);
            }
        });
        status.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Status");
        status.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 28));

        jPanel2.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        transhistory.setBackground(new java.awt.Color(178, 34, 34));
        transhistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transhistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transhistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transhistoryMouseExited(evt);
            }
        });
        transhistory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Transaction History");
        transhistory.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, 28));

        jPanel2.add(transhistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 250, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        reportbod.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout reportbodLayout = new javax.swing.GroupLayout(reportbod);
        reportbod.setLayout(reportbodLayout);
        reportbodLayout.setHorizontalGroup(
            reportbodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        reportbodLayout.setVerticalGroup(
            reportbodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(reportbod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 720, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void statusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseExited
        status.setBackground(navcol);
    }//GEN-LAST:event_statusMouseExited

    private void statusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseEntered
        status.setBackground(mainbodcol);
    }//GEN-LAST:event_statusMouseEntered

    private void receiptMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptMouseExited
        receipt.setBackground(navcol);
    }//GEN-LAST:event_receiptMouseExited

    private void receiptMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptMouseEntered
       receipt.setBackground(mainbodcol);
    }//GEN-LAST:event_receiptMouseEntered

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked
         reportone rpone = new reportone();
        reportbod.add(rpone).setVisible(true);
    }//GEN-LAST:event_statusMouseClicked

    private void receiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_receiptMouseClicked
       reportwo rptwo = new reportwo();
       reportbod.add(rptwo).setVisible(true);
    }//GEN-LAST:event_receiptMouseClicked

    private void transhistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transhistoryMouseClicked
        transacthistory tehis = new transacthistory();
        reportbod.add(tehis).setVisible(true);
    }//GEN-LAST:event_transhistoryMouseClicked

    private void transhistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transhistoryMouseEntered
       transhistory.setBackground(mainbodcol);
    }//GEN-LAST:event_transhistoryMouseEntered

    private void transhistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transhistoryMouseExited
       transhistory.setBackground(navcol);
    }//GEN-LAST:event_transhistoryMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel receipt;
    private javax.swing.JDesktopPane reportbod;
    private javax.swing.JPanel status;
    private javax.swing.JPanel transhistory;
    // End of variables declaration//GEN-END:variables

    private void setState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
