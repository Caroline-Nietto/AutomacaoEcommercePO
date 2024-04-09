package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    @FindBy(css = "h1.titulo-dept.title-defaut-interna")
    public WebElement titleCart;

    @FindBy(css = "span.prodBasket_nome")
    public WebElement nameProductCart1;

    @FindBy(css = "span.precoPor_basket")
    public WebElement priceProductCart1;

    @FindBy(css = "span.prodBasket_nome")
    public WebElement nameProductCart2;

    @FindBy(css = "span.precoPor_basket")
    public WebElement priceProductCart2;

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

    public String readNameProductCart1() { return nameProductCart1.getText();}

    public String readPriceProductCart1() { return priceProductCart1.getText();}

    public String readNameProductCart2() { return nameProductCart2.getText();}

    public String readPriceProductCart2() { return priceProductCart2.getText();}

    public void clickBtnThisDestination() { btnThisDestination.click();}

    public void clickBtnSameDate() { btnSameDate.click();}
}
