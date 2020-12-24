package Chapter5;

import javax.swing.*;

public class Diamond_Modified {
    int line;
    int space;
    int asterisks;

    public void printDiamondMethodModified() {

        int limit = Integer.parseInt(JOptionPane.showInputDialog("enter odd number in the range 1 to 19 to specify the number of rows in the diamond to display"));
        if (limit >= 1 && limit <= 19) {
//            while (limit % 2 == 0) {
//                limit = Integer.parseInt(JOptionPane.showInputDialog("enter odd number in the range 1 to 19 to specify the number of rows in the diamond to display"));
    //}
            for (line = 1; line <= limit; line += 2) {
                if (line >= limit / 2) {
                    for (space = limit / 2; space <= line; space += 2) {
                        System.out.print(" ");
                    }
                    for (asterisks = limit; asterisks >= line; asterisks--) {
                        System.out.print("*");
                    }
                    System.out.println();

                } else {
                    for (space = limit / 2; space > line; space -= 2) {
                        System.out.print(" ");
                    }
                    for (asterisks = 1; asterisks <= line; asterisks++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } else {
            limit = Integer.parseInt(JOptionPane.showInputDialog("enter odd number in the range 1 to 19 to specify the number of rows in the diamond to display"));
        }
    }





    public static void main (String[]args){
        Diamond_Modified diamond_modified = new Diamond_Modified();
        diamond_modified.printDiamondMethodModified();
    }
}



