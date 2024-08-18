package week3.day1;


public class Safari {
   public void readerMode() {
      System.out.println("Reader mode");
   }

   public void fullScreenMode() {
      System.out.println("Full Screen mode");
   }

   public static void main(String[] args) {
      Safari sf = new Safari();
      sf.openURL();
      sf.closeBrowser();
      sf.navigateBack();
      sf.readerMode();
      sf.fullScreenMode();
   }

   private void navigateBack() {
   }

   private void closeBrowser() {
   }

   private void openURL() {
   }
}