package com.omrbranch.baseclasss;


	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellType;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;


	public class BaseClass {
		
		protected static WebDriver driver;
			
			public void Thread() throws InterruptedException {
				
				Thread.sleep(3000);
			
			}
			
			// 1. Enter the url
			
			public static void applnUrl(String Url) {

				driver.get(Url);
	 		}
			
			// 2. Maximize the window

			public static void applnMaximize() {

				driver.manage().window().maximize();
			}
			
			// 3. Insert value in text box

			public void elementSendkeys(WebElement element, String data) {
				explicitWait(element);
				boolean enabled = element.isEnabled();
				boolean displayed = element.isDisplayed();
				if (enabled && displayed) {
					element.sendKeys(data);				
				} 
			}
			
			// 3.1. Insert value in text box
			public void elementSendKeysandEnter(WebElement element, String data) {
				explicitWait(element);
				boolean enabled = isEnabled(element);
				boolean displayed = isDisplayed(element);
				if (enabled && displayed) {
					element.sendKeys(data, Keys.ENTER);
				}
				
			}

			// 4. Element click

			public void clickBtn(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				boolean enabled = element.isEnabled();
				if (displayed && enabled) {
					element.click();
				}
				
			}
			
			// 5. Click OK in alert

			public void alertAccept() {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}
			
			// 6. Click cancel in alert

			public void alertCancel(Alert b) {
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
			}
			
			// 7. Get the text from web page

			public String getText(WebElement element) {
				String res=null;
				res = element.getText();
				return res;
				
			}
			
			// 8. Get the inserted value from the text box

			public String insertValue(WebElement element, String data) {
				explicitWait(element);
				String value= null;
				boolean displayed = element.isDisplayed();
				if (displayed) {
					String attribute = element.getAttribute(data);
				}
				return value;

			}
			
			// 9.Close all windows

			public static void closeWindow() {

				driver.quit();
			}
			
			// 10. Close current window

			public static void closeCurrentW() {

				driver.close();
			}
			
			// 11. Get the title

			public String getTitle() {

				String title = driver.getTitle();
				return title;
			}
			
			// 12. Get the current url

			public String enteredUrl() {

				String currentUrl = driver.getCurrentUrl();
				return currentUrl;
			}
			
			// 13. Select drop down using text

			public void dropdownText(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = isDisplayed(element);
				if (displayed) {
					Select select= new Select(element);
					select.selectByVisibleText(data);
				}
			}
			
			// 14. Select drop down using attribute

			public void dropdownAttribute(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					select.selectByValue(data);		
				}
			}
			
			// 15. Select drop down using index

			public  void elementddIndex(WebElement element, int index) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					select.selectByIndex(index);
					
				}
			}
			
			// 16. Insert value in text box using Java script

			public  void elementSendkeysJs(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("arguments[0].setAttribute('value','"+ data +"')", element);
				}
			}
			
			// 17. Click button using Java script

			public  void elementClickJs(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click()", element);
				}
			}
			
			// 18. Launch the browser

			public static void browserLaunch(String browserType) {
				
				switch (browserType) {
				case "Chrome":
					 driver= new ChromeDriver();

					break;
				case "IE":
					 driver= new InternetExplorerDriver();

					break;
					
				case "Edge":
					 driver= new EdgeDriver();

					break;
					
				case "Firefox":
					 driver= new FirefoxDriver();

					break;

				default:
					break;
				}
			}
			// 19. Switch to child window

			public  void childWindow() {

				String windowHandle = driver.getWindowHandle();
				Set<String> windowHandles = driver.getWindowHandles();
				for (String string : windowHandles) {
					if (!windowHandle.equals(string)) {
						driver.switchTo().window(string);
					}
				}
			}
			
			// 20. Switch to frame by index

			public  void frameSwitchByIndex(int data) {

				driver.switchTo().frame(data);
			}
			
			// 21. Switch to frame by frame id /frame element

			public  void frameSwitchByElement(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					driver.switchTo().frame(element);
				}
			}
			
			// 22. Find locator by id

			public static WebElement locatorById(String data) {

				WebElement element = driver.findElement(By.id(data));
				return element;
			}
			
			// 23. Find locator by name

			public static WebElement locatorByName(String data) {

				WebElement element = driver.findElement(By.name(data));
				return element;
				
			}
			
			// 25. Find locator by Xpath

			public static WebElement locatorByXpath(String data) {

				WebElement element = driver.findElement(By.xpath(data));
				return element;
				
			}
			
			// 24. Find locator by Classname

			public static WebElement locatorByClassName(String data) {

				WebElement element = driver.findElement(By.className(data));
				return element;
				
			}
			
			// 26. Get all options from drop down as text

			public List<String> elementddText(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				List<String> allOptions = new ArrayList<>();
				if (displayed) {
					
					Select select= new Select(element);
					List<WebElement> options = select.getOptions();
					for (WebElement webElement : options) {
						String text = webElement.getText();
						allOptions.add(text);
						
					}
				}
				return allOptions;
			}
			
			// 27. Get all options from drop down as attribute

			public List<String> elementddAttribute(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				List<String> allOptions = new ArrayList<>();
				if (displayed) {
					
					Select select= new Select(element);
					List<WebElement> options = select.getOptions();
					for (WebElement webElement : options) {
						String attribute = webElement.getAttribute(data);
						allOptions.add(attribute);
						
					}
				}
				return allOptions;
				
			}
			
			// 28. Get the first selected option in drop down as text

			public void elementddFirstSelectedOption(WebElement element) {
				explicitWait(element);
				String value= null;
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					WebElement firstSelectedOption = select.getFirstSelectedOption();
					String text = firstSelectedOption.getText();
				}
			}
			
			// 29. Verify in drop down is multiple or not

			public boolean isMultiple(WebElement element) {
				explicitWait(element);
				Select select= new Select(element);
				boolean multiple = select.isMultiple();
				return multiple;
				
			}
			
			// 30. Implicit Wait

			public static void implicitWait() {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
			}
			
			public static void implicitWait(int sec) {

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
			}
			
			// 31. Explicit wait for visibility of

			public static void explicitWait(WebElement element) {

				WebDriverWait driverWait= new WebDriverWait(driver, Duration.ofSeconds(50));
				driverWait.until(ExpectedConditions.visibilityOf(element));
			}
			
			public static void explicitWait(WebElement element, int sec) {

				WebDriverWait driverWait= new WebDriverWait(driver, Duration.ofSeconds(sec));
				driverWait.until(ExpectedConditions.visibilityOf(element));
			}
			// 32. Fluent Wait

			// 33. Verify isDisplayed

			public boolean isDisplayed(WebElement element) {

				boolean displayed = element.isDisplayed();
				return displayed;	
			}
			
			// 34. Verify isEnabled

			public boolean isEnabled(WebElement element) {

				boolean enabled = element.isEnabled();
				return enabled;
				
			}
			
			// 35. Verify isSeleceted

			public boolean isSelected(WebElement element) {

				boolean selected = element.isSelected();
				return selected;
				
			}
			
			// 36. Deselect by index

			public void deSelectByIndex(WebElement element, int data) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					select.deselectByIndex(data);
				}
			}		
				
			// 37. Deselect by attribute

			public void deselectByAttribute(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					select.deselectByValue(data);
				}
				
			}
			
			// 38. Deselect by text

			public void deselectByVisibleText(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					select.deselectByVisibleText(data);
				}

			}
			
			// 39. Deselect All

			public void deSelectAll(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Select select= new Select(element);
					select.deselectAll();
				}
			}
			
			// 40. Get the parent Window

			public String parentWindow() {

				String windowHandle = driver.getWindowHandle();
				return windowHandle;
				
			}
			// Switch frame to parent Window
			
			public void switchToParentFrame() {
				driver.switchTo().parentFrame();

			}
			
			// 41. Get all Windows

			public Set<String> allWindows() {

				Set<String> windowHandles = driver.getWindowHandles();
				return windowHandles;
				
				}
			
			// 42. Clear text box

			public void clearText(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					element.clear();
				}
			}
			
			// 43. Take Screenshot

			public File takescreenshot() {

				TakesScreenshot ts= (TakesScreenshot) driver;
				File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
				return screenshotAs;
			}
			// 44. Take Screenshot for element

			public File takescreenshotelement(WebElement element) {

				TakesScreenshot ts= (TakesScreenshot) driver;
				File screenshotAs = element.getScreenshotAs(OutputType.FILE);
				return screenshotAs;
			}
			
			// 45. Mouse over action

			public void mouseOver(WebElement element) {
				explicitWait(element);
				boolean displayed = element.isDisplayed();
				if (displayed) {
					Actions actions= new Actions(driver);
					actions.moveToElement(element).perform();
				}
			}
			
			// 46. Drag and drop

			public void draganddrop(WebElement srcElement, WebElement destElement) {
				explicitWait(destElement);
				boolean displayed = isDisplayed(destElement);
				if (displayed) {
					Actions actions= new Actions(driver);
					actions.dragAndDrop(srcElement, destElement).perform();
				}
			}
			
			// 47. Right Click

			public void rightClick(WebElement element) {
				explicitWait(element);
				boolean displayed = isDisplayed(element);
				if (displayed) {
					Actions actions= new Actions(driver);
					actions.contextClick(element).perform();
				}
			}
			
			// 48. Double Click

			public void doubleClick(WebElement element) {
				explicitWait(element);
				boolean displayed = isDisplayed(element);
				if (displayed) {
					Actions actions= new Actions(driver);
					actions.doubleClick(element).perform();
				}
				
			}
			
			// 49. Insert value in text box and enter

			public void insertandEnter(WebElement element, String data) {
				explicitWait(element);
				boolean displayed = isDisplayed(element);
				if (displayed) {
					element.sendKeys(data, Keys.ENTER);
				}
				
			}
			// 50. Refresh page
			
			public void refreshpage() {

				driver.navigate().refresh();
			}
		
			public void scrolldown(WebElement element) {

				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", element);
			}
			
		public String getCellValue(String SheetName, int rowIndex, int columnIndex) throws IOException {

			File file= new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWorkDay1\\excel\\Doc.xlsx");
			FileInputStream stream= new FileInputStream(file);
			Workbook book= new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(SheetName);
			Row row = sheet.getRow(rowIndex);
			Cell cell = row.getCell(columnIndex);
			CellType cellType = cell.getCellType();
			String res= null;
			switch (cellType) {
			case STRING:
				res= cell.getStringCellValue();
				break;
				
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yy");
					res= dateFormat.format(dateFormat);
				} else {

					double numericCellValue= cell.getNumericCellValue();
					long round = Math.round(numericCellValue);
					if (round == numericCellValue) {
						res= String.valueOf(round);
					}else {
						res= String.valueOf(numericCellValue);
					}
				}
				break;
			default:
				break;
			}
			return res;
			
		}
		
		public void thread() throws InterruptedException {

			Thread.sleep(30);
		}
		public void setonecellvalue(String SheetName, int rowIndex, int cellIndex, String cellValue) throws IOException {
			
			File file= new File("C:\\Users\\ELCOT\\eclipse-workspace\\FrameWorkDay1\\excel\\Doc.xlsx");
			FileInputStream stream= new FileInputStream(file);
			Workbook book= new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(SheetName);
			Row row = sheet.createRow(rowIndex);
			Cell cell = row.createCell(cellIndex);
			cell.setCellValue(cellValue);
			FileOutputStream fos= new FileOutputStream(file);
			book.write(fos);;
			book.close();		
			
		}
		
		public String getprojextPath() {
			return System.getProperty("user.dir");

		}
		
		public String getpropertyFilevalue(String key) throws FileNotFoundException, IOException {
			
			Properties properties= new Properties();
			properties.load(new FileInputStream(getprojextPath()+"\\config\\config.properties"));
			Object object = properties.get(key);
			String string =(String)object;
			return string;
			
		
		}
		
		public void pressEnter() throws AWTException {

			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		}
		
		public void scaleLess() throws AWTException {

			Robot robot= new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
		}
		
		public byte[] screenshot() {

			TakesScreenshot ts= (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			return screenshotAs;
			
			
		}
	}

