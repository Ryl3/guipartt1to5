/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restogui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ellan
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
        initComponents();
    }

        Color navcol = new Color(178,34,34);
        Color mainbodcol = new Color(128,0,0);
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        passw = new javax.swing.JPasswordField();
        cpassw = new javax.swing.JPasswordField();
        fname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        datebirth = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        country = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        signup = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        clearall = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        ex = new javax.swing.JPanel();
        exe = new javax.swing.JLabel();
        hyph = new javax.swing.JPanel();
        exe1 = new javax.swing.JLabel();
        backg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(128, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        passw.setBackground(new java.awt.Color(178, 34, 34));
        passw.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        passw.setForeground(new java.awt.Color(240, 240, 240));
        passw.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 40));

        cpassw.setBackground(new java.awt.Color(178, 34, 34));
        cpassw.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        cpassw.setForeground(new java.awt.Color(240, 240, 240));
        cpassw.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Confirm Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(cpassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, 40));

        fname.setBackground(new java.awt.Color(178, 34, 34));
        fname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        fname.setForeground(new java.awt.Color(240, 240, 240));
        fname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "First Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 40));

        email.setBackground(new java.awt.Color(178, 34, 34));
        email.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        email.setForeground(new java.awt.Color(240, 240, 240));
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Email", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, 40));

        lname.setBackground(new java.awt.Color(178, 34, 34));
        lname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        lname.setForeground(new java.awt.Color(240, 240, 240));
        lname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Last Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 240, 40));

        contact.setBackground(new java.awt.Color(178, 34, 34));
        contact.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        contact.setForeground(new java.awt.Color(240, 240, 240));
        contact.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Contact #", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 240, 40));

        uname.setBackground(new java.awt.Color(178, 34, 34));
        uname.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        uname.setForeground(new java.awt.Color(240, 240, 240));
        uname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 240, 40));

        datebirth.setBackground(new java.awt.Color(178, 34, 34));
        datebirth.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        datebirth.setForeground(new java.awt.Color(240, 240, 240));
        datebirth.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Date of Birth (mm,dd,yy)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(datebirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 240, 40));

        status.setBackground(new java.awt.Color(178, 34, 34));
        status.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(240, 240, 240));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Taken", "Married", "Widowed", "Divorced" }));
        status.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 270, -1));

        gender.setBackground(new java.awt.Color(178, 34, 34));
        gender.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(240, 240, 240));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Gay", "Lesbian", "Non-binary", "Queer", "Trans" }));
        gender.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Gender", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 270, -1));

        country.setBackground(new java.awt.Color(178, 34, 34));
        country.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        country.setForeground(new java.awt.Color(240, 240, 240));
        country.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "Country", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 240, 40));

        city.setBackground(new java.awt.Color(178, 34, 34));
        city.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        city.setForeground(new java.awt.Color(240, 240, 240));
        city.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true), "City", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 240, 40));

        signup.setBackground(new java.awt.Color(128, 0, 0));
        signup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        signup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign up");
        signup.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 30));

        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 100, 50));

        clearall.setBackground(new java.awt.Color(128, 0, 0));
        clearall.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        clearall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearallMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearallMouseExited(evt);
            }
        });
        clearall.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Clear");
        clearall.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 30));

        jPanel1.add(clearall, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 100, 50));

        jPanel2.setBackground(new java.awt.Color(178, 34, 34));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setBackground(new java.awt.Color(178, 34, 34));
        jCheckBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(240, 240, 240));
        jCheckBox1.setText("Agree with Terms and Conditions");
        jCheckBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 1, true));
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 270, 40));

        ex.setBackground(new java.awt.Color(128, 0, 0));
        ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exMouseExited(evt);
            }
        });
        ex.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exe.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        exe.setForeground(new java.awt.Color(240, 240, 240));
        exe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exe.setText("x");
        ex.add(exe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 40));

        hyph.setBackground(new java.awt.Color(128, 0, 0));
        hyph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hyphMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hyphMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hyphMouseExited(evt);
            }
        });
        hyph.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exe1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        exe1.setForeground(new java.awt.Color(240, 240, 240));
        exe1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exe1.setText("—");
        hyph.add(exe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 20));

        jPanel1.add(hyph, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 40, 40));

        backg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/zzz360_F_282407845_chiA9FNlqdviNvqm8QX7T1frAxUDN67pre.jpg"))); // NOI18N
        jPanel1.add(backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 360));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/logow-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 650, 130));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgnicons/zzzzzpnqHVbredgradient21212.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 280));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 880, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        loginform loginf = new loginform();
        this.dispose();
        loginf.setVisible(true);
    }//GEN-LAST:event_signupMouseClicked

    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setBackground(navcol);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
         signup.setBackground(mainbodcol);
    }//GEN-LAST:event_signupMouseExited

    private void clearallMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearallMouseEntered
       clearall.setBackground(navcol);
    }//GEN-LAST:event_clearallMouseEntered

    private void clearallMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearallMouseExited
        clearall.setBackground(mainbodcol);
    }//GEN-LAST:event_clearallMouseExited

    private void exMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseEntered
        ex.setBackground(navcol);
    }//GEN-LAST:event_exMouseEntered

    private void exMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseExited
       ex.setBackground(mainbodcol);
    }//GEN-LAST:event_exMouseExited

    private void exMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseClicked
         int x = JOptionPane.showConfirmDialog(null, "Confirm Exit");
        if(x== JOptionPane.YES_OPTION){
                System.exit(0);
        }
    }//GEN-LAST:event_exMouseClicked

    private void hyphMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyphMouseEntered
       hyph.setBackground(navcol);
    }//GEN-LAST:event_hyphMouseEntered

    private void hyphMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyphMouseExited
        hyph.setBackground(mainbodcol);
    }//GEN-LAST:event_hyphMouseExited

    private void hyphMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hyphMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_hyphMouseClicked

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backg;
    private javax.swing.JTextField city;
    private javax.swing.JPanel clearall;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField country;
    private javax.swing.JPasswordField cpassw;
    private javax.swing.JTextField datebirth;
    private javax.swing.JTextField email;
    private javax.swing.JPanel ex;
    private javax.swing.JLabel exe;
    private javax.swing.JLabel exe1;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel hyph;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField passw;
    private javax.swing.JPanel signup;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
