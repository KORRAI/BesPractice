import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PC007CollectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {45,6,18,9,23,13};
		
		ArrayList<Integer> ll = new ArrayList<>();
		for(int b : a) {
			ll.add(b);
		}
		
	
		  Collections.sort(ll);
		  
		  //Collections.reverse(ll);
		 
		
		System.out.println(ll);
		
		

	}

}
