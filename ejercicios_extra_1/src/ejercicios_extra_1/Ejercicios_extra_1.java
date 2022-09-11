//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package ejercicios_extra_1;

//@author Facundo Cruz
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicios_extra_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Ingrese una cantidad de minutos");
        double min = leer.nextInt();
        double horas, dias;
        dias = min / 60 / 24;
        horas = min / 60 % 24;
        if ((int) horas == 0) {
            System.out.println("Los " + ((int) min) + " minutos son: " + ((int) dias) + " días y 0 hs.");
        } else {
            horas = Double.parseDouble(df.format(horas));
            double num = horas % (int) horas;
            num = Double.parseDouble(df.format(num));
            num = 60 * (num * 100) / 100;
            horas = (int) horas + (num / 100);
            horas = Double.parseDouble(df.format(horas));
            System.out.println("Los " + ((int) min) + " minutos son: " + ((int) dias) + " días y " + horas + " hs.");
        }
    }

}
