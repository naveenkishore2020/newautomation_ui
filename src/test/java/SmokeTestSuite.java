/*
import driver.DriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import page_objects.HomePage;
import page_objects.ProductsDescriptionPage;
import page_objects.ResultsPage;
import page_objects.TrolleyPage;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SmokeTestSuite extends Hooks
        {
            private DriverManager driverManager=new DriverManager();
            private HomePage homePage=new HomePage();
            private ResultsPage resultsPage=new ResultsPage();
            private TrolleyPage trolleyPage=new TrolleyPage();
            private ProductsDescriptionPage productsDescription=new ProductsDescriptionPage();



            @Test
            public void SearchTest()
            {
                String actualHeader=homePage.getHeader();
                assertThat(actualHeader,is(equalToIgnoringCase("nike")));
                String actualUrl=homePage.getCurrentUrl();
                assertThat(actualUrl,endsWith("nike"));

            }


         @Test
        public void BasketTest()
        {
             homePage.doSearch("nike");
             String selectedProduct= resultsPage.selectAnyProduct();
             productsDescription. addToTrolley();
             productsDescription.goToTrolley();
             List<String> trolleyItems= trolleyPage.getProductsInTrolley();
             assertThat(trolleyItems,hasItem(selectedProduct));
             driverManager.closeBrowser();


        }

       @Test
        public void trolleyQuantityTest()
        {

            homePage.doSearch("nike");
            String selectedProduct= resultsPage.selectAnyProduct();
            productsDescription.addToTrolley();
            productsDescription.goToTrolley();
            double priceForOneQuantity= trolleyPage.getPriceFromBasket();
            double expected=priceForOneQuantity*3;

           trolleyPage.selectQuantity();
           double actual=trolleyPage.getPriceFromBasket();
           assertThat(expected,is(equalTo(actual)));

        }

        @Test
       public void checkOutTest()
       {


       }

       @Test
    public void customerRatingTest() throws InterruptedException {
           //What is the scope of the test
           //search//select any review//wait for page refresh//collect all products rating //assert
           homePage.doSearch("nike");
           resultsPage.selectAnyCustomerRating("4 or more");
           sleep(5000);
           List<Double> allProductRatings= resultsPage.getAllProductsRatings();
           for(Double productRating:allProductRatings)
           {
               System.out.println(productRating.toString());
           }

           driverManager.closeBrowser();


       }


    }

*/
