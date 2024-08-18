package week4.day1;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {

		String name="NaveenRajanAgustin";
	
		char[] ch = name.toCharArray();
		String empty="";
		
		Set<Character>unqi=new LinkedHashSet<Character>();
		
		for (char character : ch) {
			unqi.add(character);
		}
	
		for (Character s : unqi) {
			empty+=s;
		}
		System.out.print(empty);
	}

}