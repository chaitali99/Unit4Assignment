package Que2;

public class Student {
	
    int stuId;
    String name;
    double examFee;

    void displayDetails(){
        System.out.println(this.stuId);
        System.out.println(this.name);
        System.out.println(this.examFee);
    }

    double payFee(double amount){
        this.examFee-=amount;

        System.out.println("Due Amount of "+this.name+"'s Exam Fees Is: "+this.examFee);
        return this.examFee;
    }

    public Student(int stuId, String name, double examFee) {
        this.stuId = stuId;
        this.name = name;
        this.examFee = examFee;
    }


}
