package largestpriceprint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class PriceExtractor {
    public static void main(String[] args) throws IOException {
        // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://www.amazon.in/s?k=mobiles"); // Example URL

        // Collect all price elements (change XPath as per website structure)
        List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

        List<Integer> prices = new ArrayList<>();

        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText().replace(",", "").trim();
            if (!priceText.isEmpty()) {
                prices.add(Integer.parseInt(priceText));
            }
        }

        // Print all prices
        System.out.println("All Prices: " + prices);

        // Find largest price
        int maxPrice = Collections.max(prices);
        System.out.println("Largest Price: " + maxPrice);

        // Take Screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshot.png"));

        // Close browser
        driver.quit();
    }
}
