//Recorrer un array de forma recursiva.
package recursion_3;

//@author Facundo Cruz
import java.util.Scanner;

public class Recursion_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector[] = new int[5];
        LeerArray(vector,0); //Mandamos el vector y a partir de que posición queremos leer.
        ImprimirArray(vector,0);//Mandamos el vector y a partir de que posición queremos imprimir.
    }
    public static void LeerArray(int V[], int i){
        Scanner leer = new Scanner(System.in);
        System.out.println("["+i+"] ");
        if(i== V.length-1){ // Podemos usar la forma de ImprimirArray para pedir los datos por teclado.
            V[i] = leer.nextInt();
        }else{
            V[i] = leer.nextInt();
            LeerArray(V, i+1);
        }
        
    }
    public static void ImprimirArray(int V[], int i){
        if(i!=V.length){ // Podemos usar la forma de LeerArray para imprimir los datos por pantalla.
            System.out.print("["+V[i]+"] ");
            ImprimirArray(V,i+1);
        }
    }
}
