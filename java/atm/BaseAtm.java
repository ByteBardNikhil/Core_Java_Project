
package atm;


import Code.Database;


import javax.swing.JOptionPane;

public class BaseAtm extends javax.swing.JFrame {
    Database db=new Database();
    String accno;
    
 

  
    public BaseAtm() {
         initComponents();
         
         
    }
   

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel4.setText("Enter your Account Number ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 180, 440, 60);

        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(530, 470, 300, 50);

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(70, 470, 300, 50);

        jButton3.setText("Forgot Pin ?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(700, 370, 220, 30);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATM Management System");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 24, 950, 80);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField2);
        jPasswordField2.setBounds(590, 190, 250, 30);

        jLabel6.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Bank");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 950, 50);

        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField3);
        jPasswordField3.setBounds(590, 270, 250, 30);

        jLabel5.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel5.setText("Enter your PIN ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(70, 280, 440, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\img.jpg")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, -6, 950, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

   
        System.out.println("Submit button Clicked ");
       
       
     String accnoNpass[]={jPasswordField2.getText(),jPasswordField3.getText()};
     accno=(jPasswordField2.getText());
        System.out.println("Account Number Submit Button : "+jPasswordField2.getText());
    
    
       String check="AccountDetails";
       boolean correct =db.DatabaseCreate(check,accnoNpass ,null);
       
       if(correct)
       {
           this.setVisible(false);
           new ATMFrame2(accno).setVisible(true);
          
           
       }
       else
       {
           JOptionPane.showMessageDialog(this,"Invalid Username or Password");
       }
       
       
      
       
        
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

  
        System.out.println("Forgot Pin clicked");
      
      
       boolean correct=db.DatabaseCreate("onlyaccno",null,jPasswordField2.getText());
     
        if(jPasswordField2.getText().isEmpty())
{
    JOptionPane.showMessageDialog(this,"Please Enter Account Number \n and then proceed for Forgot Pin ");
}
else
   if(correct)
    {
                this.setVisible(false);
new PhoneNumber().setVisible(true);
    }
else
    {
    JOptionPane.showMessageDialog(this,"Invalis Account Number ");}
        
   


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
      
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField3ActionPerformed

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
            java.util.logging.Logger.getLogger(BaseAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaseAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaseAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaseAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseAtm().setVisible(true);
               
            }
        });
   }

    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}