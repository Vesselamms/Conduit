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
    @Given("user logged in as {string} ibrahim")
    public void user_logged_in_as_ibrahim(String string) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.navigateToSignin_up("Sign in");
        BrowserUtils.waitFor(2);
        loginPage.login();

    }

    @Given("user click to  {string} module")
    public void user_click_to_module(String string) {
        homePage.NewArticleButton.click();

    }

    @Then("user should be able to creat aricles")
    public void user_should_be_able_to_creat_aricles() {
        homePage.TitleArea.sendKeys("first try");
        homePage.ArticleAboutArea.sendKeys("anytime");
        homePage.WriteArticleArea.sendKeys("if ı gonna pass first try, I will be good tester");
        homePage.EntertagsArea.sendKeys("tester");
        homePage.SubmitButton.click();

    }



}
