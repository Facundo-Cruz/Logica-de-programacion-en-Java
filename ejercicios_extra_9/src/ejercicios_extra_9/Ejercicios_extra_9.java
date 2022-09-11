//Simular la división usando solamente restas. Dados dos números enteros mayores que
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
//Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
//resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

package ejercicios_extra_9;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_9 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros a dividir");
        int num1,num2,cociente =0,residuo;
        do{
            num1 = leer.nextInt();
            if(num1<2){
                System.out.println("Error, ingrese un número mayor a 1");
            }
        }while(num1<2);
        do{
            num2 = leer.nextInt();
            if(num2<2){
                System.out.println("Error, ingrese un número mayor a 1");
            }
        }while(num2<2);
        residuo = num1;
        while(residuo>num2){
            residuo -= num2;
            cociente++;
        }
        System.out.println("Dividir "+num1+" entre "+num2+" da como resultado:");
        System.out.println("Cociente: "+cociente+"\n Residuo: "+residuo);
        
    }

}
