package week3.day1;

public class MethodOverLoading {
	   public void data(int num) {
	      System.out.println(num);
	   }

	   public void data(int age, String Name) {
	      System.out.println(age + " " + Name);
	   }

	   public void data(String Place, boolean t) {
	      System.out.println(Place + " " + t);
	   }

	   public static void main(String[] args) {
	      MethodOverLoading ml = new MethodOverLoading();
	      ml.data(10);
	      ml.data(26, "Agus");
	      ml.data("duraa", true);
	   }
	}