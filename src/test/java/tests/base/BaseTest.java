package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.krisha.KrishaPage;
import pages.listing.KrishaListingPage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver(); // берём методы из класса common
    protected BasePage basePage = new BasePage(driver);
    protected KrishaPage krishaPage = new KrishaPage(driver);
    protected KrishaListingPage krishaListingPage = new KrishaListingPage(driver);
}
