package tests.searchapartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {
    @Test // аннотация для testng что бы понимал что запускать
    public void CheckIsRedrectToList(){
        basePage.open("https://krisha.kz/");
        krishaPage
                .enterCountRooms()
                .ClickToFind();
        krishaListingPage
                .checkCountCards(); // вызов метода с krishaListingPage
    }

}
