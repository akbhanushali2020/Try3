import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Selenium code
		// Create driver object for chrome browser
		
		// Once driver object is created we will strictly implements methods of webdriver
		
		// Webdriver is an interface and provides all the methods for automation (to automate)
		
		/* Classs name = x
		x driver = new x(); */
		
		/* Classs name = ChromeDriver */
		
		// give webdriver knowledge to the object driver. so that it will automate each and every UI to the browser 
		
		// return type for your driver should be webdriver
		
		//ChromeDriver driver = new ChromeDriver()
		
		
		// invoke .exe file first
		
		/* Chrome are 3rd party browsers which does not belong to selenium and they have 
			restricted selenium to invoke their browser automatically with this API's  
			
			Due to security issues they have will not allow external API's to invoke their browsers automatically
			so for that reason we need to write one more step to invoke the browser 
			
			Each browser team have given .exe file to selenium and asked selenium to invoke that .exe file first
			
			Selenium guys have set some properties for chrome property is webdriver.chrome.driver
			In their code they have defined something like this webdriver.chrome.driver
			This property (webdriver.chrome.driver) is defined in ChromeDriver() class. so we need to set this property
			This property expects location of chromedriver.exe file. so we need to set this property with chrome driver location 
			Key selenium guys have defined
			
			Java expects double slash
			*/
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\akbhanushali\\Documents\\Selenium_train\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
/*driver = new ChromeDriver(); WebDriver is an interface and all the methods 
 * which are declared in Webdriver interface are implemented 
 * by respective driver class		
		
If you use ChromeDriver driver = new ChromeDriver(); the ChromeDriver instance which will get created through that we will be only able to 
invoke and act on the methods implemented by ChromeDriver and supported 
by Chrome Browser only		


So WebDriver is an interface and FirefoxDriver and ChromeDriver classes that 
implement (tool) the WebDriver interface.
 */
		
		
		driver.get("http://google.com");
		
		// titile of the page
		
		System.out.println(driver.getTitle());
		
		
	}

}
