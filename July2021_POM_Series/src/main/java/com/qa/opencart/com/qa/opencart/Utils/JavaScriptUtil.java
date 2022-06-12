

package com.qa.opencart.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class JavaScriptUtil
{
    private WebDriver driver;
    
    public JavaScriptUtil(final WebDriver driver) {
        this.driver = driver;
    }
    
    public void flash(final WebElement element) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        final String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 15; ++i) {
            this.changeColor("rgb(0,200,0)", element);
            this.changeColor(bgcolor, element);
        }
    }
    
    private void changeColor(final String color, final WebElement element) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", new Object[] { element });
        try {
            Thread.sleep(20L);
        }
        catch (InterruptedException ex) {}
    }
    
    public String getTitleByJS() {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        return js.executeScript("return document.title;", new Object[0]).toString();
    }
    
    public void refreshBrowserByJS() {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("history.go(0)", new Object[0]);
    }
    
    public void generateAlert(final String message) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("alert('" + message + "')", new Object[0]);
    }
    
    public String getPageInnerText() {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        return js.executeScript("return document.documentElement.innerText;", new Object[0]).toString();
    }
    
    public void clickElementByJS(final WebElement element) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("arguments[0].click();", new Object[] { element });
    }
    
    public void sendKeysUsingWithId(final String id, final String value) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("document.getElementById('" + id + "').value='" + value + "'", new Object[0]);
    }
    
    public void scrollPageDown() {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)", new Object[0]);
    }
    
    public void scrollPageDown(final String height) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("window.scrollTo(0, '" + height + "')", new Object[0]);
    }
    
    public void scrollPageUp() {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)", new Object[0]);
    }
    
    public void scrollIntoView(final WebElement element) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", new Object[] { element });
    }
    
    public void drawBorder(final WebElement element) {
        final JavascriptExecutor js = (JavascriptExecutor)this.driver;
        js.executeScript("arguments[0].style.border='3px solid red'", new Object[] { element });
    }
}
