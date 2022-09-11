//Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.

package ejercicios_extra_10;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        int numU;
        System.out.println("Se han multiplicado dos números enteros aleatorios entre 0 y 10, intenta adivinar el producto.");
        do{
            numU = leer.nextInt();
        }while(numU!=(num1*num2));
        System.out.println("Felicidades has adivinado el producto entre "+num1+" y "+num2+".");
    }

}
