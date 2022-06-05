package Que2;

public class DaySchooler extends Student{
    double transportFee;

    public DaySchooler(int stuId, String name, double examFee,double transportFee) {
        super(stuId, name, examFee);
        this.transportFee=transportFee;
    }


}
