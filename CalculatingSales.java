package Chapter5;

import javax.swing.*;

/*5.17 (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
        Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
        Write an application that reads a series of pairs of numbers as follows:
        a) product number
        b) quantity sold
        Your program should use a switch statement to determine the retail price for each product. It
        should calculate and display the total retail value of all products sold. Use a sentinel-controlled
        loop to determine when the program should stop looping and display the final results.*/
public class CalculatingSales {


    private int productNumber;
    private int quantity;
    private double product_price;




    public void productNumber() {
        int productNumber = Integer.parseInt(JOptionPane.showInputDialog("enter product number"));
        this.productNumber = productNumber;

    }

    public int getProductNumber() {
        return productNumber;
    }

    public void quantity() {
        int quantity = Integer.parseInt(JOptionPane.showInputDialog("enter quantity purchased"));
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void switchCase() {

        while (true) {
            System.out.println("press 1 for Product 1 at $2.98");
            System.out.println("press 2 for Product 2 at $4.50");
            System.out.println("press 3 for Product 3 at $9.98");
            System.out.println("press 4 for Product 4 at $4.49");
            System.out.println("press 5 for Product 5 at $6.87");
            System.out.println("press 6 to Exit program");
            int productNumber = Integer.parseInt(JOptionPane.showInputDialog("enter product number"));
            this.productNumber = productNumber;
            if (productNumber == 6) {
                break;
            }

            int quantity = Integer.parseInt(JOptionPane.showInputDialog("enter quantity purchased"));
            this.quantity = quantity;


            switch (productNumber) {
                case 1:
                    product_price= 2.98;
                    break;
                case 2:
                    product_price = 4.50;
                    break;
                case 3:
                    product_price = 9.98;
                    break;
                case 4:
                    product_price = 4.49;
                    break;
                case 5:
                    product_price = 6.87;
                    break;
                default:
                    break;
            }
            System.out.println("total price = $"+productNumber*product_price);
        }
    }

    public double getProductPrice() {

        return product_price;
    }


    public static void main(String[] args) {
        CalculatingSales calculatingSales = new CalculatingSales();
        calculatingSales.switchCase();
    }
}
