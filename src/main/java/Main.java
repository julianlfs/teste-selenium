import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        for (int i = 0; i < 10; i++) {

            webDriver.get("https://docs.google.com/forms/d/e/1FAIpQLSfiUUJEGbnlus_80-wLypZzo9WXnrzq0JOjN6GiM7uqE0hRYw/viewform");
            webDriver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[1]/div/div[2]/div/span/div/div[1]/label/div/div[2]/div/span"))
                    .click();
            webDriver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]/input"))
                    .sendKeys("teste " + i);
            webDriver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div/div/div[3]/div[1]/div/div/span"))
                    .click();
        }

        webDriver.close();
    }

}
