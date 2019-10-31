
public class PC0096MaxNumber {

	public static void main(String[] args) {
		int a[] = {3,56,1,45,39};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++ )
		{
			if(a[i]>max)
				
				max=a[i];
		}
       System.out.print(max);
	}

}
