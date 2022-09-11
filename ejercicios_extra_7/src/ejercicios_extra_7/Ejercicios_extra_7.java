//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.
package ejercicios_extra_7;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos números ingresarás?");
        int n = leer.nextInt();
        int num, cont = 1;
        System.out.println("A continuación ingrese números enteros positivos.");
        do {
            num = leer.nextInt();
            if (num < 1) {
                System.out.println("Error, ingrese un número entero mayor a 0.");
            }
        } while (num < 1);
        int numMax = num;
        int numMin = num;
        double sumaT = num;
        if (n > 1) {
            do {
                do {
                    num = leer.nextInt();
                    if (num < 1) {
                        System.out.println("Error, ingrese un número entero mayor a 0.");
                    }
                } while (num < 1);
                sumaT += num;
                if (num < numMin) {
                    numMin = num;
                }
                if (num > numMax) {
                    numMax = num;
                }
                cont++;
            } while (cont < n);
        }
        System.out.println("El valor máximo ingresado es: " + numMax);
        System.out.println("El valor mínimo ingresado es: " + numMin);
        System.out.println("El valor promedio de los números ingresados es: " + sumaT / n);
    }

}
