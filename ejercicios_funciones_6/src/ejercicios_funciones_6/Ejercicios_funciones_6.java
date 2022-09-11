//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
package ejercicios_funciones_6;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_funciones_6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        System.out.println("Rellena la matriz con valores entre 1 y 9");
        int sumaF1 = 0, sumaT, j;
        boolean resp = true;
        //rellenamos la matriz por teclado
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                do {
                    System.out.println("Posición[" + i + "][" + j + "]");
                    matriz[i][j] = leer.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9); // con este bucle obligamos que ingrese enteros entre 1 y 9
                if (i == 0) {
                    //Guardamos la suma de la primer fila para compararla con las demás filas, columnas y diagonales.
                    sumaF1 += matriz[i][j];
                }
            }
        }
        //Comparamos la suma de las filas restantes
        for (int i = 1; i < 3; i++) {
            sumaT = 0;
            for (j = 0; j < 3; j++) {
                sumaT += matriz[i][j];
            }
            if (sumaF1 != sumaT) {
                resp = false;
                break;
            }
        }
        if (resp) {
            //Comparamos la suma de las columnas
            for (int i = 0; i < 3; i++) {
                sumaT = 0;
                for (j = 0; j < 3; j++) {
                    sumaT += matriz[j][i];
                }
                if (sumaF1 != sumaT) {
                    resp = false;
                    break;
                }
            }
        }
        if (resp) {
            //Comparamos diagonal principal
            sumaT = 0;
            j = 0;
            for (int i = 0; i < 3; i++) {
                sumaT += matriz[i][j];
                j++;
            }
            if (sumaF1 != sumaT) {
                resp = false;
            }
        }
        if (resp) {
            //Comparamos diagonal secundaria.
            sumaT = 0;
            j = 2;
            for (int i = 0; i < 3; i++) {
                sumaT += matriz[i][j];
                j--;
            }
            if (sumaF1 != sumaT) {
                resp = false;
            }
        }
        //Si se mantuvo verdadera durante todas las comparaciones es mágica.
        if (resp) {
            System.out.println("La matriz es mágica.");
        } else {
            System.out.println("La matriz no es mágica.");
        }
    }

}
