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

        JLabel etiqueta = new JLabel("REGISTRO DE HÉROES Y ANTIHÉROES");
        etiqueta.setBounds(60, 20, 400, 30);
        etiqueta.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panelPrincipal.add(etiqueta);

        JLabel etiqueta1 = new JLabel("¿Qué quieres crear, héroe antihéroe o villano?");
        etiqueta1.setBounds(100, 60, 400, 30);
        etiqueta1.setFont(new Font("Times New Roman", Font.BOLD, 14));
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
            panelHeroes.setLayout(null);
            JLabel etiquetaHeroe = new JLabel("FORMULAIO PARA HACER HÉROES");
            etiquetaHeroe.setBounds(70, 10, 400, 30);
            etiquetaHeroe.setFont(new Font("Times New Roman", Font.BOLD, 20));
            panelHeroes.add(etiquetaHeroe);
            JLabel datos = new JLabel("DATOS PERSONALES DEL ACTOR");
            datos.setBounds(10, 50, 300, 10);
            datos.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datos);
            JLabel nombre = new JLabel("NOMBRE:");
            nombre.setBounds(10, 70, 140, 10);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombre);
            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 90, 140, 10);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(edad);
            JLabel nacionalidad = new JLabel("NACIONALIDAD :");
            nacionalidad.setBounds(10, 110, 140, 10);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nacionalidad);
            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 130, 140, 10);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(genero);
            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 150, 140, 10);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(altura);
            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 170, 140, 10);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(estadoCivil);
            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 190, 140, 10);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(alias);
            JLabel anosCarrera = new JLabel("AÑOS DE CARRERA:");
            anosCarrera.setBounds(10, 210, 140, 10);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anosCarrera);


            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(100, 400, 100, 30);
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