package com.websystique.springmvc.ui.tests;

import com.websystique.springmvc.ui.pages.LoginPage;
import com.websystique.springmvc.ui.utils.TimeUtils;
import com.websystique.springmvc.ui.webtestsbase.WebDriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:app.xml"})
public class LoginPageTest {

    private LoginPage loginPage;

    @Before
    public void beforeTest() {
        WebDriverFactory.startBrowser(true);
        TimeUtils.waitForSeconds(9);
    }

    @Test
    public void testChat() {
        /*loginPage = new LoginPage();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin");
        loginPage.login();
        assertEquals("Login page", loginPage.getTitle());*/
        System.out.println("DEV");
    }

    @After
    public void afterTest() {
        TimeUtils.waitForSeconds(9);
        WebDriverFactory.finishBrowser();
    }

}
