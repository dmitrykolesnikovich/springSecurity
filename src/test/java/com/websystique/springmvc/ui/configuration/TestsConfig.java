package com.websystique.springmvc.ui.configuration;

import com.websystique.springmvc.ui.configuration.properties.PropertiesLoader;
import com.websystique.springmvc.ui.configuration.properties.Property;
import com.websystique.springmvc.ui.configuration.properties.PropertyFile;
import com.websystique.springmvc.ui.webtestsbase.Browser;

@PropertyFile("uiTestConfig.properties")
public class TestsConfig {

    private static TestsConfig config;

    public static TestsConfig getConfig() {
        if (config == null) {
            config = new TestsConfig();
        }
        return config;
    }

    public TestsConfig() {
        PropertiesLoader.populate(this);
    }

    @Property("browser.name")
    private String browser = "firefox";

    @Property("browser.version")
    private String version = "";

    @Property("loginPageUrl")
    private String loginPageUrl;

    public Browser getBrowser() {
        Browser browserForTests = Browser.getByName(browser);
        if (browserForTests != null) {
            return browserForTests;
        } else {
            throw new IllegalStateException("Browser name '" + browser + "' is not valid");
        }
    }

    public String getBrowserVersion() {
        return version;
    }

    public String getLoginPageUrl() {
        return loginPageUrl;
    }
}
