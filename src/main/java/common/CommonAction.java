package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.IMPLICIT_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonAction {
    private static WebDriver driver = null; // по умол драйвера нету

    private CommonAction (){
    }
    public static WebDriver createDriver(){
        if (driver == null) {  // Проверка на драйвер
            switch (PLATFORM_AND_BROWSER){
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe" );
                    driver = new ChromeDriver();
                    break; // выход из switch
                default:
                    Assert.fail("Incorrect platform" + PLATFORM_AND_BROWSER);
            }
            driver.manage().window().maximize(); // Условия теста
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }
}
