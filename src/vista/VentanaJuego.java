/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Pulpo
 */
public class VentanaJuego extends JFrame {

    private JPanel panel;
    private JLabel l1;
    private JButton b1;
    String pa;

    public VentanaJuego(String titulo, int largo, int ancho) {
        super(titulo);
        this.setSize(largo, ancho);
        this.setLocation(350, 60);
        this.iniciaComponente();
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    public void iniciaComponente() {

        LayoutManager disenio;
        LayoutManager disenioSup;

        disenio = new BorderLayout();
        disenioSup = new GridLayout(25, 30);

        JPanel panelcent = new JPanel(disenioSup);
        panelcent.setBackground(Color.BLACK);

        for (int i = 0; i <= 774; i++) {
            if (i == 0) {
                pa = "a" + i;
                JPanel pa = new JPanel();
                pa.setBackground(Color.yellow);
                panelcent.add(pa);
            } else {
                if (i % 2 == 0) {
                    pa = "a" + i;
                    JPanel pa = new JPanel();
                    pa.setBackground(Color.red);
                    panelcent.add(pa);
                } else {
                    pa = "a" + i;
                    JPanel pa = new JPanel();
                    pa.setBackground(Color.blue);
                    panelcent.add(pa);
                }

            }

        }

        this.panel = new JPanel(disenio);
        panel.add(panelcent);

        this.add(panel);
    }

}
