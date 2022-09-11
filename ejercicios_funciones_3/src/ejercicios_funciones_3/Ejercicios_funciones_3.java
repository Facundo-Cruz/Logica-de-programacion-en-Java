//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
package ejercicios_funciones_3;

import java.util.Scanner;

public class Ejercicios_funciones_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que ingresará");
        int numeros = leer.nextInt();
        int[] vector = new int[numeros];
        int dig, aux, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        for (int i = 0; i < numeros; i++) {
            vector[i] = leer.nextInt();
            dig = 0;
            aux = vector[i];
            do {
                aux /= 10;
                dig += 1;
            } while (aux != 0);

            switch (dig) {
                case 1:
                    cont1 += 1;
                    break;
                case 2:
                    cont2 += 1;
                    break;
                case 3:
                    cont3 += 1;
                    break;
                case 4:
                    cont4 += 1;
                    break;
                case 5:
                    cont5 += 1;
            }
        }
        for (int i = 0; i < numeros; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("\nCantidad de números de 1 dígito: " + cont1);
        System.out.println("Cantidad de números de 2 dígito: " + cont2);
        System.out.println("Cantidad de números de 3 dígito: " + cont3);
        System.out.println("Cantidad de números de 4 dígito: " + cont4);
        System.out.println("Cantidad de números de 5 dígito: " + cont5);
    }

}
