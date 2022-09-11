//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
//matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
//signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

package ejercicios_funciones_5;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_funciones_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de las matrices.");
        int dim = leer.nextInt();
        int matriz[][] = new int[dim][dim];
        int matriz2[][] = new int[dim][dim];
        System.out.println("LLenado Matriz 1");
        LlenarMatriz(matriz, dim);
        System.out.println("Llenado Matriz 2");
        LlenarMatriz(matriz2, dim);
        System.out.println("Matriz 1:");
        MostrarMatriz(matriz,dim);
        System.out.println("Matriz 2:");
        MostrarMatriz(matriz2,dim);
        boolean check = VerAnti(matriz,matriz2,dim);
        if (check){
            System.out.println("La matriz 2 es anti simétrica de la matriz 1 ya que cumple con A=-AT ");
        }else{
            System.out.println("La matriz 2 no es anti simétrica de la matriz 1 ya que no cumple con A=-AT ");
        }
    }

    public static void LlenarMatriz(int matriz[][], int n) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese el valor [" + i + "][" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static boolean VerAnti(int matriz[][], int matriz2[][], int n) {
        boolean resp = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] !=matriz2[j][i]) {
                    resp = false;
                    break;
                }
                if (!resp){
                    break;
                }
            }
            
        }
        if (resp) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][j] != -1*(matriz2[i][j])){
                        resp = false;
                        break;
                    }
                    if (!resp){
                        break;
                    }
                }
            }
        }
        return resp;
    }
    public static void MostrarMatriz(int matriz[][],int dim){
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}
