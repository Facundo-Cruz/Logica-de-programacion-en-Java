//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.

package ejercicios_extra_5;

//@author Facundo Cruz

import java.util.Scanner;


public class Ejercicios_extra_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué tipo de socio eres? (A , B o C)");
        String socio = leer.nextLine().toUpperCase();
        System.out.println("Ingrese el monto del medicamento");
        int monto = leer.nextInt();
        switch (socio){
            case "A":
                System.out.println("Tu obra social dispone de un 50% de descuento en medicamentos, el monto a pagar es "+"$"+(monto*0.5));
                break;
            case "B":
                System.out.println("Tu obra social dispone de un 35% de descuento en medicamentos, el monto a pagar es "+"$"+(monto*0.65));
                break;
            case "C":
                System.out.println("Tu obra social no dispone de descuento en medicamentos, el monto a pagar es "+"$"+monto);
                break;
            default:
                System.out.println("El tipo de socio es incorrecto.");
        }
    }

}
