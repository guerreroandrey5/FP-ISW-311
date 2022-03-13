/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Datos.Archivos;
import Negociacion.Imagenes;
import Negociacion.NBaraja;
import Objetos.Baraja;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import java.io.FileNotFoundException;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Guerrero
 */
public class CardsGameMain extends javax.swing.JFrame {
private Archivos data = new Archivos();
private Negociacion.DataTransfer dt = new Negociacion.DataTransfer();
private Imagenes img = new Imagenes();
private NBaraja BRJ = new NBaraja();
private ArrayList<Baraja> BarajaL = new ArrayList();
private ArrayList<Baraja> Jugador = new ArrayList();
private ArrayList<Baraja> PC = new ArrayList();
private HashMap<String, String> PD = new HashMap();
private ArrayList<JLabel> LabelPlayer = new ArrayList<>();
private ArrayList<JLabel> LabelPC = new ArrayList<>();
private int contador = 0;
public int ganes = 0;
private int puntos = 0;
private int N = 0;
private String nJ = "";
/**
     * Creates new form CardsGameMain
     */
    public CardsGameMain() {
        initComponents();
        jButton2.setVisible(false);
        loadCardz();
        Load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        Inicio = new javax.swing.JMenu();
        BtnBack = new javax.swing.JMenuItem();
        TestButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cartas Inglesas Super Divertidas");
        setSize(new java.awt.Dimension(400, 300));

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("<html><body>Digite la cantidad de veces <br>que cree que ganara entre 0 y 10</html></body>");

        Inicio.setText("Inicio");

        BtnBack.setText("Volver");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });
        Inicio.add(BtnBack);

        TestButton.setText("TestButton");
        TestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestButtonActionPerformed(evt);
            }
        });
        Inicio.add(TestButton);

        MenuBar.add(Inicio);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        MenuPrincipal mgame = new MenuPrincipal();
        jTextField1.setVisible(false);
        jLabel3.setVisible(false);
        mgame.setVisible(true);
        mgame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnBackActionPerformed

    private void loadCardz(){
        try {
        data.loadCards();
        BRJ.definirPalos();
        BarajaL = BRJ.getList();
        Jugador = BRJ.repartir(BarajaL);
        BarajaL.removeAll(Jugador);
        PC = BRJ.repartir(BarajaL);
        BarajaL.removeAll(PC);
        JLabel bckbrj = new JLabel();
        bckbrj.setIcon(img.getScaledImage(new ImageIcon("files/BRJ/BCKBRJ.png"), 80, 100));
        bckbrj.setBounds(10, 175, 80, 100);  
        data.savePal();
        this.add(bckbrj);
            for (int i = 0; i < Jugador.size(); i++) {
                Baraja get = Jugador.get(i);
                JLabel label = new JLabel();
                label.setIcon(get.getImg());
                LabelPlayer.add(label);
            }
            for (int j = 0; j < LabelPlayer.size(); j++) {
                JLabel getLa = LabelPlayer.get(j);
                getLa.setBounds(50 + (70*j), 350, 65, 100);
                this.add(getLa);
                
            }
            for (int r = 1; r < (PC.size()+1); r++) {
                JLabel label = new JLabel();
                label.setIcon(img.getScaledImage(new ImageIcon("files/BRJ/BCK (" + r + ").png"), 65, 100));
                LabelPC.add(label);
            }
            for (int j = 0; j < LabelPC.size(); j++) {
                JLabel getL = LabelPC.get(j);
                getL.setBounds(70 + (70*j), 10, 65, 100);
                this.add(getL);
                
            }
            PD = BRJ.getPalos();
            SetVisiblePalos();
            DigitePER();
    } catch (FileNotFoundException ex) {
        
    } 
    }
    
    private void SetVisiblePalos() {
        String Text = "<html><body>";
        for (Object clave:PD.keySet()) {
            String Palo = PD.get(clave);
            
            Text += clave.toString() + " : " + Palo + "<br>";
            
        }
        Text += "</body></html>";
        jLabel1.setText(Text);
    }
    
    private void comparar() {
            Baraja Carta = PC.get(contador);
            Baraja Carta2 = Jugador.get(contador);
            logica(Carta, Carta2, 1);            
            JLabel label = LabelPC.get(contador);
            JLabel label2 = LabelPlayer.get(contador);
            label.setIcon(Carta.getImg());   
            label.setSize(label.getWidth()+20, label.getHeight()+20);
            label2.setBounds(label2.getX(), label2.getY() - 20,label2.getWidth()+20, label2.getHeight()+20);

    }
    private void DigitePER() {
        jTextField1.setVisible(true);
        jLabel3.setVisible(true);
        
    }
    
    private void logica(Baraja cd1, Baraja cd2,int num) {
        String name1 = cd1.getNcardname();
        String text = "";
        String name2 = cd2.getNcardname();
        int num1 = Integer.valueOf(cd1.getNcardnumber());
        int num2 = Integer.valueOf(cd2.getNcardnumber());
        String tipo1 = PD.get(cd1.getNcardname()).toString();
        String tipo2 = PD.get(cd2.getNcardname()).toString();
        if (tipo1.equals("Regular") && tipo2.equals("Regular")) {
           if(num1 > num2) {
                text = ("Gana la computadora");
                System.out.println("gana" + cd1);
            } else {
                text = ("Gana el jugador");
               ganes += 1;
                System.out.println("gana" + cd2);
            }
        } else if (name1.equals(name2)) {
            System.out.println(num1 + "," + num2);
            if(num1 > num2) {
                 text =("Gana la computadora");
            } else {
                 text =("Gana el jugador");
                ganes += 1;
            }
        } else if (tipo1.equals(tipo2)) {
            if(num1 > num2) {
                text =("Gana la computadora");
            } else {
                 text =("Gana el jugador");
                 ganes += 1;
            }
        } else if (tipo1.equals("Fuerte") && tipo2.equals("Regular")||tipo2.equals("Fuerte") && tipo1.equals("Regular")) {
            if(tipo1.equals("Fuerte")) {
                 text =("Gana la computadora");
            } else {
                 text =("Gana el jugador");
                 ganes += 1;
            }
        } else if (tipo1.equals("Débil") && tipo2.equals("Regular")||tipo2.equals("Débil") && tipo1.equals("Regular")) {
            if(tipo1.equals("Regular")) {
                 text =("Gana la computadora");
            } else {
                 text =("Gana el jugador");
                 ganes += 1;
            }
        } else if (tipo1.equals("Débil") && tipo2.equals("Fuerte")||tipo2.equals("Débil") && tipo1.equals("Fuerte")) {
            if(tipo1.equals("Débil")) {
                 text =("Gana la computadora");
            } else {
                 text =("Gana el jugador");
                 ganes += 1;
            }
        }
        if (num == 1) {
           jLabel2.setText(text); 
        } 
        
    }
    
    private void TestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestButtonActionPerformed
        loadCardz();        
    }//GEN-LAST:event_TestButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            N = Integer.valueOf(jTextField1.getText());
            System.out.println(N);
            jTextField1.setVisible(false);
            jLabel3.setVisible(false);            
            jButton2.setVisible(true);
            jButton1.setVisible(false);
            jLabel4.setText("<html><body> Adivinación: " + N + "<br> Ganes: " + ganes + "</body></html>");
            comparar();               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ese no es un número válido","Alerta",JOptionPane.WARNING_MESSAGE);  

        }

    }
        private void Load(){
        nJ = JOptionPane.showInputDialog("Nombre del Jugador: ");
        while (nJ.equals("")){
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre!");
            nJ = JOptionPane.showInputDialog("Nombre del Jugador 1: ");
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            JLabel label = LabelPC.get(contador);
            JLabel label2 = LabelPlayer.get(contador);
            jLabel4.setText("<html><body> Adivinación: " + N + "<br> Ganes: " + ganes + "</body></html>");
        if (contador == 9) {
            jButton2.setVisible(false);
            puntos = 10-(abs(ganes- N));
            String puntoz = String.valueOf(puntos);           
            dt.puntos(puntoz);
            dt.username(nJ);
            data.guardarDatos();
            System.out.println(PC);
            System.out.println(BarajaL);
            jLabel2.setText("<html><body> Puntuaje obtenido: " + puntos);
            label.setSize(label.getWidth()-20, label.getHeight()-20);
            label2.setBounds(label2.getX(), label2.getY() + 20,label2.getWidth()-20, label2.getHeight()-20);
            } else {
            if (contador == 8) {
                jButton2.setText("Finalizar");
            }
            label.setSize(label.getWidth()-20, label.getHeight()-20);
            label2.setBounds(label2.getX(), label2.getY() + 20,label2.getWidth()-20, label2.getHeight()-20);            
      
         contador += 1;
         comparar();
            }


       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CardsGameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardsGameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardsGameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardsGameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardsGameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BtnBack;
    private javax.swing.JMenu Inicio;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem TestButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
