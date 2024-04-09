package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(css = "h1.titulo-dept.title-defaut-interna")
    public WebElement titleCart;

    @FindBy(css = "span.prodBasket_nome")
    public WebElement nameProductCart;

    @FindBy(css = "span.precoPor_basket")
    public WebElement priceProductCart;

    @FindBy(className = "jThisBasket")
    public WebElement btnThisDestination;

    @FindBy(css = "a#ContentSite_Basketcontrol1_rptBasket_ibtBuy_0")
    public WebElement btnSameDate;

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String readTitleCart () { return titleCart.getText();}

    public String readNameProductCart() { return nameProductCart.getText();}

    public String readPriceProductCart() { return priceProductCart.getText();}

    public void clickBtnThisDestination() { btnThisDestination.click();}

    public void clickBtnSameDate() { btnSameDate.click();}
}
