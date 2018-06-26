/**
 * @author Barraguesh
 * @version %I% %G%
 * @since v0.2 alpha
 */
package View;

import java.awt.Color;
import IconFighters.Controller;
import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame {
        /**
         * Creates new form Welcome
         */
        public Welcome() {
                initComponents();
                setVisible(true);
                setLocationRelativeTo(null);
                Subtitle2.setVisible(false);
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Subtitle = new javax.swing.JLabel();
        Start = new javax.swing.JButton();
        Subtitle2 = new javax.swing.JLabel();
        EditStats = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        Title.setText("ICON FIGTHERS");

        Subtitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        Subtitle.setText("WELCOME TO");
        Subtitle.setToolTipText("");

        Start.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        Start.setText("Start!");
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartMouseExited(evt);
            }
        });
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        Subtitle2.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        Subtitle2.setText("Start NOW");

        EditStats.setText("Edit stats");
        EditStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStatsActionPerformed(evt);
            }
        });

        jButton1.setText("Go to...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(Subtitle2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(Subtitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(Title))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EditStats)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditStats)
                .addGap(35, 35, 35)
                .addComponent(Subtitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title)
                    .addComponent(jButton1))
                .addGap(72, 72, 72)
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Subtitle2)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void StartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseEntered
            Title.setForeground(Color.GREEN);
            Subtitle2.setVisible(true);
        }//GEN-LAST:event_StartMouseEntered

        private void StartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseExited
            Title.setForeground(Color.black);
            Subtitle2.setVisible(false);
        }//GEN-LAST:event_StartMouseExited

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        Controller.WindowStory();
        dispose();
    }//GEN-LAST:event_StartActionPerformed

    private void EditStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStatsActionPerformed
        Controller.WindowEditStats();
    }//GEN-LAST:event_EditStatsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Controller.WindowSelectFigther();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                        java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Welcome().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditStats;
    private javax.swing.JButton Start;
    private javax.swing.JLabel Subtitle;
    private javax.swing.JLabel Subtitle2;
    private javax.swing.JLabel Title;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}