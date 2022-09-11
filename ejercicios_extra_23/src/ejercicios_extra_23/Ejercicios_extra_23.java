//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
//que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
//20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
//será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
//rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
//por pantalla la sopa de letras creada.
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
//de Java substring(), Length() y Math.random().
package ejercicios_extra_23;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_23 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String sopa[][] = new String[20][20];
        String palabra;
        int num1, num2, num3, num4, num5, numRandom;
        //generamos 5 números aleatorios distintos entre 0 y 19 para usarlos como las filas de las 5 palabras.
        do {
            num1 = (int) (Math.random() * 19);
            num2 = (int) (Math.random() * 19);
            num3 = (int) (Math.random() * 19);
            num4 = (int) (Math.random() * 19);
            num5 = (int) (Math.random() * 19);
        } while ((num1 == num2) || (num3 == num2 || num3 == num1) || (num4 == num3 || num4 == num2 || num4 == num1) || (num5 == num4 || num5 == num3 || num5 == num2 || num5 == num1));
        //guardamos los números en un vector para después poder acceder solo a esas filas.
        int vector[] = {num1,num2,num3,num4,num5};
        //llenamos la sopa de letra 20x20 con números aleatorios entre 0 y 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = String.valueOf((int) (Math.random()*9));
            }
        }
        System.out.println("Ingrese 5 palabras para la sopa de letra.");
        //creamos un bucle con 5 vueltas que nos va a permitir acceder a todas las filas guardadas en el vector.
        for (int i = 0; i < 5; i++) {
            // usamos un bucle "do-while" para limitar los caracteres de la palabra entre 3 y 5.
            do {
                palabra = leer.nextLine();
                if(palabra.length()<3||palabra.length()>5){
                    System.out.println("Error, ingrese una palabra de mínimo 3 y máximo 5 caracteres.");
                }
            } while (palabra.length()<3||palabra.length()>5);
            //creamos otro for que nos permitirá recorrer máximo 5 columnas de X fila. 
            for (int j = 0; j < 5; j++) {
                if(j<palabra.length()){ // esta condición nos permite limitar el acceso a las columnas, llegando como máximo hasta la longitud de nuestra palabra
                    sopa[vector[i]][j] = palabra.substring(j, j+1); // acá usamos el vector con números aleatorios para acceder a las filas determinadas y además cargamos caracter x caracter la frase ingresada.
                }
            }
        }
        //Imprimimos la matriz.
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+sopa[i][j]+"] ");
            }
            System.out.println("");
        }
        // ayuda visual para ver el valor de nuestros números aleatorios
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}
