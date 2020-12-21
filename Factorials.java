package Chapter5;

import javax.swing.*;

public class Factorials {
    private void factorialMethod(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("enter number to get factorial"));

        for(int i=1; i<=num; i++){
           long factorial = 1;
            //for(int i = num ; i >= 1 ; --i)
            for(int j = 1; j <= i ; ++j) {
                factorial *= j;
            }
            System.out.println("Factorial of "+i+"\t= "+"\t"+factorial);
        }


    }

    public static void main(String[] args) {
        Factorials factorial = new Factorials();
        factorial.factorialMethod();
    }


//        What difficulty might prevent you from calculating the factorial of 100?
    // answer: data type "long" of the factorial variable  should be replaced with "double" else .......
}

