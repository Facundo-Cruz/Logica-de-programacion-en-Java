//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123

package ejercicio_extra_13;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicio_extra_13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera de números.");
        int num = leer.nextInt();
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

}
