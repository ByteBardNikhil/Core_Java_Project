
package atm;

import Code.Database;
import javax.swing.JOptionPane;

public class ChangePIN extends javax.swing.JFrame {

    public ChangePIN() {
        initComponents();
    }
    String accno;
     public ChangePIN(String accno) {
        initComponents();
        this.accno=accno;
        
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ATM Management System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 40, 950, 80);

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Bank");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 950, 50);

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Change Your PIN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 114, 950, 70);

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Re-enter New PIN:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 360, 280, 70);

        jTextField2.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(490, 380, 220, 30);

        jLabel8.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter Old PIN : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 210, 250, 70);

        jTextField3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(490, 220, 220, 30);

        jLabel9.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter New PIN:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 280, 250, 70);

        jTextField4.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(490, 300, 220, 30);

        jButton2.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(390, 470, 220, 50);

        jButton7.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton7.setText("Cancel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(40, 470, 210, 50);

        jButton9.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(720, 470, 220, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\img.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 550);

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String pin =jTextField3.getText();
 
        System.out.println("PIN : "+pin);
 String []a={accno,pin};
  int len=String.valueOf(jTextField4.getText()).length();
      
      boolean correct=  new Database().DatabaseCreate("checkpin", a, null);
     
      if(correct)
      {
          if(len==4)
          {
                          if(jTextField4.getText().equals(jTextField2.getText()))
                           {
                             this.setVisible(false);
                              String a2[]={accno,jTextField4.getText()};
                            correct= new Database().DatabaseCreate("UpDatePin",a2, null);
                               System.out.println("Correct : "+correct);
                            if(correct)
                            { 
                                new SuccesWithdraw(accno).setVisible(true);
                            }
                           else
                           {
                               JOptionPane.showMessageDialog(this,"Technical Issue");
                           }
                           }
                          else
                           {
                                JOptionPane.showMessageDialog(this, "NewPin Does not matches with Re-Entered Pin");
                            }
          }
          else
          {
              JOptionPane.showMessageDialog(this,"Length of PIN should be 4 digits");
          }
      }
      else
      {
          JOptionPane.showMessageDialog(this, "Invalid Old Pin");
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        new ATMFrame2(accno).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
     
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
