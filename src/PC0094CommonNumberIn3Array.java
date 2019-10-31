import java.util.ArrayList;

public class PC0094CommonNumberIn3Array {

	public static void main(String[] args) {
		 int a1[]= {2,7,9,10,15};
		 
		 int a2[]= {7,13,14,15};
		 
		 int a3[]= {9,13,15,17};
		 
		 int x=0,y=0,z=0;
		 ArrayList<Integer> al=new ArrayList<>();
		 while(x<a1.length && y<a2.length && z<a3.length)
		 
		 {
		 if(a1[x]==a2[y] && a2[y]==a3[z])
			 
		 {
			 al.add(a1[x]);
			 
			 x++;
			 y++;
			 z++;
		 }
		 
		 else if (a1[x] < a2[y])
				x++;
			else if (a2[y] < a3[z])
				y++;
			else
				z++;
		 } 
		 
	

	for(int no:al)
	{
	System.out.println(no);
	}
}

}