package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {
   public static void main(String[] args) {
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.leafground.com/alert.xhtml");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30L));
      driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
      Alert alert = driver.switchTo().alert();
      String text = alert.getText();
      System.out.println(text);
      alert.accept();
   }
}
   