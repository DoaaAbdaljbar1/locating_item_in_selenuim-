import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get(" http://127.0.0.1:5500/indexss.html");

			driver.findElement(By.id("eamile")).sendKeys("doooaaahjklaa@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("ffffffff");

			driver.findElement(By.id("date")).sendKeys("22_55_9999");
			driver.findElement(By.id("phone")).sendKeys(" 02589674");
	driver.findElement(By.tagName("button")).click();
	}

}
