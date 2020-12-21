package Chapter5;

import java.util.Scanner;

public class BarChart {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first input");
        int num1 = input.nextInt();

        System.out.println("enter second input");
        int num2 = input.nextInt();

        System.out.println("enter third input");
        int num3 = input.nextInt();

        System.out.println("enter fourth input");
        int num4 = input.nextInt();

        System.out.println("enter fifth input");
        int num5 = input.nextInt();
        int asterisks;
        if (num1 >= 1 && num1 <= 30 && num2 >= 1 && num2 <= 30 && num3 >= 1 && num3 <= 30 && num4 >= 1 && num4 <= 30 && num5 >= 1 && num5 <= 30) {

            System.out.printf("%3d ", num1);
            for (asterisks = 1; asterisks <= num1; asterisks++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.printf("%3d ", num2);
            for (asterisks = 1; asterisks <= num2; asterisks++) {
                System.out.print("*");
            }
            System.out.println();

            System.out.printf("%3d ", num3);
            for (asterisks = 1; asterisks <= num3; asterisks++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.printf("%3d ", num4);
            for (asterisks = 1; asterisks <= num4; asterisks++) {
                System.out.print("*");
            }

            System.out.println();

            System.out.printf("%3d ", num5);
            for (asterisks = 1; asterisks <= num5; asterisks++) {
                System.out.print("*");
            }

        } else {
            System.out.println("enter digits between 1 and 30");
        }


    }
}