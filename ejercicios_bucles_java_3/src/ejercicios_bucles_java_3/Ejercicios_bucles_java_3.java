//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
package ejercicios_bucles_java_3;

import java.util.Scanner;

public class Ejercicios_bucles_java_3 {

    public static void main(String[] args) {
        System.out.println("Dipositivo RS232");
        int C1 = 0;
        int C2 = 0;
        Scanner leer = new Scanner(System.in);
        String frase; 
        do {
            System.out.println("Ingrese una cadena");
            frase = leer.nextLine();
            if (frase.length() == 8) {
                if (frase.substring(0,1).equals("X")){
                    int A = frase.length()-1;
                    int B = frase.length();
                    if (frase.substring(A,B).equals("O")) {
                        C1 += 1;
                    }
                }
            }else{
                if (!(frase.equals("&&&&&"))){
                    C2 += 1;
                }
            }
        }while(!(frase.equals("&&&&&")));
        System.out.println(C1 + " CADENAS CORRECTAS.");
        System.out.println(C2 + " CADENAS INCORRECTAS.");
    }
    
}
