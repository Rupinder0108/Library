
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ANIKA WALIA
 */
public class forgot extends javax.swing.JFrame {


PreparedStatement pst;
        ResultSet rs;
        Connection c=Connect.ConnectToDB();


    /**
     * Creates new form forgot
     */
    public forgot() {
        initComponents();
       txtsq.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtsq = new javax.swing.JTextField();
        txtans = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnloginback = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forgot  Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sequrity Question");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 520, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 226, 38));

        txtsq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtsq, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 226, 38));

        txtans.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtans, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 226, 40));

        btnsubmit.setBackground(new java.awt.Color(255, 51, 51));
        btnsubmit.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnsubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 90, 40));

        btncancel.setBackground(new java.awt.Color(255, 51, 51));
        btncancel.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 590, 90, 40));

        btnloginback.setBackground(new java.awt.Color(255, 51, 51));
        btnloginback.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnloginback.setForeground(new java.awt.Color(255, 255, 255));
        btnloginback.setText("Back To Login ");
        btnloginback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnloginback, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 150, 40));

        btnsearch.setBackground(new java.awt.Color(255, 51, 51));
        btnsearch.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, 100, 40));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close icon.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 40, 40));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 230, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/88.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1340, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
int yes=JOptionPane.showConfirmDialog(this, "Are you really Close this application?","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(yes==JOptionPane.YES_OPTION){
            System.exit(0);
        }
      // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
    try{
         pst=c.prepareStatement("Select sq from library.login where emailid=?");
         pst.setString(1, txtemail.getText());
        rs=pst.executeQuery();
        if(rs.next()){
        txtsq.setText(rs.getString("sq"));
}
else{
JOptionPane.showMessageDialog(this,"Sorry Record Not Found ");
}
    }catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }






        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnloginbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginbackActionPerformed

new SignIn().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginbackActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
try{
        pst=c.prepareStatement("Select * from library.login where emailid=? ");
         pst.setString(1, txtemail.getText());
         pst.setString(2, txtans.getText());
        rs=pst.executeQuery();
        if(rs.next()){
        txtsq.setText(rs.getString(""));
       try{
pst=c.prepareStatement("update library.login set password=? where emailid=? ");
pst.setString(1, txtpassword.getText());
//pst.setString(2, txtemail.getText());
//pst.setString(3, txtans.getText());

pst.executeUpdate();
JOptionPane.showMessageDialog(this,"Update  Successful \n Login Now");
}catch (SQLException ex) {
            Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
JOptionPane.showMessageDialog(this,"Answer Not Match !!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsubmitActionPerformed
catch (SQLException ex) {
            Logger.getLogger(forgot.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed


    txtemail.setText("");   
    txtans.setText("");   
    txtsq.setText("");   
    txtpassword.setText("");   // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

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
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnloginback;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtsq;
    // End of variables declaration//GEN-END:variables
}
