package Chapter5;

public class Exercise5_19 {
//      5.19
//    Assume that i = 1 , j = 2 , k = 3 and m = 2 . What does each of the following statements print?
    public static void main(String[] args) {
      int   i = 1 , j = 2 , k = 3, m = 2;
        /*a) */ System.out.println(i == 1); //true
        /*b) */System.out.println(j == 3);  //false
        /*c) */System.out.println((i >= 1) && (j < 4)); //true
        /*d) */System.out.println((m <= 99) & (k < m)); //false
        /*e) */System.out.println((j >= i) || (k == m)); //true
        /*f) */System.out.println((k + m < j) | (3 - j >= k));//false
        /*g) */System.out.println(!(k > m));//false
    }
}
