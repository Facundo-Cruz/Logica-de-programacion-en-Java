package ejercicios_funciones_7;

//@author Facundo Cruz
public class Ejercicios_funciones_7 {

    public static void main(String[] args) {
        int M[][] = new int[10][10];
        int P[][] = {
            {36, 5, 67},
            {89, 90, 75},
            {14, 22, 26},};
        LlenarMatriz(M, P);
        System.out.println("Matriz M");
        MostrarMatriz(M, 10);
        System.out.println("Matriz P");
        MostrarMatriz(P, 3);
        BuscarMatrizEnMatriz(M, P);
    }

    public static void LlenarMatriz(int M[][], int P[][]) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 4; i < 7; i++) {
            for (int j = 4; j < 7; j++) {
                M[i][j] = P[i - 4][j - 4];
            }
        }
//        for (int i = 1; i < 4; i++) {
//            for (int j = 1; j < 4; j++) {
//                M[i][j] = P[i - 1][j - 1];
//            }
//        }
//        M[4][4] = 1;
    }

    public static void MostrarMatriz(int matriz[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void BuscarMatrizEnMatriz(int M[][], int P[][]) {
        boolean resp = false;
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (M[i][j] == P[0][0]) {
                    resp = Coincidir(M, P, i, j);
                }
                if (resp) {
                    x = i;
                    y = j;
                    break;
                }
            }
            if (resp) {
                break;
            }
        }
        if (resp) {
            System.out.println("¡Se ha encontrado la matriz P en la matriz M!\n Su posición es:");
            for (int i = x; i < x + 3; i++) {
                for (int j = y; j < y + 3; j++) {
                    if ((i == x + 2)&&(j==x+2)) {
                        System.out.print(i + "," + j + ".");
                    } else {
                        System.out.print(i + "," + j + "-");
                    }
                }
            }
            System.out.println("");
        } else {
            System.out.println("No se ha encontrado la matriz P en la matriz M.");
        }
    }

    public static boolean Coincidir(int M[][], int P[][], int i, int j) {
        boolean resp = false;

        if (i > 7 || j > 7) {
            resp = false;
        } else {

            for (int k = i; k < i + 3; k++) {
                for (int l = j; l < j + 3; l++) {
                    if (M[k][l] == P[k - i][l - j]) {
                        resp = true;
                    } else {
                        resp = false;
                        break;
                    }
                }
                if (!resp) {
                    break;
                }
            }
        }
        return resp;
    }
}
