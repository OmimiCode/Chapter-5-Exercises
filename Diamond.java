package Chapter5;

public class Diamond {
    int line;
    int space;
    int asterisks;

    public void printDiamondMethod() {

        for (line = 1; line <= 18; line += 2) {
            if (line >= 11) {
                for (space = 11; space <= line; space += 2) {
                    System.out.print(" ");
                }
                for (asterisks = 18; asterisks > line; asterisks--) {
                    System.out.print("*");
                }
                System.out.println();

            } else {
                for (space = 8; space > line; space -= 2) {
                    System.out.print(" ");
                }
                for (asterisks = 1; asterisks <= line; asterisks++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }


        public static void main (String[]args){
            Diamond diamond = new Diamond();
            diamond.printDiamondMethod();
        }
    }



