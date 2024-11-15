package genericutility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.reactivex.rxjava3.functions.Action;

public class WebDriverUtility {
	private String frameElement;
	/**
	 * This method is used to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/**
	 * This is used to capture the size of the window
	 * @param driver
	 * @return
	 */
	
	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();
	}
	/**
	 * This is used to switch driver control to window based on url
	 * @param driver
	 * @param url
	 */
	
public void switchToWindow(WebDriver driver,String url) {
	//step 1: capture window ids
	Set<String> allWindowIds = driver.getWindowHandles();
	//step 2: navigate through all the windows
	for(String id:allWindowIds) {
		driver.switchTo().window(id);
		String acturl=driver.getCurrentUrl();
		if(acturl.contains(url)) {
			break;
		}
	}	
}
public void rightClick(WebDriver driver) {
	Actions act=new Actions(driver);
	act.contextClick().perform();
}
public void clickAndHold(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.clickAndHold(element).perform();
}
public void mouseHover(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
}
public void mouseHover(WebDriver driver,int x,int y) {
	Actions act=new Actions(driver);
	act.moveByOffset(x,y).perform();
}
public void dragAndDrop(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.dragAndDrop(element, element).perform();
}
public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}
public void switchToFrame(WebDriver driver,String nameorId) {
	driver.switchTo().frame(nameorId);
}
public void switchToFrame(WebDriver driver,WebElement frameElement) {
	driver.switchTo().frame(frameElement);
}
public void selectDropDownByIndex(WebElement element,int index) {
	Select sel = new Select(element);
	sel.selectByIndex(index);
}
public void selectDropDownByValue(WebElement element,String value) {
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void selectDropDownByVisibleText(WebElement element,String text) {
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}
public void switchBackToMainPage(WebDriver driver) {
	driver.switchTo().defaultContent();
}
public Alert switchToAlert(WebDriver driver) {
	return driver.switchTo().alert();
}
public void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void switchToAlertAndDismiss(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
public void switchToAlertAndSendKeys(WebDriver driver,String data) {
	driver.switchTo().alert().sendKeys(data);
}
}
