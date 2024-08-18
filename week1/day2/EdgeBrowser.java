package week1.day2;

public class EdgeBrowser {
	   public static void main(String[] args) {
	      Browser b = new Browser();
	      b.loadUrl();
	      String launchBrowser = b.launchBrowser("Edge");
	      System.out.println("Browser" + launchBrowser + "is launched successfully");
	   }
}
