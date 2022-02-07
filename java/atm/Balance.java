
package atm;

import Code.Database;


public class Balance extends javax.swing.JFrame {

  
    public Balance() {
       initComponents();
    }
    String accno;
    public Balance(String accno) {
       initComponents();
       this.accno=accno;
       jLabel3.setText("Your Current Balance   ");
       jLabel7.setText(new Database().getBalance(accno)+"");
       
       
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
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
        jLabel6.setText(" Bank");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 950, 50);

        jButton2.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(570, 420, 220, 50);

        jLabel4.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Balance :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(240, 250, 230, 70);

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 170, 950, 40);

        jLabel7.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(520, 254, 200, 40);

        jButton3.setFont(new java.awt.Font("Sitka Display", 0, 36)); // NOI18N
        jButton3.setText("Main Menu ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(110, 430, 220, 50);

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
System.exit(0);     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
new ATMFrame2(accno).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Balance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
