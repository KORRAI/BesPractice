import java.util.Arrays;

public class PC0095MinNumber {

	public static void main(String[] args) {
		int a[]= {45,2,4,78,5};
		Arrays.sort(a);
		System.out.println("--least--"+a[a.length-1]);
		
		int min =a[0];
		
		for(int i=1;i<a.length;i++)
			
		{
			if(a[i]<min)
				
			{
				min=a[i];
			}
		}
		System.out.print(min);

	}

}
