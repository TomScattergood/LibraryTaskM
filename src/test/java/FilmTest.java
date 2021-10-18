import com.softwareinstitute.training.scattergood.thomas.Film;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {
    @Test
    public void testFilmTitleMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The title was not the same", "SpiderMan", testFilm.getTitle());
    }

    @Test
    public void testFilmReleaseYearMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Release year was not the same", 2001, testFilm.getReleaseYear());
    }

    @Test
    public void testFilmGenreMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Genre was not the same", "Superhero", testFilm.getGenre());
    }

    @Test
    public void testFilmFictionMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Fiction was not the same", "True", testFilm.getFiction());
    }

    @Test
    public void testFilmDirectorMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Director was not the same", "Sam Raimi", testFilm.getDirector());
    }

    @Test
    public void testFilmRuntimeMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Runtime was not the same", 121, testFilm.getRuntime());
    }

    @Test
    public void testFilmAgeRatingMethod() {
        Film testFilm = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Age rating was not the same", 12, testFilm.getAgeRating());
    }
    @Test
    public void testFilmMainStarMethod(){
        Film testFilm = new Film ("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        assertEquals("The Main Star was not the same", "Tobey Maguire", testFilm.getMainStar());
    }
}