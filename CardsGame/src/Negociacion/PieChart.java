/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negociacion;

import Datos.Archivos;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.util.Rotation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Guerrero
 */
public class PieChart extends JFrame{
    private Archivos data = new Archivos();
    private static ArrayList<String> arrl = new ArrayList<String>();
    public PieChart(String appTitle, String chartTitle) throws FileNotFoundException{
        PieDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        setContentPane(chartPanel);           
    }


    
    private PieDataset createDataset() throws FileNotFoundException{
        data.loadPer();
        arrl = data.getArrl();
        int tam = arrl.size();        
        int picas = Collections.frequency(arrl, "Carta=PicasPalo=Fuerte");
        int diama = Collections.frequency(arrl, "Carta=DiamantesPalo=Fuerte");
        int coraz = Collections.frequency(arrl, "Carta=CorazonesPalo=Fuerte");
        int trebo = Collections.frequency(arrl, "Carta=TrebolesPalo=Fuerte");
        double ppi = (tam*picas);
        double pdi = (tam*diama);
        double pcr = (tam*coraz);
        double ptr = (tam*trebo);
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Picas",picas);
        result.setValue("Treboles",trebo);
        result.setValue("Corazones",coraz);
        result.setValue("Diamantes",diama);
        System.out.println("picas: "+picas);
        System.out.println("diama: "+diama);
        System.out.println("coraz: "+coraz);
        System.out.println("trebo: "+trebo);
        return result;
    }
            
    private JFreeChart createChart (PieDataset dataset, String title){
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true, false);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    
}
