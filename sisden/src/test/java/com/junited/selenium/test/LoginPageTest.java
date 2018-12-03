package com.junited.selenium.test;

import com.junited.selenium.page.LoginPage;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class LoginPageTest extends AbstractSeleniumTest
{
    private LoginPage loginPage;

/*    @Before
    public void prepareUserToLogin()
    {
        ensureNoLogin();
    }*/

    @After
    public void logoutUser()
    {
        ensureNoLogin();
    }

    @Description("")
    @Test
    public void testLoginByStandardUser()
    {
        login("nisan.derman@bilgiedu.net", "GqGd8rjA1");
        Assert.assertTrue(isAnyUserLoggedIn());
    }

    protected void login(String username, String password)
    {
        LoginPage loginPage = new LoginPage(browser);

        browser.waitUntilVisibilityOf(loginPage.usernameInput);
        loginPage.usernameInput.clear();
        loginPage.usernameInput.sendKeys(username);

        loginPage.passwordInput.clear();
        loginPage.passwordInput.sendKeys(password);

        browser.waitAndClick(loginPage.userLoginSubmitButton);
    }

}
