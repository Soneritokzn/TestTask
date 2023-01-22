import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;


//Тест проверяет первую кнопку выбора "меньше 18".Проверка наличия текста.
// Остальные тесты просто открывают страницы,в них можно прописать ожидаемые условия.



public class TestTask extends Data {

private By inputLogin = By.xpath("/html/body/div/div/form/input[1]");
private By inputPassword = By.xpath("/html/body/div/div/form/input[2]");
private By enter = By.xpath("/html/body/div/div/form/button");
private By buttonAge18 = By.xpath("/html/body/form/ol/li[1]/input");
private By buttonAge24 = By.xpath("/html/body/form/ol/li[2]/input");
private By buttonAge35 = By.xpath("/html/body/form/ol/li[3]/input");
private By buttonAgeMax = By.xpath("/html/body/form/ol/li[4]/input");
private By submit = By.xpath("/html/body/form/input");
private By textResult = By.xpath("/html/body");




    @Test
    public void chooseAge18() throws InterruptedException {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        sleep(1000);
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(enter).click();
        driver.findElement(buttonAge18).click();
        driver.findElement(submit).click();
        String st = driver.findElement(textResult).getText();
        Assert.assertNotNull(st);

        driver.close();

    }
    @Test
    public void chooseAge24() throws InterruptedException {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        sleep(1000);
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(enter).click();
        driver.findElement(buttonAge24).click();
        driver.findElement(submit).click();

        driver.close();

    }
    @Test
    public void chooseAge35() throws InterruptedException {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        sleep(1000);
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(enter).click();
        driver.findElement(buttonAge35).click();
        driver.findElement(submit).click();


        driver.close();

    }
    @Test
    public void chooseAgeMax() throws InterruptedException {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        Data getDate = new Data();
        driver.get(getDate.getUrl);
        driver.manage().window().maximize();
        sleep(1000);
        driver.findElement(inputLogin).sendKeys(login);
        driver.findElement(inputPassword).sendKeys(password);
        driver.findElement(enter).click();
        driver.findElement(buttonAgeMax).click();
        driver.findElement(submit).click();
        driver.close();

    }



}
