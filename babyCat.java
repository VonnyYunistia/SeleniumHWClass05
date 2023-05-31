package Class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class babyCat extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {

        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        //    Step1:        as the webElement is inside an iframe
//            frist we need to switch to it
        driver.switchTo().frame(1);
//            find the WebElement animal
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

//select baby cat
        //        1. inspect and find the element that has the dropdown
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel =new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        //switch the focus to  ain page
        driver.switchTo().defaultContent();


        driver.switchTo().frame("frame1");
    WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Meeeeow meeeeeeow");
        Thread.sleep(2000);


}
