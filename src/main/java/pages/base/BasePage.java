package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.Config.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver; // Создает экземпляр драйвера для остальных классов

    public BasePage (WebDriver driver){ // Конструктор что бы передать драйвер
        this.driver = driver;
    }

    public void open (String url){ // Метод для открытия страницы
        driver.get(url);
    }
    public WebElement waitElement(WebElement element){ // ограничение для загрузки элментов
        WebElement el1 = new WebDriverWait(driver, EXPLICIT_WAIT)
                .until(ExpectedConditions.visibilityOf(element)); // Ожидание элемента
        return element;
    }

}
