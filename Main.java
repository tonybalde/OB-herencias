public class Main {

    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();
        Trabajador nuevoTrabajador = new Trabajador();

        nuevoCliente.edad = 20;
        nuevoCliente.nombre = "Juan";
        nuevoCliente.telefono = 12332424;
        nuevoCliente.credito = 4345;

        System.out.println("El cliente tiene :" + nuevoCliente.edad + " años y se llama " + nuevoCliente.nombre + ", su telefono es el: " + nuevoCliente.telefono + " y su credito es de: " + nuevoCliente.credito);

        nuevoTrabajador.edad = 40;
        nuevoTrabajador.nombre = "Pedro";
        nuevoTrabajador.telefono = 345354;
        nuevoTrabajador.salario = 24325;

        System.out.println("El trabajador tiene :" + nuevoTrabajador.edad + " años y se llama " + nuevoTrabajador.nombre + ", su telefono es el: " + nuevoTrabajador.telefono + " y su salario es de: " + nuevoTrabajador.salario);

    }
}
class Persona  {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
     double credito;
}

class Trabajador extends Persona{
        double salario;
}


