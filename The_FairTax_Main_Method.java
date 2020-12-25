package Chapter5;

public class The_FairTax_Main_Method {
    public static void main(String[] args) {
        Tax_Plan_Alternatives fairTaxMain = new Tax_Plan_Alternatives();
        //collect user expenses by categories
        fairTaxMain.housingExpenses();
        fairTaxMain.foodExpenses();
        fairTaxMain.clothingExpenses();
        fairTaxMain.transportationExpenses();
        fairTaxMain.educationExpenses();
        fairTaxMain.healthCareExpenses();
        fairTaxMain.vacationExpenses();

        fairTaxMain.totalExpenses();
        fairTaxMain.taxation();
        fairTaxMain.displayDetails();

    }
}
