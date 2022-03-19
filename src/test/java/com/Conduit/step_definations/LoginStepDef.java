package com.Conduit.step_definations;

import com.Conduit.Pages.LoginPage;
import com.Conduit.utilities.BrowserUtils;
import com.Conduit.utilities.ConfigurationReader;
import com.Conduit.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDef {
    LoginPage loginPage=new LoginPage();
    Faker faker=new Faker();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Given("user click to  {string}")
    public void user_click_to(String Sign_up)  {
        loginPage.navigateToSignin_up("Sign up");


    }

    @Given("fill the username box, Email box  and Password box and click sign up button")
    public void fill_the_username_box_Email_box_and_Password_box_and_click_sign_up_button() {

        String Fakeusername=faker.harryPotter().character();
        String FakeEmail=faker.color().name();

        loginPage.UsernameBox1.sendKeys(Fakeusername);

        loginPage.Emailbox.sendKeys(FakeEmail+"@gmail.com");
        BrowserUtils.waitFor(2);

        loginPage.Password1.sendKeys("122333");
        BrowserUtils.waitFor(2);

        loginPage.SignupButton.click();
        BrowserUtils.waitFor(2);
    }



    @Then("user should be able to see {string} page")
    public void user_should_be_able_to_see_page(String ExpectedResult) {
        String ActualResult= Driver.get().getTitle();
        Assert.assertEquals(ExpectedResult,ActualResult);

    }

    @Given("user click to  {string} button")
    public void user_click_to_button(String string) {
        loginPage.navigateToSignin_up("Sign in");
    }

    @Given("fill the {string} box and Email box  and {string} box and click to sign in button")
    public void fill_the_box_and_Email_box_and_box_and_click_to_sign_in_button(String username1, String password1) {
        loginPage.Emailbox.sendKeys(username1);
        loginPage.Password1.sendKeys(password1);
        loginPage.SigninButton.click();
        BrowserUtils.waitFor(3);

    }

}
