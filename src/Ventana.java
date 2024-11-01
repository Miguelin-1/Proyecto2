import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ventana extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelHeroes;
    private JPanel panelAntiheroes;
    private JPanel panelVillanos;
    private int contarArchivos=1;
    private List<Heroe> listaHeroes = new ArrayList<>();
    private List<Villano> listaVillanos = new ArrayList<>();
    private List<Antiheroe> listaAntiheroes = new ArrayList<>();
    private ModificarArchivos modifcarArchivos = new ModificarArchivos();

    private JTextField textoNom,textoEdad,textoNacion,textoGen,textoAlt,textoEstado,textoAliasActor,textoCarrera,textoPremios,textoPapeles,textoNombrep,textoAliasp,textoPoderes,textoDebilidades,textoDichos,textoEquipo,textoNivelBondad,textoAnoinicio,textoAnofin,textoPeliculas,textoPlanMalevolo,textoEstadoMental,textoComplices,textoMotivacion,textoNivelAmenaza;

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
            JLabel datos = new JLabel("DATOS PERSONALES DEL ACTOR");
            datos.setBounds(10, 50, 300, 15);
            datos.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datos);

            JLabel nombre = new JLabel("NOMBRE:");
            nombre.setBounds(10, 80, 140, 15);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombre);
            textoNom = new JTextField();
            textoNom.setBounds(200, 80, 140, 15);
            panelHeroes.add(textoNom);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 95, 140, 15);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(edad);
            textoEdad = new JTextField();
            textoEdad.setBounds(200, 95, 140, 15);
            panelHeroes.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD:");
            nacionalidad.setBounds(10, 110, 140, 15);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nacionalidad);
            textoNacion = new JTextField();
            textoNacion.setBounds(200, 110, 140, 15);
            panelHeroes.add(textoNacion);

            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 125, 140, 15);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(genero);
            textoGen = new JTextField();
            textoGen.setBounds(200, 125, 140, 15);
            panelHeroes.add(textoGen);

            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 140, 140, 15);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(altura);
            textoAlt = new JTextField();
            textoAlt.setBounds(200, 140, 140, 15);
            panelHeroes.add(textoAlt);

            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 155, 140, 15);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(estadoCivil);
            textoEstado = new JTextField();
            textoEstado.setBounds(200, 155, 140, 15);
            panelHeroes.add(textoEstado);

            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 170, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 185, 140, 15);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(alias);
            textoAliasActor = new JTextField();
            textoAliasActor.setBounds(200, 185, 140, 15);
            panelHeroes.add(textoAliasActor);

            JLabel anosCarrera = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarrera.setBounds(10, 200, 160, 15);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anosCarrera);
            textoCarrera = new JTextField();
            textoCarrera.setBounds(200, 200, 140, 15);
            panelHeroes.add(textoCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 215, 140, 15);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(premios);
            textoPremios = new JTextField();
            textoPremios.setBounds(200, 215, 140, 15);
            panelHeroes.add(textoPremios);

            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 230, 140, 15);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(papeles);
            textoPapeles = new JTextField();
            textoPapeles.setBounds(200, 230, 140, 15);
            panelHeroes.add(textoPapeles);

            JLabel datosPapel = new JLabel("DATOS DEL PAPEL");
            datosPapel.setBounds(10, 245, 300, 15);
            datosPapel.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosPapel);

            JLabel anoInicio = new JLabel("FECHA INICIO:");
            anoInicio.setBounds(10, 260, 140, 15);
            anoInicio.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anoInicio);
            textoAnoinicio = new JTextField();
            textoAnoinicio.setBounds(200, 260, 140, 15);
            panelHeroes.add(textoAnoinicio);

            JLabel anoFin = new JLabel("FECHA FINAL:");
            anoFin.setBounds(10, 275, 140, 15);
            anoFin.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anoFin);
            textoAnofin = new JTextField();
            textoAnofin.setBounds(200, 275, 140, 15);
            panelHeroes.add(textoAnofin);

            JLabel peliculas = new JLabel("PELICULAS:");
            peliculas.setBounds(10, 290, 140, 15);
            peliculas.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(peliculas);
            textoPeliculas = new JTextField();
            textoPeliculas.setBounds(200, 290, 140, 15);
            panelHeroes.add(textoPeliculas);

            JLabel datosPersonaje = new JLabel("DATOS PERSONAJE");
            datosPersonaje.setBounds(10, 305, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosPersonaje);

            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 320, 140, 15);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombrep);
            textoNombrep = new JTextField();
            textoNombrep.setBounds(200, 320, 140, 15);
            panelHeroes.add(textoNombrep);

            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 335, 140, 15);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(aliasp);
            textoAliasp = new JTextField();
            textoAliasp.setBounds(200, 335, 140, 15);
            panelHeroes.add(textoAliasp);

            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 350, 140, 15);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(poderes);
            textoPoderes = new JTextField();
            textoPoderes.setBounds(200, 350, 140, 15);
            panelHeroes.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 365, 140, 15);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(debilidades);
            textoDebilidades = new JTextField();
            textoDebilidades.setBounds(200, 365, 140, 15);
            panelHeroes.add(textoDebilidades);

            JLabel dichos = new JLabel("DICHOS:");
            dichos.setBounds(10, 380, 140, 15);
            dichos.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(dichos);
            textoDichos = new JTextField();
            textoDichos.setBounds(200, 380, 140, 15);
            panelHeroes.add(textoDichos);

            JLabel equipo = new JLabel("EQUIPO:");
            equipo.setBounds(10, 395, 140, 15);
            equipo.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(equipo);
            textoEquipo = new JTextField();
            textoEquipo.setBounds(200, 395, 140, 15);
            panelHeroes.add(textoEquipo);

            JLabel nivelBondad = new JLabel("NIVEL DE BONDAD:");
            nivelBondad.setBounds(10, 410, 140, 15);
            nivelBondad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nivelBondad);
            textoNivelBondad = new JTextField();
            textoNivelBondad.setBounds(200, 410, 140, 15);
            panelHeroes.add(textoNivelBondad);


            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(350, 200, 100, 30);
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

        JButton botonGuardarH=new JButton("Guardar");
        botonGuardarH.setBounds(350,250,100,30);
        botonGuardarH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                    ArrayList<String>premiosList=new ArrayList<>(Arrays.asList(textoPremios.getText().split(",")));
                    ArrayList<String>papelesList=new ArrayList<>(Arrays.asList(textoPapeles.getText().split(",")));
                    ArrayList<String>peliculasList=new ArrayList<>(Arrays.asList(textoPeliculas.getText().split(",")));
                    ArrayList<String>poderesList=new ArrayList<>(Arrays.asList(textoPoderes.getText().split(",")));
                    ArrayList<String>debilidadesList=new ArrayList<>(Arrays.asList(textoDebilidades.getText().split(",")));
                    ArrayList<String>dichosList=new ArrayList<>(Arrays.asList(textoDichos.getText().split(",")));

                    Heroe heroe=new Heroe(Integer.parseInt(textoEdad.getText()),textoNom.getText(),textoNacion.getText(),textoGen.getText(),textoAlt.getText(),textoEstado.getText(),textoAliasActor.getText(),Integer.parseInt(textoCarrera.getText()),premiosList,papelesList,Integer.parseInt(textoAnoinicio.getText()),Integer.parseInt(textoAnofin.getText()),peliculasList,textoNombrep.getText(),textoAliasp.getText(),poderesList,debilidadesList,dichosList,textoEquipo.getText(),Integer.parseInt(textoNivelBondad.getText()));
                    listaHeroes.add(heroe);
                    ModificarArchivos.escribirArchivos(contarArchivos,heroe);
                    JOptionPane.showMessageDialog(null, "Héroe guardado en archivo " + (contarArchivos));
                    contarArchivos++;

                }
                else {
                    JOptionPane.showMessageDialog(null, "Ya se han guardado los 10 héroes permitidos.");
                }
            }
        });
        panelHeroes.add(botonGuardarH);

        JButton botonAbrir=new JButton("Abrir txt");
        botonAbrir.setBounds(350, 300, 100, 30);
        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                    ModificarArchivos.abrirArchivos((contarArchivos-1));
                    contarArchivos++;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Ya no se pueden hacer mas archivos");
                }
            }
        });
        panelHeroes.add(botonAbrir);

    }
    private void mostrarPanelVillanos() {
        if (panelVillanos == null) {
            panelVillanos = new JPanel();
            panelVillanos.setLayout(null);
            JLabel etiquetaVillano = new JLabel("FORMULARIO PARA HACER VILLANOS");
            etiquetaVillano.setBounds(70, 10, 400, 30);
            etiquetaVillano.setFont(new Font("Times New Roman", Font.BOLD, 20));
            panelVillanos.add(etiquetaVillano);

            JLabel datos = new JLabel("DATOS PERSONALES DEL ACTOR");
            datos.setBounds(10, 50, 300, 15);
            datos.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datos);

            JLabel nombre = new JLabel("NOMBRE:");
            nombre.setBounds(10, 80, 140, 15);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nombre);
            JTextField textoNom = new JTextField();
            textoNom.setBounds(200, 80, 140, 15);
            panelVillanos.add(textoNom);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 95, 140, 15);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(edad);
            JTextField textoEdad = new JTextField();
            textoEdad.setBounds(200, 95, 140, 15);
            panelVillanos.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD:");
            nacionalidad.setBounds(10, 110, 140, 15);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nacionalidad);
            JTextField textoNacion = new JTextField();
            textoNacion.setBounds(200, 110, 140, 15);
            panelVillanos.add(textoNacion);

            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 125, 140, 15);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(genero);
            JTextField textoGen = new JTextField();
            textoGen.setBounds(200, 125, 140, 15);
            panelVillanos.add(textoGen);

            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 140, 140, 15);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(altura);
            JTextField textoAlt = new JTextField();
            textoAlt.setBounds(200, 140, 140, 15);
            panelVillanos.add(textoAlt);

            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 155, 140, 15);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(estadoCivil);
            JTextField textoEstado = new JTextField();
            textoEstado.setBounds(200, 155, 140, 15);
            panelVillanos.add(textoEstado);

            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 170, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 185, 140, 15);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(alias);
            JTextField textoAliasActor = new JTextField();
            textoAliasActor.setBounds(200, 185, 140, 15);
            panelVillanos.add(textoAliasActor);

            JLabel anosCarrera = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarrera.setBounds(10, 200, 160, 15);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anosCarrera);
            JTextField textoCarrera = new JTextField();
            textoCarrera.setBounds(200, 200, 140, 15);
            panelVillanos.add(textoCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 215, 140, 15);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(premios);
            JTextField textoPremios = new JTextField();
            textoPremios.setBounds(200, 215, 140, 15);
            panelVillanos.add(textoPremios);

            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 230, 140, 15);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(papeles);
            JTextField textoPapeles = new JTextField();
            textoPapeles.setBounds(200, 230, 140, 15);
            panelVillanos.add(textoPapeles);

            JLabel datosPapel = new JLabel("DATOS DEL PAPEL");
            datosPapel.setBounds(10, 245, 300, 15);
            datosPapel.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosPapel);

            JLabel anoInicio = new JLabel("FECHA INICIO:");
            anoInicio.setBounds(10, 260, 140, 15);
            anoInicio.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anoInicio);
            JTextField textoAnoInicio = new JTextField();
            textoAnoInicio.setBounds(200, 260, 140, 15);
            panelVillanos.add(textoAnoInicio);

            JLabel anoFin = new JLabel("FECHA FINAL:");
            anoFin.setBounds(10, 275, 140, 15);
            anoFin.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anoFin);
            JTextField textoAnoFin = new JTextField();
            textoAnoFin.setBounds(200, 275, 140, 15);
            panelVillanos.add(textoAnoFin);

            JLabel peliculas = new JLabel("PELICULAS:");
            peliculas.setBounds(10, 290, 140, 15);
            peliculas.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(peliculas);
            JTextField textoPeliculas = new JTextField();
            textoPeliculas.setBounds(200, 290, 140, 15);
            panelVillanos.add(textoPeliculas);

            JLabel datosPersonaje = new JLabel("DATOS PERSONAJE");
            datosPersonaje.setBounds(10, 305, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosPersonaje);

            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 320, 140, 15);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nombrep);
            JTextField textoNombrep = new JTextField();
            textoNombrep.setBounds(200, 320, 140, 15);
            panelVillanos.add(textoNombrep);

            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 335, 140, 15);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(aliasp);
            JTextField textoAliasp = new JTextField();
            textoAliasp.setBounds(200, 335, 140, 15);
            panelVillanos.add(textoAliasp);

            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 350, 140, 15);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(poderes);
            JTextField textoPoderes = new JTextField();
            textoPoderes.setBounds(200, 350, 140, 15);
            panelVillanos.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 365, 140, 15);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(debilidades);
            JTextField textoDebilidades = new JTextField();
            textoDebilidades.setBounds(200, 365, 140, 15);
            panelVillanos.add(textoDebilidades);

            JLabel dichos = new JLabel("DICHOS:");
            dichos.setBounds(10, 380, 140, 15);
            dichos.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(dichos);
            JTextField textoDichos = new JTextField();
            textoDichos.setBounds(200, 380, 140, 15);
            panelVillanos.add(textoDichos);

            JLabel estadoMental = new JLabel("ESTADO MENTAL:");
            estadoMental.setBounds(10, 395, 140, 15);
            estadoMental.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(estadoMental);
            JTextField textoEstadoMental = new JTextField();
            textoEstadoMental.setBounds(200, 395, 140, 15);
            panelVillanos.add(textoEstadoMental);

            JLabel planMalevolo = new JLabel("PLAN MALÉVOLO:");
            planMalevolo.setBounds(10, 410, 140, 15);
            planMalevolo.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(planMalevolo);
            JTextField textoPlanMalevolo = new JTextField();
            textoPlanMalevolo.setBounds(200, 410, 140, 15);
            panelVillanos.add(textoPlanMalevolo);

            JLabel complices = new JLabel("COMPLICES:");
            complices.setBounds(10, 425, 140, 15);
            complices.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(complices);
            JTextField textoComplices = new JTextField();
            textoComplices.setBounds(200, 425, 140, 15);
            panelVillanos.add(textoComplices);


            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(350, 200, 100, 30);
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

        JButton botonGuardarH=new JButton("Guardar");
        botonGuardarH.setBounds(350,250,100,30);
        botonGuardarH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                    ArrayList<String>premiosList=new ArrayList<>(Arrays.asList(textoPremios.getText().split(",")));
                    ArrayList<String>papelesList=new ArrayList<>(Arrays.asList(textoPapeles.getText().split(",")));
                    ArrayList<String>peliculasList=new ArrayList<>(Arrays.asList(textoPeliculas.getText().split(",")));
                    ArrayList<String>poderesList=new ArrayList<>(Arrays.asList(textoPoderes.getText().split(",")));
                    ArrayList<String>debilidadesList=new ArrayList<>(Arrays.asList(textoDebilidades.getText().split(",")));
                    ArrayList<String>dichosList=new ArrayList<>(Arrays.asList(textoDichos.getText().split(",")));
                    ArrayList<String>complicesList=new ArrayList<>(Arrays.asList(textoComplices.getText().split(",")));

                    Villano villano= new Villano(Integer.parseInt(textoEdad.getText()),textoNom.getText(),textoNacion.getText(),textoGen.getText(),textoAlt.getText(),textoEstado.getText(),textoAliasActor.getText(),Integer.parseInt(textoCarrera.getText()),premiosList,papelesList,Integer.parseInt(textoAnoinicio.getText()),Integer.parseInt(textoAnofin.getText()),peliculasList,textoNombrep.getText(),textoAliasp.getText(),poderesList,debilidadesList,dichosList,complicesList,textoEstadoMental.getText(),textoPlanMalevolo.getText());
                    listaVillanos.add(villano);
                    ModificarArchivos.escribirArchivosV(contarArchivos,villano);
                    contarArchivos++;
                    JOptionPane.showMessageDialog(null, "Héroe guardado en archivo " + (contarArchivos - 1));

                }
                else {
                    JOptionPane.showMessageDialog(null, "Ya se han guardado los 10 héroes permitidos.");
                }
            }
        });
        panelVillanos.add(botonGuardarH);


        JButton botonAbrir=new JButton("Abrir txt");
        botonAbrir.setBounds(350, 300, 100, 30);
        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                    ModificarArchivos.abrirArchivos((contarArchivos-1));
                    contarArchivos++;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Ya no se pueden hacer mas archivos");
                }
            }
        });
        panelVillanos.add(botonAbrir);
    }

    private void mostrarPanelAntiheroes() {
        if (panelAntiheroes == null) {
            panelAntiheroes = new JPanel();
            panelAntiheroes.setLayout(null);

            JLabel etiquetaAntiheroe = new JLabel("FORMULARIO PARA CREAR ANTIHÉROES");
            etiquetaAntiheroe.setBounds(70, 10, 400, 30);
            etiquetaAntiheroe.setFont(new Font("Times New Roman", Font.BOLD, 20));
            panelAntiheroes.add(etiquetaAntiheroe);

            JLabel datos = new JLabel("DATOS PERSONALES DEL ACTOR");
            datos.setBounds(10, 50, 300, 15);
            datos.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datos);

            JLabel nombre = new JLabel("NOMBRE:");
            nombre.setBounds(10, 80, 140, 15);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nombre);
            JTextField textoNom = new JTextField();
            textoNom.setBounds(200, 80, 140, 15);
            panelAntiheroes.add(textoNom);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 95, 140, 15);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(edad);
            JTextField textoEdad = new JTextField();
            textoEdad.setBounds(200, 95, 140, 15);
            panelAntiheroes.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD:");
            nacionalidad.setBounds(10, 110, 140, 15);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nacionalidad);
            JTextField textoNacion = new JTextField();
            textoNacion.setBounds(200, 110, 140, 15);
            panelAntiheroes.add(textoNacion);

            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 125, 140, 15);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(genero);
            JTextField textoGen = new JTextField();
            textoGen.setBounds(200, 125, 140, 15);
            panelAntiheroes.add(textoGen);

            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 140, 140, 15);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(altura);
            JTextField textoAlt = new JTextField();
            textoAlt.setBounds(200, 140, 140, 15);
            panelAntiheroes.add(textoAlt);

            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 155, 140, 15);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(estadoCivil);
            JTextField textoEstado = new JTextField();
            textoEstado.setBounds(200, 155, 140, 15);
            panelAntiheroes.add(textoEstado);

            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 170, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 185, 140, 15);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(alias);
            JTextField textoAliasActor = new JTextField();
            textoAliasActor.setBounds(200, 185, 140, 15);
            panelAntiheroes.add(textoAliasActor);

            JLabel anosCarrera = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarrera.setBounds(10, 200, 160, 15);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anosCarrera);
            JTextField textoCarrera = new JTextField();
            textoCarrera.setBounds(200, 200, 140, 15);
            panelAntiheroes.add(textoCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 215, 140, 15);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(premios);
            JTextField textoPremios = new JTextField();
            textoPremios.setBounds(200, 215, 140, 15);
            panelAntiheroes.add(textoPremios);

            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 230, 140, 15);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(papeles);
            JTextField textoPapeles = new JTextField();
            textoPapeles.setBounds(200, 230, 140, 15);
            panelAntiheroes.add(textoPapeles);

            JLabel datosPapel = new JLabel("DATOS DEL PAPEL");
            datosPapel.setBounds(10, 245, 300, 15);
            datosPapel.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosPapel);

            JLabel anoInicio = new JLabel("FECHA INICIO:");
            anoInicio.setBounds(10, 260, 140, 15);
            anoInicio.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anoInicio);
            JTextField textoAnoInicio = new JTextField();
            textoAnoInicio.setBounds(200, 260, 140, 15);
            panelAntiheroes.add(textoAnoInicio);

            JLabel anoFin = new JLabel("FECHA FINAL:");
            anoFin.setBounds(10, 275, 140, 15);
            anoFin.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anoFin);
            JTextField textoAnoFin = new JTextField();
            textoAnoFin.setBounds(200, 275, 140, 15);
            panelAntiheroes.add(textoAnoFin);

            JLabel peliculas = new JLabel("PELICULAS:");
            peliculas.setBounds(10, 290, 140, 15);
            peliculas.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(peliculas);
            JTextField textoPeliculas = new JTextField();
            textoPeliculas.setBounds(200, 290, 140, 15);
            panelAntiheroes.add(textoPeliculas);

            JLabel datosPersonaje = new JLabel("DATOS PERSONAJE");
            datosPersonaje.setBounds(10, 305, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosPersonaje);

            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 320, 140, 15);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nombrep);
            JTextField textoNombrep = new JTextField();
            textoNombrep.setBounds(200, 320, 140, 15);
            panelAntiheroes.add(textoNombrep);

            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 335, 140, 15);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(aliasp);
            JTextField textoAliasp = new JTextField();
            textoAliasp.setBounds(200, 335, 140, 15);
            panelAntiheroes.add(textoAliasp);

            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 350, 140, 15);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(poderes);
            JTextField textoPoderes = new JTextField();
            textoPoderes.setBounds(200, 350, 140, 15);
            panelAntiheroes.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 365, 140, 15);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(debilidades);
            JTextField textoDebilidades = new JTextField();
            textoDebilidades.setBounds(200, 365, 140, 15);
            panelAntiheroes.add(textoDebilidades);

            JLabel dichos = new JLabel("DICHOS:");
            dichos.setBounds(10, 380, 140, 15);
            dichos.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(dichos);
            JTextField textoDichos = new JTextField();
            textoDichos.setBounds(200, 380, 140, 15);
            panelAntiheroes.add(textoDichos);

            JLabel nivelAmenaza = new JLabel("NIVEL DE AMENAZA:");
            nivelAmenaza.setBounds(10, 395, 140, 15);
            nivelAmenaza.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nivelAmenaza);
            JTextField textoNivelAmenaza = new JTextField();
            textoNivelAmenaza.setBounds(200, 395, 140, 15);
            panelAntiheroes.add(textoNivelAmenaza);

            JLabel motivacion = new JLabel("MOTIVACIÓN:");
            motivacion.setBounds(10, 410, 140, 15);
            motivacion.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(motivacion);
            JTextField textoMotivacion = new JTextField();
            textoMotivacion.setBounds(200, 410, 140, 15);
            panelAntiheroes.add(textoMotivacion);

            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(350, 200, 100, 30);
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

        JButton botonGuardarH=new JButton("Guardar");
        botonGuardarH.setBounds(350,250,100,30);
        botonGuardarH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                    ArrayList<String>premiosList=new ArrayList<>(Arrays.asList(textoPremios.getText().split(",")));
                    ArrayList<String>papelesList=new ArrayList<>(Arrays.asList(textoPapeles.getText().split(",")));
                    ArrayList<String>peliculasList=new ArrayList<>(Arrays.asList(textoPeliculas.getText().split(",")));
                    ArrayList<String>poderesList=new ArrayList<>(Arrays.asList(textoPoderes.getText().split(",")));
                    ArrayList<String>debilidadesList=new ArrayList<>(Arrays.asList(textoDebilidades.getText().split(",")));
                    ArrayList<String>dichosList=new ArrayList<>(Arrays.asList(textoDichos.getText().split(",")));

                    Antiheroe antiheroe= new Antiheroe(Integer.parseInt(textoEdad.getText()),textoNom.getText(),textoNacion.getText(),textoGen.getText(),textoAlt.getText(),textoEstado.getText(),textoAliasActor.getText(),Integer.parseInt(textoCarrera.getText()),premiosList,papelesList,Integer.parseInt(textoAnoinicio.getText()),Integer.parseInt(textoAnofin.getText()),peliculasList,textoNombrep.getText(),textoAliasp.getText(),poderesList,debilidadesList,dichosList,textoMotivacion.getText(),Integer.parseInt(textoNivelAmenaza.getText()));
                    listaAntiheroes.add(antiheroe);
                    ModificarArchivos.escribirArchivosA(contarArchivos,antiheroe);
                    contarArchivos++;
                    JOptionPane.showMessageDialog(null, "Héroe guardado en archivo " + (contarArchivos - 1));

                }
                else {
                    JOptionPane.showMessageDialog(null, "Ya se han guardado los 10 héroes permitidos.");
                }
            }
        });
        panelAntiheroes.add(botonGuardarH);


        JButton botonAbrir=new JButton("Abrir txt");
        botonAbrir.setBounds(350, 300, 100, 30);
        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(contarArchivos<=10){
                    ModificarArchivos.abrirArchivos((contarArchivos-1));
                    contarArchivos++;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Ya no se pueden hacer mas archivos");
                }
            }
        });
        panelAntiheroes.add(botonAbrir);
    }



    private void mostrarPanelPrincipal() {
        this.getContentPane().removeAll();
        this.getContentPane().add(panelPrincipal);
        this.revalidate();
        this.repaint();
    }
}