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
        setSize(500, 600);
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
        botonH.setBounds(25, 450, 125, 50);
        botonH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPanelHeroes();
            }
        });
        panelPrincipal.add(botonH);

        JButton botonAH = new JButton("Crear AntiHéroe");
        botonAH.setBounds(175, 450, 125, 50);
        panelPrincipal.add(botonAH);
        botonAH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPanelAntiheroes();
            }
        });

        JButton botonV = new JButton("Crear Villano");
        botonV.setBounds(325, 450, 125, 50);
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
            nombre.setBounds(10, 70, 140, 10);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombre);
            JTextField textoNom=new JTextField();
            textoNom.setBounds(200,70,140,15);
            panelHeroes.add(textoNom);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 90, 140, 10);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(edad);

            JTextField textoEdad=new JTextField();
            textoEdad.setBounds(200,90,140,15);
            panelHeroes.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD :");
            nacionalidad.setBounds(10, 110, 140, 10);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nacionalidad);

            JTextField textoNacion=new JTextField();
            textoNacion.setBounds(200,110,140,15);
            panelHeroes.add(textoNacion);

            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 130, 140, 10);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(genero);
            JTextField textoGen=new JTextField();
            textoGen.setBounds(200,130,140,15);
            panelHeroes.add(textoGen);
            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 150, 140, 10);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(altura);
            JTextField textoAlt=new JTextField();
            textoAlt.setBounds(200,150,140,15);
            panelHeroes.add(textoAlt);

            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 170, 140, 10);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(estadoCivil);
            JTextField textoEstado=new JTextField();
            textoEstado.setBounds(200,170,140,15);
            panelHeroes.add(textoEstado);

            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 185, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 205, 140, 10);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(alias);
            JTextField textoAliasActor=new JTextField();
            textoAliasActor.setBounds(200,205,140,15);
            panelHeroes.add(textoAliasActor);

            JLabel anosCarrera = new JLabel("TIEMPO DE EXPERIENCIA:");
            anosCarrera.setBounds(10, 225, 140, 10);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(anosCarrera);
            JTextField textoCarrera=new JTextField();
            textoCarrera.setBounds(200,225,140,15);
            panelHeroes.add(textoCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 245, 140, 10);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(premios);
            JTextField textoPremios=new JTextField();
            textoPremios.setBounds(200,245,140,15);
            panelHeroes.add(textoPremios);

            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 265, 140, 10);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(papeles);
            JTextField textoPapeles=new JTextField();
            textoPapeles.setBounds(200,265,140,15);
            panelHeroes.add(textoPapeles);

            JLabel datosPersonaje = new JLabel("DATOS PERSONAJE");
            datosPersonaje.setBounds(10, 280, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelHeroes.add(datosPersonaje);
            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 300, 140, 10);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nombrep);
            JTextField textoNombrep=new JTextField();
            textoNombrep.setBounds(200,300,140,15);
            panelHeroes.add(textoNombrep);


            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 320, 140, 10);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(aliasp);
            JTextField textoAliasp=new JTextField();
            textoAliasp.setBounds(200,320,140,15);
            panelHeroes.add(textoAliasp);


            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 340, 140, 10);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(poderes);
            JTextField textoPoderes=new JTextField();
            textoPoderes.setBounds(200,340,140,15);
            panelHeroes.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 360, 140, 10);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(debilidades);
            JTextField textoDebilidades=new JTextField();
            textoDebilidades.setBounds(200,360,140,15);
            panelHeroes.add(textoDebilidades);

            JLabel dichos = new JLabel("DICHOS:");
            dichos.setBounds(10, 380, 140, 10);
            dichos.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(dichos);
            JTextField textoDichos=new JTextField();
            textoDichos.setBounds(200,380,140,15);
            panelHeroes.add(textoDichos);

            JLabel equipo = new JLabel("EQUIPO:");
            equipo.setBounds(10, 400, 140, 10);
            equipo.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(equipo);
            JTextField textoEquipo=new JTextField();
            textoEquipo.setBounds(200,400,140,15);
            panelHeroes.add(textoEquipo);

            JLabel nivelBondad = new JLabel("NIVEL DE BONDAD:");
            nivelBondad.setBounds(10, 420, 140, 10);
            nivelBondad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelHeroes.add(nivelBondad);
            JTextField textoNivelBondad=new JTextField();
            textoNivelBondad.setBounds(200,420,140,15);
            panelHeroes.add(textoNivelBondad);


            JButton botonVolver = new JButton("Volver");
            botonVolver.setBounds(200, 450, 100, 30);
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
            nombre.setBounds(10, 70, 140, 10);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nombre);
            JTextField textoNombre=new JTextField();
            textoNombre.setBounds(200,70,140,15);
            panelVillanos.add(textoNombre);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 90, 140, 10);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(edad);
            JTextField textoEdad=new JTextField();
            textoEdad.setBounds(200,90,140,15);
            panelVillanos.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD:");
            nacionalidad.setBounds(10, 110, 140, 10);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nacionalidad);
            JTextField textoNacionalidad=new JTextField();
            textoNacionalidad.setBounds(200,110,140,15);
            panelVillanos.add(textoNacionalidad);


            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 130, 140, 10);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(genero);
            JTextField textoGenero=new JTextField();
            textoGenero.setBounds(200,130,140,15);
            panelVillanos.add(textoGenero);


            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 150, 140, 10);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(altura);
            JTextField textoAltura=new JTextField();
            textoAltura.setBounds(200,150,140,15);
            panelVillanos.add(textoAltura);



            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 170, 140, 10);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(estadoCivil);
            JTextField textoEstadoCivil=new JTextField();
            textoEstadoCivil.setBounds(200,170,140,15);
            panelVillanos.add(textoEstadoCivil);



            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 185, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 205, 140, 10);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(alias);
            JTextField textoAlias=new JTextField();
            textoAlias.setBounds(200,205,140,15);
            panelVillanos.add(textoAlias);

            JLabel anosCarrera = new JLabel("AÑOS DE CARRERA:");
            anosCarrera.setBounds(10, 225, 140, 10);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(anosCarrera);
            JTextField textoAnosCarrera=new JTextField();
            textoAnosCarrera.setBounds(200,225,140,15);
            panelVillanos.add(textoAnosCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 245, 140, 10);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(premios);
            JTextField textoPremios=new JTextField();
            textoPremios.setBounds(200,245,140,15);
            panelVillanos.add(textoPremios);


            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 265, 140, 10);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(papeles);
            JTextField textoPapeles=new JTextField();
            textoPapeles.setBounds(200,265,140,15);
            panelVillanos.add(textoPapeles);


            JLabel datosPersonaje = new JLabel("DATOS DEL PERSONAJE");
            datosPersonaje.setBounds(10, 280, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelVillanos.add(datosPersonaje);

            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 300, 140, 10);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(nombrep);
            JTextField textoNombrep=new JTextField();
            textoNombrep.setBounds(200,300,140,15);
            panelVillanos.add(textoNombrep);

            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 320, 140, 10);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(aliasp);
            JTextField textoAliasp=new JTextField();
            textoAliasp.setBounds(200,320,140,15);
            panelVillanos.add(textoAliasp);

            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 340, 140, 10);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(poderes);
            JTextField textoPoderes=new JTextField();
            textoPoderes.setBounds(200,340,140,15);
            panelVillanos.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 360, 140, 10);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(debilidades);
            JTextField textoDebilidades=new JTextField();
            textoDebilidades.setBounds(200,360,140,15);
            panelVillanos.add(textoDebilidades);


            JLabel planMalevolo = new JLabel("PLAN MALÉVOLO:");
            planMalevolo.setBounds(10, 380, 140, 10);
            planMalevolo.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(planMalevolo);
            JTextField textoPlanMalevolo=new JTextField();
            textoPlanMalevolo.setBounds(200,380,140,15);
            panelVillanos.add(textoPlanMalevolo);

            JLabel equipo = new JLabel("EQUIPO:");
            equipo.setBounds(10, 400, 140, 10);
            equipo.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(equipo);
            JTextField textoEquipo=new JTextField();
            textoEquipo.setBounds(200,400,140,15);
            panelVillanos.add(textoEquipo);


            JLabel estadoMental = new JLabel("ESTADO MENTAL:");
            estadoMental.setBounds(10, 420, 140, 10);
            estadoMental.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelVillanos.add(estadoMental);
            JTextField textoEstadoMental=new JTextField();
            textoEstadoMental.setBounds(200,420,140,15);
            panelVillanos.add(textoEstadoMental);

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

            JLabel datos = new JLabel("DATOS PERSONALES DEL ACTOR");
            datos.setBounds(10, 50, 300, 15);
            datos.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datos);

            JLabel nombre = new JLabel("NOMBRE:");
            nombre.setBounds(10, 70, 140, 10);
            nombre.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nombre);
            JTextField textoNombre=new JTextField();
            textoNombre.setBounds(200,70,140,15);
            panelAntiheroes.add(textoNombre);

            JLabel edad = new JLabel("EDAD:");
            edad.setBounds(10, 90, 140, 10);
            edad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(edad);
            JTextField textoEdad=new JTextField();
            textoEdad.setBounds(200,90,140,15);
            panelAntiheroes.add(textoEdad);

            JLabel nacionalidad = new JLabel("NACIONALIDAD:");
            nacionalidad.setBounds(10, 110, 140, 10);
            nacionalidad.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nacionalidad);
            JTextField textoNacionalidad=new JTextField();
            textoNacionalidad.setBounds(200,110,140,15);
            panelAntiheroes.add(textoNacionalidad);

            JLabel genero = new JLabel("GÉNERO:");
            genero.setBounds(10, 130, 140, 10);
            genero.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(genero);
            JTextField textoGenero=new JTextField();
            textoGenero.setBounds(200,130,140,15);
            panelAntiheroes.add(textoGenero);

            JLabel altura = new JLabel("ALTURA:");
            altura.setBounds(10, 150, 140, 10);
            altura.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(altura);
            JTextField textoAltura=new JTextField();
            textoAltura.setBounds(200,150,140,15);
            panelAntiheroes.add(textoAltura);

            JLabel estadoCivil = new JLabel("ESTADO CIVIL:");
            estadoCivil.setBounds(10, 170, 140, 10);
            estadoCivil.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(estadoCivil);
            JTextField textoEstadocivil=new JTextField();
            textoEstadocivil.setBounds(200,170,140,15);
            panelAntiheroes.add(textoEstadocivil);


            JLabel datosProfesionales = new JLabel("DATOS PROFESIONALES");
            datosProfesionales.setBounds(10, 185, 300, 15);
            datosProfesionales.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosProfesionales);

            JLabel alias = new JLabel("ALIAS:");
            alias.setBounds(10, 205, 140, 10);
            alias.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(alias);
            JTextField textoAlias=new JTextField();
            textoAlias.setBounds(200,205,140,15);
            panelAntiheroes.add(textoAlias);

            JLabel anosCarrera = new JLabel("AÑOS DE CARRERA:");
            anosCarrera.setBounds(10, 225, 140, 10);
            anosCarrera.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(anosCarrera);
            JTextField textoAnosCarrera=new JTextField();
            textoAnosCarrera.setBounds(200,225,140,15);
            panelAntiheroes.add(textoAnosCarrera);

            JLabel premios = new JLabel("PREMIOS:");
            premios.setBounds(10, 245, 140, 10);
            premios.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(premios);
            JTextField textoPremios=new JTextField();
            textoPremios.setBounds(200,245,140,15);
            panelAntiheroes.add(textoPremios);

            JLabel papeles = new JLabel("PAPELES:");
            papeles.setBounds(10, 265, 140, 10);
            papeles.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(papeles);
            JTextField textoPapeles=new JTextField();
            textoPapeles.setBounds(200,265,140,15);
            panelAntiheroes.add(textoPapeles);

            JLabel datosPersonaje = new JLabel("DATOS DEL PERSONAJE");
            datosPersonaje.setBounds(10, 280, 300, 15);
            datosPersonaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
            panelAntiheroes.add(datosPersonaje);

            JLabel nombrep = new JLabel("NOMBRE:");
            nombrep.setBounds(10, 300, 140, 10);
            nombrep.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nombrep);
            JTextField textoNombrep=new JTextField();
            textoNombrep.setBounds(200,300,140,15);
            panelAntiheroes.add(textoNombrep);

            JLabel aliasp = new JLabel("ALIAS:");
            aliasp.setBounds(10, 320, 140, 10);
            aliasp.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(aliasp);
            JTextField textoAliasp=new JTextField();
            textoAliasp.setBounds(200,320,140,15);
            panelAntiheroes.add(textoAliasp);

            JLabel poderes = new JLabel("PODERES:");
            poderes.setBounds(10, 340, 140, 10);
            poderes.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(poderes);
            JTextField textoPoderes=new JTextField();
            textoPoderes.setBounds(200,340,140,15);
            panelAntiheroes.add(textoPoderes);

            JLabel debilidades = new JLabel("DEBILIDADES:");
            debilidades.setBounds(10, 360, 140, 10);
            debilidades.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(debilidades);
            JTextField textoDebilidades=new JTextField();
            textoDebilidades.setBounds(200,360,140,15);
            panelAntiheroes.add(textoDebilidades);

            JLabel dichos = new JLabel("DICHOS:");
            dichos.setBounds(10, 380, 140, 10);
            dichos.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(dichos);
            JTextField textoDichos=new JTextField();
            textoDichos.setBounds(200,380,140,15);
            panelAntiheroes.add(textoDichos);

            JLabel nivelAmenaza = new JLabel("NIVEL DE AMENAZA:");
            nivelAmenaza.setBounds(10, 400, 140, 10);
            nivelAmenaza.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(nivelAmenaza);
            JTextField textoNivelAmenaza=new JTextField();
            textoNivelAmenaza.setBounds(200,400,140,15);
            panelAntiheroes.add(textoNivelAmenaza);

            JLabel motivacion = new JLabel("MOTIVACIÓN:");
            motivacion.setBounds(10, 420, 140, 10);
            motivacion.setFont(new Font("Times New Roman", Font.BOLD, 12));
            panelAntiheroes.add(motivacion);
            JTextField textoMotivacion=new JTextField();
            textoMotivacion.setBounds(200,420,140,15);
            panelAntiheroes.add(textoMotivacion);

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