//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
//en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
//vocales acentuadas) se mantienen sin cambios.
//a=@ , e=#, i=$ , o=% , u=*
//    Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//correspondiente. Utilice la estructura “según” para la transformación.
//Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
package ejercicios_ejemplos_11;

import java.util.Scanner;

public class Ejercicios_ejemplos_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase terminada en punto.");
        String var;
        String frase;
        String retorno;
        do {
            frase = leer.nextLine();
            var = charF(frase);
            if (!var.equals(".")) {
                System.out.println("Ingrese un punto al final.");
            }
        }while(!var.equals("."));
        retorno = conversion(frase);
        System.out.println(retorno);
    }

    public static String charF(String cadena) {
        Scanner leer = new Scanner(System.in);
        int i = cadena.length() - 1;
        int j = cadena.length();
        String texto = cadena.substring(i, j);
        return texto;
    }

    public static String conversion(String texto) {
        String newFrase = "";
        for (int i = 0; i < texto.length(); i++) {
            switch (texto.substring(i, (i + 1))) {
                case ("a"):
                    newFrase = newFrase.concat("@");
                    break;
                case ("A"):
                    newFrase = newFrase.concat("@");
                    break;
                case "e":
                    newFrase = newFrase.concat("#");
                    break;
                case "E":
                    newFrase = newFrase.concat("#");
                    break;
                case "i":
                    newFrase = newFrase.concat("$");
                    break;
                case "I":
                    newFrase = newFrase.concat("#");
                    break;
                case "o":
                    newFrase = newFrase.concat("%");
                    break;
                case "O":
                    newFrase = newFrase.concat("#");
                    break;
                case "u":
                    newFrase = newFrase.concat("*");
                    break;
                case "U":
                    newFrase = newFrase.concat("*");
                    break;
                default:
                    newFrase = newFrase.concat(texto.substring(i, i + 1));
            }
        }
        return newFrase;
    }
}
