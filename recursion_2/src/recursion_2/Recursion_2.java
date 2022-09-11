//2. Factorial de un número.
package recursion_2;

//@author Facundo Cruz
import java.util.Scanner;

public class Recursion_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número para calcular su factorial.");
        int num = leer.nextInt();
        int resp = CalcularFactorial(num);
        System.out.println("!"+num+"="+resp);
    }

    public static int CalcularFactorial(int num) {
        int f;
        if (num == 1) {
            return 1;
        } else {
            f = num * CalcularFactorial(num-1);
        }
        return f;
    }
}
