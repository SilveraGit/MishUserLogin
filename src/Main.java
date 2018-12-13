import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();
        chrome.get("https://mish.sheygam.com/#/wellcome");
        WebElement reg_button = chrome.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        reg_button.click();
        WebElement email_field = chrome.findElement(By.xpath("//div//input[@formcontrolname='email']"));
        email_field.click();
        email_field.sendKeys("examplemail1@gmail.com");
        WebElement pass_field = chrome.findElement(By.xpath("//div//input[@formcontrolname='password']"));
        pass_field.click();
        pass_field.sendKeys("123456789");
        WebElement pass2_field = chrome.findElement(By.xpath("//div//input[@formcontrolname='passwordRep']"));
        pass2_field.click();
        pass2_field.sendKeys("123456789");
        WebElement reg2_button = chrome.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        reg2_button.click();







        //chrome.quit();



    }
}
