//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main.
package ejercicios_extra_15;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números.");
        int num1 = leer.nextInt(), num2 = leer.nextByte();
        double retorno = 0;
        System.out.println("¿Qué función matemática desea relizar con sus dos números.");
        String opc = leer.next().toLowerCase();
        boolean var = true;
        switch (opc) {
            case "sumar":
                retorno = sumar(num1, num2);
                break;
            case "restar":
                retorno = restar(num1, num2);
                break;
            case "dividir":
                retorno = dividir(num1, num2);
                break;
            case "multiplicar":
                retorno = multiplicar(num1, num2);
                break;
            default:
                System.out.println("No tenemeos registrada esa función matemática.");
                var = false;
        }
        if(var){
            System.out.println("El resultado es: " + retorno);
        }
    }

    public static int sumar(int num1, int num2) {
        int sumar = num1 + num2;
        return sumar;
    }

    public static int restar(int num1, int num2) {
        int restar = num1 - num2;
        return restar;
    }

    public static double dividir(int num1, int num2) {
        double dividir = num1 / num2;
        return dividir;
    }

    public static int multiplicar(int num1, int num2) {
        int multiplicar = num1 * num2;
        return multiplicar;
    }
}
