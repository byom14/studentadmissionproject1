/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Satya
 */
public class ParentDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame1
     */
    public ParentDetails() {
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

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfid = new javax.swing.JTextField();
        jtfFathercontact = new javax.swing.JTextField();
        jtfoccupation = new javax.swing.JTextField();
        jtfincome = new javax.swing.JTextField();
        jtfmothername = new javax.swing.JTextField();
        jtfmcontact = new javax.swing.JTextField();
        jtfmoccupation = new javax.swing.JTextField();
        jtfmincome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtffatherName = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setPreferredSize(new java.awt.Dimension(704, 560));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PARENT DETAILS:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 250, 30);

        jLabel2.setText("Father's Name     ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 80, 120, 30);

        jLabel3.setText("Contact");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 120, 130, 30);

        jLabel4.setText("Occcupation");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 160, 130, 30);

        jLabel5.setText("Annual Income");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 200, 140, 30);

        jLabel6.setText("Mother's Name     ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 260, 110, 30);

        jLabel7.setText("Contact");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 304, 110, 30);

        jLabel8.setText("Occcupation");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 340, 140, 30);

        jLabel9.setText("Annual Income");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 380, 140, 30);

        jtfid.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtfid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfidKeyTyped(evt);
            }
        });
        jPanel1.add(jtfid);
        jtfid.setBounds(220, 40, 150, 30);

        jtfFathercontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFathercontactKeyTyped(evt);
            }
        });
        jPanel1.add(jtfFathercontact);
        jtfFathercontact.setBounds(220, 120, 150, 30);

        jtfoccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfoccupationActionPerformed(evt);
            }
        });
        jPanel1.add(jtfoccupation);
        jtfoccupation.setBounds(220, 160, 150, 30);

        jtfincome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfincomeKeyTyped(evt);
            }
        });
        jPanel1.add(jtfincome);
        jtfincome.setBounds(220, 200, 150, 30);
        jPanel1.add(jtfmothername);
        jtfmothername.setBounds(220, 260, 150, 30);

        jtfmcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfmcontactKeyTyped(evt);
            }
        });
        jPanel1.add(jtfmcontact);
        jtfmcontact.setBounds(220, 300, 150, 30);

        jtfmoccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfmoccupationActionPerformed(evt);
            }
        });
        jPanel1.add(jtfmoccupation);
        jtfmoccupation.setBounds(220, 340, 148, 30);

        jtfmincome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfmincomeKeyTyped(evt);
            }
        });
        jPanel1.add(jtfmincome);
        jtfmincome.setBounds(220, 380, 150, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 440, 90, 30);

        jButton2.setBackground(new java.awt.Color(211, 10, 41));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
        jButton2.setMaximumSize(new java.awt.Dimension(69, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(69, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 440, 90, 30);

        jLabel10.setText("ID");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(70, 40, 100, 30);

        jtffatherName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jtffatherName);
        jtffatherName.setBounds(220, 80, 150, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfoccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfoccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfoccupationActionPerformed

    private void jtfmoccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfmoccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfmoccupationActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jtfid.setText(null);
 jtffatherName.setText(null);  
jtfFathercontact.setText(null);
jtfincome.setText(null);
jtfmcontact.setText(null);
jtfoccupation.setText(null);
jtfmothername.setText(null);  
jtfmincome.setText(null);  
jtfmoccupation.setText(null);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String id=jtfid.getText();
    String fname=jtffatherName.getText();
    String mname=jtffatherName.getText();
    String fincome=jtffatherName.getText();
    String fcontact=jtffatherName.getText();
    String mcontact=jtffatherName.getText();
    String foccupatin=jtffatherName.getText();
    String moccupation=jtffatherName.getText();
    String mincome=jtffatherName.getText();
    
    try{
          
     Class.forName("com.mysql.jdbc.Driver");
         Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false","root","tiger");
     
         String sql="insert into parent_details values(?,?,?,?,?,?,?,?,?)";
       
         PreparedStatement pst=conn.prepareStatement(sql);
       
      
       
       
       pst.setString(1,id);
    pst.setString(2,fname);
     pst.setString(3,fcontact);
      pst.setString(4,foccupatin);
       pst.setString(5,mname);
        pst.setString(6,mcontact);
         pst.setString(7,moccupation);
          pst.setString(8,fincome);
           pst.setString(9,mincome);
          if(id.equals("")||fname.equals("")||fcontact.equals("")||mname.equals("")||mcontact.equals("")||moccupation.equals("")||fincome.equals("")||mincome.equals("")){
          JOptionPane.showMessageDialog(null,"field vacant");
          }
           else{
               pst.execute();
             JOptionPane.showMessageDialog(null,"complete");
           }
      
       
        
             }
    
          catch(Exception ee){}
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfidKeyTyped
 char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume(); }        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidKeyTyped

    private void jtfFathercontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFathercontactKeyTyped
 char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume(); }        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFathercontactKeyTyped

    private void jtfincomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfincomeKeyTyped
 char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume(); }        // TODO add your handling code here:
    }//GEN-LAST:event_jtfincomeKeyTyped

    private void jtfmcontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmcontactKeyTyped
 char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume(); }        // TODO add your handling code here:
    }//GEN-LAST:event_jtfmcontactKeyTyped

    private void jtfmincomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfmincomeKeyTyped
 char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||(c==KeyEvent.VK_BACKSPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume(); }        // TODO add your handling code here:
    }//GEN-LAST:event_jtfmincomeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jtfFathercontact;
    private javax.swing.JTextField jtffatherName;
    private javax.swing.JTextField jtfid;
    private javax.swing.JTextField jtfincome;
    private javax.swing.JTextField jtfmcontact;
    private javax.swing.JTextField jtfmincome;
    private javax.swing.JTextField jtfmoccupation;
    private javax.swing.JTextField jtfmothername;
    private javax.swing.JTextField jtfoccupation;
    // End of variables declaration//GEN-END:variables
}
