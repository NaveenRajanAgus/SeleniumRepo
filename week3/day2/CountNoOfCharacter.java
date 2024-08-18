package week3.day2;

public class CountNoOfCharacter {
	   public static void main(String[] args) {
	      String text = "TestLeaf";
	      int count = 0;

	      for(int i = 0; i < text.length(); ++i) {
	         if (text.charAt(i) == 'e') {
	            ++count;
	         }
	      }

	      System.out.println("Number of occurrences of 'e': " + count);
	   }
	}