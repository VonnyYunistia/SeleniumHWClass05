package Class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
public class Alerts extends CommonMethods {

    public static void main(String[] args) throws InterruptedException {


        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

/*WebElement alert1Btn= driver.findElement(By.xpath("//button[@onclick='myAlertFunction"));

alert1Btn.click();

Thread.sleep(3000);*/

//switch the focus of the driver to the alert

       /* Alert confirmationAlert1= driver.switchTo().alert();
        confirmationAlert1.accept();

        //find the 2nd alert button an click on it

        WebElement alert2Btn= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();

        Thread.sleep(3000);
        Alert confirmationAlert2= driver.switchTo().alert();
        confirmationAlert2.dismiss();*/



        Alert confirmationAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);

        WebElement alert3Btn= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        alert3Btn.click();


        Thread.sleep(3000);
        WebElement textBox= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));

        confirmationAlert3.sendKeys("Ciwit");
        Thread.sleep(2000);
        confirmationAlert3.accept();

    }
}
