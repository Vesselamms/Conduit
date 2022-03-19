package com.Conduit.Pages;

import com.Conduit.utilities.BrowserUtils;
import com.Conduit.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@href='#/editor/']")
    public WebElement NewArticleButton;

    @FindBy(xpath = "//a[@href='#/settings']")
    public WebElement SettingsButton;

    @FindBy(xpath = "//a[@href='#/@Unluckycamel']")
    public WebElement ProfilButton;

    //textarea[@placeholder='Write your article (in markdown)']
    @FindBy(xpath = "//textarea[@placeholder='Article Title']")
    public WebElement TitleArea;

    @FindBy(xpath = "//textarea[@placeholder='Write your article (in markdown)']")
    public WebElement WriteArticleArea;

    @FindBy(xpath = "//textarea[@placeholder='What's this article about?']")
    public WebElement ArticleAboutArea;

    @FindBy(xpath = "//textarea[@placeholder='Enter tags']")
    public WebElement EntertagsArea;


    @FindBy(xpath = "//button[normalize-space(text())='Publish Article']")
    public WebElement SubmitButton;
}
