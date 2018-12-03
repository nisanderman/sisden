package com.junited.selenium.page;

import com.junited.selenium.utils.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject
{
    public LoginPage(Browser browser)
    {
        super(browser);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(className = "btn btn-primary")
    public WebElement userLoginSubmitButton;

}

