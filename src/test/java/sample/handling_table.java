package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class handling_table {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        

        driver.quit();
    }
}
