package ru.deliveryClub;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    @After
    public void close() {
        driver.quit();
    }
}
