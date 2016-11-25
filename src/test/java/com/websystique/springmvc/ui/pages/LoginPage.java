package com.websystique.springmvc.ui.pages;

import com.websystique.springmvc.ui.configuration.TestsConfig;
import com.websystique.springmvc.ui.webtestsbase.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id = 'username']")
    private WebElement username;

    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement password;

    @FindBy(xpath = "//input[@value = 'Log in']")
    private WebElement login;

    public LoginPage() {
        super(true);
    }

    public void setUsername(String test) {
        username.sendKeys(test);
    }

    public void setPassword(String test) {
        password.sendKeys(test);
    }

    public void login() {
        click(login);
    }

    @Override
    protected void openPage() {
        getDriver().get(TestsConfig.getConfig().getLoginPageUrl());
    }

    @Override
    public boolean isPageOpened() {
        return true;
    }

}
