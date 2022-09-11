//Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
//alguno de ellos es mayor a 25.
package ejercicios_ejemplos_6;

import java.util.Scanner;

public class Ejercicios_ejemplos_6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros.");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores que 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Alguno de ellos es mayor que 25");
        } else {
            System.out.println("Ninguno de ellos es mayor que 25");
        }
    }

}
