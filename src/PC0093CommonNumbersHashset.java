import java.util.HashSet;

public class PC0093CommonNumbersHashset {

	public static void main(String[] args) {
	 int a[]= {2,6,54,30,24};
	 
	 int b[]= {1,3,6,30,25};
	 
	 HashSet<Integer>hs =new HashSet<>();
	 
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=0;j<b.length;j++)
		 {
			  if(a[i]==b[j])
			  {
				  hs.add(a[i]);
			  }
		 }
	 }
		
	 for(int no:hs)
	 {
		 System.out.println(no);
	 }
	}

}
