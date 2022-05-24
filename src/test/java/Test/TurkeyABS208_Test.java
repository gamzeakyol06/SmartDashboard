package Test;

import Base.Base;
import Component.ABSLines;
import Component.LeftMenu;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TurkeyABS208_Test extends Base {
/*    @BeforeTest
    public void beforemethod(){
        super.beforemethod();
        super.loginmethod();
    }*/
    @Test(priority = 1)
    public void TInsertion_Daily_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {

            leftmenu.ComboboxTurkey().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(leftmenu.ABS208()).click().build().perform();
            Thread.sleep(2000);
            System.out.println(absline.title().getText()+ " Daily");
            Thread.sleep(2000);
            actions.moveToElement(absline.TabTInsertion()).click().build().perform();

            System.out.println(absline.TabTInsertion().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality " + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 2)
    public void Winding_Daily_Success() throws InterruptedException {

        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabWinding()).click().build().perform();

            System.out.println(absline.TabWinding().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality" + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

             if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 3)
    public void Case_Daily_Success() throws InterruptedException {

        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabCase()).click().build().perform();

            System.out.println(absline.TabCase().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality" + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 4)
    public void Final_Daily_Success() throws InterruptedException {

        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Daily");
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabFinal()).click().build().perform();

            System.out.println(absline.TabFinal().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality " + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 5)

    public void TInsertion_Weekly_Success() throws InterruptedException {
        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Weekly");
            Thread.sleep(2000);
            absline.PeriodFilter().click();
            Thread.sleep(2000);
            absline.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabTInsertion()).click().build().perform();

            System.out.println(absline.TabTInsertion().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality " + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Thread.sleep(2000);
            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 6)
    public void Winding_Weekly_Success() throws InterruptedException {

        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Weekly");
            Thread.sleep(2000);
            absline.PeriodFilter().click();
            Thread.sleep(2000);
            absline.PeriodWeekly().click();
            Thread.sleep(2000);
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabWinding()).click().build().perform();

            System.out.println(absline.TabWinding().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality" + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 7)
    public void Case_Weekly_Success() throws InterruptedException {

        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Weekly");
            Thread.sleep(2000);
            absline.PeriodFilter().click();
            Thread.sleep(2000);
            absline.PeriodWeekly().click();
            Thread.sleep(2000);;
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabCase()).click().build().perform();

            System.out.println(absline.TabCase().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality" + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(priority = 8)
    public void Final_Weekly_Success() throws InterruptedException {

        LeftMenu leftmenu = new LeftMenu(driver);
        ABSLines absline = new ABSLines(driver);
        Thread.sleep(2000);
        try {
            System.out.println(absline.title().getText()+ " Weekly");
            Thread.sleep(2000);
            absline.PeriodFilter().click();
            Thread.sleep(2000);
            absline.PeriodWeekly().click();
            Thread.sleep(2000);;
            Actions actions = new Actions(driver);
            actions.moveToElement(absline.TabFinal()).click().build().perform();

            System.out.println(absline.TabFinal().getText());
            System.out.println("OEE " + absline.ValueOEE().getText());
            System.out.println("Availability " + absline.ValueAvailability().getText());
            System.out.println("Performance " + absline.ValuePerformance().getText());
            System.out.println("Quality " + absline.ValueQuality().getText());

            System.out.println("Total Production " + absline.TotalProduction().getText());
            System.out.println("Defect " + absline.Defect().getText());
            System.out.println("PPM " + absline.PPM().getText());
            System.out.println("Breakdowns " + absline.Breakdowns().getText());

            Integer totalproduction = Integer.parseInt(absline.TotalProduction().getText());
            System.out.println("Total Production "+totalproduction+"\n");

            if (totalproduction == 0) {
                Assert.fail("No Production");
                System.out.println("Production is NOK");
            }
            else{
                System.out.println("Production is OK");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @AfterTest
    public void aftertest(){
        super.aftermethod();
    }
}

