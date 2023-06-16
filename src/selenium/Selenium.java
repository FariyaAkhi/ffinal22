/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author student_user
 */
public class Selenium {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
WebDriver driver= new ChromeDriver();
driver.get("https://demo.openmrs.org/openmrs/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("akhiddg");
Thread.sleep(3000);
driver.findElement(By.id("password")).sendKeys("hgdh");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
    }
    
}
