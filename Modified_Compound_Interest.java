package Chapter5;

import java.util.Arrays;

//5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
//        Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
//        vary the interest rate.
// Fig. 5.6: Interest.java
// Compound-interest calculations with for.
//    public class Interest
//    {
public class Modified_Compound_Interest {
    public static void main(String[] args) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
//        double rate = 0.05; // interest rate

        for ( double rate = 0.05; rate <= 0.10; rate += 0.01) {
            System.out.println("interest at " + rate + " rate");
            System.out.printf("%s %20s %n", "Year", "Amount on deposit");
            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,20.2f%n", year, amount);
            }
        }
    }
}

