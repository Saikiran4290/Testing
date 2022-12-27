package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Facebook_login
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("9663984283");
	driver.findElement(By.id("pass")).sendKeys("Hiremani@4290");
	driver.findElement(By.name("login")).click();
	
	}

}
