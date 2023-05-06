package automation_test.mortgage_calculator;

import commond_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;

import java.time.Duration;

public class CalculateRealAprRate {
    WebDriver driver;
    Select select;
    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        ActOn.browser(driver).openBrowser("https://www.mortgagecalculator.org/");
    }
    @Test
    public void calculateRealApr(){

        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .waitForPageToLoad()
                .typeHomePrice("200000")
                .typeDownPayment("15000")
                .selectDownPaymentInDollar()
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateRealAprRate("3.130%");
    }
    @AfterMethod
    public void closeBrowser(){
        ActOn.browser(driver).closeBrowser();
    }

}
