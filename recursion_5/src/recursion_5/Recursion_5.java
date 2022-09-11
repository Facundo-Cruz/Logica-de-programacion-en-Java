//5. Recorrer una matriz de forma recursiva.
package recursion_5;

//@author Facundo Cruz
public class Recursion_5 {

    public static void main(String[] args) {
        int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ImprimirMatriz(matriz, 0, 0);
        System.out.println("");
    }

    public static void ImprimirMatriz(int matriz[][], int i, int j) {

        System.out.print(matriz[i][j] + " ");
        if (j != matriz[0].length - 1) {
            ImprimirMatriz(matriz, i, j + 1);
        } else if (i != matriz.length - 1) {
            j = 0;
            System.out.println("");
            ImprimirMatriz(matriz, i + 1, j);
        }
    }
}
