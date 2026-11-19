package com.itmskills;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.itmskills.base.BaseTest;

import com.itmskills.pages.InventoryPage;
import com.itmskills.pages.LoginPage;
public class LoginTest extends BaseTest {
@Test
public void verifyValidLogin() {
InventoryPage inventoryPage =
new LoginPage(driver)
.login(
"standard_user",
"secret_sauce");
Assert.assertTrue(
inventoryPage.isLoaded(),
"Inventory Page did not load");
Assert.assertEquals(
inventoryPage.getPageTitle(),
"Products");
}
}