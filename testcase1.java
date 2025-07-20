package softwaretestpkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver_win64/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com");
		WebElement c = driver.findElementByName("search_query");
		Actions builder = new Actions(driver); 
		builder.contextClick(c).perform();
		WebElement searchBox=driver.findElementByName("search_query");
		searchBox.sendKeys("generative ai"); 
		searchBox.submit();
		if(true);
		System.out.println("automation is done");
		
	}

}
