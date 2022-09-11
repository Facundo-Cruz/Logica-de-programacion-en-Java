//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
//define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
package ejercicios_ejemplos_13;

import java.util.Scanner;

public class Ejercicios_ejemplos_13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String []Equipo = new String[8];
        System.out.println("Ingrese los nombres del grupo.");
        for (int i = 0; i < 8; i++) {
            Equipo[i] = leer.nextLine();
        }
        System.out.println("Los nombres de los integrantes son:");
        for (int i = 0; i < 8; i++) {
            System.out.println(Equipo[i]);
        }
    }

}
