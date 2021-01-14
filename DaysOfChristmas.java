package Chapter5;

import java.util.Scanner;

public class DaysOfChristmas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any day between 1-12");
        int day = input.nextInt();

        if (day>=1 && day<=12) {
            switch (day) {
                case 12:
                    if (day == 12) {
                        System.out.println("On the twelfth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "12 Drummers Drumming\n" +
                                "Eleven Pipers Piping\n" +
                                "Ten Lords a Leaping\n" +
                                "Nine Ladies Dancing\n" +
                                "Eight Maids a Milking\n" +
                                "Seven Swans a Swimming\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 11:
                    if (day == 11) {
                        System.out.println("On the eleventh day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Eleven Pipers Piping\n" +
                                "Ten Lords a Leaping\n" +
                                "Nine Ladies Dancing\n" +
                                "Eight Maids a Milking\n" +
                                "Seven Swans a Swimming\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 10:
                    if (day == 10) {
                        System.out.println("On the tenth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Ten Lords a Leaping\n" +
                                "Nine Ladies Dancing\n" +
                                "Eight Maids a Milking\n" +
                                "Seven Swans a Swimming\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 9:
                    if (day == 9) {
                        System.out.println("On the ninth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Nine Ladies Dancing\n" +
                                "Eight Maids a Milking\n" +
                                "Seven Swans a Swimming\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree ");
                        break;
                    }
                case 8:
                    if (day == 8) {
                        System.out.println("On the eighth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Eight Maids a Milking\n" +
                                "Seven Swans a Swimming\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 7:
                    if (day == 7) {
                        System.out.println("On the seventh day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Seven Swans a Swimming\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 6:
                    if (day == 6) {
                        System.out.println("On the sixth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Six Geese a Laying\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 5:
                    if (day == 5) {
                        System.out.println("On the fifth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Five Golden Rings\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 4:
                    if (day == 4) {
                        System.out.println("On the fourth day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Four Calling Birds\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 3:
                    if (day == 3) {
                        System.out.println("On the third day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Three French Hens\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree\n");
                        break;
                    }
                case 2:
                    if (day == 2) {
                        System.out.println("On the second day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "Two Turtle Doves\n" +
                                "and a Partridge in a Pear Tree");
                        break;
                    }
                case 1:
                    if (day == 1) {
                        System.out.println("On the first day of Christmas\n" +
                                "my true love sent to me:\n" +
                                "A Partridge in a Pear Tree");
                        break;
                    }
                default:
                    System.out.println("invalid day input");
            }
        }
            else
            System.out.println("enter values between 1 to 12");
        }
    }

