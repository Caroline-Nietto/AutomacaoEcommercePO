package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {


    // Produto 1
    @FindBy(css = "img[alt='Buquê de 6 Rosas Vermelhas']")
    private WebElement product1;

    @FindBy(css = "img[alt='Cesta Sonho dos Chocólatras']")
    private WebElement product2;

    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    // Funcões e Métodos - Ação

    public void clickProduct1() {product1.click();}

    public void clickProduct2() {product2.click();}

}
