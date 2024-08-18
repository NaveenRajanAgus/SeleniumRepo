package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
   public static void main(String[] args) {
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30L));
      driver.switchTo().frame("iframeResult");
      driver.findElement(By.xpath("//button[text()='Try it']")).click();
      Alert alert = driver.switchTo().alert();
      String message = alert.getText();
      System.out.println("Actual Message on the screen: " + message);
      alert.accept();
   }
}