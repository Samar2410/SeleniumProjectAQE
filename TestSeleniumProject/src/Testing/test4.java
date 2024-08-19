package Testing;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Testing.SeleniumScripts.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 {
		@Test
		public void func4() {
			 System.setProperty("webdriver.gecko.driver", "C:\\Users\\samar\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		        
		        WebDriver driver = new FirefoxDriver();

		        try {
		          
		            driver.get("https://demoqa.com/automation-practice-form");

		            
		            driver.manage().window().maximize();

		         
		            QAFormPOM formPage = new QAFormPOM(driver);

		           
		            formPage.setFirstName("Samarvir");
		            formPage.setLastName("Singh");
		            formPage.setEmail("samarvirnarula@gmail.com");
		            formPage.selectGender();
		            formPage.setUserNumber("7710279071");
		            formPage.setDateOfBirth("November", "2002", "24");
		            formPage.setSubjects("Computer Science");
		            formPage.selectHobbies();
		            formPage.uploadPicture("E:\\Wallpapers\\WhatsApp Image 2022-10-14 at 11.04.17.jpeg");
		            formPage.setAddress("La Casa PG, Gurugram, Haryana");
		            formPage.selectState("Haryana");
		            formPage.selectCity("Panipat");
		            formPage.submitForm();
		            Thread.sleep(3000);
		            Assert.assertTrue(true);

		        } catch (Exception e) {
		            e.printStackTrace();
		            Assert.assertTrue(false);
		        } finally {
		          
		            driver.quit();
		        }
		}
}
