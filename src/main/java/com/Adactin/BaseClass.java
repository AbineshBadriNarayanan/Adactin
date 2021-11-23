package com.Adactin;

import java.io.File;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver D;

	public static WebDriver browser(String url) {

		if (url.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			D = new ChromeDriver();
		}

		else if (url.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Driver\\firefoxdriver.exe");
			D = new FirefoxDriver();

		}

		else if (url.equalsIgnoreCase("Internetexplorer")) {
			System.setProperty("webdriver.internetexplorer",
					System.getProperty("user.dir") + "\\Driver\\internetexplorerdriver.exe");
			D = new InternetExplorerDriver();
		}

		else if (url.equalsIgnoreCase("Safari")) {
			System.setProperty("webdriver.Safari", System.getProperty("user.dir") + "\\Driver\\Safaridriver.exe");
			D = new SafariDriver();
		}

		else if (url.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera", System.getProperty("user.dir") + "\\Driver\\operadriver.exe");
			D = new OperaDriver();
		}

		else if (url.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge", System.getProperty("user.dir") + "\\Driver\\edgedriver.exe");
			D = new EdgeDriver();
		}

		D.manage().window().maximize();
		return D;
	}

	public static void sleep(int i) throws InterruptedException {
		Thread.sleep(i);
	}

	public static void get(String url) {
		D.get(url);

	}

	public static void sendkey(WebElement E, String F) {
		E.sendKeys(F);
	}

	public static void click(WebElement E) {
		E.click();

	}

	public static void quit() {
		
		D.quit();

	}
	public static void ts(String file) throws IOException {
	 TakesScreenshot TS = (TakesScreenshot) D;
	 File sou=TS.getScreenshotAs(OutputType.FILE);
	 File des=new File(System.getProperty("user.dir")+"\\Screenshot\\"+file);
	 FileUtils.copyFile(sou, des);
	 

	}
	public static void navigateto(String S) {
		D.navigate().to(S);
	}
	public static void navigateback() {
		D.navigate().back();
	}
	public static void navigateforward() {
		D.navigate().forward();
	}
	public static void navigaterefresh() {
		D.navigate().refresh();
	}
	public static void alert() {
		D.switchTo().alert();
	}
	public static void gettext(WebElement G) {
		G.getText();
		}
	public static void gettitle(String s) {
		D.getTitle();
		
		}
	public static void getcurrenturl(WebElement a, String s) {
		D.getCurrentUrl();
		
		}
	public static void getattribute(WebElement a, String s) {
		a.getAttribute(s);
		
		}
	public static void getpagesource(String s) {
		D.getPageSource();
		
		}
	public static void close() {
		D.close();
		
		}
	public static void implict() {
		D.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		}
	public static void explicit(WebElement E) {
		WebDriverWait T= new WebDriverWait(D, 30);
		T.until(ExpectedConditions.visibilityOf(E));
		
		
		}
	public static void action(WebElement b) {
     Actions a= new Actions(D);
     a.contextClick(b).build().perform();
    
	}
	public static void isenabled(WebElement a) {
		a.isEnabled();
		}
	public static void isselected(WebElement a) {
		a.isSelected();
		}
	public static void isdisplayed(WebElement a) {
		a.isDisplayed();
		}
	public static void Drop_Down(WebElement we, String str, String vt) {
		Select s = new Select(we);
		
		if (str.equalsIgnoreCase("byvalue")) {
			s.selectByValue(vt);
		}
		else if (str.equalsIgnoreCase("ByVisibleText")) {
			s.selectByVisibleText(vt);
		}
		
		else if (str.equalsIgnoreCase("ByIndex")){
			int parseInt = Integer.parseInt(vt);
			s.selectByIndex(parseInt);
		}
		else {
			s.isMultiple();
		}
	}
	
	public static void robot1() throws AWTException {
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);

	}
	
	public static void robot2() throws AWTException {
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static void Scroll_Down() {
		JavascriptExecutor js = (JavascriptExecutor) D;
		js.executeScript("window.scroll(0, 4000)", "");
	}
	
	public static void Scroll_ToEnd() {
		JavascriptExecutor js = (JavascriptExecutor) D;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	}
	
	public static void Scroll_Up() {
		JavascriptExecutor js = (JavascriptExecutor) D;
		js.executeScript("window.scroll(0, 0)", "");
	}
	
	public static void windowshandling(String s) {
		D.switchTo().window(s);
	}
}