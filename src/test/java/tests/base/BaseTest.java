package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.krisha.KrishaPage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected KrishaPage krishaPage = new KrishaPage(driver);
}
