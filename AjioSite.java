package assingment6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioSite {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");

		//Search bag and enter
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);

		//The number of ItemFound
		System.out.println("The number of Itemfound : "+driver.findElement(By.className("length")).getText() );

		//The number of Bags:
		List<WebElement> brandName = driver.findElements(By.className("brand"));
		System.out.println("The Number of Bags : "+brandName.size());
		//Brand Name
		for (WebElement eachElement : brandName) {
			System.out.println("The Brand name is : "+eachElement.getText());
		}

		//Bag Name
		List<WebElement> bagName = driver.findElements(By.className("nameCls"));
		for (WebElement eachElement : bagName) {
			System.out.println("The Bag name is : "+eachElement.getText());
		}
	}
}
