package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {

    public static void main(String[] args) {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8090");
        System.out.println(driver.getPageSource());
//        WebElement element = driver.findElement(By.linkText("login"));       
//        element.click(); 
//        
//        System.out.println("==");
//        
//        System.out.println( driver.getPageSource() );
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("akkep");
//        element = driver.findElement(By.name("login"));
//        element.submit();
//        
//        System.out.println("==");
//        System.out.println( driver.getPageSource() );

        //Epaonnistunut kirjautuminen - oikea tunnus vaara salasana
//        WebElement element = driver.findElement(By.linkText("login"));
//        element.click();
//
//        System.out.println("==");
//
//        System.out.println(driver.getPageSource());
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekka");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("akkepp");
//        element = driver.findElement(By.name("login"));
//        element.submit();
//
//        System.out.println("==");
//        System.out.println(driver.getPageSource());
                //Epaonnistunut kirjautuminen - ei tunnusta
//        WebElement element = driver.findElement(By.linkText("login"));
//        element.click();
//
//        System.out.println("==");
//
//        System.out.println(driver.getPageSource());
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("tetta");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("akkepp");
//        element = driver.findElement(By.name("login"));
//        element.submit();
//
//        System.out.println("==");
//        System.out.println(driver.getPageSource());
                //Uuden kayttajatunnuksen luominen
//        WebElement element = driver.findElement(By.linkText("register new user"));
//        element.click();
//
//        System.out.println("==");
//
//        System.out.println(driver.getPageSource());
//        element = driver.findElement(By.name("username"));
//        element.sendKeys("pekkate");
//        element = driver.findElement(By.name("password"));
//        element.sendKeys("12345678a");
//        element = driver.findElement(By.name("passwordConfirmation"));
//        element.sendKeys("12345678a");
//        element = driver.findElement(By.name("add"));
//        element.submit();
//
//        System.out.println("==");
//        System.out.println(driver.getPageSource());
        //Uuden kayttajatunnuksen luominen
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        System.out.println("==");

        System.out.println(driver.getPageSource());
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekkate");
        element = driver.findElement(By.name("password"));
        element.sendKeys("12345678a");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("12345678a");
        element = driver.findElement(By.name("add"));
        element.submit();

        System.out.println("==");
        System.out.println(driver.getPageSource());

        WebElement element2 = driver.findElement(By.linkText("continue to application mainpage"));
        element2.click();
        
        System.out.println("==");
        System.out.println(driver.getPageSource());
//
        WebElement element3 = driver.findElement(By.linkText("logout"));
        element3.click();
        
         System.out.println("==");
        System.out.println(driver.getPageSource());

    }
}
