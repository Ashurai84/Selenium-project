package com.itmskills;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.itmskills.base.BaseTest;
import com.itmskills.pages.CartPage;
import com.itmskills.pages.CheckoutPage;
import com.itmskills.pages.InventoryPage;
import com.itmskills.pages.LoginPage;
public class CheckoutTest
extends BaseTest {
@Test
public void verifyCheckoutFlow() {
InventoryPage inventoryPage =
new LoginPage(driver)
.login(
"standard_user",
"secret_sauce");
Assert.assertTrue(
inventoryPage.isLoaded());
inventoryPage.addBackpackToCart();
CartPage cartPage =
inventoryPage.goToCart();
Assert.assertTrue(
driver.getCurrentUrl()
.contains("cart"));
CheckoutPage checkoutPage =
cartPage.clickCheckout();
Assert.assertTrue(
driver.getCurrentUrl()
.contains("checkout-step-one"));
checkoutPage.enterCustomerDetails(
"Muskaan",
"Gulrajani",
"400706");
}
}