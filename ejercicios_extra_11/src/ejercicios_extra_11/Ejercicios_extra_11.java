//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
package ejercicios_extra_11;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero para calcular sus dígitos.");
        int num = leer.nextInt(), cont = 0;
        do {
            num /= 10;
            cont++;
        } while (num != 0);
        System.out.println("La cantidad de dígitos del número es " + cont);
    }

}
