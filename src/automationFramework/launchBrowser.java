package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nilamma\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//CRM App
		driver.get("https://imcqa.crm.dynamics.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("nilamma@cybage.com");
		
		driver.findElement(By.xpath("//input[@id='idSIButton9']")).click();
		Thread.sleep(5000);
		/*WebElement loginPageLogo = driver.findElement(By.xpath("//span[@id='submitButton']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(loginPageLogo));*/
		
		driver.findElement(By.id("passwordInput")).click();
		
		driver.findElement(By.id("passwordInput")).sendKeys("cybage#123");
		
		driver.findElement(By.xpath("//span[@id='submitButton']")).click();
		
		driver.quit();
		
		/* ETK App
		//driver.get("https://staging.expotoolkit.com");
		//Login
		driver.findElement(By.linkText("Administrator Sign-in")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement loginPage = driver.findElement(By.id("txtUsername"));
		wait.until(ExpectedConditions.visibilityOf(loginPage));
		loginPage.sendKeys("shradhama@cybage.com");
		driver.findElement(By.id("txtPassword")).sendKeys("Ma45AzSd27");
		driver.findElement(By.id("cmdSubmit")).click();
		
		//Shows selection from list
		Select select_shows = new Select (driver.findElement(By.id("pagebody_cboMonths")));
		select_shows.selectByVisibleText("December 2020");
		
		*/		
		
		//driver.quit();
		System.out.println("Execution complete");
	}

}
