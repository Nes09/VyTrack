package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

public static void waitFor(int second){

    try {
        Thread.sleep(second*1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }



}

public static boolean checkVisibilityOfElement(By locator, int timeToWait){

    boolean result = false;

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeToWait);

    try{
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return true;

    } catch (TimeoutException e) {
        System.out.println("WE DID NOT SEE THE ERROR MESSAGE ELEMENT");
    }

          return result;
}


}
