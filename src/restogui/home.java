/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restogui;

import internalpages.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    
    public home() {
        initComponents();
            
    }
    
        Color navcol = new Color(178,34,34);
        Color headercol = new Color(255,0,0);
        Color mainbodcol = new Color(128,0,0);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navi = new javax.swing.JPanel();
        reprts = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashbrd = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        setting = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        close = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        minus = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        mainbod = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navi.setBackground(new java.awt.Color(178, 34, 34));
        navi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reprts.setBackground(new java.awt.Color(178, 34, 34));
        reprts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reprtsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reprtsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reprtsMouseExited(evt);
            }
        });
        reprts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reports");
        reprts.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 140, 20));

        navi.add(reprts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 60));

        dashbrd.setBackground(new java.awt.Color(178, 34, 34));
        dashbrd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashbrdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashbrdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashbrdMouseExited(evt);
            }
        });
        dashbrd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");
        dashbrd.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 140, 20));

        navi.add(dashbrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, 60));

        setting.setBackground(new java.awt.Color(178, 34, 34));
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });
        setting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Account");
        setting.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 140, 20));

        navi.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, 60));

        jPanel2.setBackground(new java.awt.Color(178, 34, 34));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(178, 34, 34));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dont Click");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/restaurant-cafe-exterior-building100.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 89));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 90));

        navi.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/downloadsilh-removebg-preview.png"))); // NOI18N
        navi.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 310));

        jPanel1.add(navi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 550));

        header.setBackground(new java.awt.Color(255, 0, 0));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setBackground(new java.awt.Color(255, 0, 0));
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

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("x");
        close.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        header.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 30));

        minus.setBackground(new java.awt.Color(255, 0, 0));
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

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("—");
        minus.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 20, 30));

        header.add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 40, 30));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 710, 60));

        body.setBackground(new java.awt.Color(139, 0, 0));

        mainbod.setBackground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout mainbodLayout = new javax.swing.GroupLayout(mainbod);
        mainbod.setLayout(mainbodLayout);
        mainbodLayout.setHorizontalGroup(
            mainbodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        mainbodLayout.setVerticalGroup(
            mainbodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainbod)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainbod)
        );

        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 710, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reprtsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reprtsMouseClicked
         reports rp = new reports();
        mainbod.add(rp).setVisible(true);
    }//GEN-LAST:event_reprtsMouseClicked

    private void reprtsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reprtsMouseEntered
         reprts.setBackground(mainbodcol);
    }//GEN-LAST:event_reprtsMouseEntered

    private void reprtsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reprtsMouseExited
        reprts.setBackground(navcol);
    }//GEN-LAST:event_reprtsMouseExited

    private void dashbrdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbrdMouseClicked
        dashboard db = new dashboard();
        mainbod.add(db).setVisible(true);
    }//GEN-LAST:event_dashbrdMouseClicked

    private void dashbrdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbrdMouseEntered
        dashbrd.setBackground(mainbodcol);
    }//GEN-LAST:event_dashbrdMouseEntered

    private void dashbrdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbrdMouseExited
       dashbrd.setBackground(navcol);
    }//GEN-LAST:event_dashbrdMouseExited

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        settings st = new settings();
        mainbod.add(st).setVisible(true);
    }//GEN-LAST:event_settingMouseClicked

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
         setting.setBackground(mainbodcol);
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
         setting.setBackground(navcol);
    }//GEN-LAST:event_settingMouseExited

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        acchistory acch = new acchistory();
        mainbod.add(acch).setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(navcol);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int x = JOptionPane.showConfirmDialog(null, "Confirm Exit");
        if(x== JOptionPane.YES_OPTION){
                System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       close.setBackground(headercol);
    }//GEN-LAST:event_closeMouseExited

    private void minusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseEntered
       minus.setBackground(navcol);
    }//GEN-LAST:event_minusMouseEntered

    private void minusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseExited
       minus.setBackground(headercol);
    }//GEN-LAST:event_minusMouseExited

    private void minusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minusMouseClicked
       setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minusMouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(mainbodcol);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(navcol);
    }//GEN-LAST:event_jPanel3MouseExited

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel close;
    private javax.swing.JPanel dashbrd;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JDesktopPane mainbod;
    private javax.swing.JPanel minus;
    private javax.swing.JPanel navi;
    private javax.swing.JPanel reprts;
    private javax.swing.JPanel setting;
    // End of variables declaration//GEN-END:variables
}
