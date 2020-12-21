package Chapter5;
//5.15 (Triangle Printing Program) Write an application that displays the following patterns sep-
//        arately, one below the other. Use for loops to generate the patterns. All asterisks ( * ) should be print-
//        ed by a single statement of the form System.out.print('*' ) ; which causes the asterisks to print side
//        by side. A statement of the form System.out.println(); can be used to move to the next line. A
//        statement of the form System.out.print(' ' ) ; can be used to display a space for the last two pat-
//        terns. There should be no other output statements in the program. [Hint: The last two patterns re-
//        quire that each line begin with an appropriate number of blank spaces.]

import java.util.Arrays;

public class AsterisksTriangles {
    // i= lines
    // j= asterisk prints
    public static void main(String[] args) {
        //(a)
        System.out.println("(A)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();

        //(b)
        System.out.println("(B)");
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; --j) {
                System.out.print("*");
            }
            System.out.println();
        }

        //(c)
        System.out.println("(C)");
        // i = lines
        // j = asterisk prints
        // s = space
        int s;
        for (int i = 1; i <= 10; i++) {
            for (s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 10; j >= i; --j) {
                System.out.print("*");
            }
            System.out.println();
        }




        //(D)
        System.out.println("(D)");
        // i = lines
        // j = asterisk prints
        // s = space

        for (int i = 1; i <= 10; i++) {
            for (s = 10; s > i; --s) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

