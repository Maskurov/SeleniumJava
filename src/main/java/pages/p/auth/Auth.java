package pages.p.auth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class Auth extends BasePage {

    public Auth(WebDriver driver) {
        super(driver);
    }

    /**
     * элементы для авторизации
     */


    private final By inputUsername = By.xpath("//input[@placeholder='Username']");
    private final By inputPassword = By.xpath("//input[@type='password']");
    private final By buttonLogin = By.xpath("//input[@type='submit']");
    private final By buttonSortirovka = By.xpath("//select[@class='product_sort_container']");
    private final By buttonNameZ = By.xpath("//option[@value='za']");
    private final By imgBackpack = By.xpath("//img[@alt='Sauce Labs Backpack']");
    private final By buttonAdd = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    private final By buttonBasket = By.xpath("//a[@class='shopping_cart_link']");
    private final By buttonCheckout = By.xpath("//button[@class='btn btn_action btn_medium checkout_button']");
    public final By inputFirstName = By.xpath("//input[@placeholder='First Name']");
    public final By inputLastName = By.xpath("//input[@placeholder='Last Name']");
    public final By inputPostalCode = By.xpath("//input[@placeholder='Zip/Postal Code']");
    public final By buttonContinue = By.xpath("//input[@type='submit']");
    public final By buttonFinish = By.xpath("//button[@class='btn btn_action btn_medium cart_button']");
    public final By buttonBackHome = By.xpath("//button[@class='btn btn_primary btn_small']");




    /**
     *
     * команды для прохождения теста
     *
     */


    public Auth enterUsername(String username) {
        driver.findElement(inputUsername).sendKeys(username);
        return this;
    }

    public Auth enterPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
        return this;
    }

    public Auth selectButtonLogin() {
        driver.findElement(buttonLogin).click();
        return this;

    }

    public Auth selectSortirovka() {
        driver.findElement(buttonSortirovka).click();
        return this;
    }

    public Auth selectNameZ() {
        driver.findElement(buttonNameZ).click();
        return this;
    }

    public Auth selectImgBackpack() {
        driver.findElement(imgBackpack).click();
        return this;
    }

    public Auth selectButtonAdd() {
        driver.findElement(buttonAdd).click();
        return this;
    }

    public Auth selectButtonBasket() {
        driver.findElement(buttonBasket).click();
        return this;
    }

    public Auth selectButtonCheckout() {
        driver.findElement(buttonCheckout).click();
        return this;
    }

    public Auth enterFirstName() {
        driver.findElement(inputFirstName).sendKeys("Vasya");
        return this;
    }

    public Auth enterLastName() {
        driver.findElement(inputLastName).sendKeys("Ivanov");
        return this;
    }

    public Auth enterPostalCode() {
        driver.findElement(inputPostalCode).sendKeys("213454");
        return this;
    }

    public Auth selectContinue() {
        driver.findElement(buttonContinue).click();
        return this;
    }

    public Auth selectFinish() {
        driver.findElement(buttonFinish).click();
        return this;
    }

    public Auth selectBackHome() {
        driver.findElement(buttonBackHome).click();
        return this;
    }

}
