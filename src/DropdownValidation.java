import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownValidation {

	@Test
	public void dropdownvalidationstuffs (){

		try {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();		
			driver.get("https://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
			Thread.sleep(2000);
			WebElement we = driver.findElement(By.xpath("//select[@id='tools']"));
			Select s = new Select (we);
			
			List list1 = new ArrayList();			
			
			List<WebElement> allOptions = s.getOptions();
			for (WebElement options : allOptions) {
				String data = options.getText();
				System.out.println(data);
				list1.add(data);			
			}
			
			List list2 = new ArrayList();
			list2.addAll(list1);
			Assert.assertTrue(list1.equals(list2));
			System.out.println("dropdown verified");
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}