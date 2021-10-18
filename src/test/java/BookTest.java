import com.softwareinstitute.training.scattergood.thomas.Book;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testBookTitleMethod(){
    Book testBook = new Book ("Metro 2033", 2005, "Post apocalyptic", "True", "Dimitri Gluhovsky", 430);
    assertEquals("The Title was not the same", "Metro 2033", testBook.getTitle());
    }

    @Test
    public void testBookReleaseYearMethod(){
        Book testBook = new Book ("Metro 2033", 2005, "post apocalyptic", "True", "Dimitri Gluhovsky", 430);
        assertEquals("The Release year was not the same", 2005, testBook.getReleaseYear());
    }
}
