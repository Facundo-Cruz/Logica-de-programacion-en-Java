//Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package ejercicios_vec_mat_java_1;

import java.util.Scanner;

public class Ejercicios_vec_mat_java_1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿A qué moneda desea hacer la conversión? (libras,dolares o yenes)");
        String moneda = leer.nextLine();
        System.out.println("Ingresa una cantidad de euros.");
        double euros = leer.nextDouble();
        ConvertirMoneda(euros, moneda);
    }

    public static void ConvertirMoneda(double euros, String moneda) {
        switch (moneda) {
            case "libras":
                System.out.println("Tus " + euros + " euros a libras son " + (euros * 0.86));
                break;
            case "dolares":
                System.out.println("Tus " + euros + " euros a dólares son " + (euros * 1.28611));
                break;
            case "yenes":
                System.out.println("Tus " + euros + " euros a yenes son " + (euros * 129.852));
                break;
            default:
                System.out.println("Has ingresado una moneda inexistente.");
        }
    }

   
}
