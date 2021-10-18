import com.softwareinstitute.training.scattergood.thomas.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainTest{

    @Test
    public void testGetTitleMethod(){
        Book BookTest = new Book ("Fellowship of the Ring", 1954, "Fantasy", "True", "J.R.R Tolkien", 423);
        assertEquals("The title was not the same", "Fellowship of the Ring", BookTest.getTitle());
    }
}
