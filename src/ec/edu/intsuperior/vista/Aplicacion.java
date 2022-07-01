package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        System.out.print("Ingresa la cedula de la persona 1: ");
        p1.setCi(leer.next());
        System.out.print("Ingresa el nombre: ");
        p1.setNombre(leer.next());
        System.out.print("Ingresa el apellido: ");
        p1.setApellido(leer.next());
        p1.setGenero(Persona.TipoGenero.FEMENINO);

        System.out.println(p1.toString());

        System.out.print("Ingresa la cedula de la persona 2: ");
        p2.setCi(leer.next());
        System.out.print("Ingresa el nombre: ");
        p2.setNombre(leer.next());
        System.out.print("Ingresa el apellido: ");
        p2.setApellido(leer.next());
        p2.setGenero(Persona.TipoGenero.MACULINO);

        System.out.println(p2.toString());
    }

}
