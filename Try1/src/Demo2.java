import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbhanushali\\Documents\\Selenium_train\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("http://google.com"); // hit url on the browser
		
		// titile of the page
		
		System.out.println(driver.getTitle());  //validate if page title is correct
		
		System.out.println (driver.getCurrentUrl()); //validate if landed on correct url
		
		//System.out.println(driver.getPageSource()); // print page source
		
		driver.get("http://yahoo.com"); // hit url on the browser
		
		driver.navigate().back(); //Navigate back to google from yahoo
		
		driver.navigate().forward(); //Navigate forward from  google to yahoo
		
		driver.close(); // It will close only current browser which is in focus
		
		driver.quit(); // It closes all the browsers opened by selenium script for example child windows
		
		

	}

}
