
public class PC0092CommonNumbersIn2Array {

	public static void main(String[] args) {
		int a[] = {2,7,9,10,17,17};
		
		int b[]= {4,6,9,10,17};
		
		for(int i=0;i<a.length;i++)
			
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
	}

}
