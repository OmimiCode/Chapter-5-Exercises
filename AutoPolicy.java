package Chapter5;

// Fig. 5.11: AutoPolicy.java
// Class that represents an auto insurance policy.
public class AutoPolicy{
    private int accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation
    // constructor
    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    // sets the accountNumber
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    // returns the accountNumber
    public int getAccountNumber(){
        return accountNumber;
    }
    // sets the makeAndModel
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }
    // returns the makeAndModel
    public String getMakeAndModel(){
        return makeAndModel;
    }// sets the state
    public void setState(String state){
        this.state = state;
    }
    // returns the state
    public String getState(){
        return state;
    }
    // predicate method returns whether the state has no-fault insurance
    public boolean isNoFaultState(){
        boolean noFaultState;
// determine whether state has no-fault auto insurance
        switch (getState()){ // get AutoPolicy object's state abbreviation
            case "MA":
                case "NJ":
                    case "NY":
                        case "PA":
                            case "CT":
                                case "NH":
                                    case "VT":
                                        case "ME":

if(state=="MA"||state=="MA"||state=="MA"||state=="MA"||state==""||state=="NH"||state=="VT"||state=="ME"){
                noFaultState = true;
            }else {
    noFaultState = false;
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + getState());
        }
        return noFaultState;
    }
// end class AutoPolicy


// Fig. 5.12: AutoPolicyTest.java
// Demonstrating Strings in switch.
//public class AutoPolicyTest
//{
public static void policyInNoFaultState(AutoPolicy policy){
    System.out.println("The auto policy:");
    System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is": "is not") );
}
    public static void main(String[] args){
// create two AutoPolicy objects
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ" );
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME" );
        // display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }
    // method that displays whether an AutoPolicy
// is in a state with no-fault auto insurance

} // end class AutoPolicyTest