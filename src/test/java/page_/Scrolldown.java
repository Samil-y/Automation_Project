package page_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolldown {
WebDriver driver;
	
	By Scroll=By.xpath("//body/div[@id='PageContainer']/div[1]/div[3]/footer[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]");
	
	By homeImg=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div[1]/div[2]/div/a/image-element[1]/img");
	public Scrolldown(WebDriver driver) {
		this.driver=driver;
	}
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(Scroll));
		driver.findElement(Scroll).click();
		driver.findElement(homeImg).click();
		
		
	}
}
