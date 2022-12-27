package Actions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class S_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
	    Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");	
		WebElement source = driver.findElement(By.id("box3"));
		WebElement destination = driver.findElement(By.id("box103"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();//to handle drag and drop action
	}

}
