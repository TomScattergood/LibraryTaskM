import com.softwareinstitute.training.scattergood.thomas.Book;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Metro2033StepDefinitions {
    static String isItMetro2033 (String Title){return "Metro 2033".equals(Title) ? "Yes": "No";}

    Book testTitle = new Book("Metro 2033", 2005, "Post apocalyptic", "True", "Dimitri Gluhovsky", 430);
    private String Title;
    private String ActualTitle;


    @Given("The book is Metro 2033")
    public void the_book_is_metro_2033() {Title = "Metro 2033";}



    @When("I ask whether the book is Metro 2033")
    public void i_ask_whether_the_book_is_Metro2033() {
    }

    @Then("I should be told yes")
    public void i_should_be_told_yes() {
    }
}
