package Que4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1) {
			System.out.println(fact(Integer.parseInt(args[0])));
		}else if(args.length==2) {
			System.out.println(fact(Integer.parseInt(args[1])));

		}else {
			System.out.println("Error");
		}
	}
	
	static int fact(int n) {
		int fact=1;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }

        return fact;
    

	}
}
