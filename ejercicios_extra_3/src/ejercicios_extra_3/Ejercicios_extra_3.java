//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

package ejercicios_extra_3;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra.");
        String prueba = (leer.nextLine()).toUpperCase();
        if (prueba.equals("A")||prueba.equals("E")||prueba.equals("I")||prueba.equals("O")||prueba.equals("U")){
            System.out.println("El caracter ingresado SI es parte de las vocales.");
        }else{
            System.out.println("El caracter ingresado NO es parte de las vocales.");
        }
    }

}
