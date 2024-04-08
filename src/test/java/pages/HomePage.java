package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // Mapeamento dos Elementos

    // Categoria do Primeiro Produto
    @FindBy(css = "img[src*='Categoria-buques-de-rosas']")
    private WebElement category1;


    // Categoria do Segundo Produto
    @FindBy(linkText = "Aniversário")
    private WebElement category2;

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Funcões e Métodos - Ação

    public void clickCategoryProduct1() {
        category1.click();
    }

    public void clickCategoryProduct2() { category2.click(); }

}
