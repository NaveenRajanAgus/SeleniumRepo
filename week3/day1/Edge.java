package week3.day1;

public class Edge {
	   public void takeSnap() {
	      System.out.println("Take snap");
	   }

	   public void clearCookies() {
	      System.out.println("Clear cookies");
	   }

	   public static void main(String[] args) {
	      Edge ed = new Edge();
	      ed.openURL();
	      ed.closeBrowser();
	      ed.clearCookies();
	      ed.takeSnap();
	      ed.navigateBack();
	   }

	   private void openURL() {
	   }

	   private void closeBrowser() {
	   }

	   private void navigateBack() {
	   }
	}