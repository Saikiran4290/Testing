
package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assginment_01
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("file:///C:/Users/kiran/Desktop/Selenium%20files/pass the data.html");
	Thread.sleep(2000);
	driver.findElement(By.tagName("input")).sendKeys("Sai");
	driver.findElement(By.tagName("a")).click();
	
}

}
