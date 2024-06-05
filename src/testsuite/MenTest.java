package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MenTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

    }

    private void mouseHoverToElement(By id) {
    }

    private void mouseHoverToElementAndClick(By xpath) {
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
