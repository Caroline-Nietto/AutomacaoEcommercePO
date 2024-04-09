package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSelect2Products {

  private WebDriver driver;

  private HomePage homePage;
  private ProductsPage productsPage;
  private DetailsProductPage detailsProductPage;

  private PostCodePage postCodePage;

  private CartPage cartPage;


    public TestSelect2Products(Base base) {
        this.driver = base.driver;

        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        detailsProductPage = new DetailsProductPage(driver);
        postCodePage = new PostCodePage(driver);
        cartPage = new CartPage(driver);
    }


    @Given("I access the giuliana store T")
    public void i_access_the_giuliana_store_T () {

        driver.get("https://www.giulianaflores.com.br/");
    }

    @When("I click on the product category T")
    public void i_click_on_the_product_category_T () {
        homePage.clickCategoryProduct1();
    }


    @Then("I select the product1 T")
    public void i_select_the_product1_T () {
        productsPage.clickProduct1(); }


    @Then("I check the product1 name {string} T")
    public void i_check_the_product1_name_T (String productTitle1){
        assertEquals(detailsProductPage.readNameProduct1(), productTitle1);

    }


    @Then("I check the product1 price {string} T")
    public void i_check_the_product1_price_T (String productPrice1){
        assertEquals(detailsProductPage.readPriceProduct1(), productPrice1);
    }


    @Then("I click on add to cart T")
    public void i_click_on_add_to_cart_T () {
        detailsProductPage.clickBtnAddToCart();
    }


    @Then("I fill in the field with the postcode for delivery {string} T")
    public void i_fill_in_the_field_with_the_postcode_for_delivery_T (String CEP) {
        postCodePage.postCode(CEP);
    }


    @When("I click on the ok button to select the postcode T")
    public void i_click_on_the_ok_button_to_select_the_postcode_T () {
        postCodePage.clickBtnSelectPostCode();
    }


    @Then("I select the delivery period T")
    public void i_select_the_delivery_period_T () {
        postCodePage.clickBtnConfirmData(); }


    @Then("I click on add to cart after to select the postcode T")
    public void i_click_on_add_to_cart_after_to_select_the_postcode_T () {
        postCodePage.clickAddCartAfterPostCode();
    }


    @Then("I verify the page's title {string} in cart T")
    public void i_verify_the_pages_title_in_cart_T (String pageTitle){
        assertEquals(cartPage.readTitleCart(), pageTitle);
    }


    @Then("I verify the product1 title {string} in cart T")
    public void i_verify_the_product1_title_in_cart_T (String productTitleCart1){
        assertEquals(cartPage.readNameProductCart1(), productTitleCart1);
    }


    @Then("I verify the price of the product1 {string} T")
    public void i_verify_the_price_of_the_product1_in_cart_T (String productPrice1){
        assertEquals(cartPage.readPriceProductCart1(), productPrice1);
    }


    @Then("I click buy more for this destination T")
    public void i_click_buy_more_for_this_destination_T() {
        cartPage.clickBtnThisDestination();
    }
    @Then("I click on Same Date T")
    public void i_click_on_same_date_T() {
        cartPage.clickBtnSameDate();
    }


    @Then("I click on the Category Menu T")
        public void i_click_on_the_category_menu_T() {
        homePage.clickCategoryProduct2();
    }


    @Then("I select the product2 T")
    public void i_select_the_product2_T()  {
         productsPage.clickProduct2(); }


    @Then("I check the product2 name {string} T")
    public void i_check_the_product2_name_T(String productTitle2) {
        assertEquals(detailsProductPage.readNameProduct2(), productTitle2);
    }


    @Then("I check the price of the product2 {string} T")
    public void i_check_the_price_of_the_product2_T(String productPrice2) {
        assertEquals(detailsProductPage.readPriceProduct2(), productPrice2);
    }

    @Then("I click Add to Cart T")
    public void i_click_add_to_cart_T() { detailsProductPage.clickBtnAddToCart();
    }


    @Then("I select the delivery time T")
    public void i_select_the_delivery_time_T() {
        postCodePage.clickBtnConfirmData();
    }


    @Then("I click ok T")
    public void i_click_ok_T() {
        detailsProductPage.clickBtnAddToCart();
    }
    @Then("I check the page's title {string} in cart T")
    public void i_check_the_page_s_title_in_cart_T(String pageTitle) {
         assertEquals(cartPage.readTitleCart(), pageTitle);
    }

    @Then("I check the product1 name {string} in cart T")
    public void i_check_the_product1_name_in_cart_T(String productTitleCart1) {
        assertEquals(cartPage.readNameProductCart1(), productTitleCart1);
    }

    @Then("I check the product1 price {string} in cart T")
    public void i_check_the_product1_price_in_cart_T(String productPrice1) {
        assertEquals(cartPage.readPriceProductCart1(), productPrice1);
    }


    @Then("I check the product2 name {string} in cart T")
    public void i_check_the_product2_name_in_cart_T(String productTitleCart2) {
        assertEquals(cartPage.readNameProductCart2(), productTitleCart2);
    }


    @Then("I check the product2 price {string} in cart T")
    public void i_check_the_product2_price_in_cart_T(String productPrice2) {
        assertEquals(cartPage.readPriceProductCart2(), productPrice2);
    }
}
