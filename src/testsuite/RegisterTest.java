package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/ ";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //Find the Register link and click on register link
        WebElement registerLink = driver.findElement(By.xpath("//a[@class ='ico-register']"));
        registerLink.click();
        String expectedText = "Register";
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
    }

    public static String getRandomEmail(){//Method generating Random email everytime
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder random = new StringBuilder();
        Random rnd = new Random();
        while (random.length() <10){
            int index = (int) (rnd.nextFloat() * chars.length());
            random.append(chars.charAt(index));
        }
        String email = random.toString() + "@gmail.com";
        return email;
    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        WebElement registerLink = driver.findElement(By.xpath("//a[@class ='ico-register']"));
        registerLink.click();
        //select gender radio field button
        WebElement genderField = driver.findElement(By.name("Gender"));
        genderField.sendKeys("Female");
        //Type firstname and enter into firstname field
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Bhreina");
        //Type lastname and enter into lastname field
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Patel");
        //select Day Month And Year and enter
        WebElement dayField = driver.findElement(By.name("DateOfBirthDay"));
        dayField.sendKeys("30");
        WebElement monthField = driver.findElement(By.name("DateOfBirthDay"));
        monthField.sendKeys("March");
        WebElement yearField = driver.findElement(By.name("DateOfBirthDay"));
        yearField.sendKeys("1990");
        //Find email address to email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys(getRandomEmail());
        //Find the password field element and send the password on password field
        driver.findElement(By.name("Password")).sendKeys("bhreina123");
        //Find the confirm password field element and send the confirm password on confirm password field
        driver.findElement(By.id("ConfirmPassword")).sendKeys("bhreina123");
        //Find the register button and click on register
        driver.findElement(By.id("register-button")).click();
        String expectedText = "Your registration completed";
        WebElement actualWebElement = driver.findElement(By.xpath("//div[text()='Your registration completed']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Text is not same Eexpected not meets Actual",actualText,expectedText);

    }
    @After
    public void teamDown() {
        closeBrowser();
    }
}
