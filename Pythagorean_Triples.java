package Chapter5;

import java.util.Arrays;

public class Pythagorean_Triples {
    public int pythagoreanTriplesMethod() {
        System.out.println("Pythagorean Triples:");
        System.out.printf("%3s  %3s %3s %3s \n", "S/N", "a", "b", "hypotenuse");
        System.out.println("_________________________");
        {
            int a, b, c, i = 0, limit = 500;
            for (a = 1; a < limit; ++a) {
                for (b = a + 1; b < limit; ++b) {
                    for (c = b + 1; c < limit; ++c) {
                        if (a * a + b * b == c * c) {
                            System.out.printf("%3d | %3d |%3d | %3d \n", ++i, a, b, c);
                       }
                    }
                }
                System.out.println("_____________________");
            }

            return 0;
        }
    }


    public static void main(String[] args) {
        Pythagorean_Triples main = new Pythagorean_Triples();
        main.pythagoreanTriplesMethod();
    }
}