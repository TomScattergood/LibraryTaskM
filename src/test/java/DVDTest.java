import com.softwareinstitute.training.scattergood.thomas.DVD;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDTest {
    @Test
    public void testDVDTitleMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The title was not the same", "SpiderMan", testDVD.getTitle());
    }

    @Test
    public void testDVDReleaseYearMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The Release year was not the same", 2001, testDVD.getReleaseYear());
    }

    @Test
    public void testDVDGenreMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The Genre was not the same", "Superhero", testDVD.getGenre());
    }

    @Test
    public void testDVDFictionMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The Fiction was not the same", "True", testDVD.getFiction());
    }

    @Test
    public void testDVDDirectorMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The Director was not the same", "Sam Raimi", testDVD.getDirector());
    }

    @Test
    public void testDVDRuntimeMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The Runtime was not the same", 121, testDVD.getRuntime());
    }

    @Test
    public void testDVDAgeRatingMethod() {
        DVD testDVD = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        assertEquals("The Age rating was not the same", 12, testDVD.getAgeRating());
    }

}