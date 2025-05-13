package softwaretestpkg;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver_win64/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com"); 
		driver.manage().window().maximize(); 
		WebElement searchBox=driver.findElementByName("q"); 
		searchBox.sendKeys("iphone 16");
		searchBox.submit();

	}

}
