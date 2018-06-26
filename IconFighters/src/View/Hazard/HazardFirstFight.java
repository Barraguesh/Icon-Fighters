/**
 * @author Barraguesh
 * @version %I% %G%
 * @since v0.2 alpha
 */
package View.Hazard;

import IconFighters.Controller;
import static IconFighters.Controller.*;
import static View.SelectFighter.fighter;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class HazardFirstFight extends javax.swing.JFrame {
    /**
     * Creates new form HazardFirstFight
     */
    int EnemyCounterAttack = 0;
    int temporalvariable = 0;

    public HazardFirstFight() {
        initComponents();
        setVisible(false);
        setLocationRelativeTo(null);
        Continue.setVisible(false);
        EnemyLife.setValue(100); //Percentage
        PlayerLife.setValue(100); //Percentage
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HazardousAttack = new javax.swing.JButton();
        UltraHazard = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CombatContext = new javax.swing.JTextArea();
        PlayerLife = new javax.swing.JProgressBar();
        EnemyLife = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Continue = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HazardousAttack.setText("Hazardous Attack");
        HazardousAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HazardousAttackActionPerformed(evt);
            }
        });

        UltraHazard.setText("Ultra Hazard");
        UltraHazard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltraHazardActionPerformed(evt);
            }
        });

        CombatContext.setColumns(20);
        CombatContext.setRows(5);
        jScrollPane1.setViewportView(CombatContext);

        PlayerLife.setBackground(new java.awt.Color(255, 0, 0));
        PlayerLife.setForeground(new java.awt.Color(0, 255, 0));

        EnemyLife.setBackground(new java.awt.Color(255, 0, 0));
        EnemyLife.setForeground(new java.awt.Color(0, 255, 0));

        Continue.setText("Cotinue");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Hazard.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/XML.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PlayerLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3)))
                            .addGap(9, 9, 9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HazardousAttack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UltraHazard))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel4))
                        .addComponent(EnemyLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(Continue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(PlayerLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(EnemyLife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HazardousAttack)
                    .addComponent(UltraHazard))
                .addGap(18, 18, 18)
                .addComponent(Continue)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void EnemyAttack(){
        try{
            HazardousAttack.setEnabled(false);
            UltraHazard.setEnabled(false);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {    // Takes anonymous inner TimerTask class as argument
                public void run() {
                    try {
                        temporalvariable = 100*(EnemyCounterAttack - Controller.GetStats(fighter).getDefense()/4)/Controller.GetStats(fighter).getLifePoints();
                    } catch (Exception ex) {
                        
                    }
                    if(temporalvariable < 0) temporalvariable = 0;
                    PlayerLife.setValue(PlayerLife.getValue() - temporalvariable);
                    ConsolePrint("Enemy made: " + temporalvariable + "\n" + "Player life is: " + PlayerLife.getValue() + "\n");
                    temporalvariable = 0;
                    if (EnemyCounterAttack > 10){
                        CombatContext.setText(CombatContext.getText() + "\n" + "\n" + "XML used 'Basic Attack'!" + "\n" + "It seems it is effective!");  
                    }else if (EnemyCounterAttack >= 20){
                        CombatContext.setText(CombatContext.getText() + "\n" + "\n"  + "XML used 'Basic Attack'!" + "\n" + "It it is super effective!");  
                    }else
                        CombatContext.setText(CombatContext.getText() + "\n" + "\n" + "XML used 'Basic Attack'!");
                    HazardousAttack.setEnabled(true);
                    UltraHazard.setEnabled(true);
                   cancel();
                }
            }, 5000); // Second argument is the time in milliseconds, third argument is how many times you wanna do that task every set amount of milliseconds
        } catch (Exception ex){
                System.out.println("Exception in Enemy Attack " + ex.getMessage());
        }
    }
    
    private void HazardousAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HazardousAttackActionPerformed
        // TODO add your handling code here:
        int damage;
        try {
            damage = ThreadLocalRandom.current().nextInt(0, Controller.GetStats(fighter).getAttack() / 2);
            temporalvariable =  100*(damage - Controller.XMLBorn().getDefense()/4)/Controller.XMLBorn().getLifePoints();
            if(temporalvariable < 0) temporalvariable = 0;
            EnemyLife.setValue(EnemyLife.getValue() - temporalvariable);
            System.out.println("Hazarous Attack made: " + temporalvariable + "\n" + "Enemy life is: " + EnemyLife.getValue() + "\n");
            temporalvariable = 0;
            if(damage > 10){
                CombatContext.setText("Hazard used 'Hazardous Attack'!" + "\n" + "It seems it is effective!");  
            }else 
                CombatContext.setText("Hazard used 'Hazardous Attack'!");
                UltraHazard.setEnabled(true);
            if (EnemyLife.getValue() <= 0) {
                 CombatContext.setText("Damn, you massacred XML. Good job, now, continue your journey.");
                 Continue.setVisible(true);
            }
            //Insert timer here that calls EnemyAttack()  
            EnemyCounterAttack = Controller.CounterAttack(1);
            EnemyAttack();
        } catch (Exception ex) {
            System.out.println("Exception in Hazarous Attack " + ex.getMessage());
        }
    }//GEN-LAST:event_HazardousAttackActionPerformed

    private void UltraHazardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltraHazardActionPerformed
        // TODO add your handling code here:
        int damage;
        try {
            damage = ThreadLocalRandom.current().nextInt(Controller.GetStats(fighter).getAttack()/4, Controller.GetStats(fighter).getAttack());
        temporalvariable =  100*(damage - Controller.XMLBorn().getDefense()/4)/Controller.XMLBorn().getLifePoints();
        if(temporalvariable < 0) temporalvariable = 0;
        EnemyLife.setValue(EnemyLife.getValue() - temporalvariable);
        System.out.println("Ultra Hazard made: " + temporalvariable + "\n" + "Enemy life is: " + EnemyLife.getValue() + "\n");
        temporalvariable = 0;
        if (damage > 10){
            CombatContext.setText("Hazard used 'Ultra Hazard'!" + "\n" + "It seems it is effective!");  
        }else if (damage >= 20){
            CombatContext.setText("Hazard used 'Ultra Hazard'!" + "\n" + "It it is super effective!");  
        }else 
        CombatContext.setText("Hazard used 'Ultra Hazard'!");
        
        if (EnemyLife.getValue() <= 0) {
             CombatContext.setText("Damn, you massacred XML. Good job, now, continue your journey.");
             Continue.setVisible(true);
        }
        UltraHazard.setEnabled(false);
        EnemyCounterAttack = Controller.CounterAttack(2);
        EnemyAttack();
        } catch (Exception ex) {
            System.out.println("Exception in Ultra Hazard Attack " + ex.getMessage());
        }
    }//GEN-LAST:event_UltraHazardActionPerformed
   
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
            java.util.logging.Logger.getLogger(HazardFirstFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HazardFirstFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HazardFirstFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HazardFirstFight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HazardFirstFight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CombatContext;
    private javax.swing.JToggleButton Continue;
    private javax.swing.JProgressBar EnemyLife;
    private javax.swing.JButton HazardousAttack;
    private javax.swing.JProgressBar PlayerLife;
    private javax.swing.JButton UltraHazard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
