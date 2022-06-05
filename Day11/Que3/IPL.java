package Que3;
import java.util.*;
public class IPL {
	public void homeTeamStadium(Stadium stadium) {
		switch(stadium) {
		case EDEN_GARDEN_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indian");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter stadium: ");
			String std=sc.next();
			Stadium stadium=Stadium.valueOf(std);
			IPL ipl=new IPL();
			ipl.homeTeamStadium(stadium);
		}
		
		catch(Exception e) {
			System.out.println("Enter proper stadium");
		}
		
		
	}
}
