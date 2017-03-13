package com.seleniumtests.webpage;

import com.seleniumtests.core.Locator;

import com.seleniumtests.core.SeleniumTestsContextManager;
import com.seleniumtests.webelements.ButtonElement;
import com.seleniumtests.webelements.PageObject;
import com.seleniumtests.webelements.TextFieldElement;

/**
 * Created by tarun on 3/22/16.
 */
public class GoogleHomePage extends PageObject {

    private static final TextFieldElement searchTextBox = new TextFieldElement("search Text Box", Locator.locateByName("q"));

    private ButtonElement googleSearchButton = new ButtonElement("Google Search Button", Locator.locateByName("btnG"));

    public GoogleHomePage() throws Exception {
        super(searchTextBox, SeleniumTestsContextManager.getThreadContext().getAppURL());
    }

    public boolean isSearchBoxDisplayed() {
        return searchTextBox.isDisplayed();
    }

    public GoogleHomePage enterSearchKeyword(final String searchKeyword){
        searchTextBox.clearAndType(searchKeyword);
        googleSearchButton.click();
        return  this;
    }
}
