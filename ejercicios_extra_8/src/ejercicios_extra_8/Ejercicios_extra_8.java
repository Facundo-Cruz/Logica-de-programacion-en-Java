//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
//la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

package ejercicios_extra_8;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 1, numP = 0,numI = 0;
        System.out.println("Ingrese números y finalize con un múltiplo de 5");
        while(num%5!=0){
            do{
                num = leer.nextInt();
                if(num<0){
                    System.out.println("Error. Ingrese un entero positivo.");
                }
            }while(num<0);
            if(num%2==0){
                numP++;
            }else{
                numI++;
            }
        }
        System.out.println("Números pares: "+numP);
        System.out.println("Números impares: "+numI);
        System.out.println("Números leídos: "+(numP+numI));
    }

}
