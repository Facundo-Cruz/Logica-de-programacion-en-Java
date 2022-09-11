//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.

package ejercicios_condiciones_java_2;

import java.util.Scanner;

public class Ejercicios_condiciones_java_2 {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase.");
        Scanner leer = new Scanner (System.in);
        String frase1 = "eureka";
        String frase2 = leer.nextLine();
        if (frase1.equals(frase2)) {
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
    }
    
}
