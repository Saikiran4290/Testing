package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class S_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		//Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='nav-line-2'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();// to handle mouse hover action
	}

}
