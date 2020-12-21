package Chapter5;
//5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
//        of the odd integers from 1 to 15.

import javax.swing.*;

public class ProductOfOddIntegers {


    private int product = 1;
    int counter = 1;
    public void product_Of_Input_Odd_Integers() {

        int input = Integer.parseInt(JOptionPane.showInputDialog("enter value to find the product of its odd integers "));

        while (counter <= input) {
            this.product *= counter;
            counter += 2;

        }
    }

    public int getProductOfItsOddIntegers() {
        System.out.println("product_Of_Odd_Integers : "+product);
        return product;
    }


    public static void main(String[] args) {
        ProductOfOddIntegers main = new ProductOfOddIntegers();
        main.product_Of_Input_Odd_Integers();
        main.getProductOfItsOddIntegers();

    }
}