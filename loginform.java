/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL LAPTOP
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public loginform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtfuser = new javax.swing.JTextField();
        jtpf = new javax.swing.JPasswordField();
        jButtonsubmit = new javax.swing.JButton();
        jButtonregister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(440, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtfuser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtfuser.setForeground(new java.awt.Color(102, 102, 102));
        jtfuser.setText("  USERNAME");
        jtfuser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jtfuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfuserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jtfuserMouseEntered(evt);
            }
        });
        jtfuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfuserActionPerformed(evt);
            }
        });

        jtpf.setForeground(new java.awt.Color(102, 102, 102));
        jtpf.setText("asswordField1");
        jtpf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        jtpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtpfMouseClicked(evt);
            }
        });

        jButtonsubmit.setBackground(new java.awt.Color(0, 102, 102));
        jButtonsubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonsubmit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsubmit.setText("LOGIN");
        jButtonsubmit.setOpaque(false);
        jButtonsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonsubmitMouseEntered(evt);
            }
        });
        jButtonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsubmitActionPerformed(evt);
            }
        });

        jButtonregister.setBackground(new java.awt.Color(0, 102, 102));
        jButtonregister.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButtonregister.setForeground(new java.awt.Color(255, 255, 255));
        jButtonregister.setText("REGISTER");
        jButtonregister.setOpaque(false);
        jButtonregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonregisterActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL LAPTOP\\Desktop\\project\\usericon1resize.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL LAPTOP\\Desktop\\project\\Keychainiconresize.png")); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" LOGIN or SIGN UP:");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfuser, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonregister, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtpf))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfuser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsubmit)
                    .addComponent(jButtonregister))
                .addGap(106, 106, 106))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 60, 330, 380);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL LAPTOP\\Desktop\\project\\Very-Basic-Close-iconresize.png")); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 0, 20, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL LAPTOP\\Desktop\\project\\background6.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 440, 500);

        setSize(new java.awt.Dimension(440, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonsubmitMouseEntered

        jButtonsubmit.setOpaque(false);
    }//GEN-LAST:event_jButtonsubmitMouseEntered

    private void jtfuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfuserMouseClicked
       
        jtfuser.setText(null);
        
    }//GEN-LAST:event_jtfuserMouseClicked

    private void jtpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtpfMouseClicked
       jtpf.setText(null);
       
    }//GEN-LAST:event_jtpfMouseClicked

    private void jButtonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonregisterActionPerformed
JOptionPane.showMessageDialog(null,"if you are a new user then please enter the id same everywhere :) :)  ");
        new Window1().setVisible(true);
 this.dispose();
    }//GEN-LAST:event_jButtonregisterActionPerformed

    private void jButtonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsubmitActionPerformed
 String user=jtfuser.getText();
 String password=jtpf.getText();
 
        try{
    Class.forName("com.mysql.jdbc.Driver");
    
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false","root","tiger");

    String sql="select ID,password from login where(ID=? and password=?)";
    
    PreparedStatement pst=conn.prepareStatement(sql);
 
    
    pst.setString(1,user);
        pst.setString(2,password);
        ResultSet rs=pst.executeQuery();    
        JOptionPane.showMessageDialog(null,"rs");
        if(rs.next())
        {
        Window2 win2=new Window2();
        win2.setVisible(true);
       dispose();
       
        }
        else{
            JOptionPane.showMessageDialog(null,"username or password incorrect");
        }
        }catch(Exception ee){}
    }//GEN-LAST:event_jButtonsubmitActionPerformed

    private void jtfuserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfuserMouseEntered
      
    }//GEN-LAST:event_jtfuserMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfuserActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonregister;
    private javax.swing.JButton jButtonsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtfuser;
    private javax.swing.JPasswordField jtpf;
    // End of variables declaration//GEN-END:variables
}
