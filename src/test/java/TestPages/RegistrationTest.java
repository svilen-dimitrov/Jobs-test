package TestPages;

import dev.page.RegistrationPage;
import org.testng.annotations.Test;

public class RegistrationTest extends MainDriver{

    RegistrationPage registrationPage;

    @Test
    public void registration(){
    registrationPage = new RegistrationPage(driver);
    registrationPage.clickRegistrationButton();
    registrationPage.setFirstNameField("Svilen");
    }
}
