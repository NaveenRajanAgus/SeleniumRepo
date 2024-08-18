package week4.day2;



	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ScrollAction {
	    public static void main(String[] args) {
	        ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.telerik.com/");
	        
	        WebElement element = driver.findElement(By.xpath("//h2[text()='Your Success is Our Success']"));
	        Actions opt = new Actions(driver);
	        opt.scrollToElement(element).perform();
	    }
	}

