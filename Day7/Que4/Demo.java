package Que4;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter The Name Of The Bank: ");
        String bank=sc.next();

        Bank bank1 = getBank(bank);

        //System.out.println(bank1 instanceof AxisBank);

        if(bank1 instanceof AxisBank){
            AxisBank a1 = (AxisBank) bank1;
            a1.getCreaditCard();
        }
        
    }
        
        public static Bank getBank(String bank){
            bank=bank.toUpperCase();
            if(bank.equals("AXIS")){
                AxisBank axisBank = new AxisBank(7,"Axis Bank Kolkata","1234");
                axisBank.displayDetails();

                return axisBank;
            }
            else if (bank.equals("ICICI")) {
                ICICIBank iciciBank = new ICICIBank(8,"ICICI Bank Salt Lake","5678");
                iciciBank.displayDetails();

                return iciciBank;
            }
            return null;
        }

}
