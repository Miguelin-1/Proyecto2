
public class Main {
    public static void main(String[] args) {
        //ModificarArchivos.crearArchivos();
        Ventana v1= new Ventana();
        v1.setVisible(true);
        Persona persona=new Persona(18,"Juan","Colombiano","Hombre","1,85","Soltero");
        System.out.println(persona.toString());
    }


}