package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsProductPage {

    @FindBy(id = "ContentSite_lblProductDsName")
    private WebElement nameProduct1;

    @FindBy(css = "span.precoPor_prod")
    private WebElement priceProduct1;

    @FindBy(id = "ContentSite_lblProductDsName")
    private WebElement nameProduct2;

    @FindBy(css = "span.precoPor_prod")
    private WebElement priceProduct2;

    @FindBy(id = "ContentSite_divBtBuy")
    private WebElement btnAddToCart;

    private WebDriver driver;

    public DetailsProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Funções

    public String readNameProduct1() { return nameProduct1.getText(); }

    public String readPriceProduct1() { return priceProduct1.getText(); }

    public String readNameProduct2() { return nameProduct2.getText(); }

    public String readPriceProduct2() { return priceProduct2.getText(); }

    public void clickBtnAddToCart() { btnAddToCart.click();

    }
}
