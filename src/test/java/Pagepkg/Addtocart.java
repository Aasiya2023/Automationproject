package Pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"sizeSelAddToCart\"]")  // Add to cart(Shoe)
    WebElement cart;
	
	@FindBy(xpath="//*[@id=\"primaryImage\"]")  //Colorbar click
    WebElement makeup;
	
	@FindBy(xpath="//*[@id=\"addToCartButton\"]")  //Add to cart(Colorbar)
    WebElement makeupcart;
	
	
	
	public Addtocart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addtocart()
	{
		cart.click();
	}
	public void makeupclick()
	{
		makeup.click();
	}
	public void makeupaddtocart()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"addToCartButton\"]")));
		makeupcart.click();
	}
}


