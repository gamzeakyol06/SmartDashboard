package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ABSLines {

    WebDriver driver;
    public ABSLines(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    By title = By.xpath("//h2[contains(text(),'TURKEY')]");
    public WebElement title() {return  driver.findElement(title);}

    By tabtinsertion = By.linkText("T. INSERTION");
    public WebElement TabTInsertion() {return driver.findElement(tabtinsertion);}
    By tabwinding = By.linkText("WINDING");
    public WebElement TabWinding() {return driver.findElement(tabwinding);}
    By tabcaseassembly = By.linkText("CASE ASSEMBLY");
    public WebElement TabCaseAssembly() {return driver.findElement(tabcaseassembly);}
    By tabfinal = By.linkText("FINAL");
    public WebElement TabFinal() {return driver.findElement(tabfinal);}
    By tabcase = By.linkText("CASE");
    public WebElement TabCase() {return driver.findElement(tabcase);}

    By valueoee = By.xpath("//h4[@id='oee']");
    public WebElement ValueOEE() {return driver.findElement(valueoee);}
    By valueavailability = By.xpath("//h4[@id='availability']");
    public WebElement ValueAvailability() {return driver.findElement(valueavailability);}
    By valueperformance = By.xpath("//h4[@id='performance']");
    public WebElement ValuePerformance() {return driver.findElement(valueperformance);}
    By valuequality = By.xpath("//h4[@id='quality']");
    public WebElement ValueQuality() {return driver.findElement(valuequality);}

    By totalprodution = By.xpath("//span[@id='totalprod']");
    public WebElement TotalProduction() {return driver.findElement(totalprodution);}
    By defect = By.xpath("//span[@id='defect']");
    public WebElement Defect() {return driver.findElement(defect);}
    By ppm = By.xpath("//span[@id='ppm']");
    public WebElement PPM() {return driver.findElement(ppm);}
    By breakdowns = By.xpath("//span[@id='breakdown']");
    public WebElement Breakdowns() {return driver.findElement(breakdowns);}

    By target = By.xpath("//h6[@id='target']");
    public WebElement Target() {return driver.findElement(target);}
    By ppmlimit = By.xpath("//h6[@id='ppmlimit']");
    public WebElement PPMLimit() {return driver.findElement(ppmlimit);}

    By periodfilter = By.xpath("//input[@id='drpFilter']");
    public WebElement PeriodFilter() {return driver.findElement(periodfilter);}
    By productfilter = By.xpath("//input[@id='drpProduct']");
    public WebElement ProductFilter() {return driver.findElement(productfilter);}

    By perioddaily = By.xpath("//div[contains(text(), 'Daily')");
    public WebElement PeriodDaily() {return driver.findElement(perioddaily);}
    By periodhourly = By.xpath("//div[contains(text(), 'Hourly')]");
    public WebElement PeriodHourly() {return driver.findElement(periodhourly);}
    By periodmonthly = By.xpath("//div[contains(text(), 'Monthly')]");
    public WebElement PeriodMonthly() {return driver.findElement(periodmonthly);}
    By periodweekly = By.xpath("//div[contains(text(), 'Weekly')]");
    public WebElement PeriodWeekly() {return driver.findElement(periodweekly);}
    By yesterday = By.xpath("//div[contains(text(), 'Yesterday')]");
    public WebElement Yesterday() {return driver.findElement(yesterday);}
    By previousweek = By.xpath("//div[contains(text(), 'Previous Week')]");
    public WebElement PreviousWeek() {return driver.findElement(previousweek);}
    By previousmonth = By.xpath("//div[contains(text(), 'Previous Month')]");
    public WebElement PreviousMonth() {return driver.findElement(previousmonth);}
}
