package Que4;

public class ICICIBank extends Bank{
	
    double rateOfInterest;

    public ICICIBank(double rateOfInterest,String branchName, String ifscCode) {
        super(branchName, ifscCode);
        this.rateOfInterest=rateOfInterest;
    }

    @Override
    void displayDetails() {
        System.out.println("Get the Credit Card from the Axis Bank");
    }

}
