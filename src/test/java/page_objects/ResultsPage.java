package page_objects;

import com.maven.training.utils.RandomHelper;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {



    public  String selectAnyProduct()
    {
        List<WebElement> products= driver.findElements(By.cssSelector("a[data-test='component-product-card-title']"));
        int numberOfProducts=products.size();
        int indexNumber= new RandomHelper().randomNumber(numberOfProducts);
        WebElement selectedElement=products.get(indexNumber);
        String expectedElement=  selectedElement.getText();
        selectedElement.click();
        sleep(5000);
        return expectedElement;
    }


    public void selectAnyCustomerRating(String choice)
    {
        //collect all web elements
        //for loop
        //get text of each element
        //get the intrest rating
        //break

        List<WebElement> ratingElements= driver.findElements(By.cssSelector("#content-container label"));
        for(WebElement ratingElement:ratingElements)
        {
            String ratingLabel=ratingElement.getText();
            if(ratingLabel.equalsIgnoreCase(choice))

            {
                ratingElement.click();
                break;
            }
        }


    }

    public List<Double> getAllProductsRatings()
    {
        //Scope of the method
        //web element for all images
        //for
        //read DOM Values
        //store every product rating in list
        //assert
        List <Double> ratingCollection =new ArrayList<>();//collect ratings
        List<WebElement>  ratingLabels= driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for (WebElement ratingLabel:ratingLabels)
        {
            String ratingValue=ratingLabel.getAttribute("data-star-rating");
            double ratingValueInDouble= Double.parseDouble(ratingValue);
            ratingCollection.add(ratingValueInDouble);

        }
        return ratingCollection;

    }
}
