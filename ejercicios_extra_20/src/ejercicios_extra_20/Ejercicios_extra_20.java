//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.

package ejercicios_extra_20;

//@author Facundo Cruz

public class Ejercicios_extra_20 {

    public static void main(String[] args) {
        int vector[] = new int[5];
        LlenarVector(vector);
        ImprimirVector(vector);
    }
    public static void LlenarVector(int vector[]){
        for (int i = 0; i < 5; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }
    public static void ImprimirVector(int vector[]){
        for (int i = 0; i < 5; i++) {
            System.out.print("["+vector[i]+"] ");
        }
        System.out.println("");
    }
    
}
