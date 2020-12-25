package Chapter5;

import javax.swing.*;

/*5.32 (Tax Plan Alternatives; The “FairTax”) There are many proposals to make taxation fairer.
        Check out the FairTax initiative in the United States at www.fairtax.org . Research how the pro-
        posed FairTax works. One suggestion is to eliminate income taxes and most other taxes in favor of
        a 23% consumption tax on all products and services that you buy. Some FairTax opponents ques-
        tion the 23% figure and say that because of the way the tax is calculated, it would be more accurate
        to say the rate is 30%—check this carefully. Write a program that prompts the user to enter expenses
        in various expense categories they have (e.g., housing, food, clothing, transportation, education,
        health care, vacations), then prints the estimated FairTax that person would pay.*/
public class Tax_Plan_Alternatives {

    private double housingExpenses;
    private double foodExpenses;
    private double clothingExpenses;
    private double transportationExpenses;
    private double educationExpenses;
    private double healthCareExpenses;
    private double vacationExpenses;
    private double totalExpenses = 0 ;
    private double taxation;
    private String details;

    public void housingExpenses() {
        double housingExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Housing Expenses"));
        this.housingExpenses = housingExpenses;
    }

    public double getHousingExpenses() {

        return housingExpenses;
    }

    public void foodExpenses() {
        double foodExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Food Expenses"));
        this.foodExpenses = foodExpenses;
    }

    public double getFoodExpenses() {
        return foodExpenses;
    }

    public void clothingExpenses() {
        double clothingExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Clothing Expenses"));
        this.clothingExpenses = clothingExpenses;
    }

    public double getClothingExpenses() {
        return clothingExpenses;
    }

    public void transportationExpenses() {
        double transportationExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Transportation Expenses"));
        this.transportationExpenses = transportationExpenses;
    }

    public double getTransportationExpenses() {
        return transportationExpenses;
    }

    public void educationExpenses() {
        double educationExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Education Expenses"));
        this.educationExpenses = educationExpenses;
    }

    public double getEducationExpenses() {
        return educationExpenses;
    }

    public void healthCareExpenses() {
        double healthCareExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Health Care Expenses"));
        this.healthCareExpenses = healthCareExpenses;
    }

    public double getHealthCareExpenses() {
        return healthCareExpenses;
    }

    public void vacationExpenses() {
        double vacationExpenses = Double.parseDouble(JOptionPane.showInputDialog("Enter Vacation Expenses"));
        this.vacationExpenses = vacationExpenses;
    }

    public double getVacationExpenses() {
        return vacationExpenses;
    }



    public void totalExpenses() {
//        foodExpenses();
//        vacationExpenses();
//        clothingExpenses();
//        healthCareExpenses();
//        educationExpenses();
//        transportationExpenses();
//        housingExpenses();
        totalExpenses+=vacationExpenses+healthCareExpenses+educationExpenses+transportationExpenses+clothingExpenses+foodExpenses+housingExpenses;
    }

    public double  getTotalExpenses() {
        return totalExpenses;
    }

    public void taxation() {
//        totalExpenses();
        this.taxation =  totalExpenses * 0.3;

    }

    public double getTaxation() {
        return taxation;

    }

    public void details() {
//        taxation();
        String Of_Taxation = Double.toString(taxation);
        String details = (String.valueOf(JOptionPane.showConfirmDialog(null,
                "your overall tax is $"+ (Of_Taxation)+ " with the total expenses of $"+totalExpenses)));
        this.details = details;
    }


    public String displayDetails() {
        details();
        return details;
    }
}
