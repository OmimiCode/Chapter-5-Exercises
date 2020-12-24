package Chapter5;

public class BreakStatementReplaced {
    // Fig. 5.13: BreakTest.java
// break statement exiting a for statement.
//    public class BreakTest
//    {
    public static void main(String[] args) {
        int count; // control variable also used after loop terminates
        boolean condition = false;
        for (count = 1; ((count <= 10) == !condition); count++) {
            if (count == 4) {
                //   break; // terminates loop if count is 5\
                condition = true;
                System.out.printf("%d ", count);
            }
            System.out.printf("%nBroke out of loop at count = %d%n", count);
        }
    } // end class BreakTest
}
