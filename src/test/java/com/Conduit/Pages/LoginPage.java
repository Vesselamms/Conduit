package com.Conduit.Pages;

import com.Conduit.utilities.BrowserUtils;
import com.Conduit.utilities.ConfigurationReader;
import com.Conduit.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement UsernameBox1;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement Password1;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement Emailbox;

    @FindBy(xpath = "//button[normalize-space(text())='Sign up']")
    public WebElement SignupButton;

    @FindBy(xpath = "//button[normalize-space(text())='Sign in']")
    public WebElement SigninButton;

    public void navigateToSignin_up(String Button) {
        String ButtonLocator = "//a[normalize-space(text())= '" + Button + "']";

        Driver.get().findElement(By.xpath(ButtonLocator)).click();

        BrowserUtils.waitFor(2);


    }

    public void login() {


        UsernameBox1.sendKeys("ibrahimoztom@hotmail.com");
        Password1.sendKeys("122333");
        SigninButton.click();


    }
}
