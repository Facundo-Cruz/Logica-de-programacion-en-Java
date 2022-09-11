//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

package ejercicios_introducción_java_4;

import java.util.Scanner;

public class Ejercicios_Introducción_Java_4 {

    public static void main(String[] args) {
        System.out.println("Ingrese una cantidad de grados centigrados.");
        Scanner leer = new Scanner (System.in);
        float C = leer.nextFloat();
        System.out.println("Has ingresado " + C + "°");
        float F;
        F = 32 + (9*C/5);
        System.out.println("Que es equivalente con " + F + " F");
    }
    
}
