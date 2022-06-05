package Que2;

public class Hosteller extends Student{
    double hostelFee;


    public Hosteller(int stuId, String name, double examFee, double hostelFee) {
        super(stuId, name, examFee);
        this.hostelFee=hostelFee;
    }

}
