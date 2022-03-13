/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Negociacion.PieChart;
import Datos.Archivos;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Guerrero
 */
public class FrmPuntu extends javax.swing.JFrame {
private Archivos data = new Archivos();
    /**
     * Creates new form NewJFrame
     */
    public FrmPuntu() {
        initComponents();
        TRLoad();
    }

    void TRLoad(){
        data.loadList();
        RecordsTable.setModel(data.RecordsTablez);
        RecordsTable.getTableHeader().getColumnModel().getColumn(0).setHeaderRenderer(data.MyHeaderRender);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RecordsTable = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        BtnGraphs = new javax.swing.JMenuItem();
        BtnBack = new javax.swing.JMenuItem();

        setTitle("Puntuaciones");
        setSize(new java.awt.Dimension(600, 400));

        RecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        RecordsTable.setColumnSelectionAllowed(true);
        RecordsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(RecordsTable);
        RecordsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Inicio.setText("Menu");

        BtnGraphs.setText("Porcentajes de Palos");
        BtnGraphs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraphsActionPerformed(evt);
            }
        });
        Inicio.add(BtnGraphs);

        BtnBack.setText("Volver");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        Inicio.add(BtnBack);

        MenuBar.add(Inicio);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        MenuPrincipal mgame = new MenuPrincipal();
        mgame.setVisible(true);
        mgame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnGraphsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraphsActionPerformed
    try {        
        PieChart CC = new PieChart("Gráfico","Porcentaje de Palos Fuertes");
        CC.pack();        
        CC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        CC.setVisible(true);  
        CC.setTitle("Porcentaje de Palos Fuertes");
        CC.setLocationRelativeTo(null);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(FrmPuntu.class.getName()).log(Level.SEVERE, null, ex);
    }       
    }//GEN-LAST:event_BtnGraphsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPuntu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPuntu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPuntu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPuntu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPuntu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnBack;
    private javax.swing.JMenuItem BtnGraphs;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTable RecordsTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
