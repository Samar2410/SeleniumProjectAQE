package Testing;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class test3 {
@Test
public void func3() {
	 try {
  	   
	       
	        WebDriver driver =new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\samar\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			
	    
			 driver.get("https://demoqa.com/automation-practice-form");

		      
		        driver.manage().window().maximize();

		      
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		       
		        driver.findElement(By.id("firstName")).sendKeys("Samarvir");
		        driver.findElement(By.id("lastName")).sendKeys("Singh");
		        driver.findElement(By.id("userEmail")).sendKeys("samarvirnarula@gmail.com");

		     
		        WebElement genderRadioButton = driver.findElement(By.xpath("//label[text()='Male']"));
		        js.executeScript("arguments[0].click();", genderRadioButton);

		        driver.findElement(By.id("userNumber")).sendKeys("7710279071");

		       
		        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
		        js.executeScript("arguments[0].click();", dateOfBirthInput);
		        WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
		        Select monthSelect = new Select(monthDropdown);
		        monthSelect.selectByVisibleText("November");

		        WebElement yearDropdown = driver.findElement(By.className("react-datepicker__year-select"));
		        Select yearSelect = new Select(yearDropdown);
		        yearSelect.selectByVisibleText("2002");

		        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='24']"));
		        js.executeScript("arguments[0].click();", day);

		      
		        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
		        subjectsInput.sendKeys("Computer Science");
		        subjectsInput.sendKeys(Keys.ENTER);

		        
		  

		        WebElement musicCheckbox = driver.findElement(By.xpath("//label[text()='Music']"));
		        js.executeScript("arguments[0].click();", musicCheckbox);

		     
		        driver.findElement(By.id("uploadPicture")).sendKeys("E:\\Wallpapers\\WhatsApp Image 2022-10-14 at 11.04.17.jpeg");

		   
		        driver.findElement(By.id("currentAddress")).sendKeys("La Casa PG , Gurugram , Haryana");

		      
		        WebElement state = driver.findElement(By.id("react-select-3-input"));
		        state.sendKeys("Haryana");
		        state.sendKeys(Keys.ENTER);

		        WebElement city = driver.findElement(By.id("react-select-4-input"));
		        city.sendKeys("Panipat");
		        city.sendKeys(Keys.ENTER);

		  
		        WebElement submitButton = driver.findElement(By.id("submit"));
		        js.executeScript("arguments[0].click();", submitButton);
		        	
		        Assert.assertTrue(true);

	       
	       // driver.quit();
	       }
	       catch(Exception e) {
	    	   e.printStackTrace();
	    	   Assert.assertTrue(false);
	       }
}
}
