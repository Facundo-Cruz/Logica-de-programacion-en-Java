//6. Calcular el valor de la posición fibonacci usando recursividad.
package recursion_6;

//@author Facundo Cruz
import java.util.Scanner;

public class Recursion_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la posición fibonacci que desea calcular");
        int x = leer.nextInt();
        int r = Fibonacci(x);
        System.out.println(r);
    }

    public static int Fibonacci(int x) {

        switch (x) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return Fibonacci(x - 1) + Fibonacci(x - 2);
        }
    }
}
