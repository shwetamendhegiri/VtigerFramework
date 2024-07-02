package Generic_Utilities;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	/**
	 * this method is used for maximizing window
	 * @param driver
	 * @author Shobha
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * this method is used to wait all elements to get loaded in GUI
	 * version3
	 * @param driver
	 */
	public void waitForElementToLoad(WebDriver driver)
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	/**
	 * this method is used to wait all elements to get loaded in GUI
	 * version4
	 * @param driver
	 */
	public void elementsToGetLoaded(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method is used to switch windows
	 * @param driver
	 * @param particalText
	 */
	public  void switchingWindows(WebDriver driver,String particalText)
	{
		 Set<String> wins = driver.getWindowHandles();
	      Iterator<String> it = wins.iterator();
	         while(it.hasNext())
	       {
	    	   String win = it.next();
	    	   driver.switchTo().window(win);
	    	   String currentTitle = driver.getTitle();
	    	   if(currentTitle.contains(particalText))
	    	   {
	    		   break;
	    	   }
	       }
	}
	/**
	 * this method is used to accept the alert popup
	 * @param driver
	 */
	public void alertAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/** this method is used to dismiss the alert popup
	 * 
	 * @param driver
	 */
	public void alertDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method is used to handle drop down using Select class(SelectByIndex)
	 * @param ele
	 * @param value
	 */
	public void selectByIndexApproch(WebElement ele, int value)
	{
		Select select = new Select(ele);
		select.selectByIndex(value);
	}
	
	/**
	 * this method is used to handle drop down using Select class(SelectByValue)
	 * @param ele
	 * @param value
	 */
	public void selectByValueApproch(WebElement ele, String value)
	{
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	
	/**
	 * this method is used to handle drop down using Select class(SelectByValue)
	 * @param ele
	 * @param value
	 */
	public void selectByVisibleTextApproch(WebElement ele, String text)
	{
		Select select = new Select(ele);
		select.selectByVisibleText(text);
	}
	
}



