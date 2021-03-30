package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class Post extends Base{
    private Base base; //cria um objeto Base

    //Criar o construtor
    public Post(Base base) {
        this.base = base;
    }

    @Given("^access Wikipedia in Portuguese$")
    public void accessWikipediaInPortuguese() {
        base.driver.get(base.url);
    }

    @When("^search for \"([^\"]*)\"$")
    public void searchFor(String produto) {
        base.driver.findElement(By.id("searchInput")).click(); //Clica
        base.driver.findElement(By.id("searchInput")).clear(); //Limpa
        base.driver.findElement(By.id("searchInput")).sendKeys(produto) ;
        base.driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click(); //Clica em buscar
    }

    @Then("^shows the text \"([^\"]*)\" on title$")
    public void showsTheTextOnTitle(String produto)  {
        assertTrue(base.driver.getTitle().contains(produto));
    }
}
