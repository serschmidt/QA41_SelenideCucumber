package de.sconto.stepDefinition;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.CustomerAccountPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
  HomePage home;
  LoginPage login;
  CustomerAccountPage customer;

  @When("User clicks on User icon")
  public void click_on_User_icon() {
    home = Selenide.page(HomePage.class);
    login = home.clickOnLoginIcon();
  }

  @Then("User verifies Login form")
  public void verify_Login_form() {
    login.loginFormTitle();
  }

  @When("User enters valid data")
  public void enter_valid_data() {
    login.validLoginInput();
  }

  @And("User clicks on Anmelden button")
  public void click_on_Anmelden_button() {
    login.clickOnAnmelden();
  }

  @Then("User verifies user name status")
  public void verify_user_name_status() {
    home.userNameStatus();
  }

  @Then("User verifies user name")
  public void verify_user_name() {
    customer = Selenide.page(CustomerAccountPage.class);
    customer.userName("Hans Mustermann");
  }

  // Negative Test:

  @And("User enters valid email and invalid password")
  public void enter_valid_email_invalid_password(DataTable table) {
    login.enterInvalidePassword(table);
  }

  @Then ("User verifies Error Message")
  public void verify_Error(){
    login.isMessageTextPresent("Benutzername nicht gefunden oder Passwort falsch.");
  }

}
