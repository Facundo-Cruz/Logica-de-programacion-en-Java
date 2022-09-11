//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

package ejercicios_funciones_2;

import java.util.Scanner;

public class Ejercicios_funciones_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos números deseas crear?");
        int num = leer.nextInt();
        int[] vector = new int[num];
        System.out.println("Ingrese un número a buscar en el vector.");
        int num2 = leer.nextInt();
        RellenarVectorAzar(vector, num);
        BuscarNumero(vector, num, num2);
        MostrarVector(vector, num);
    }

    public static void RellenarVectorAzar(int vector[], int num) {
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void BuscarNumero(int vector[], int num, int num2) {
        int cont = 0;
        for (int i = 0; i < num; i++) {
            if (num2 == vector[i]) {
                System.out.println("El número ingresado se encuentra en la posición [" + i + "] del vector.");
                cont += 1;
            }
        }
        if (cont == 0) {
            System.out.println("El número no se ha encontrado en el vector.");
        } else if (cont == 1) {
            System.out.println("El número se ha encontra una vez en el vector.");
        } else if (cont > 1) {
            System.out.println("El número se ha repetido " + cont + " veces en el vector.");
        }
    }

    public static void MostrarVector(int vector[], int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }

}
