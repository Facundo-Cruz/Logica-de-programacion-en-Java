//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

package ejercicios_bucles_java_1;

import java.util.Scanner;
public class Ejercicios_bucles_java_1 {

    public static void main(String[] args) {
        System.out.println("Ingrese un valor límite positivo");
        Scanner leer = new Scanner(System.in);
        int lim = leer.nextInt();
        int num;
        int suma = 0;
        do {
            System.out.println("Ingrese un número a sumar");
            num = leer.nextInt();
            suma += num;
        } while (suma <= lim);
        System.out.println("Tu suma ha superado el límite.");
        System.out.println("Valor límite = " + lim);
        System.out.println("Suma = " + suma);
    }
    
}
