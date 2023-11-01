package test_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_.Cartpage;
import page_.Homepage;
import page_.Loginpage;
import page_.Scrolldown;

public class TestWebpage {
	WebDriver driver;
	@BeforeTest
	public void browse() {
		driver=new ChromeDriver();
	}
	@BeforeTest
	public void launch() {
		driver.get("https://noorchikankari.in/");
	}
	
	@Test
	public void testlogin() throws IOException  {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		Loginpage obj=new Loginpage(driver);
		obj.check();
		//obj.user();
		//obj.givevalue("Samily", "Sagar t","samilysasi453@gmail.com","Aysh@19");
		obj.login("samilysasi453@gmail.com", "Aysh@19");	
		Homepage objct=new Homepage(driver);
		objct.mouse();
		objct.purchase();
		Cartpage obje=new Cartpage(driver);
		obje.order("samilysasi453@gmail.com","Aysh","Sam","luminar","nilh(h),kochi","Kochi","685551", "9544692217");
		obje.search();
		obje.to_check();
		obje.windows();
		Scrolldown ob=new Scrolldown(driver);
		ob.scroll();
		
	}
}

