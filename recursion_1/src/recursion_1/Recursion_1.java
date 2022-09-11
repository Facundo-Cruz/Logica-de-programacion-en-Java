//1. Sumar los números números naturales hasta N (se lo damos nosotros) de forma recursiva.

package recursion_1;

//@author Facundo Cruz

import java.util.Scanner;


public class Recursion_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero.");
        int num = leer.nextInt();
        int resp = sumaE(num);
        System.out.println("La suma de los primeros "+num+" enteros es "+resp);
    }

    public static int sumaE(int N){
        int suma;
        if(N==0){
            return N;
        }else{
            suma = N + sumaE(N-1);
     // N = 3;
     // 1ro suma = 3 + sumaE(2) hace el primer llamado dentro de si misma.
     // 2do suma = 2 + sumaE(1) segundo llamadado dentro de la misma
     // 3ro suma = 1 + sumaE(0) tercer llamada dentro de la msima dando un resultado 
     // 4to LLAMADO no entra a suma, retorna N, siendo N=0 
     // ya obtuvimos el valor de sumaE(0) que es "0" entonces podemos finalizar el 3er llamado
     //   1 = 1 + 0 CIERRA EL TERCER LLAMADADO DENTRO DE SI MISMA Y RETORNA 1
     //   3 = 2 + 1 CIERRA EL SEGUNDO LLAMADO DENTRO DE SI MISMA y RETORNA 3
     //   6 = 3 + 3 CIERRA EL PRIMER LLAMADO DENTRO DE SI MISMA Y RETORNA 6
     //VOLVEMOS AL UNICO LLAMADO DE LA FUNCIÓN Y COMO YA RESOLVIMOS suma = N + sumaE(N-1) LO RETORNAMOS AL ALGORITMO PRINCIPAL
     // COMO ANALISIS VEMOS QUE LA ÚLTIMA FUNCIÓN EN SER LLAMADA ES LA PRIMERA EN TERMINAR.
        }
        return suma;
    }

}
