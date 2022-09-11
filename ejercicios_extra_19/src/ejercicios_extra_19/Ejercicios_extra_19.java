//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
package ejercicios_extra_19;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectors");
        int dim = leer.nextInt();
        System.out.println("Proceda a llenar el vector 1");
        int vector1[] = new int[dim];
        for (int i = 0; i < dim; i++) {
            System.out.println("Posición [" + i + "]:");
            vector1[i] = leer.nextInt();
        }
        int vector2[] = new int[dim];
        System.out.println("Proceda a llenar el vector 2");
        for (int i = 0; i < dim; i++) {
            System.out.println("Posición [" + i + "]:");
            vector2[i] = leer.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < dim; i++) {
            if(vector1[i]==vector2[i]){
                cont++;
            }else{
                break;
            }
        }
        if(cont==dim){
            System.out.println("Los vectores son iguales.");
        }else{
            System.out.println("Los vectores no son iguales.");
        }
    }

}
