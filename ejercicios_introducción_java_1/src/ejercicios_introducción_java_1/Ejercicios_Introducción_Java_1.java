//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los;
//dos. El programa deberá después mostrar el resultado de la suma
package ejercicios_introducción_java_1;

import java.util.Scanner;

public class Ejercicios_Introducción_Java_1 {
    
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     System.out.println("Ingrese dos numeros para sumar ");
     //int tipo de dato:enteros
     int numero1 = leer.nextInt();
     int numero2 = leer.nextInt();
     System.out.println("la suma de ambos numeros es "+ (numero1 + numero2));
    }
    
}
