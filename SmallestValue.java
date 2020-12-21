package Chapter5;

import javax.swing.*;

//5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
//        Assume that the first value read specifies the number of values to input from the user.
public class SmallestValue {

    private int number;
    private int minimum=0;

    public void input() {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("enter value"));
        this.number = userInput;

    }

    public int getInput() {
        return  number;
    }

    public void minimum() {
        if( number < minimum){
            minimum = number;
        }
    }

    public int getMinimum() {
        System.out.print( "smallest values : "+ minimum);
        return minimum;
    }


    public static void main(String[] args) {
        SmallestValue smallestValue = new SmallestValue();
        int limit = Integer.parseInt(JOptionPane.showInputDialog("number of values to be entered"));
        int counter=1;
        while(counter <= limit){
            smallestValue.input();
            smallestValue.minimum();
            counter++;
        }
        smallestValue.getMinimum();
    }
}
