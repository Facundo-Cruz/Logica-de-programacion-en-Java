//Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
//muestre la suma de sus elementos.

package ejercicios_extra_22;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas");
        int f = leer.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        int c = leer.nextInt();
        int matriz[][] = new int [f][c], suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                suma += matriz[i][j];
            }
        }
        System.out.println("La suma de los valores de la matriz es "+suma);
    }

}
