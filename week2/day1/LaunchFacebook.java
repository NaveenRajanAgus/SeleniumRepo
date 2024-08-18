package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {
   public static void main(String[] args) {
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/login/");
      driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"testuser"});
      driver.findElement(By.name("pass")).sendKeys(new CharSequence[]{"password"});
      driver.findElement(By.name("Login")).click();
      driver.findElement(By.linkText("Find Your Account and log in")).click();
      driver.close();
   }
}
