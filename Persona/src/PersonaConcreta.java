public class PersonaConcreta extends Persona {

    public PersonaConcreta(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ".");
    }
}
