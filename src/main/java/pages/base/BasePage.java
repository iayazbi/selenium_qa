package pages.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver; // Создает экземпляр драйвера для остальных классов

    public BasePage (WebDriver driver){ // Конструктор что бы передать драйвер
        this.driver = driver;
    }

    public void open (String url){ // Метод для открытия страницы
        driver.get(url);
    }

}
