package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Locator_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/kiran/Desktop/Selenium%20files/Link.html");
	Thread.sleep(4000);
	WebElement ele=driver.findElement(By.tagName("a"));
	ele.click();
	//driver.findElement(By.tagName("a")).click();
	}

}
//to perform click action on a link by using tagname