//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.

package ejercicios_funciones_1;

public class Ejercicios_funciones_1 {

    public static void main(String[] args) {
        int vector[] = new int[100];
        LlenadoVector(vector);
        MostrarVector(vector);
    }
    public static void LlenadoVector(int[] vector){
        for (int i = 0; i < 100; i++) {
            vector[i]= i+1;
        }
    }
    public static void MostrarVector(int[] vector){
        for (int i = 99; i > -1; i--) {
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
    }
}
