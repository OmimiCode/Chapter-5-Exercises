package Chapter5;
//5.28 Describe in general how you’d remove any continue statement from a loop in a program
//        and replace it with some structured equivalent. Use the technique you develop here to remove the
//        continue statement from the program in Fig. 5.14.
public class ContinueStatementReplaced {
    // Fig. 5.14: ContinueTest.java
// continue statement terminating an iteration of a for statement.
//    public class ContinueTest
//    {
    public static void main(String[] args) {
        boolean condition = false;
        for (int count = 1; ((count <= 10) == !condition); count++) {
                if (count == 4)

                    condition=true;
                    //continue; // skip remaining code in loop body if count is 5
                System.out.printf("%d ", count);
            }
            System.out.printf("%nUsed continue to skip printing 5%n");
        }
    } // end class ContinueTest
