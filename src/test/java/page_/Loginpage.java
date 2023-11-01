package page_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	//registration
	
	By logo=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[2]/h1/a/image-element[1]/img");
	
	By user=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[3]/div/div/a[1]");
	
	By createac=By.xpath("//*[@id=\"customer_register_link\"]");
	
	By frstname=By.xpath("//*[@id=\"FirstName\"]");
	
	By lstname=By.xpath("//*[@id=\"LastName\"]");
	
	By email=By.xpath("//*[@id=\"Email\"]");
	
	By pswrd=By.xpath("//*[@id=\"CreatePassword\"]");
	
	By submt=By.xpath("//*[@id=\"register-submit\"]");
	
	//login
	
	By username=By.xpath("//*[@id=\"CustomerEmail\"]");
	
	By secure=By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/input[4]");
	
	By smtbtn=By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/form[1]/p[1]/button[1]");
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public void check() {
		driver.findElement(logo).isDisplayed();
		System.out.println("logo is displayed");
	}
	public void user() {
		driver.findElement(user).click();
		driver.findElement(createac).click();		
	}
	public void givevalue(String frname,String lsname,String mail,String pswd) {
		driver.findElement(frstname).sendKeys(frname);
		driver.findElement(lstname).sendKeys(lsname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(pswrd).sendKeys(pswd);
		driver.findElement(submt).click();
				System.out.println("ac created succesfully");

	}
	public void login(String useName,String secPwd) {
		driver.findElement(user).click();
		driver.findElement(username).sendKeys(useName);
		driver.findElement(secure).sendKeys(secPwd);
		driver.findElement(smtbtn).click();
		System.out.println("Loggined succesfully");
	}
}
