package pages.krisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class KrishaPage extends BasePage {

    public KrishaPage(WebDriver driver) {
        super(driver);
    }
    // Задать элементы в переменную для того что бы не было ошибки прогрузки
    By countRooms = By.xpath("//*[@class='search-element-wrap specs_kvartiry']/div[1]/select[1]");
    By option3rooms = By.xpath("//*[@class='search-element-wrap specs_kvartiry']/div[1]/select[1]/option[6]");
    By findBtn = By.xpath("//*[@class='search-btn-main']");

    public KrishaPage enterCountRooms(){ // условия поиска
        driver.findElement(countRooms).click();
        driver.findElement(option3rooms).click();
        return this;
    }

    public KrishaPage ClickToFind(){ // кнопка найти
        driver.findElement(findBtn).click();
        return this;
    }
}
