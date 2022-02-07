
package atm;

import Code.Database;
import javax.swing.JOptionPane;


public class Withdraw extends javax.swing.JFrame {

   
    public Withdraw() {
        initComponents();
        
    }
   double balance;
   String accno;
    public Withdraw(String accno) {
        initComponents();
        this.accno=accno;
         balance= new Database().getBalance(accno);
        jLabel3.setText(balance+"");
      
        
    }
  

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATM Management System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 24, 950, 80);

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Bank");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 950, 50);

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Withdraw Money");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 114, 950, 70);

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Current Balance :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 320, 280, 70);

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Amount : ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 230, 180, 70);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(440, 240, 260, 50);

        jButton3.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton3.setText("Main Menu ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(60, 460, 220, 50);

        jButton7.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton7.setText("Submit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(710, 460, 210, 50);

        jButton8.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(380, 460, 210, 50);

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 330, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\img.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -6, 950, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        
        new ATMFrame2(accno).setVisible(true);// TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
if(jTextField1.getText().equals("0")||jTextField1.getText().isEmpty())
{
  JOptionPane.showMessageDialog(this, "Please Enter Valid Ammount to be Withdraw");
}
else
    if(Double.parseDouble(jTextField1.getText())>balance)
    {
        JOptionPane.showMessageDialog(this, "Ammount Entered is greater than your Balance");
    }
else
    {
        String check ="withdraw";
        String amt=jTextField1.getText();
        System.out.println("Accno : "+accno);
        System.out.println("amt : "+amt);
        String a[]={accno,amt};
        boolean correct=new Database().DatabaseCreate(check, a,null);
        System.out.println("Coorect : "+correct);
        if(correct)
        {
           this.setVisible(false);
       new  SuccesWithdraw(accno,Double.parseDouble(amt)).setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"There is Technical isuue");
        }
       
    }
     
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
