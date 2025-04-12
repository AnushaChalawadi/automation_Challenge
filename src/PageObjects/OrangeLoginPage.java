package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLoginPage {

    WebDriver driver;
    
    // Locating the username text box
    
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement user_name;
    
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement user_password;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement login_Button;

    // Constructor that initializes the WebDriver and PageFactory
    public OrangeLoginPage(WebDriver driver) {
        this.driver = driver;
        // Initialize elements using PageFactory
        PageFactory.initElements(driver, this);
    }
    
    // Method that performs login action using the web elements
    public void enterUserName(String username) {
        user_name.sendKeys(username);
    }
    
    public void enterPassword(String password) {
    	user_password.sendKeys(password);
    }
    
    public void clickOnLoginButton() {
    	login_Button.click();
    }
    
}
