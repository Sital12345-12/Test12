package Enn.Universe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestPro {

	public static void main(String[] arg) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://omayo.blogspot.com/");

		Thread.sleep(5000);
		// ebElement element=driver.findElement(By.id("textbox1"));
//element.clear();
		
// Retrieves the title of the page
		// String title=driver.getTitle();

// System.out.println("The title of the page : "+title);

		// String text = driver.findElement(By.xpath("//*[contains(text(), 'The cat was
		// playing in the garden.')]")).getText();
		// System.out.println(text);

		
		//retrive the Url of the current webpage 
		//String url1 = driver.getCurrentUrl();   
	//ystem.out.println("URL of the page : " + url1);
		
		
		driver.findElement(By.linkText("compendiumdev")).click();
		String url2 = driver.getCurrentUrl();
		System.out.println("URL of the page : " + url2);

	}
}





System.setProperty("webdriver.chrome.driver", path);
System.setPropery("webdriver.chrome.driver",path);

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.findElement(By.linkText(" ")).click();










































