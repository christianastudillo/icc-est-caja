import models.Persona;
//import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
        // Caja<String> cajaString = new Caja<>();
        // Caja<Integer> cajaInteger = new Caja<>();
        // Caja<Persona> cajaPersona = new Caja<>();
        // Par<String, Integer> par1 = new Par<>();
        // Par<Integer, String> par2 = new Par<>();

        // // Guardar datos en las cajas
        // cajaString.guardar("Guardo un string");
        // cajaInteger.guardar(10);
        // cajaPersona.guardar(new Persona("Carlos", 19));
        // par1.establecerClave("HOLA");
        // par1.establecerValor(123);
        // par2.establecerValor("ESTE ES UN PAR");
        // par2.establecerClave(456);

        // // Imprimir los contenidos de las cajas
        // System.out.println("Contenido de la caja de String: " + cajaString.getContenido());
        // System.out.println("Contenido de la caja de Integer: " + cajaInteger.getContenido());
        // System.out.println("Contenido de la caja de Persona: " + cajaPersona.getContenido());
        // System.out.println(par1.obtenerClave());
        // System.out.println(par1.obtenerValor());
        // System.out.println(par2.obtenerValor());
        // System.out.println(par2.obtenerClave());

        // Crear un arreglo de 10 personas con edades diferentes
        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Juan", 25);
        personas[1] = new Persona("Maria", 30);
        personas[2] = new Persona("Pedro", 20);
        personas[3] = new Persona("Ana", 15);
        personas[4] = new Persona("Luis", 40);
        personas[5] = new Persona("Sofia", 28);
        personas[6] = new Persona("Isabella", 32);
        personas[7] = new Persona("Jose", 17);
        personas[8] = new Persona("Marco", 45);
        personas[9] = new Persona("Diego", 22);

        // Crear un arreglo de tipo Par que guarde como clave el nombre de una persona y como valor su edad si es mayor de edad
        Par<String, Integer>[] arregloParPersonas = new Par[10];
        for (int i = 0; i < 10; i++) {
            if (personas[i].getEdad() > 18) {
                arregloParPersonas[i] = new Par<>(personas[i].getNombre(), personas[i].getEdad());
            }
        }

        // Crear un arreglo tipo Par que guarde como clave la edad de la persona y como valor el nombre de la persona si es menor de edad
        Par<Integer, String>[] arregloParEdad = new Par[10];
        for (int i = 0; i < 10; i++) {
            if (personas[i].getEdad() < 18) {
                arregloParEdad[i] = new Par<>(personas[i].getEdad(), personas[i].getNombre());
            }
        }

        // Imprimir los arreglos de mayores de edad
        System.out.println("\nPersonas mayores de edad:");
        for (Par<String, Integer> par : arregloParPersonas) {
            if (par != null) {
                System.out.println("Edad: " + par.obtenerValor() + ", Nombre: " + par.obtenerClave());
            }
        }

        // Imprimir los arreglos de menores de edad
        System.out.println("\nPersonas menores de edad:");
        for (Par<Integer, String> par : arregloParEdad) {
            if (par != null) {
                System.out.println("Edad: " + par.obtenerClave() + ", Nombre: " + par.obtenerValor());
            }
        }
    }
}
