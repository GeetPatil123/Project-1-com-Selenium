package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseURL = "https://demo.nopcommerce.com/";

    @Before
    public void setUpUrl() {
        openBrowser(baseURL); // Browser setup method from BaseTest class
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers")).click();
        String expectedText = "Computers";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Computers']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.linkText("Electronics")).click();
        String expectedText = "Electronics";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.linkText("Apparel")).click();
        String expectedText = "Apparel";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.linkText("Digital downloads")).click();
        String expectedText = "Digital downloads";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.linkText("Books")).click();
        String expectedText = "Books";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Books']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.linkText("Jewelry")).click();
        String expectedText = "Jewelry";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.linkText("Gift Cards")).click();
        String expectedText = "Gift Cards";
        WebElement actualWebElement = driver.findElement(By.xpath("//h1[text()='Gift Cards']"));
        String actualText = actualWebElement.getText();
        Assert.assertEquals("Expected Text doesn't meets Actual Text", expectedText, actualText);
    }

    @After
    public void teamDown() {
        closeBrowser();
    }
}
