package Automation.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    //reusable method for click on web element
    public static void clickOnElement(By by){
        driver.findElement(by).click();

    }
    //reusable method for send keys
    public static void typeText(By by,String textValue){
        driver.findElement(by).sendKeys(textValue);

    }
    //reusable method for timeStamp
    public static String timeStamp(){
        DateFormat dateFormat=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
        Date date =new Date();
        return dateFormat.format(date);
    }
    //reusable method for getText
    public String getText(By by){
        return driver.findElement(by).getText();
    }
    //reusable method for select
    public void selectValueFromDropDown(By by,String value){
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }
    public void mouseHover(By by){
        Actions actions=new Actions(driver);
        WebElement target = driver.findElement(by);
        actions.moveToElement(target).build().perform();
    }



}
