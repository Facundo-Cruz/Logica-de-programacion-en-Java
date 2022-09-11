//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario.

package ejercicios_extra_18;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos números desea cargar en el vector?");
        int N = leer.nextInt(),suma = 0;
        int vector[]=new int[N];
        System.out.println("Ingrese un número para dicha posición:");
        for (int i = 0; i < N; i++) {
            System.out.println("["+i+"]:");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los valores ingresado en el vector es de: "+suma);
    }

}
