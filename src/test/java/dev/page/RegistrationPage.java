package dev.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    @FindBy(css = ".bold.subscriber-register-btn")
    private WebElement registrationButton;

    //@FindBy (css = "register-menu-surface  [title='Потребител']")
    // WebElement userButton;

    @FindBy(id = "fname")
    WebElement firstNameField;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickRegistrationButton() {
        registrationButton.click();
    }

    //    public void clickUserButton(){
//        userButton.click();
//    }
    public void setFirstNameField(String username) {
        firstNameField.sendKeys(username);
    }


}
