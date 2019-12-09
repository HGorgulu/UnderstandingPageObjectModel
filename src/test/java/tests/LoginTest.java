package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Driver;

public class LoginTest extends TestBase {


    @Test(description = "Verify login")
    public void test1(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        System.out.println(Driver.get().getTitle());
    }

}
