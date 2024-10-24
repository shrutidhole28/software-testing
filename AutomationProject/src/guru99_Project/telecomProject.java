package guru99_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class telecomProject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		
		b.get("https://demo.guru99.com/telecom/index.html");
		//Add Customer
		b.findElement(By.linkText("Add Customer")).click();
		Thread.sleep(2000);
		b.findElement(By.id("pending")).click();
		Thread.sleep(1000);
		b.findElement(By.id("fname")).sendKeys("shrutika");
		b.findElement(By.id("lname")).sendKeys("dhole");
		Thread.sleep(1000);
		b.findElement(By.id("email")).sendKeys("shrutika12@gmail.com");
		Thread.sleep(1000);
		b.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("pune");
		Thread.sleep(1000);
		b.findElement(By.id("telephoneno")).sendKeys("8647373738");
		Thread.sleep(1000);
		b.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		
		WebElement d=b.findElement(By.tagName("table"));
		String detail=d.getText();
		System.out.println(detail);
		Thread.sleep(1000);
		b.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		b.close();

	}

}
