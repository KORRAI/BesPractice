
public class PC002ConvertToyears {

	public static void main(String[] args) {
	int no = 789;
	 
	int years = no/365;
	  
	 no =no%365;
	 
	 int months= no/30;
	 
	 no=no%30;
	 
	 int days=no/7;
	  no =no%7;
	  
	  System.out.print("Years :months :Days :" +years +":"+months+":"+days);
	 
	 
	}

}
