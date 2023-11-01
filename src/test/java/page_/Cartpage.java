package page_;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Cartpage {
	
	WebDriver driver;

	By mailSecond=By.xpath("//*[@id=\"email\"]");

	By frstName=By.name("firstName");

	By secondName=By.name("lastName");

	By cmpny=By.name("company");

	By adrs=By.xpath("//*[@id=\"shipping-address1\"]");

	By city=By.name("city");

	By state=By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/select[1]");

	By pinCode=By.name("postalCode");

	By phone=By.name("phone");

	By shippingMethod=By.xpath("//*[@id=\"billing_address_selector-shipping_address\"]");

	By saveInfo=By.id("save_shipping_information");

	By payNow=By.xpath("//*[@id=\"pay-button-container\"]");

	By homeIcon=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div/header/div[1]/div/h1/a");

	By searchIcon=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[1]/div[1]/a");

	By searchInput=By.xpath("//*[@id=\"Search\"]");

	By searchButton=By.xpath("//*[@id=\"SiteHeader\"]/div[2]/div/div/predictive-search/form/div[1]/button");

	By availability=By.xpath("//*[@id=\"CollectionSidebar\"]/div[1]/form/div[1]/div/button/span");

	By stock=By.xpath("//*[@id=\"CollectionSidebar-1-filter-availability\"]/div/ul/li[1]/label/span[1]");

	By checkBox=By.xpath("//*[@id=\"CollectionSidebar-1-filter-availability\"]/div/ul/li[1]/label/span[1]");

	By return_Home=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[2]/div/a/image-element[1]/img");

	By instaGram=By.xpath("//*[@id=\"shopify-section-sections--15413536161851__header\"]/div[3]/div[1]/div/div/div[2]/ul/li[1]/a");

	By logIn=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
	
	public Cartpage(WebDriver driver) {
		
	this.driver=driver;	
	}
	public void  order(String giveMail,String giveName,String scndName,String com,String addrs,String place,String pin,String phne) {
		driver.findElement(mailSecond).sendKeys(giveMail);
		driver.findElement(frstName).sendKeys(giveName);
		driver.findElement(secondName).sendKeys(scndName);
		driver.findElement(cmpny).sendKeys(com);
		driver.findElement(adrs).sendKeys(addrs);
		driver.findElement(city).sendKeys(place);
		WebElement drop = driver.findElement(state);
		drop.click();
		drop.sendKeys("Kerala");
		driver.findElement(pinCode).sendKeys(pin);
		driver.findElement(phone).sendKeys(phne);
		driver.findElement(shippingMethod).click();
		driver.findElement(payNow).click();
		System.out.println("redirected to payment gateway");
		driver.findElement(homeIcon).click();
	}
	public void search() {
		driver.findElement(searchIcon).click();
		driver.findElement(searchInput).sendKeys("kurta set");
		driver.findElement(searchButton).click();
		driver.findElement(availability).click();
		driver.findElement(stock).click();
	}
	//to check whether the check box selected or not
	public void to_check() throws IOException {
		WebElement box=driver.findElement(checkBox);
		File src=box.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshot//checkbox_1.png"));
		driver.findElement(return_Home).click();
		
	}
	public void windows() {
		String mainTab=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(instaGram).click();
		Set<String>multiplewind=driver.getWindowHandles();
		for(String handle:multiplewind) {
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(mainTab)) {
				driver.switchTo().window(handle);
				driver.findElement(logIn).click();
				driver.close();
			}
			driver.switchTo().window(mainTab);
			System.out.println("Windows handled succesfully");
		}
	}


}
