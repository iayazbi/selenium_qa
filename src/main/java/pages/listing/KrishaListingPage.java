package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class KrishaListingPage extends BasePage {

    public KrishaListingPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.xpath("//div[@class='a-card__inc']"); // локатор задаём в перемменную

    public KrishaListingPage checkCountCards(){
        waitElement(driver.findElement(card)); // проверка элемента который указали в BasePage

        int countCards = driver.findElements(card).size(); // Добавляет карточки в переменную
        Assert.assertEquals(countCards, 21); // проверка на карточки
        return this; // возврашает экземпляер к классу
    }

}
