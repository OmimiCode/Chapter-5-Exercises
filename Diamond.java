package Chapter5;

import javax.swing.*;

public class Diamond {
    int line;
    int space;
    int asterisks;

    public void printDiamondMethod() {


//        for (line = 1; line <= 18; line += 2) {
//            if (line >= 11) {
//                for (space = 11; space <= line; space += 2) {
//                    System.out.print(" ");
//                }
//                for (asterisks = 18; asterisks > line; asterisks--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//
//            } else {
//                for (space = 8; space > line; space -= 2) {
//                    System.out.print(" ");
//                }
//                for (asterisks = 1; asterisks <= line; asterisks++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }



        //REFACTORED

        //top
        for (line = 1; line <= 5; line++) {
            for (space = 1; space <= (5 - line); space++)
                System.out.print(" ");
            for (asterisks = 1; asterisks <= (2 * line) - 1; asterisks++)
                System.out.print("*");
            System.out.println();
        }

        //bottom
        for (line = 4; line >= 1; line--) {
            for (space = 1; space <= (5 - line); space++)
                System.out.print(" ");
            for (asterisks = 1; asterisks <= (2 * line - 1); asterisks++)
                System.out.print("*");
            System.out.println();

        }
    }               //REFACTORED END




        public static void main (String[]args){
            Diamond diamond = new Diamond();
            diamond.printDiamondMethod();
        }
    }



