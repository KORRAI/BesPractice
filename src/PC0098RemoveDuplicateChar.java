import java.util.HashSet;
import java.util.Set;

public class PC0098RemoveDuplicateChar {
	
	
	public static void main(String[] args) {
		
		String Str="Sandeep";
		

		System.out.print(RevomeDup(Str));
	}
	
	public static String RevomeDup(String Str) {
		
		
	Set<Character> set =new HashSet<>();
	StringBuffer sb =new StringBuffer();
	
	for(int i=0;i<Str.length();i++)
	{
		Character c =Str.charAt(i);
		
		if(!set.contains(c))
		{
			set.add(c);
			sb.append(c);
		}
	}
	
	return sb.toString();

}
}