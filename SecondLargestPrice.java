package largestpriceprint;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondLargestPrice {
	public static void main(String[] args) throws IOException {

		        
		        
		        ChromeDriver driver = new ChromeDriver();

		        try {
		          
		            driver.get("https://secudemo.com/v1/");
		            List<WebElement> priceElements = driver.findElements(By.cssSelector(".price"));

		            // Store all parsed prices
		           List<Double> prices = new ArrayList<>();

		            // Print all prices
		            System.out.println("All Prices:");
		            for (WebElement element : priceElements) {
		                String priceText = element.getText().replaceAll("[^\\d.]", ""); // Remove currency symbol
		                if (!priceText.isEmpty()) {
		                    double price = Double.parseDouble(priceText);
		                    prices.add(price);
		                    System.out.println(price);
		                }
		            }

		            // Print the largest price
		            if (!prices.isEmpty()) {
		                double maxPrice = Collections.max(prices);
		                System.out.println("\nLargest Price: " + maxPrice);
		            }

		           
		            System.out.println("\nScreenshot saved as 'screenshot.png'");
		        } finally {
		            // Close browser
		            driver.quit();
		        }
		       
		    }

	private TakesScreenshot driver;
	{
		
		File source = driver.getScreenshotAs(OutputType.FILE);

		File destination = new File("./janaki/product.png");

		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}
}




	


