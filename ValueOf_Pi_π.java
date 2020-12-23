package Chapter5;

import javax.swing.*;

public class ValueOf_Pi_π {
    //    (Calculating the Value of π) Calculate the value of π from the infinite series
//    Print a table that shows the value of π approximated by computing the first 200,000 terms of this
//    series. How many terms do you have to use before you first get a value that begins with 3.14159?

    static double π = 0;
    int determinant = 0;
    double counter;

    public void piValueMethod() {
        int limit = Integer.parseInt(JOptionPane.showInputDialog("enter limit"));
        System.out.println("no." + "\t" + "counter" + "\t" + "pi(π)");
        for (counter = 1; counter <= limit; counter += 2) {
            double var = 4 / counter;
            if (determinant % 2 == 0) {
                π += var;
            } else {
                π -= var;
            }
            determinant++;
            System.out.println(determinant + "\t" + counter + "\t" + "\t" + π);
        }
    }



    public static void main(String[] args) {
        ValueOf_Pi_π pi_Π = new ValueOf_Pi_π();
        pi_Π.piValueMethod();
        }

    }
