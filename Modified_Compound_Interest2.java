package Chapter5;
//5.18 (Modified Compound-Interest Program) Modify the application in Fig. 5.6 to use only in-
//        tegers to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
//        of pennies. Then break the result into its dollars and cents portions by using the division and re-
//        mainder operations, respectively. Insert a period between the dollars and the cents portions.]

//    // Fig. 5.6: Interest.java
//// Compound-interest calculations with for.
//    public class Interest
//
public class Modified_Compound_Interest2 {

    public static void main(String[] args) {
        int amount; // amount on deposit at end of each year
        int principal = 100000; // initial amount before interest
        double rate = 0.05; // interest rate

        System.out.printf("%s %20s %n", "Year", "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {

            amount = (int) (principal * Math.pow(1.0 + rate, year) * 100);
            System.out.printf("%4d%,16d.%02d%n", year, (amount / 100) / 100, (amount / 100) % 100);

        }
    }
}