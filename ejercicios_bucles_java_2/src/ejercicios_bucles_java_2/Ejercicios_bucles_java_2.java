
package ejercicios_bucles_java_2;

import java.util.Scanner;

public class Ejercicios_bucles_java_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opc;
        String resp = "N";
        do {
            System.out.println("MENU\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Salir\nElija una opción.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma entre " + num1 + " y " + num2 + " es " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta entre " + num1 + " y " + num2 + " es " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación entre " + num1 + " y " + num2 + " es " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La división entre " + num1 + " y " + num2 + " es " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Estás seguro que deseas salir del sistema?(S/N)");
                    resp = leer.next();
                    
                default:
                    System.out.println("Has ingresado una opción invalida.");
                   
            }
        }while(!(resp.equals("S")));
    }
    
}
