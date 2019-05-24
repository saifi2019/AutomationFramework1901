package pageobjects.test;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.objects.HomePage;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class HomePageTest extends BrowserDriver {
    @Test
    public void searchText(){

        HomePage objHomePage = PageFactory.initElements(driver,HomePage.class);
        objHomePage.search();

    }
}
