package Pagepkg;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
WebDriver driver;
	
    @FindBy(xpath="/html/body/main/header/div[1]/div/div[1]/div[2]/a/img[1]")
    WebElement logo;
    
	@FindBy(xpath="//*[@id=\"js-site-search-input\"]")  //Search Field
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"search_form_SearchBox\"]/div/input[2]")  //Search icon 
    WebElement searchbutton;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton0\"]")  //Drop down button of gender
    WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"Girls\"]")  // Tick box of girl under gender
    WebElement girlcolumn;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton1\"]")  // dropdown button of sole material
    WebElement solematerial;
	
	@FindBy(xpath="//*[@id=\"EVA\"]")  // Tick box of Eva in sole material
    WebElement eva;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton2\"]")  // dropdown button of warranty
    WebElement warranty;
	
	@FindBy(xpath="//*[@id=\"6 Months From Purchase\"]")  // Tick box of Warranty
    WebElement warrantymonth;
	
	@FindBy(xpath="//*[@id=\"product-facet\"]/div/div/a[2]")  // Show more link
    WebElement showmore;
	
	@FindBy(xpath="//*[@id=\"dropdownMenuButton4\"]")  // Material dropdown button
    WebElement material;
	
	@FindBy(xpath="//*[@id=\"Fabric\"]")  // Tick box of Fabric in Material dropdown
    WebElement fabric;
	
	@FindBy(xpath="//*[@id=\"primaryImage\"]")  // Shoe click
    WebElement shoe;
	
	
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void title_verification()
	{
		String actualtitle=driver.getTitle();
		System.out.println("actual title");
		String expectedtitle="SHOPPERS STOP";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Title is verified!");
		}
		else
		{
			System.out.println("Title is incorrect");
		}
	}
	public void Contentverification()
	{
		String content=driver.getPageSource();
		if(content.contains("Bargains"))
		
			{
				System.out.println("The page contains the word 'Bargains'");
			}
			else
			{
				System.out.println("The page does not contain the word 'Bargains'");
			}
		}
	
	public void logo_display()
	{
		boolean bn=logo.isDisplayed();
		if(bn)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
	}
		public void scrolldown()
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1200)","");
			System.out.println("Scrolled down Successfully!");
		}
		public void Screenshot() throws Exception
		{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("E:\\screenshotes.png"));
		}
		
	
	public void searchfield(String productname)
	{
		search.click();
		search.sendKeys(productname);
	}
	public void searchclick()
	{
		searchbutton.click();
	}
	public void filter()
	{
		dropdown.click();
		girlcolumn.click();
		solematerial.click();
		eva.click();
		warranty.click();
		warrantymonth.click();
		showmore.click();
		material.click();
		fabric.click();
	}
	public void shoeclick() throws InterruptedException
	{
		shoe.click();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	Thread.sleep(2000);
	}
	
	public void newsearch(String productname2)
	{
		search.click();
		search.sendKeys(productname2);
	}
	
	
	}




