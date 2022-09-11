//Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
//bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
//resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
//Nota: recordar el uso de la sentencia break.
package ejercicios_ejemplos_9;

import java.util.Scanner;

public class Ejercicios_ejemplos_9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont = 0;
        int suma = 0;
        System.out.println("Tienes 20 intentos para adivinar el número. Ingrese el primer número.");
        do{
            cont++;
            num = leer.nextInt();
            if (num>0){
                suma += num;
            }else if(num==0){
                break;
            }
        }while(!(cont==20));
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("Tus intentos para adivinar el número fueron " + cont);
    }
    
}
