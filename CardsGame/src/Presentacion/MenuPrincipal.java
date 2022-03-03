/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negociacion.Imagenes;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


/**
 *
 * @author Guerrero
 */
public class MenuPrincipal extends javax.swing.JFrame {
 private Imagenes img = new Imagenes();
 
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        int width = PlnLogo.getSize().width-5;
        int height = PlnLogo.getSize().height-5;
        LblImgLogo.setIcon(img.getScaledImage(new ImageIcon("files/logo.png"), width, height));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlnLogo = new javax.swing.JPanel();
        LblImgLogo = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        JMenu = new javax.swing.JMenu();
        BtnPlay = new javax.swing.JMenuItem();
        BtnPuntu = new javax.swing.JMenuItem();
        BtnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cartas Inglesas Super Divertidas");
        setName("FrmMenu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        getContentPane().setLayout(null);

        LblImgLogo.setText(" ");

        javax.swing.GroupLayout PlnLogoLayout = new javax.swing.GroupLayout(PlnLogo);
        PlnLogo.setLayout(PlnLogoLayout);
        PlnLogoLayout.setHorizontalGroup(
            PlnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlnLogoLayout.createSequentialGroup()
                .addComponent(LblImgLogo)
                .addGap(0, 222, Short.MAX_VALUE))
        );
        PlnLogoLayout.setVerticalGroup(
            PlnLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlnLogoLayout.createSequentialGroup()
                .addComponent(LblImgLogo)
                .addGap(0, 104, Short.MAX_VALUE))
        );

        getContentPane().add(PlnLogo);
        PlnLogo.setBounds(80, 40, 225, 120);

        JMenu.setText("Inicio");

        BtnPlay.setText("Jugar");
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });
        JMenu.add(BtnPlay);

        BtnPuntu.setText("Puntuaciones");
        BtnPuntu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPuntuActionPerformed(evt);
            }
        });
        JMenu.add(BtnPuntu);

        BtnExit.setText("Salir");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        JMenu.add(BtnExit);

        MenuBar.add(JMenu);

        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPuntuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPuntuActionPerformed
        FrmPuntu pgame = new FrmPuntu();
        pgame.setVisible(true);
        pgame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnPuntuActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        dispose();
    }//GEN-LAST:event_BtnExitActionPerformed

    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        CardsGameMain cgame = new CardsGameMain();
        cgame.setVisible(true);
        cgame.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnPlayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatAtomOneDarkIJTheme());
        } catch (Exception e){
            e.printStackTrace();
        }
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatAtomOneDarkIJTheme".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnExit;
    private javax.swing.JMenuItem BtnPlay;
    private javax.swing.JMenuItem BtnPuntu;
    private javax.swing.JMenu JMenu;
    private javax.swing.JLabel LblImgLogo;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel PlnLogo;
    // End of variables declaration//GEN-END:variables

}
