package week1.day2;

public class Browser {
	   public String launchBrowser(String browserName) {
	      return browserName;
	   }

	   public void loadUrl() {
	      System.out.println("Application url loaded");
	   }

	   public static void main(String[] args) {
	      Browser b = new Browser();
	      b.loadUrl();
	      String launchBrowser = b.launchBrowser("Chrome");
	      System.out.println("Browser" + launchBrowser + " is launched successfully");
	   }

	   

}
