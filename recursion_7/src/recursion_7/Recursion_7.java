//7. Invertir un numero de forma recursiva (no usar String)

package recursion_7;

//@author Facundo Cruz

public class Recursion_7 {

    public static void main(String[] args) {
        int num = 123, inv = 0;
        int r = InvertirNum(num,inv);
        System.out.println(r);
    }
    public static int InvertirNum(int num, int inv){
        if(num==0){
            return inv;
        }else{                
            return InvertirNum(num/10, (inv * 10 + num%10));
        }
    }
}
