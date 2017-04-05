/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noixcoop;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tangu
 */
public class AccueilGestionnaire extends javax.swing.JFrame {

    /**
     * Creates new form AccueilGestionnaire
     */
    public AccueilGestionnaire(){
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        editercommande = new javax.swing.JMenuItem();
        consultercommande = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        deco = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Bonjour et bienvenue ");

        jLabel2.setText("dans l'application de gestion de commande de Noixcoop");

        jMenu1.setText("Commandes");

        editercommande.setText("Editer une commande");
        editercommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editercommandeActionPerformed(evt);
            }
        });
        jMenu1.add(editercommande);

        consultercommande.setText("Consulter les commandes d'un distributeur");
        consultercommande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultercommandeActionPerformed(evt);
            }
        });
        jMenu1.add(consultercommande);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Deconnexion");

        deco.setText("Deconnexion");
        deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decoActionPerformed(evt);
            }
        });
        jMenu2.add(deco);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editercommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editercommandeActionPerformed
        EditerCommande creer = new EditerCommande();
        creer.setTitle("Editer une commande");
        creer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editercommandeActionPerformed

    private void consultercommandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultercommandeActionPerformed
      ConsulterCommande consulter;
        try {
            consulter = new ConsulterCommande();
            consulter.setTitle("Consulter une commande");
            consulter.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AccueilGestionnaire.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_consultercommandeActionPerformed

    private void decoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decoActionPerformed
       connexion connexion = new connexion();
        connexion.setTitle("Connexion");
        connexion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_decoActionPerformed

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
            java.util.logging.Logger.getLogger(AccueilGestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccueilGestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccueilGestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccueilGestionnaire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultercommande;
    private javax.swing.JMenuItem deco;
    private javax.swing.JMenuItem editercommande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
