package Que2;

public class Mobile {
	String [] outdatedModel= {"note4","note5","note6","note7"};
	public void searchOutdatedModel(String...args) {
		for(String items:args) {
			boolean flag=false;
			for(int i=0;i<outdatedModel.length;i++) {
				if(items.equals(outdatedModel[i])) {
					flag=true;
					break;
				}
			}
			if(flag) {
				System.out.println(items+"_OUTDATED");
			}
		}
	}
	
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.searchOutdatedModel("S21","note5","S22","note7");
	}
}
