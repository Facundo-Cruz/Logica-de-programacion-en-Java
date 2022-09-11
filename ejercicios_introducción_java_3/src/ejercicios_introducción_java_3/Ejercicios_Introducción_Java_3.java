//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

package ejercicios_introducción_java_3;

import java.util.Scanner;

public class Ejercicios_Introducción_Java_3 {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner (System.in);
        String frase;
        String fraseMay;
        String fraseMin;
        frase = leer.nextLine();
        fraseMay = frase.toUpperCase();
        System.out.println("Su frase en mayúsculas es: "+fraseMay);
        fraseMin = frase.toLowerCase();
        System.out.println("Su frase en minúsculas es: "+fraseMin);
    }
    
}
