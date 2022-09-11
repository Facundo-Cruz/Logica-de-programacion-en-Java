//Crear un programa que dado un numero determine si es par o impar.

package ejercicios_condicionales_java_1;

import java.util.Scanner;

public class Ejercicios_Condicionales_Java_1 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero.");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es un número " + num + " es par.");
        }else {
            System.out.println("Es un número " + num + " es impar.");
        }
    }
    
}
