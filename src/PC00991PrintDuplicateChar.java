
public class PC00991PrintDuplicateChar {

	public static void main(String[] args) {
		String Str= "Ravikorrai";
		
		
		 char[] Inp =Str.toCharArray();
		 
		 for(int i=0;i<Str.length();i++)
			 
		 {
			 for(int j=i+1;j<Str.length();j++)
				 
			 {
				 if(Inp[i]==Inp[j])
				 {
					 System.out.println(Inp[i]);
					 
					  
					  
				 }
			 }
		 }
		

	}

}
