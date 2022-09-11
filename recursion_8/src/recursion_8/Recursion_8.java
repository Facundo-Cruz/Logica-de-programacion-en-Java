//8. Invertir una palabra de forma recursiva
package recursion_8;

//@author Facundo Cruz
public class Recursion_8 {

    public static void main(String[] args) {
        String frase = "MUNDO", newFrase = "";
        String finish = Invertir(frase, frase.length() - 1, newFrase);
        System.out.println(finish);
    }

    public static String Invertir(String frase, int x, String newFrase) {
        if (x == 0) {
            return String.valueOf(frase.charAt(x));
        } else {
            newFrase = frase.charAt(x) + Invertir(frase, x - 1,newFrase);
        }
        return newFrase;
    }
}
