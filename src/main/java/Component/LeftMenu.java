package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftMenu {
    WebDriver driver;
    public LeftMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public List<WebElement> span_Value(){
    List<WebElement> spans = driver.findElements(By.tagName("span"));return spans;}
    By comboboxturkey = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]");
    public WebElement ComboboxTurkey() {return driver.findElement(comboboxturkey);}
    By abs202 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[1]");
    public WebElement ABS202() {return driver.findElement(abs202);}
    By abs203 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[2]");
    public WebElement ABS203() {return driver.findElement(abs203);}
    By abs204 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[3]");
    public WebElement ABS204() {return driver.findElement(abs204);}
    By abs205 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[4]");
    public WebElement ABS205() {return driver.findElement(abs205);}
    By abs206 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[5]");
    public WebElement ABS206() {return driver.findElement(abs206);}
    By abs207 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[6]");
    public WebElement ABS207() {return driver.findElement(abs207);}
    By abs208 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[7]");
    public WebElement ABS208() {return driver.findElement(abs208);}
    By abs209 = By.xpath("//*[@id=\"mCSB_1_container\"]/ul/li[6]/ul/li[1]/ul/li[8]");
    public WebElement ABS209() {return driver.findElement(abs209);}
}