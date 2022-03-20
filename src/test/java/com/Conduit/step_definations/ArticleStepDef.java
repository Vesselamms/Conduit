package com.Conduit.step_definations;

import com.Conduit.Pages.HomePage;
import com.Conduit.Pages.LoginPage;
import com.Conduit.utilities.BrowserUtils;
import com.Conduit.utilities.ConfigurationReader;
import com.Conduit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ArticleStepDef {
LoginPage loginPage=new LoginPage();
HomePage homePage=new HomePage();
    @Given("user logged in as {string}")
    public void user_logged_in_as(String string) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.navigateToSignin_up("Sign in");
        BrowserUtils.waitFor(2);
        loginPage.Emailbox.sendKeys(ConfigurationReader.get("username1"));
        loginPage.Password1.sendKeys(ConfigurationReader.get("password1"));
        loginPage.SigninButton.click();
        BrowserUtils.waitFor(3);
    }


    @Given("user click to  {string} module")
    public void user_click_to_module(String string) {
        homePage.NewArticleButton.click();
        BrowserUtils.waitFor(3);

    }

    @Then("user should be able to creat aricles")
    public void user_should_be_able_to_creat_aricles() {
        homePage.TitleArea.sendKeys("first try");
        BrowserUtils.waitFor(2);
        homePage.ArticleAboutArea.sendKeys("anytime");
        BrowserUtils.waitFor(2);
        homePage.WriteArticleArea.sendKeys("if ı gonna pass first try, I will be good tester");
        BrowserUtils.waitFor(2);
        homePage.EntertagsArea.sendKeys("tester");
        BrowserUtils.waitFor(2);
        homePage.SubmitButton.click();

    }



}
