package Que4;

public class AxisBank extends Bank{
    double rateOfInterest=7;

    public AxisBank(double rateOfInterest, String branchName, String ifscCode) {
        super(branchName,ifscCode);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    void displayDetails() {
        System.out.println("Branch Name: "+branchName+"\nIFSC Code: "+ifscCode+"\nRate Of Interest: "+rateOfInterest+"%");
    }

    void getCreaditCard(){
        System.out.println("Get the Credit Card from the Axis Bank");
    }

}
