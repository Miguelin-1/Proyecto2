import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelHeroes;
    private JPanel panelAntiheroes;
    private JPanel panelVillanos;
    private int contarArchivos=1;
    private JTextField textoNom,textoEdad,textoNacion,textoGen,textoAlt,textoEstado,textoAliasActor,textoCarrera,textoPremios,textoPapeles,textoNombrep,textoAliasp,textoPoderes,textoDebilidades,textoDichos,textoEquipo,textoNivelBondad,textoAnoinicio,textoAnofin,textoPeliculas;

    public Ventana() {
        setSize(500, 550);
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
            JLabel etiquetaHeroe = new JLabel("FORMULARIO PARA HACER HÉROES");
            etiquetaHeroe.setBounds(70, 10, 400, 30);
            etiquetaHeroe.setFont(new Font("Times New Roman", Font.BOLD, 20));
            panelHeroes.add(etiquetaHeroe);
            JLabel datosPersonales = new JLabel("DATOS PERSONALES DEL ACTOR");
            datosPersonales.setBounds(10, 50, 300, 15);
            datosPersonales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosPersonales);

            JLabel nombre = new JLabel("NOMBRE:");
            nombre.setBounds(10, 70, 140, 10);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombre);
            JTextField textoNom = new JTextField();
            textoNom.setBounds(70, 70, 140, 15);
            panelHeroes.add(textoNom);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 90, 140, 10);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(edad);
            JTextField textoEdad = new JTextField();
            textoEdad.setBounds(55, 90, 140, 15);
            panelHeroes.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD:");
            nacionalidad.setBounds(10, 110, 140, 10);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nacionalidad);
            JTextField textoNacion = new JTextField();
            textoNacion.setBounds(115, 110, 140, 15);
            panelHeroes.add(textoNacion);

            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 130, 140, 10);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(genero);
            JTextField textoGen = new JTextField();
            textoGen.setBounds(66, 130, 140, 15);
            panelHeroes.add(textoGen);

            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 150, 140, 10);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(altura);
            JTextField textoAlt = new JTextField();
            textoAlt.setBounds(66, 150, 140, 15);
            panelHeroes.add(textoAlt);

            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 170, 140, 10);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(estadoCivil);
            JTextField textoEstado = new JTextField();
            textoEstado.setBounds(100, 170, 140, 15);
            panelHeroes.add(textoEstado);

            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 185, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 205, 140, 10);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(alias);
            JTextField textoAliasActor = new JTextField();
            textoAliasActor.setBounds(50, 205, 140, 15);
            panelHeroes.add(textoAliasActor);

            JLabel anosCarrera = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarrera.setBounds(10, 225, 170, 10);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anosCarrera);
            JTextField textoCarrera = new JTextField();
            textoCarrera.setBounds(160, 225, 140, 15);
            panelHeroes.add(textoCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 245, 140, 10);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(premios);
            JTextField textoPremios = new JTextField();
            textoPremios.setBounds(70, 245, 140, 15);
            panelHeroes.add(textoPremios);

            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 265, 140, 10);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(papeles);
            JTextField textoPapeles = new JTextField();
            textoPapeles.setBounds(65, 265, 140, 15);
            panelHeroes.add(textoPapeles);

            JLabel datosPapel = new JLabel("DATOS DEL PAPEL");
            datosPapel.setBounds(10, 285, 300, 15);
            datosPapel.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosPapel);

            JLabel anoInicio = new JLabel("AÑO INICIO:");
            anoInicio.setBounds(10, 305, 140, 10);
            anoInicio.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anoInicio);
            JTextField textoAnoInicio = new JTextField();
            textoAnoInicio.setBounds(70, 305, 140, 15);
            panelHeroes.add(textoAnoInicio);

            JLabel anoFin = new JLabel("AÑO FINAL:");
            anoFin.setBounds(10, 325, 140, 10);
            anoFin.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anoFin);
            JTextField textoAnoFin = new JTextField();
            textoAnoFin.setBounds(55, 325, 140, 15);
            panelHeroes.add(textoAnoFin);

            JLabel peliculas = new JLabel("PELICULAS:");
            peliculas.setBounds(10, 345, 140, 10);
            peliculas.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(peliculas);
            JTextField textoPeliculas = new JTextField();
            textoPeliculas.setBounds(70, 345, 140, 15);
            panelHeroes.add(textoPeliculas);

            JLabel datosPersonaje = new JLabel("DATOS PERSONAJE");
            datosPersonaje.setBounds(10, 365, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosPersonaje);

            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 385, 140, 10);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombrep);
            JTextField textoNombrep = new JTextField();
            textoNombrep.setBounds(70, 385, 140, 15);
            panelHeroes.add(textoNombrep);

            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 405, 140, 10);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(aliasp);
            JTextField textoAliasp = new JTextField();
            textoAliasp.setBounds(55, 405, 140, 15);
            panelHeroes.add(textoAliasp);

            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 425, 140, 10);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(poderes);
            JTextField textoPoderes = new JTextField();
            textoPoderes.setBounds(70, 425, 140, 15);
            panelHeroes.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 445, 140, 10);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(debilidades);
            JTextField textoDebilidades = new JTextField();
            textoDebilidades.setBounds(98, 445, 140, 15);
            panelHeroes.add(textoDebilidades);

            JLabel dichos = new JLabel("DICHOS:");
            dichos.setBounds(10, 465, 140, 10);
            dichos.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(dichos);
            JTextField textoDichos = new JTextField();
            textoDichos.setBounds(70, 465, 140, 15);
            panelHeroes.add(textoDichos);

            JLabel equipo = new JLabel("EQUIPO:");
            equipo.setBounds(10, 485, 140, 10);
            equipo.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(equipo);
            JTextField textoEquipo = new JTextField();
            textoEquipo.setBounds(60, 485, 140, 15);
            panelHeroes.add(textoEquipo);

            JLabel nivelBondad = new JLabel("NIVEL DE BONDAD:");
            nivelBondad.setBounds(10, 505, 140, 10);
            nivelBondad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nivelBondad);
            JTextField textoNivelBondad = new JTextField();


            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(300, 250, 100, 30);
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

        JButton botontxt=new JButton("Exportar a txt");
        botontxt.setBounds(300,250,100,30);
        botontxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                   // Heroe heroe=new Heroe(Integer.parseInt(textoEdad.getText()),textoNom.getText(),textoNacion.getText(),textoGen.getText(),textoAlt.getText(),textoEstado.getText(),textoAliasActor.getText(),Integer.parseInt(textoCarrera.getText()),textoPremios.getText(),textoPapeles.getText(),Integer.parseInt(textoCarrera.getText()));

                }
            }
        });
    }
    private void mostrarPanelVillanos() {
        if (panelVillanos == null) {
            panelVillanos = new JPanel();
            panelVillanos.setLayout(null);
            // Datos Personales
            JLabel datosPersonalesVillano = new JLabel("DATOS PERSONALES DEL ACTOR");
            datosPersonalesVillano.setBounds(10, 10, 300, 15);
            datosPersonalesVillano.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosPersonalesVillano);

            JLabel nombreVillano = new JLabel("NOMBRE:");
            nombreVillano.setBounds(10, 30, 140, 10);
            nombreVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nombreVillano);

            JLabel edadVillano = new JLabel("EDAD:");
            edadVillano.setBounds(10, 50, 140, 10);
            edadVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(edadVillano);

            JLabel nacionalidadVillano = new JLabel("NACIONALIDAD:");
            nacionalidadVillano.setBounds(10, 70, 140, 10);
            nacionalidadVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nacionalidadVillano);

            JLabel datosProfesionalesVillano = new JLabel("DATOS PROFESIONALES");
            datosProfesionalesVillano.setBounds(10, 100, 300, 15);
            datosProfesionalesVillano.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosProfesionalesVillano);

            JLabel aliasVillano = new JLabel("ALIAS:");
            aliasVillano.setBounds(10, 120, 140, 10);
            aliasVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(aliasVillano);

            JLabel anosCarreraVillano = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarreraVillano.setBounds(10, 140, 170, 10);
            anosCarreraVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anosCarreraVillano);

            JLabel premiosVillano = new JLabel("PREMIOS:");
            premiosVillano.setBounds(10, 160, 140, 10);
            premiosVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(premiosVillano);

            JLabel papelesVillano = new JLabel("PAPELES:");
            papelesVillano.setBounds(10, 180, 140, 10);
            papelesVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(papelesVillano);

            JLabel datosPapelVillano = new JLabel("DATOS DEL PAPEL");
            datosPapelVillano.setBounds(10, 200, 300, 15);
            datosPapelVillano.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosPapelVillano);

            JLabel anoInicioVillano = new JLabel("AÑO INICIO:");
            anoInicioVillano.setBounds(10, 220, 140, 10);
            anoInicioVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anoInicioVillano);

            JLabel anoFinVillano = new JLabel("AÑO FINAL:");
            anoFinVillano.setBounds(10, 240, 140, 10);
            anoFinVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anoFinVillano);

            JLabel peliculasVillano = new JLabel("PELICULAS:");
            peliculasVillano.setBounds(10, 260, 140, 10);
            peliculasVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(peliculasVillano);

            JLabel datosPersonajeVillano = new JLabel("DATOS PERSONAJE");
            datosPersonajeVillano.setBounds(10, 280, 300, 15);
            datosPersonajeVillano.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosPersonajeVillano);

            JLabel nombrepVillano = new JLabel("NOMBRE:");
            nombrepVillano.setBounds(10, 300, 140, 10);
            nombrepVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nombrepVillano);

            JLabel aliaspVillano = new JLabel("ALIAS:");
            aliaspVillano.setBounds(10, 320, 140, 10);
            aliaspVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(aliaspVillano);

            JLabel poderesVillano = new JLabel("PODERES:");
            poderesVillano.setBounds(10, 340, 140, 10);
            poderesVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(poderesVillano);

            JLabel debilidadesVillano = new JLabel("DEBILIDADES:");
            debilidadesVillano.setBounds(10, 360, 140, 10);
            debilidadesVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(debilidadesVillano);

            JLabel dichosVillano = new JLabel("DICHOS:");
            dichosVillano.setBounds(10, 380, 140, 10);
            dichosVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(dichosVillano);

            JLabel estadoMentalVillano = new JLabel("ESTADO MENTAL:");
            estadoMentalVillano.setBounds(10, 400, 140, 10);
            estadoMentalVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(estadoMentalVillano);

            JLabel planMalevoloVillano = new JLabel("PLAN MALEVOLENTE:");
            planMalevoloVillano.setBounds(10, 420, 140, 10);
            planMalevoloVillano.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(planMalevoloVillano);

            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(200, 450, 100, 30);
            botonVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mostrarPanelPrincipal();
                }
            });
            panelVillanos.add(botonVolver);
        }

        this.getContentPane().removeAll();
        this.getContentPane().add(panelVillanos);
        this.revalidate();
        this.repaint();
    }
    private void mostrarPanelAntiheroes() {
        if (panelAntiheroes == null) {
            panelAntiheroes = new JPanel();
            panelAntiheroes.setLayout(null);

            JLabel etiquetaAntiheroe = new JLabel("FORMULARIO PARA CREAR ANTIHÉROES");
            etiquetaAntiheroe.setBounds(70, 10, 400, 30);
            etiquetaAntiheroe.setFont(new Font("Times New Roman", Font.BOLD, 20));
            panelAntiheroes.add(etiquetaAntiheroe);

            JLabel datosPersonalesAntiHeroe = new JLabel("DATOS PERSONALES DEL ACTOR");
            datosPersonalesAntiHeroe.setBounds(10, 10, 300, 15);
            datosPersonalesAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosPersonalesAntiHeroe);

            JLabel nombreAntiHeroe = new JLabel("NOMBRE:");
            nombreAntiHeroe.setBounds(10, 30, 140, 10);
            nombreAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nombreAntiHeroe);

            JLabel edadAntiHeroe = new JLabel("EDAD:");
            edadAntiHeroe.setBounds(10, 50, 140, 10);
            edadAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(edadAntiHeroe);

            JLabel nacionalidadAntiHeroe = new JLabel("NACIONALIDAD:");
            nacionalidadAntiHeroe.setBounds(10, 70, 140, 10);
            nacionalidadAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nacionalidadAntiHeroe);

            JLabel datosProfesionalesAntiHeroe = new JLabel("DATOS PROFESIONALES");
            datosProfesionalesAntiHeroe.setBounds(10, 100, 300, 15);
            datosProfesionalesAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosProfesionalesAntiHeroe);

            JLabel aliasAntiHeroe = new JLabel("ALIAS:");
            aliasAntiHeroe.setBounds(10, 120, 140, 10);
            aliasAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(aliasAntiHeroe);

            JLabel anosCarreraAntiHeroe = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarreraAntiHeroe.setBounds(10, 140, 170, 10);
            anosCarreraAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anosCarreraAntiHeroe);

            JLabel premiosAntiHeroe = new JLabel("PREMIOS:");
            premiosAntiHeroe.setBounds(10, 160, 140, 10);
            premiosAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(premiosAntiHeroe);

            JLabel papelesAntiHeroe = new JLabel("PAPELES:");
            papelesAntiHeroe.setBounds(10, 180, 140, 10);
            papelesAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(papelesAntiHeroe);

            JLabel datosPapelAntiHeroe = new JLabel("DATOS DEL PAPEL");
            datosPapelAntiHeroe.setBounds(10, 200, 300, 15);
            datosPapelAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosPapelAntiHeroe);

            JLabel anoInicioAntiHeroe = new JLabel("AÑO INICIO:");
            anoInicioAntiHeroe.setBounds(10, 220, 140, 10);
            anoInicioAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anoInicioAntiHeroe);

            JLabel anoFinAntiHeroe = new JLabel("AÑO FINAL:");
            anoFinAntiHeroe.setBounds(10, 240, 140, 10);
            anoFinAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anoFinAntiHeroe);

            JLabel peliculasAntiHeroe = new JLabel("PELICULAS:");
            peliculasAntiHeroe.setBounds(10, 260, 140, 10);
            peliculasAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(peliculasAntiHeroe);

            JLabel datosPersonajeAntiHeroe = new JLabel("DATOS PERSONAJE");
            datosPersonajeAntiHeroe.setBounds(10, 280, 300, 15);
            datosPersonajeAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosPersonajeAntiHeroe);

            JLabel nombrepAntiHeroe = new JLabel("NOMBRE:");
            nombrepAntiHeroe.setBounds(10, 300, 140, 10);
            nombrepAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nombrepAntiHeroe);

            JLabel aliaspAntiHeroe = new JLabel("ALIAS:");
            aliaspAntiHeroe.setBounds(10, 320, 140, 10);
            aliaspAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(aliaspAntiHeroe);

            JLabel poderesAntiHeroe = new JLabel("PODERES:");
            poderesAntiHeroe.setBounds(10, 340, 140, 10);
            poderesAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(poderesAntiHeroe);

            JLabel debilidadesAntiHeroe = new JLabel("DEBILIDADES:");
            debilidadesAntiHeroe.setBounds(10, 360, 140, 10);
            debilidadesAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(debilidadesAntiHeroe);

            JLabel dichosAntiHeroe = new JLabel("DICHOS:");
            dichosAntiHeroe.setBounds(10, 380, 140, 10);
            dichosAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(dichosAntiHeroe);

            JLabel nivelAmenazaAntiHeroe = new JLabel("NIVEL DE AMENAZA:");
            nivelAmenazaAntiHeroe.setBounds(10, 400, 140, 10);
            nivelAmenazaAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nivelAmenazaAntiHeroe);

            JLabel motivacionesAntiHeroe = new JLabel("MOTIVACIONES:");
            motivacionesAntiHeroe.setBounds(10, 420, 140, 10);
            motivacionesAntiHeroe.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(motivacionesAntiHeroe);


            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(200, 450, 100, 30);
            botonVolver.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mostrarPanelPrincipal();
                }
            });
            panelAntiheroes.add(botonVolver);



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