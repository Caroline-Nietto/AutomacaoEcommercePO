package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostCodePage {

    // Mapeamento dos Elementos
    @FindBy(id = "ContentSite_uwcCalendar_txtZip")
    private WebElement txtCep;

    @FindBy(xpath = "//span[@class='btn_okcep jSelectZip']")
    private WebElement btnSelectPostCode;

    @FindBy(id = "btConfirmShippingData")
    private WebElement btnConfirmData;


    @FindBy(css = "span.seta_carrinho")
    private WebElement btnAddToCartAfterPostCode;

    private WebDriver driver;

    public PostCodePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Funções
    public void postCode(String CEP){
        txtCep.sendKeys(CEP);
    }

    public void clickBtnSelectPostCode() {btnSelectPostCode.click();}

    public void clickBtnConfirmData() {btnConfirmData.click();}

    public void clickAddCartAfterPostCode() {btnAddToCartAfterPostCode.click();}
}
