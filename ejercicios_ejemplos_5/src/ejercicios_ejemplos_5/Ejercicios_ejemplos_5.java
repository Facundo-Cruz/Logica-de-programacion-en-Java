//Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
//Scanner.
package ejercicios_ejemplos_5;

import java.util.Scanner;

public class Ejercicios_ejemplos_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean valor;
        double num;
        char caracter;
        System.out.println("Ingrese el valor del boolean");
        valor = leer.nextBoolean();
        System.out.println("Ingrese el valor del double");
        num = leer.nextDouble();
        System.out.println("Ingrese el valor de char");
        caracter = leer.next().charAt(0);
        System.out.println(caracter);
    }
    
}
