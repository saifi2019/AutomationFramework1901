package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

   @FindBy( id="search_query_top")
    private WebElement searchbox;

   @FindBy(name= "submit_search")
    private WebElement submitButton;
   @FindBy(linkText = "Contact Us")
   private WebElement contactUs;

 public void search(){

     searchbox.sendKeys("iPhone");
     submitButton.click();

 }




}
