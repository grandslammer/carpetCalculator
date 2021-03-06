
import java.math.RoundingMode;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Trainee
 */
public class CarpetProgram extends javax.swing.JFrame {

    String gradeValue;
    double pricePerMeter;
    double fittingRate;
    double length;

    /**
     * Creates new form CarpetProgram
     */
    public CarpetProgram() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtTotal = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtLength = new javax.swing.JTextField();
        txtPriceTotal = new javax.swing.JTextField();
        txtFittingCharge = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtTax20 = new javax.swing.JTextField();
        clearEstimate = new javax.swing.JButton();
        calculateEstimate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Total");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 710, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Grade");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Price per meter");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Length");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade A", "Grade B", "Grade C", "Grade D" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 120, -1));

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, 100, -1));

        txtPrice.setEditable(false);
        txtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 100, -1));

        txtLength.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLengthActionPerformed(evt);
            }
        });
        jPanel1.add(txtLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 100, -1));

        txtPriceTotal.setEditable(false);
        txtPriceTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtPriceTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 100, -1));

        txtFittingCharge.setEditable(false);
        txtFittingCharge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtFittingCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 270, 100, -1));

        txtSubTotal.setEditable(false);
        txtSubTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 100, -1));

        txtTax20.setEditable(false);
        txtTax20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTax20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 480, 100, -1));

        clearEstimate.setText("Clear Estimate");
        clearEstimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEstimateActionPerformed(evt);
            }
        });
        jPanel1.add(clearEstimate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 700, -1, -1));

        calculateEstimate.setText("Calculate Estimate");
        calculateEstimate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateEstimateActionPerformed(evt);
            }
        });
        jPanel1.add(calculateEstimate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 700, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Carpet Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Fitting Charge");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Sub Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Tax 20%");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setText("Carpet Price Calculator");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1231, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        gradeValue = String.valueOf(jComboBox1.getSelectedItem());

        switch (gradeValue) {
            case "Grade A":
                txtPrice.setText("€25.99");
                pricePerMeter = 25.99;
                fittingRate = 0.1;
                break;
            case "Grade B":
                txtPrice.setText("€22.99");
                pricePerMeter = 22.99;
                fittingRate = 0.075;
                break;
            case "Grade C":
                txtPrice.setText("€19.99");
                pricePerMeter = 19.99;
                fittingRate = 0.05;
                break;
            case "Grade D":
                txtPrice.setText("€15.99");
                pricePerMeter = 15.99;
                fittingRate = 0.025;
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLengthActionPerformed

    private void calculateEstimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateEstimateActionPerformed
        // TODO add your handling code here:
        NumberFormat nf = NumberFormat.getInstance(); // Formats to 2 decimal points ALWAYS
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        nf.setRoundingMode(RoundingMode.HALF_UP);

        try {
            length = Double.parseDouble(txtLength.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid length!");
        }
        double priceByLength = pricePerMeter * length;

        txtPriceTotal.setText("€" + String.valueOf(nf.format(priceByLength)));
        txtFittingCharge.setText(String.valueOf(nf.format(priceByLength * fittingRate)));

        double subTotal = priceByLength + (fittingRate * 100);
        txtSubTotal.setText("€" + String.valueOf(nf.format(subTotal)));

        double tax = subTotal * 0.2;
        txtTax20.setText("€" + String.valueOf(nf.format(tax)));

        double total = subTotal + tax;
        txtTotal.setText("€" + String.valueOf(nf.format(total)));
    }//GEN-LAST:event_calculateEstimateActionPerformed

    private void clearEstimateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEstimateActionPerformed
        // TODO add your handling code here:
        txtLength.setText("");
        txtPriceTotal.setText("");
        txtFittingCharge.setText("");
        txtSubTotal.setText("");
        txtTax20.setText("");
        txtTotal.setText("");
    }//GEN-LAST:event_clearEstimateActionPerformed

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
            java.util.logging.Logger.getLogger(CarpetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarpetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarpetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarpetProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarpetProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateEstimate;
    private javax.swing.JButton clearEstimate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFittingCharge;
    private javax.swing.JTextField txtLength;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPriceTotal;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTax20;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
