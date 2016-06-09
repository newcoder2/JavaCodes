package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//l.enriquez.rodriguez//Documents//Eclipse Projects//chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://accounts.google.com/ServiceLogin?hl=es-419&passive=true&continue=https://www.google.com.mx/%3Fgfe_rd%3Dcr%26ei%3DF9ZZV4u5MKXU8ge3vb64Dw%26gws_rd%3Dssl#identifier");
		driver.findElement(By.id("Email")).sendKeys("luis.rodriguez@pearson.com");
		driver.findElement(By.id("next")).click();
		System.out.println("Gmail access has been completed");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Person Cloud
		driver.findElement(By.id("UsernameTextBox")).sendKeys("vrodrlu");
		driver.findElement(By.id("PasswordTextBox")).sendKeys("Welcome1");
		driver.findElement(By.id("SubmitButton")).click();
		System.out.println("Pearson Cloud will start");
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		String linkEmailValue = driver.findElement(By.linkText("Correo")).getText();
		
		if (linkEmailValue.equalsIgnoreCase("Correo")){
			System.out.println("Spanish Version");
			driver.findElement(By.linkText("Correo")).click();
		}
		else
		{
			driver.findElement(By.linkText("Mail")).click();
			System.out.println("English Version");
		}
		
		//"https://mail.google.com/mail/?tab=wm"
		
		
			
		
		
		
		
		
		
	}

}
