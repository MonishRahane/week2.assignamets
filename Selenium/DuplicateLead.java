package week2.day2.seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) {
		//Initializing chromedriver using webdriver manager
		WebDriverManager.chromedriver().setup();
		
		//Creating object for chromedriver and maximizing the chrome
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launching URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Entering UserName and Password Using Id Locator
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		WebElement elementPassword= driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		//Clicking on Login Button using Class Locator
		WebElement elementLoginBtn = driver.findElement(By.className("decorativeSubmit"));
		elementLoginBtn.click();
		 
		//Clicking on CRM/SFA Link
		WebElement elementCrmsfa= driver.findElement(By.linkText("CRM/SFA"));
		elementCrmsfa.click();
		
		//Clicking on Leads Button
		WebElement elementLeads= driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		
		//Clicking on Create Lead
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		
		//Entering CompanyName Field Using id Locator
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("Stark Industries");
		
		//Entering FirstName Field Using id Locator
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Monish");
		
		//Entering LastName Field Using id Locator
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Rahane");
		
		//Entering FirstName(Local) Field Using id Locator
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("Monish");
		
		//Entering Department Field Using name Locator 
		WebElement elementDepartmentName = driver.findElement(By.name("departmentName"));
		elementDepartmentName.sendKeys("Computer");
		
		//Entering Description Field Using name Locator
		WebElement elementDescription = driver.findElement(By.name("description"));
		elementDescription.sendKeys("Expert in handling the computer administrative safegaurds");
		
		//Entering your email in the E-mail address Field using id locator
		WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailAddress.sendKeys("monishrahane@gmail.com");
		
		//Selecting State/Province as New York Using Visible Text
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD = new Select(elementState);
		stateDD.selectByVisibleText("New York");
		
		//Clicking on Create Button
		WebElement elementCreateBtn = driver.findElement(By.name("submitButton"));
		elementCreateBtn.click();
		
		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());
		
		//Clicking on Duplicate button
		WebElement elementDuplicateLead = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicateLead.click();
		
		//Clearing the CompanyName Field using .clear() And Enter new CompanyName
		WebElement elementEditCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementEditCompanyName.clear();
		elementEditCompanyName.sendKeys("Mark Industries");
		
		//Clearing the FirstName Field using .clear() And Enter new FirstName
		WebElement elementEditFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementEditFirstName.clear();
		elementEditFirstName.sendKeys("Saskue");
		
		//Clicking on create lead button
		WebElement elementCreateLeadBtn = driver.findElement(By.name("submitButton"));
		elementCreateLeadBtn.click();
		
		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());
	}
}
