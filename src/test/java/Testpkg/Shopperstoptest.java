package Testpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


import Basepkg.Shopperstopbase;
import Pagepkg.Addtocart;
import Pagepkg.Cart;
import Pagepkg.Homepage;

public class Shopperstoptest extends Shopperstopbase {
	
	
		@Test
		public void test() throws Exception
		{
			Actions act=new Actions(driver);
			Homepage s=new Homepage(driver);
			Addtocart s1=new Addtocart(driver);
			Cart s2=new Cart(driver);
			s.title_verification();
			s.Contentverification();
			s.logo_display();
			s.scrolldown();
			s.Screenshot();
			s.searchfield("Shoes");
			s.searchclick();
			s.filter();
			String parentwindow=driver.getWindowHandle();
			s.shoeclick();
			Set<String>allwindowhandles=driver.getWindowHandles();
			for(String handle:allwindowhandles)
			{
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					driver.switchTo().window(handle);
				    driver.navigate().refresh();
				    driver.close();			
			//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			//	act.perform();
			//	s1.addtocart();
				}
				driver.switchTo().window(parentwindow);
				
			}
			
		
			s.newsearch("Makeup");
			s.searchclick();
			s1.makeupclick();
			String parentwindow1=driver.getWindowHandle();
			Set<String>allwindowhandles1=driver.getWindowHandles();
			for(String handle1:allwindowhandles1)
			{
				if(!handle1.equalsIgnoreCase(parentwindow1))
				{
					
					driver.switchTo().window(handle1);
					driver.navigate().refresh();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
					s1.makeupaddtocart();
					act.perform();
					driver.close();
				}
				driver.switchTo().window(parentwindow1);
				driver.navigate().refresh();
				//s2.cart();
				
			}
			driver.quit();
			
			
			
		}
}


