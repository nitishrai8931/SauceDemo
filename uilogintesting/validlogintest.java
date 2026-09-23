package uitesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validlogintest {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("inventory.html")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
		}
	}

}