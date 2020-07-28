package pruebas;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class bumeran {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHRISTIAN\\eclipse-workspace\\ej1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("D://SELENIUM//extension_4_17_0_0.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.bumeran.com.pe/");
		Actions actions = new Actions(driver);
		WebElement website = driver.findElement(By.id("busqueda"));
		actions.moveToElement(website);
		actions.click();
		actions.sendKeys("Some Name");
		actions.build().perform();
		
	}

}
