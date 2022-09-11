//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

package ejercicios_introducción_java_5;

import java.util.Scanner;

public class Ejercicios_Introducción_Java_5 {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero.");
        Scanner leer = new Scanner (System.in);
        int num = leer.nextInt();
        System.out.println("Has ingresado el numero " + num);
        System.out.println("Su doble es: " + (num * 2));
        System.out.println("Su triple es: " + (num * 3));
        System.out.println("Su raíz cuadrada es: " + Math.sqrt(num));
        
    }
    
}
