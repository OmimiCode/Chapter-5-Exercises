package Chapter5;

import java.util.Arrays;

public class FacebookUserBaseGrowth {
    double futureUserPopulation;
    double currentUserPopulation = 1_000_000_000; //Facebook hit one billion users in October 2012.
    double growthRate = 0.04; //per month @ 40%
    int month = 0;

    public void userBaseCalculationFor1_5BillionUsers() {
        System.out.printf("%s %22s %n", "Month", "User_Base_Growth per Month ");
        month = 0;//count from october 2012 to October 2021 (13 months)
        do {
            futureUserPopulation = currentUserPopulation * Math.pow(1.0 + growthRate, month);
            System.out.printf("%4d%,20.2f%n", month, futureUserPopulation);
            month++;
        }
        while (futureUserPopulation <= 1_500_000_000);
        System.out.println("  how many months will it take for Facebook to grow its user base to 1.5 billion users?\n" +
                "ANS :  " + (month-1) + " months  (October 2021  users base ~ " + futureUserPopulation + ")");
//         how many months will it take for Facebook to grow its user base to 1.5 billion users?
//        ANS :  11 months  (October 2021  users base ~1,539,454,056.32)

    }
    public void userBaseCalculationFor2BillionUsers(){
        System.out.printf("%s %22s %n", "Month", "User_Base_Growth per Month ");
        month = 0;//count from october 2012 to October 2021 (13 months)
        do {
            futureUserPopulation = currentUserPopulation * Math.pow(1.0 + growthRate, month);
            System.out.printf("%4d%,20.2f%n", month, futureUserPopulation);
            month++;
        }
        while (futureUserPopulation <= 2_000_000_000);
        System.out.println("  how many months will it take for Facebook to grow its user base to 1.5 billion users?\n" +
                "ANS :  "+(month-1)+ " months  (May 2022  users base ~ "+ futureUserPopulation +")");
        // how many months will it take for Facebook to grow its user base to 2 billion users?
        // ANS :  18 months  (May 2022  users base ~2,025,816,515.38)


    }


    public static void main(String[] args) {
        FacebookUserBaseGrowth facebookUserBaseGrowth = new FacebookUserBaseGrowth();
     facebookUserBaseGrowth.userBaseCalculationFor1_5BillionUsers();
        System.out.println();
        System.out.println("======================================== ");
        System.out.println();
        facebookUserBaseGrowth.userBaseCalculationFor2BillionUsers();

    }
}
