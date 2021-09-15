package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		WebElement lead = driver.findElement(By.linkText("Leads"));
		lead.click();
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("AMJ Technologies");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Ruth");
		String firstname = firstName.getAttribute("value");
		System.out.println("The First Name is: " + firstname);
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Kelly");
		WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNameLocal.sendKeys("ABC");
		WebElement lastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		lastNameLocal.sendKeys("DEF");
		WebElement salutation = driver.findElement(By.id("createLeadForm_personalTitle"));
		salutation.sendKeys("Miss");
		WebElement profileTitle = driver.findElement(By.id("createLeadForm_generalProfTitle"));
		profileTitle.sendKeys("LLLL");
		WebElement annualRevenue = driver.findElement(By.id("createLeadForm_annualRevenue"));
		annualRevenue.sendKeys("8,00,000");
		WebElement sicCode = driver.findElement(By.id("createLeadForm_sicCode"));
		sicCode.sendKeys("302");
		WebElement leadDescription = driver.findElement(By.id("createLeadForm_description"));
		leadDescription.sendKeys("kkkk");
		WebElement importantNote = driver.findElement(By.id("createLeadForm_importantNote"));
		importantNote.sendKeys("To be followed");
		WebElement departmentName = driver.findElement(By.id("createLeadForm_departmentName"));
		departmentName.sendKeys("Testing");
		WebElement employeeNum = driver.findElement(By.id("createLeadForm_numberEmployees"));
		employeeNum.sendKeys("50");
		WebElement tickerSymbol = driver.findElement(By.id("createLeadForm_tickerSymbol"));
		tickerSymbol.sendKeys("BRK.A");
		WebElement birthDate = driver.findElement(By.id("createLeadForm_birthDate"));
		birthDate.sendKeys("05/10/95");
		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("4");
		WebElement areaCode = driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		areaCode.sendKeys("210");
		WebElement phoneExtension = driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		phoneExtension.sendKeys("Ext");
		WebElement emailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailId.sendKeys("mnop9874@gmail.com");
		WebElement phoneNum = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		phoneNum.sendKeys("8985846321");
		WebElement contactPerson = driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		contactPerson.sendKeys("lisa");
		WebElement webUrl = driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		webUrl.sendKeys("https://www.jjjjj.com/");
		WebElement toName = driver.findElement(By.id("createLeadForm_generalToName"));
		toName.sendKeys("Ruth");
		WebElement attName = driver.findElement(By.id("createLeadForm_generalAttnName"));
		attName.sendKeys("ghju");
		WebElement addLine1 = driver.findElement(By.id("createLeadForm_generalAddress1"));
		addLine1.sendKeys("2,Street,Cross");
		WebElement addLine2 = driver.findElement(By.id("createLeadForm_generalAddress2"));
		addLine2.sendKeys("Area,City");
		WebElement city = driver.findElement(By.id("createLeadForm_generalCity"));
		city.sendKeys("Trichy");
		WebElement postalCode = driver.findElement(By.id("createLeadForm_generalPostalCode"));
		postalCode.sendKeys("620 014");
		WebElement postalExt = driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		postalExt.sendKeys("Ext");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select states = new Select(state);
		states.selectByIndex(5);
		WebElement createLeadButton = driver.findElement(By.name("submitButton"));
		createLeadButton.click();
		String title1 = driver.getTitle();
		System.out.println("Next Title: " + title1);
	}

}
