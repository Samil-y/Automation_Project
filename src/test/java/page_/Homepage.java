package page_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
WebDriver driver;
	
	By fabric=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[3]/details[1]/summary[1]");
	
	By material=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[3]/details[1]/ul[1]/li[2]/a[1]");
	
	By red=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div/div/div[2]/div/div/div[1]/div[2]/div[1]/div[1]/div/a");
	
	By condition=By.xpath("//*[@id=\"CartTermsDrawer\"]");
	
	By checkout=By.xpath("//*[@id=\"CartDrawerForm\"]/div[2]/div[2]/div[5]/button");
	
	By add=By.xpath("//*[@id=\"AddToCartForm-template--15413535965243__main-7203140436027\"]/div[1]/button");
	
	By bag=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[3]/div/div/a[3]/span");
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	public void mouse() {
		Actions act=new Actions(driver);
		WebElement m=driver.findElement(fabric);
		act.moveToElement(m).perform();
		driver.findElement(material).click();
		driver.findElement(red).click();
		System.out.println("product selected succesfully");
	}
	public void purchase() {
		driver.findElement(add).click();
		driver.findElement(bag).click();
		driver.findElement(condition).click();
		driver.findElement(checkout).click();
		System.out.println("succesfully added to cart");
	}
		
}
