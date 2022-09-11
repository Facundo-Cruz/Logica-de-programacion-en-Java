//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
//tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
package ejercicios_extra_2;

//@author Facundo Cruz
public class Ejercicios_extra_2 {

    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4, AUX;
        
        System.out.println("A="+A+"\nB="+B+"\nC="+C+"\nD="+D+"");
        // B = C , C = A , A = D , D = B.
        AUX = B+C; // 2 + 3 = 5
        B = C; // 3
        C = A;//1
        A = D;//4
        D = AUX - B;//5-3 = 2
        System.out.println("------------------------");
        System.out.println("A="+A+"\nB="+B+"\nC="+C+"\nD="+D+"");
    }

}
