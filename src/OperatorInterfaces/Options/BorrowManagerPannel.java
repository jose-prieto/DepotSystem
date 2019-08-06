/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperatorInterfaces.Options;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jose Prieto
 */
public class BorrowManagerPannel extends javax.swing.JPanel implements ActionListener{

    /**
     * Creates new form MainOptionPannel
     */
    public BorrowManagerPannel() {
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

        ReturnButton = new javax.swing.JButton();
        BorrowButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));

        ReturnButton.setBackground(new java.awt.Color(153, 153, 153));
        ReturnButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ReturnButton.setForeground(new java.awt.Color(204, 204, 204));
        ReturnButton.setText("Devolución de Material");
        ReturnButton.setContentAreaFilled(false);
        ReturnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReturnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseExited(evt);
            }
        });
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        BorrowButton.setBackground(new java.awt.Color(153, 153, 153));
        BorrowButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BorrowButton.setForeground(new java.awt.Color(204, 204, 204));
        BorrowButton.setText("Retiro de Material");
        BorrowButton.setContentAreaFilled(false);
        BorrowButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrowButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BorrowButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BorrowButtonMouseExited(evt);
            }
        });
        BorrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BorrowButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ReturnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BorrowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ReturnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(421, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void BorrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowButtonActionPerformed

    private void BorrowButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowButtonMouseEntered
        // TODO add your handling code here:
        BorrowButton.setContentAreaFilled(true);
        BorrowButton.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_BorrowButtonMouseEntered

    private void BorrowButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BorrowButtonMouseExited
        // TODO add your handling code here:
        BorrowButton.setContentAreaFilled(false);
    }//GEN-LAST:event_BorrowButtonMouseExited

    private void ReturnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseEntered
        // TODO add your handling code here:
        ReturnButton.setContentAreaFilled(true);
        ReturnButton.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_ReturnButtonMouseEntered

    private void ReturnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseExited
        // TODO add your handling code here:
        ReturnButton.setContentAreaFilled(false);
    }//GEN-LAST:event_ReturnButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BorrowButton;
    public javax.swing.JButton ReturnButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}