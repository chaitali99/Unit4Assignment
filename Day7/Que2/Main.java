package Que2;

public class Main {
    public static void main(String[] args) {
        DaySchooler daySchooler = new DaySchooler(1,"Protyush",5000,2000);

        daySchooler.payFee(4000);

        Hosteller hosteller = new Hosteller(2,"Sayan",7000,1000);

        hosteller.payFee(5000);
    }

}
