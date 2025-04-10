/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.TaxPayer;
import dao.TaxPayerDao;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guhirwa
 */
public class UpdateTaxPayer extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTaxPayer
     */
    public UpdateTaxPayer() {
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

        jLabel1 = new javax.swing.JLabel();
        goBackBtn = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TinText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tinTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nidTxt = new javax.swing.JTextField();
        ClearUpdateForm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        confirmUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        uniqueTaxPayer = new javax.swing.JTable();
        checkButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TaxPayer Update Form");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N

        goBackBtn.setBackground(new java.awt.Color(255, 255, 204));
        goBackBtn.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        goBackBtn.setText("Go Back");
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });

        CancelButton.setBackground(new java.awt.Color(255, 102, 102));
        CancelButton.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel7.setText("Enter TaxPayer TIN to Update:");

        TinText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinTextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Names:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("TIN:");

        tinTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinTxtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel5.setText("Amount:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel4.setText("National_ID:");

        nidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidTxtActionPerformed(evt);
            }
        });

        ClearUpdateForm.setBackground(new java.awt.Color(255, 255, 204));
        ClearUpdateForm.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        ClearUpdateForm.setText("Clear Form");
        ClearUpdateForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearUpdateFormActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setText("Enter New Informations...");

        confirmUpdate.setBackground(new java.awt.Color(255, 255, 204));
        confirmUpdate.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        confirmUpdate.setText("Confirm");
        confirmUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUpdateActionPerformed(evt);
            }
        });

        uniqueTaxPayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Names", "TIN", "NID", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(uniqueTaxPayer);

        checkButton.setBackground(new java.awt.Color(255, 255, 204));
        checkButton.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(TinText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkButton)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(60, 60, 60)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(2, 2, 2)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(goBackBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ClearUpdateForm)
                                        .addGap(12, 12, 12)
                                        .addComponent(confirmUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CancelButton)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jLabel1)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TinText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkButton))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tinTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackBtn)
                    .addComponent(CancelButton)
                    .addComponent(ClearUpdateForm)
                    .addComponent(confirmUpdate))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new App().setVisible(true);

    }//GEN-LAST:event_goBackBtnActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new App().setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void tinTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tinTxtActionPerformed

    private void nidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nidTxtActionPerformed

    private void ClearUpdateFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearUpdateFormActionPerformed
        // TODO add your handling code here:
        clearField();
    }//GEN-LAST:event_ClearUpdateFormActionPerformed

    public  void clearField() {
        tinTxt.setText("");
        TinText.setText("");
        nameTxt.setText("");
        nidTxt.setText("");
        amountTxt.setText("");
    }

    private void confirmUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUpdateActionPerformed
        // TODO add your handling code here:
        if (
                !tinTxt.getText().trim().isEmpty() &&
                !nameTxt.getText().trim().isEmpty() &&
                !amountTxt.getText().trim().isEmpty() &&
                !nidTxt.getText().trim().isEmpty()
            ) {
            TaxPayerDao dao = new TaxPayerDao();
            String tinToSearch = TinText.getText();
            TaxPayer result = dao.getTaxPayerByTin(tinToSearch);
            if (result != null) {
                result.setNames(nameTxt.getText());
                result.setNid(tinTxt.getText());
                result.setTin(tinTxt.getText());
                result.setAmount(Double.valueOf(String.valueOf(amountTxt.getText())));

                int rowAffected = dao.updateTaxPayer(result);
                if(rowAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Data Updated successful!!!");
                } else {
                    JOptionPane.showMessageDialog(null, "Data no Updated.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "TaxPayer not found!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill or the required spaces.");
        }
    }//GEN-LAST:event_confirmUpdateActionPerformed

    private void TinTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinTextActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        if (!TinText.getText().trim().isEmpty()) {
            TaxPayerDao dao = new TaxPayerDao();
            String tinToSearch = TinText.getText();
            TaxPayer result = dao.getTaxPayerByTin(tinToSearch);
            if (result != null) {
                // Update JTable
                DefaultTableModel model = (DefaultTableModel) uniqueTaxPayer.getModel();
                model.setRowCount(0); // Clear any previous data
                model.addRow(new Object[]{
                        result.getTin(),
                        result.getNames(),
                        result.getNid(),
                        result.getAmount()
                });

            } else {
                JOptionPane.showMessageDialog(null, "TaxPayer not found!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please enter a TIN number.");
        }
    }//GEN-LAST:event_checkButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTaxPayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTaxPayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTaxPayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTaxPayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTaxPayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ClearUpdateForm;
    private javax.swing.JTextField TinText;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton confirmUpdate;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField nidTxt;
    private javax.swing.JTextField tinTxt;
    private javax.swing.JTable uniqueTaxPayer;
    // End of variables declaration//GEN-END:variables
}
