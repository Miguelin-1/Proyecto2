import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

    public Ventana(){
        setSize(500,500);
        setLocationRelativeTo(null); //este metodo pone la ventana en el centro de la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Creacion de héroes y antihéroes");
        panelP();
    }
    private void panelP(){
            JPanel panelPrincipal=new JPanel();
            panelPrincipal.setLayout(null);
            this.getContentPane().add(panelPrincipal);

        JLabel etiqueta = new JLabel("Registro de héroes y antihéroes");
        etiqueta.setBounds(100, 20, 400, 30);
        etiqueta.setFont(new Font("Times new roman", Font.BOLD, 20));
        panelPrincipal.add(etiqueta);

        JLabel etiqueta1 = new JLabel("¿Qué quieres crear, héroe o antihéroe?");
        etiqueta1.setBounds(100, 60, 400, 30);
        etiqueta1.setFont(new Font("Times new roman", Font.BOLD, 16));
        panelPrincipal.add(etiqueta1);

        JButton botonH = new JButton("Crear Héroe");

        botonH.setBounds(25, 350, 125, 50);
        panelPrincipal.add(botonH);


        JButton botonAH = new JButton("Crear AntiHéroe");
        botonAH.setBounds(175, 350, 125, 50);
        panelPrincipal.add(botonAH);
        JButton botonV = new JButton("Crear Villano");
        botonV.setBounds(325, 350, 125, 50);
        panelPrincipal.add(botonV);

    }

}
