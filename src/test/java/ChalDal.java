import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChalDal {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Wait 10 sec for finding elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Nevigate ot web URL
        driver.get("https://chaldal.com/");
        Thread.sleep(1000);
//select food
        WebElement selectFood = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/ul[3]/li[4]/div"));
        selectFood.click();
        Thread.sleep(1000);
//select Diabetic food
        WebElement selectDFood = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/div/div/div[2]/div[1]/ul[3]/li[4]/ul/li[12]/div"));
        selectDFood.click();
        Thread.sleep(1000);
//Select oats
        WebElement selectOats = driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[2]/div/div[1]/div/div/div[2]"));
        selectOats.click();
        Thread.sleep(1000);
        //Select oats
        WebElement selectZerocal = driver.findElement(By.xpath("/html/body/div[2]/div/div[6]/section/div/div/div/div/section/div[2]/div/div[3]/div/div/div[2]"));
        selectZerocal.click();
        Thread.sleep(1000);
        // Select Bisk
        WebElement selectBisk = driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[6]/section/div/div/div/div/section/div[2]/div/div[4]/div/div/div[2]"));
        selectBisk.click();
        Thread.sleep(1000);
        //Select Quaker
        WebElement selectQuaker = driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[6]/section/div/div/div/div/section/div[2]/div/div[7]/div/div/div[2]"));
        selectQuaker.click();
        Thread.sleep(1000);
        //WebElement increaseZerocal = driver.findElement(By.className("plusQuantity"));
       // increaseZerocal.click();
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[2]/div/div/section/div[1]/p/span"));
        cart.click();
        Thread.sleep(1000);

        WebElement placeOrder = driver.findElement(By.id("placeOrderButton"));
        placeOrder.click();
        Thread.sleep(1000);

        WebElement inMobile = driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/section/div/div/form/div[1]/div/div[1]/input"));
        inMobile.sendKeys("01521101382");



       /* //First name
        WebElement fnamenput = driver.findElement(By.name("firstname"));
        fnamenput.sendKeys("Mahtab");
        //Last name
        WebElement snamenput = driver.findElement(By.name("lastname"));
        snamenput.sendKeys("Hossain");
        //Mobile/Email Number
        WebElement emailInput = driver.findElement(By.name("reg_email__"));
        emailInput.sendKeys("mahtab.ykmcs@gmail.com");
        //Reenter Mobile/Email Number
        WebElement remailInput = driver.findElement(By.name("reg_email_confirmation__"));
        remailInput.sendKeys("mahtab.ykmcs@gmail.com");
        //Enter Password
        WebElement passInput = driver.findElement(By.name("reg_passwd__"));
        passInput.sendKeys("123456789");
        //Enter Day
        WebElement dayInput = driver.findElement(By.id("day"));
        dayInput.sendKeys("10");
        //Enter Month
        WebElement monthInput = driver.findElement(By.id("month"));
        monthInput.sendKeys("Dec");
        //Enter Year
        WebElement yearInput = driver.findElement(By.id("year"));
        yearInput.sendKeys("1992");
        //Enter Gender
        // WebElement gInput = driver.findElement(By.id("u_0_4_4o"));
        // gInput.click();

        //Enter Gender
        WebElement gInput = driver.findElement(By.xpath("//*[@id=\"u_0_5_F9\"]"));
        gInput.click();*/


        //Find email input field
        // WebElement emailnput = driver.findElement(By.id("email"));
        // Write email into email input field
        // emailnput.sendKeys("dummyemail@xyz.com");

        //Find password input field
        //WebElement passwordInput = driver.findElement(By.id("pass"));
        //Write email into password input field
        // passwordInput.sendKeys("123456");

        //Find login button
        //WebElement loginBtn = driver.findElement(By.name("login"));
        //Click on login button
        //loginBtn.click();

        Thread.sleep(10000);

       // driver.quit();
    }


}
