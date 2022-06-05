package Que4;

public class Bank {
    String branchName;
    String ifscCode;

    public Bank(String branchName, String ifscCode) {
        this.branchName = branchName;
        this.ifscCode = ifscCode;
    }

    void displayDetails(){
        System.out.println(this.branchName+"\n"+this.ifscCode);
    }

}
