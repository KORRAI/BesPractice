
public class PC0097ReveseNumber {

	public static void main(String[] args) {
		int  no=568;
		int rev=0,rem;
		while(no!=0)
		{
			rem= no%10;
			rev=rev*10+rem;
			no=no/10;
			
			
		}
		
		System.out.print(rev);
	}

}
