package de.sconto.stepDefinition;

import de.sconto.pages.HomePage;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static de.sconto.pages.HomePage.baseURL;

public class HomePageSteps {

  HomePage homePage;

  @Given("User is on HomePage")
  public void user_is_on_home_page() {
    homePage=open(baseURL, HomePage.class);
//    System.setProperty("selenide.browser","Firefox");
    getWebDriver().manage().window().maximize();
    homePage.acceptCookies();

  }


}
