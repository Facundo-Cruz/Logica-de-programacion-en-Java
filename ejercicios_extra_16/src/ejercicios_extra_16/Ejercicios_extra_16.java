//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package ejercicios_extra_16;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántos datos de personas llenaras?");
        int N = leer.nextInt();
        datos(N);
    }

    public static void datos(int n) {
        Scanner leer = new Scanner(System.in);
        String name, resp = "Si";
        int age;
        for (int i = 1; i <= n; i++) {
            System.out.println("Persona " + i);
            System.out.println("Ingrese su nombre");
            name = leer.next();
            System.out.println("Ingrese su edad ");
            age = leer.nextInt();
            System.out.println("Su nombre es: " + name);
            System.out.println("Su edad es: " + age);
            if (age >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }
            if (i != n) {
                System.out.println("¿Desea seguir llenando los datos?");
                resp = leer.next();
                if (resp.equals("No")) {
                    break;
                }
            }
        }
    }
}
