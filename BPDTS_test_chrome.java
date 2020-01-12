// Import the following packages, in particular junit and selenium
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestRTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://automationpractice.com/index.php"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testR() {
    // Test name: Test_R
    // Step # | name | target | value | comment
    // 1 | open | http://automationpractice.com/index.php |  | 
    driver.get("http://automationpractice.com/index.php");
    // 2 | setWindowSize | 1920x1061 |  | 
    driver.manage().window().setSize(new Dimension(1920, 1061));
    // 3 | verifyTitle | My Store |  | 
    assertThat(driver.getTitle(), is("My Store"));
    // 4 | click | css=.sfHover > .sf-with-ul |  | 
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    // 5 | click | linkText=Summer Dresses |  | 
    driver.findElement(By.linkText("Summer Dresses")).click();
    // 6 | select | id=selectProductSort | label=Price: Lowest first | 
    {
      WebElement dropdown = driver.findElement(By.id("selectProductSort"));
      dropdown.findElement(By.xpath("//option[. = 'Price: Lowest first']")).click();
    }
    // 7 | mouseDownAt | id=selectProductSort | -718.296875,-677 | 
    {
      WebElement element = driver.findElement(By.id("selectProductSort"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 8 | mouseMoveAt | id=selectProductSort | -718.296875,-677 | 
    {
      WebElement element = driver.findElement(By.id("selectProductSort"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 9 | mouseUpAt | id=selectProductSort | -718.296875,-677 | 
    {
      WebElement element = driver.findElement(By.id("selectProductSort"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 10 | click | id=selectProductSort |  | 
    driver.findElement(By.id("selectProductSort")).click();
    // 11 | click | css=.ajax_block_product:nth-child(2) .replace-2x |  | 
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(2) .replace-2x")).click();
    // 12 | click | css=.exclusive > span |  | 
    driver.findElement(By.cssSelector(".exclusive > span")).click();
    // 13 | click | css=.button-medium > span |  | 
    driver.findElement(By.cssSelector(".button-medium > span")).click();
    // 14 | click | css=.icon-trash |  | 
    driver.findElement(By.cssSelector(".icon-trash")).click();
    // 15 | click | css=.sfHover > .sf-with-ul |  | 
    driver.findElement(By.cssSelector(".sfHover > .sf-with-ul")).click();
    // 16 | click | linkText=Summer Dresses |  | 
    driver.findElement(By.linkText("Summer Dresses")).click();
    // 17 | select | id=selectProductSort | label=Price: Lowest first | 
    {
      WebElement dropdown = driver.findElement(By.id("selectProductSort"));
      dropdown.findElement(By.xpath("//option[. = 'Price: Lowest first']")).click();
    }
    // 18 | mouseDownAt | id=selectProductSort | -718.296875,-677 | 
    {
      WebElement element = driver.findElement(By.id("selectProductSort"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    // 19 | mouseMoveAt | id=selectProductSort | -718.296875,-677 | 
    {
      WebElement element = driver.findElement(By.id("selectProductSort"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    // 20 | mouseUpAt | id=selectProductSort | -718.296875,-677 | 
    {
      WebElement element = driver.findElement(By.id("selectProductSort"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    // 21 | click | id=selectProductSort |  | 
    driver.findElement(By.id("selectProductSort")).click();
    // 22 | click | css=.ajax_block_product:nth-child(3) .replace-2x |  | 
    driver.findElement(By.cssSelector(".ajax_block_product:nth-child(3) .replace-2x")).click();
    // 23 | click | css=.exclusive > span |  | 
    driver.findElement(By.cssSelector(".exclusive > span")).click();
    // 24 | click | css=.button-medium > span |  | 
    driver.findElement(By.cssSelector(".button-medium > span")).click();
    // 25 | click | css=.standard-checkout > span |  | 
    driver.findElement(By.cssSelector(".standard-checkout > span")).click();
  }
}
