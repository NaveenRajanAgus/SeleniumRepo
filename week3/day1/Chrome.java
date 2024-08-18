package week3.day1;

public class Chrome {
	   public void openBrowser() {
	      System.out.println("Open Browser");
	   }

	   public void closeBrowser() {
	      System.out.println("Close Browser");
	   }

	   public void navigateURL() {
	      System.out.println("Navigate to URL");
	   }

	   public void clearCache() {
	      System.out.println("Clear Cache");
	   }

	   public static void main(String[] args) {
	      Chrome ch = new Chrome();
	      ch.openBrowser();
	      ch.navigateURL();
	      ch.closeBrowser();
	      ch.clearCache();
	   }
	}
	  