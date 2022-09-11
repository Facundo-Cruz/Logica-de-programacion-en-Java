//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
package ejercicios_extra_6;

//@author Facundo Cruz
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicios_extra_6 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("¿Cuántas alturas ingresarás?");
        int num = leer.nextInt(), cont = 0;
        double h, sumaT = 0, sumaI = 0;
        System.out.println("Ingrese las alturas en metros.");
        for (int i = 0; i < num; i++) {
            System.out.println("Altura " + (i + 1) + ":");
            h = leer.nextDouble();
            sumaT += h;
            if (h < 1.60) {
                cont++;
                sumaI += h;
            }
        }
        
        if (cont == 0) {
            System.out.println("No se registraron alturas por debajo de 1.60m el promedio es 0.");
        } else {
            System.out.println("El promedio de alturas por debajo de 1.60m es:" + df.format((sumaI / cont)) + "m.");
        }
        System.out.println("El promedio de alturas en general es " + df.format((sumaT / num)) + "m.");
    }
    
}
