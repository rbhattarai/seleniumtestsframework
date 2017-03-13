package com.seleniumtests.tests;

import com.seleniumtests.core.SeleniumTestPlan;
import com.seleniumtests.webpage.GoogleHomePage;
import org.testng.annotations.Test;



/**
 * Created by rbhattarai on 3/13/2017.
 */
public class GoogleSearchTest extends SeleniumTestPlan {

    @Test(groups = {"googleSearchTest"}, description = "Search keyword in google")
    public void googleSearchTest() throws  Exception {
        String searchKeyword = "Selenium";
        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.enterSearchKeyword(searchKeyword);
        googleHomePage.waitForTextPresent(searchKeyword);
        googleHomePage.assertTextPresent(searchKeyword);
    }



}
