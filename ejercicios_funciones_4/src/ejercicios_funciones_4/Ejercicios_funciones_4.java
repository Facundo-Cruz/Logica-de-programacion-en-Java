//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
//cambiando sus filas por columnas (o viceversa).
package ejercicios_funciones_4;

//@author Facundo Cruz

public class Ejercicios_funciones_4 {

    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        int matriz2[][]=new int[4][4];
        RellenarMatrizAzar(matriz);
        System.out.println("Matriz 1:");
        MostrarMatriz(matriz);
        CargarTranspuesta(matriz,matriz2);
        System.out.println("Matriz 2 (transpuesta de 1):");
        MostrarMatriz(matriz2);
    }
    public static void RellenarMatrizAzar(int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
    }
    public static void MostrarMatriz(int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
    public static void CargarTranspuesta(int matriz[][], int transpuesta[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transpuesta[i][j]=matriz[j][i];
            }
        }
    }
}
