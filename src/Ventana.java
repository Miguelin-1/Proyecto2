import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelHeroes;
    private JPanel panelAntiheroes;
    private JPanel panelVillanos;

    public Ventana() {
        setSize(500, 500);
        setLocationRelativeTo(null); // Pone la ventana en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Creación de héroes y antihéroes");
        panelP();
    }

    private void panelP() {
        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null); // Diseño nulo para posiciones manuales
        this.getContentPane().add(panelPrincipal);

        JLabel etiqueta = new JLabel("Registro de héroes y antihéroes");
        etiqueta.setBounds(100, 20, 400, 30);
        etiqueta.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelPrincipal.add(etiqueta);

        JLabel etiqueta1 = new JLabel("¿Qué quieres crear, héroe o antihéroe?");
        etiqueta1.setBounds(100, 60, 400, 30);
        etiqueta1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        panelPrincipal.add(etiqueta1);

        JButton botonH = new JButton("Crear Héroe");
        botonH.setBounds(25, 350, 125, 50);
        botonH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPanelHeroes();
            }
        });
        panelPrincipal.add(botonH);

        JButton botonAH = new JButton("Crear AntiHéroe");
        botonAH.setBounds(175, 350, 125, 50);
        panelPrincipal.add(botonAH);
        botonAH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPanelAntiheroes();
            }
        });

        JButton botonV = new JButton("Crear Villano");
        botonV.setBounds(325, 350, 125, 50);
        panelPrincipal.add(botonV);
        botonV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPanelVillanos();
            }
        });
    }

    private void mostrarPanelHeroes() {
        if (panelHeroes == null) {
            panelHeroes = new JPanel();
            panelHeroes.setLayout(new FlowLayout());
            JLabel etiquetaHeroe = new JLabel("FORMULAIO PARA HACER HÉROES");
            etiquetaHeroe.setBounds(100, 20, 400, 30);
            etiquetaHeroe.setFont(new Font("Times New Roman", Font.BOLD, 20));
            panelHeroes.add(etiquetaHeroe);

            JButton botonVolver = new JButton("Volver");
            botonVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mostrarPanelPrincipal();
                }
            });
            panelHeroes.add(botonVolver);
        }

        this.getContentPane().removeAll();
        this.getContentPane().add(panelHeroes);
        this.revalidate();
        this.repaint();
    }
    private void mostrarPanelVillanos(){
        if(panelVillanos==null){
            panelVillanos=new JPanel();
            panelVillanos.setLayout(new FlowLayout());
            JLabel etiquetaVillano = new JLabel("FORMULARIO PARA HACER VILLANOS");
            etiquetaVillano.setBounds(100, 20, 400, 30);
            etiquetaVillano.setFont(new Font("Times New Roman", Font.BOLD, 20));
            JButton botonVolver = new JButton("Volver");
            botonVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mostrarPanelPrincipal();
                }
            });
            panelVillanos.add(botonVolver);
            panelVillanos.add(etiquetaVillano);
        }
        this.getContentPane().removeAll();
        this.getContentPane().add(panelVillanos);
        this.revalidate();
        this.repaint();

    }
    private void mostrarPanelAntiheroes(){
        if(panelAntiheroes==null){
            panelAntiheroes=new JPanel();
            panelAntiheroes.setLayout(new FlowLayout());
            JLabel etiquetaVillano = new JLabel("FORMULARIO PARA HACER VILLANOS");
            etiquetaVillano.setBounds(100, 20, 400, 30);
            etiquetaVillano.setFont(new Font("Times New Roman", Font.BOLD, 20));
            JButton botonVolver = new JButton("Volver");
            botonVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mostrarPanelPrincipal();
                }
            });
            panelAntiheroes.add(botonVolver);
            panelAntiheroes.add(etiquetaVillano);
        }
        this.getContentPane().removeAll();
        this.getContentPane().add(panelAntiheroes);
        this.revalidate();
        this.repaint();

    }

    private void mostrarPanelPrincipal() {
        this.getContentPane().removeAll();
        this.getContentPane().add(panelPrincipal);
        this.revalidate();
        this.repaint();
    }
}