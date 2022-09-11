//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.

package ejercicios_extra_14;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias.");
        int N = leer.nextInt(), M,edad,sumaE = 0, sumaH = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia "+i);
            M = leer.nextInt();
            sumaH += M;
            if(M!=0){
                System.out.println("Ingrese sus respectivas edades");
            }
            for (int j = 1; j <= M; j++) {
                System.out.println("Hijo "+j);
                edad = leer.nextInt();
                sumaE += edad;
            }
        }
        System.out.println("La media de edad de los hijos de todas las familias es "+(sumaE/sumaH)+" años.");
    }

}
