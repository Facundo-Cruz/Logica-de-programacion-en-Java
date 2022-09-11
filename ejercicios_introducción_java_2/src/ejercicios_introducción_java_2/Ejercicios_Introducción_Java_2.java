//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
package ejercicios_introducción_java_2;

import java.util.Scanner;

public class Ejercicios_Introducción_Java_2 {

    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        Scanner leer = new Scanner (System.in);
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
