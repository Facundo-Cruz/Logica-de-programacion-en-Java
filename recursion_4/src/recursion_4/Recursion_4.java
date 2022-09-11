//4. Buscar un elemento de un array de forma recursiva.
package recursion_4;

//@author Facundo Cruz
import java.util.Scanner;

public class Recursion_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = {1, 2, 3, 4, 5};
        System.out.println("Ingrese un número a buscar en el array");
        int num = leer.nextInt();
        int pos = BuscarNum(vector, num, 0);
        if(pos == -1){
            System.out.println("Su número no se encuentre en el Array");
        }else{
            System.out.println("Posición encontrada: [" + pos + "]");
        }
    }

    public static int BuscarNum(int vector[], int n, int i) {
        int x;
        if (vector.length == i + 1) {
            return -1;
        } else if (vector[i] == n) {
            return i;
        } else {
            x = BuscarNum(vector, n, i + 1);
        }
        return x;
    }
}
