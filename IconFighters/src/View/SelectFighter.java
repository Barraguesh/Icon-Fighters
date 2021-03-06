/**
 * @author Barraguesh
 * @version %I% %G%
 * @since v0.2 alpha
 */
package View;
import IconFighters.Controller;
import static IconFighters.Controller.*;

public class SelectFighter extends javax.swing.JFrame {
    public static String fighter = null;
    /**
     * Creates new form WindowSelectFigther
     */
    public SelectFighter() {
        initComponents();
        setVisible(false);
        setLocationRelativeTo(null);
        Continue.setVisible(false);
        HAttack.setVisible(false);
        HDefense.setVisible(false);
        HLifePoints.setVisible(false);
        XAttack.setVisible(false);
        XDefense.setVisible(false);
        XLifePoints.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Group = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        HazardTitle = new javax.swing.JLabel();
        Continue = new javax.swing.JToggleButton();
        HazardSelect = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        HAttack = new javax.swing.JLabel();
        HDefense = new javax.swing.JLabel();
        HLifePoints = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        XAttack = new javax.swing.JLabel();
        XDefense = new javax.swing.JLabel();
        XLifePoints = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel1.setText("Select your figther!");

        HazardTitle.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        HazardTitle.setText("Hazard");

        Continue.setText("Continue");
        Continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContinueMouseClicked(evt);
            }
        });
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });

        Group.add(HazardSelect);
        HazardSelect.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        HazardSelect.setText("I want this cutie");
        HazardSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HazardSelectActionPerformed(evt);
            }
        });

        Group.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jRadioButton2.setText("I luf this one!");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        Group.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        HAttack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        HAttack.setText("Attack:");

        HDefense.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        HDefense.setText("Defense: ");

        HLifePoints.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        HLifePoints.setText("Life points: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Hazard.png"))); // NOI18N

        jLabel3.setText("XML");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/XML.png"))); // NOI18N

        XAttack.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        XAttack.setText("Attack:");

        XDefense.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        XDefense.setText("Defense: ");

        XLifePoints.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        XLifePoints.setText("Life points: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(HazardSelect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(jRadioButton3))
                            .addComponent(Continue))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HDefense, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HLifePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(HazardTitle)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel2)
                                .addGap(82, 82, 82)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(XDefense, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(XAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(XLifePoints, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HazardTitle)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HazardSelect)
                        .addComponent(jRadioButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HAttack)
                    .addComponent(XAttack))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HDefense)
                    .addComponent(XDefense))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HLifePoints)
                    .addComponent(XLifePoints))
                .addGap(18, 18, 18)
                .addComponent(Continue)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContinueMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ContinueMouseClicked

    private void HazardSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HazardSelectActionPerformed
        // TODO add your handling code here:
        try{
            fighter = "Hazard";
            Continue.setVisible(true);
            HAttack.setText("Attack: " + GetStats(fighter).getAttack());
            HAttack.setVisible(true);
            HDefense.setText("Defense: " + GetStats(fighter).getDefense());
            HDefense.setVisible(true);
            HLifePoints.setText("Life points: " + GetStats(fighter).getLifePoints());
            HLifePoints.setVisible(true);
        }catch(Exception ex){
            ConsolePrint("Exception in Hazard selection " + ex.getMessage());
        }
    }//GEN-LAST:event_HazardSelectActionPerformed

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        Controller.WindowFirstFigth(fighter);
        setVisible(false);
    }//GEN-LAST:event_ContinueActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        try {
            fighter = "XML";
            Continue.setVisible(true);
            XAttack.setText("Attack: " + GetStats(fighter).getAttack());
            XAttack.setVisible(true);
            XDefense.setText("Defense: " + GetStats(fighter).getDefense());
            XDefense.setVisible(true);
            XLifePoints.setText("Life points: " + GetStats(fighter).getLifePoints());
            XLifePoints.setVisible(true);
        } catch (Exception ex) {
            ConsolePrint("Exception in XML selection " + ex.getMessage());
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectFighter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectFighter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Continue;
    private javax.swing.ButtonGroup Group;
    private javax.swing.JLabel HAttack;
    private javax.swing.JLabel HDefense;
    private javax.swing.JLabel HLifePoints;
    private javax.swing.JRadioButton HazardSelect;
    private javax.swing.JLabel HazardTitle;
    private javax.swing.JLabel XAttack;
    private javax.swing.JLabel XDefense;
    private javax.swing.JLabel XLifePoints;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
