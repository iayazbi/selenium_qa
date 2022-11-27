package tests.searchapartments;

import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {
    public void CheckIsRedrectToList(){
        basePage.open("https://krisha.kz/");
        krishaPage
                .enterCountRooms()
                .ClickToFind();
    }

}
