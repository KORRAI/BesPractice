
public class PC006SortNumber {

	public static void main(String[] args) {
		int a[]= {45,6,18,9,23,13};
		
		
		for(int i=0;i<a.length;i++)
		{
			int temp;
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
