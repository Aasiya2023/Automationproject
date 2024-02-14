package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
WebDriver driver;
	
	@FindBy(xpath="/html/body/main/header/div[1]/div/div[2]/div[2]/ul/li[3]/a/i")  //Cart
    WebElement cart1;
	
	//@FindBy(xpath="/html/body/main/div[19]/section/div/div[2]/div/div/div[2]/div/ul/li/a")  //Continue shopping link
   // WebElement link;
	
	public Cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cart()
	{
		
		cart1.click();
		//link.click();
	}
}
