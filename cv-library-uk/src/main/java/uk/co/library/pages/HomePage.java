package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;

    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDownMenu;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;

    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;

    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDownMenu;

    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDownMenu;

    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @FindBy(xpath = "//*[contains(text(),'Accept')]")
    WebElement acceptCookies;

    public void enterJobTitle(String jobTitle){
        Reporter.log("Enter job "+jobTitle+ " to jobTitle field "+jobTitleField.toString() + "<br>");
        sendTextToElement(jobTitleField, jobTitle);
    }
    public void enterLocation(String location){
        Reporter.log("Enter location "+location+ " to location field "+locationField.toString() + "<br>");
        sendTextToElement(locationField, location);
    }
    public void selectDistance(String distance){
        Reporter.log("Selecting distance "+distance+" from dropdown "+distanceDropDownMenu.toString() + "<br>");
        selectByValueFromDropDown(distanceDropDownMenu, distance);
    }
    public void clickOnMoreSearchOption(){
        Reporter.log("Clicking on moreSearchOptionsLink "+ moreSearchOptionsLink.toString()+ "<br>");
        clickOnElement(moreSearchOptionsLink);
    }
    public void enterMinSalary(String minSalary){
        Reporter.log("Enter minSalary "+minSalary+ " to email field "+salaryMin.toString() + "<br>");
        sendTextToElement(salaryMin, minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        Reporter.log("Enter maxSalary "+maxSalary+ " to email field "+salaryMax.toString() + "<br>");
        sendTextToElement(salaryMax, maxSalary);
    }
    public void selectSalaryType(String sType){
        Reporter.log("Selecting salary Type "+sType+" from dropdown "+salaryTypeDropDownMenu.toString() + "<br>");
        selectByValueFromDropDown(salaryTypeDropDownMenu, sType);
    }
    public void selectJobType(String jobType){
        Reporter.log("Selecting job Type "+jobType+" from dropdown "+jobTypeDropDownMenu.toString() + "<br>");
        selectByValueFromDropDown(jobTypeDropDownMenu, jobType);
    }
    public void clickOnFindJobsBtn(){
        Reporter.log("Clicking on findJobsBtn "+ findJobsBtn.toString()+ "<br>");
        clickOnElement(findJobsBtn);
    }

    public void clickOnAcceptCookie(){
        Reporter.log("Clicking on acceptCookies "+ acceptCookies.toString()+ "<br>");
        switchToiFrame("gdpr-consent-notice");
        clickOnElement(acceptCookies);
    }







}
