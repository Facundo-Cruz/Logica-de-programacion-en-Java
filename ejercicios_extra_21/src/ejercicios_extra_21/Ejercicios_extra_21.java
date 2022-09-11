//Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
//adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
//desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
//prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
//programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
//desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
//igual al 7 de sus notas del curso.
package ejercicios_extra_21;

//@author Facundo Cruz
import java.util.Scanner;

public class Ejercicios_extra_21 {

    public static void main(String[] args) {
        // 10 alumnos / cantidad de aprobado y desaprobado / 4 notas[2 x tp y 2 x parciales]
        // primer tp 10%, segundo 15%, primer Parcial 25%, segundo Parcial 50%.
        // promedio se guarda en un arreglo / mayor o igual a 7 aprueban
        Scanner leer = new Scanner(System.in);
        double notas[] = new double[10];
        double nota1, nota2, nota3, nota4;
        int cont = 0;
        System.out.println("Ingrese las notas de sus alumnos.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nota T.P 1");
            nota1 = leer.nextInt()*0.10;
            System.out.println("Nota T.P 2");
            nota2 = leer.nextInt()*0.15;
            System.out.println("Nota Integrador 1");
            nota3 = leer.nextInt()*0.25;
            System.out.println("Nota Integrador 2");
            nota4 = leer.nextInt()*0.50;
            notas[i] = nota1+nota2+nota3+nota4;
            if (notas[i]>= 7){
                cont++;
            }
        }
        System.out.println("Cantidad de aprobados: "+cont);
        System.out.println("Cantidad de desaprobados "+(10-cont));
    }

}
