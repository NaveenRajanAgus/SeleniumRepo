package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.findElement(By.xpath("//a[contains(text(), 'FLIGHTS')]")).click();
        
        Set<String> aw = driver.getWindowHandles();
        System.out.println(aw);
        
        List<String> window = new ArrayList<String>(aw);
        String cw = driver.switchTo().window(window.get(1)).getTitle();
        System.out.println("Child window: " + cw);
        
        driver.close();
        driver.switchTo().window(window.get(0));
        String title1 = driver.getTitle();
        System.out.println("Parent window: " + title1);
    }
}