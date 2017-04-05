/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noixcoop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;


/**
 *
 * @author tangu
 */
public class EditerCommande extends javax.swing.JFrame {

    /**
     * Creates new form EditerCommande
     */
    public EditerCommande(){
        initComponents();
        chargerIdCommande();
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
        vailder = new javax.swing.JButton();
        idCommande = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        conditionnement = new javax.swing.JTextField();
        quantite = new javax.swing.JTextField();
        jourConditionnement = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        moisConditionnement = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        anneeConditionnement = new javax.swing.JTextField();
        jourEnvoi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        moisEnvoi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        anneeEnvoi = new javax.swing.JTextField();
        buttonUpdate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labelValidation = new javax.swing.JLabel();
        labelValider1 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        deco = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        retour = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Quel commande voulez vous modifier ?");

        vailder.setText("Vailder");
        vailder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vailderActionPerformed(evt);
            }
        });

        jLabel2.setText("Conditionnement : ");

        jLabel3.setText("Quantité : ");

        jLabel4.setText("Date de conditionnement : ");

        jLabel5.setText("Date d'envoi : ");

        conditionnement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conditionnementActionPerformed(evt);
            }
        });

        jLabel6.setText("/");

        jLabel7.setText("/");

        jourEnvoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jourEnvoiActionPerformed(evt);
            }
        });

        jLabel8.setText("/");

        jLabel9.setText("/");

        buttonUpdate.setText("Update");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        jMenu1.setText("Deconnexion");

        deco.setText("Deconnexion");
        deco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decoActionPerformed(evt);
            }
        });
        jMenu1.add(deco);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Retour à l'accueil");

        retour.setText("Retour à l'accueil");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });
        jMenu2.add(retour);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vailder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idCommande, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jourConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moisConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anneeConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jourEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(moisEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anneeEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(conditionnement)
                            .addComponent(quantite)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonUpdate)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelValidation)
                                .addGap(144, 144, 144)))))
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelValider1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idCommande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vailder)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(conditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(quantite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jourConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(moisConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(anneeConditionnement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jourEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(moisEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(anneeEnvoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonUpdate)
                .addGap(18, 18, 18)
                .addComponent(labelValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(labelValider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vailderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vailderActionPerformed
        String login = "root"
            , mdp = "",
                ip = "jdbc:mysql://localhost/agrurppe";
        Connection c=null;
        Statement s=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/agrurppe","root",mdp);
            s = c.createStatement();
            String sql= "SELECT * FROM commandejava WHERE commandejava.idCommandeJava = "+idCommande.getSelectedItem().toString()+""; 
            ResultSet res = s.executeQuery(sql);
            String conditionement;
            while (res.next()){
                conditionnement.setText(res.getString("conditionnementJava"));
                quantite.setText(res.getString("quantiteJava"));
                
                String jourCond = res.getString("dateConditionnement").substring(8,10);
                jourConditionnement.setText(jourCond);
                String moisCond = res.getString("dateConditionnement").substring(5,7);
                moisConditionnement.setText(moisCond);
                String anneeCond = res.getString("dateConditionnement").substring(0,4);
                anneeConditionnement.setText(anneeCond);
             
                String jourEnv = res.getString("dateEnvoi").substring(8,10);
                jourEnvoi.setText(jourEnv);
                String moisEnv = res.getString("dateEnvoi").substring(5,7);
                moisEnvoi.setText(moisEnv);
                String anneeEnv = res.getString("dateEnvoi").substring(0,4);
                anneeEnvoi.setText(anneeEnv);
            }
            labelValider1.setText("");
                    
        }
        catch(SQLException e){
            System.out.println("erreur premier catch");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            System.out.println("erreur deuxieme catch");
            e.printStackTrace();
        }finally{
            try{
                c.close();
                s.close();
            }
            catch(SQLException e){
                System.out.println("erreur troisieme catch");
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_vailderActionPerformed

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourActionPerformed
        AccueilGestionnaire AccueilGestionnaire = new AccueilGestionnaire();
        AccueilGestionnaire.setTitle("Accueil");
        AccueilGestionnaire.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_retourActionPerformed

    private void decoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decoActionPerformed
        connexion connexion = new connexion();
        connexion.setTitle("Connexion");
        connexion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_decoActionPerformed

    private void conditionnementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conditionnementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conditionnementActionPerformed

    private void jourEnvoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jourEnvoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jourEnvoiActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
         String login = "root"
            , mdp = "",
                ip = "jdbc:mysql://localhost/agrurppe";
        Connection c=null;
        Statement s=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/agrurppe","root",mdp);
            s = c.createStatement();
            
            if (conditionnement.getText().equals("") || quantite.getText().equals("") || jourConditionnement.getText().equals("") || moisConditionnement.getText().equals("") || anneeConditionnement.getText().equals("") 
                    || jourEnvoi.getText().equals("") || moisEnvoi.getText().equals("") || anneeEnvoi.getText().equals("") || jourConditionnement.getText().length()!=2 || moisConditionnement.getText().length()!=2 
                    || anneeConditionnement.getText().length()!=4 || jourEnvoi.getText().length()!=2 || moisEnvoi.getText().length()!=2 
                    || anneeEnvoi.getText().length()!=4)
                    {
                labelValider1.setText("Erreur lors des saisie");
                
            }
            else{
                
                String dateEnvoi=anneeEnvoi.getText()+"-"+moisEnvoi.getText()+"-"+jourEnvoi.getText();
                String dateConditionnement=anneeConditionnement.getText()+"-"+moisConditionnement.getText()+"-"+jourConditionnement.getText();
                
                String sql= "UPDATE `commandejava` SET `conditionnementJava`=\""+conditionnement.getText()+"\",`quantiteJava`=\""+quantite.getText()+"\","
                        + "`dateConditionnement`=\""+dateConditionnement+"\",`dateEnvoi`=\""+dateEnvoi+"\" WHERE idCommandeJava="+idCommande.getSelectedItem().toString()+"; "; 
                
                s.executeUpdate(sql); 
                labelValider1.setText("Update réussi");
            }          
        }
        catch(SQLException e){
            System.out.println("erreur premier catch");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            System.out.println("erreur deuxieme catch");
            e.printStackTrace();
        }finally{
            try{
                c.close();
                s.close();
            }
            catch(SQLException e){
                System.out.println("erreur troisieme catch");
                e.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_buttonUpdateActionPerformed
    
     public boolean estUnEntier(String chaine) {
		try {
			Integer.parseInt(chaine);
		} catch (NumberFormatException e){
			return false;
		}
 
		return true;
	}
    
    private void chargerIdCommande (){
     JComboBox liste;
        String login = "root"
            , mdp = "",
                ip = "jdbc:mysql://localhost/agrurppe";
        Connection c=null;
        Statement s=null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/agrurppe","root",mdp);
            s = c.createStatement();
            String sql= "SELECT * FROM commandejava "; 
            ResultSet res = s.executeQuery(sql); 
            while (res.next()){
                idCommande.addItem(res.getString("idCommandeJava"));
            }
            
                    
        }
        catch(SQLException e){
            System.out.println("erreur premier catch");
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            System.out.println("erreur deuxieme catch");
            e.printStackTrace();
        }finally{
            try{
                c.close();
                s.close();
            }
            catch(SQLException e){
                System.out.println("erreur troisieme catch");
                e.printStackTrace();
            }
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(EditerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditerCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anneeConditionnement;
    private javax.swing.JTextField anneeEnvoi;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextField conditionnement;
    private javax.swing.JMenuItem deco;
    private javax.swing.JComboBox<String> idCommande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jourConditionnement;
    private javax.swing.JTextField jourEnvoi;
    private javax.swing.JLabel labelValidation;
    private java.awt.Label labelValider1;
    private javax.swing.JTextField moisConditionnement;
    private javax.swing.JTextField moisEnvoi;
    private javax.swing.JTextField quantite;
    private javax.swing.JMenuItem retour;
    private javax.swing.JButton vailder;
    // End of variables declaration//GEN-END:variables
}
