import com.softwareinstitute.training.scattergood.thomas.tvSeries;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class tvSeriesTest {

    @Test
    public void testTvSeriesTitleMethod(){
        tvSeries tvSeriesTest = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Title was not the same", "Breaking bad", tvSeriesTest.getTitle());
    }

    @Test
    public void testTvSeriesReleaseYearMethod() {
        tvSeries tvSeriesTest = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Release year was not the same", 2008, tvSeriesTest.getReleaseYear());
    }

    @Test
    public void testTvGenreMethod(){
        tvSeries tvSeriesTest = new tvSeries ("breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Genre Was not the same", "Crime drama", tvSeriesTest.getGenre());
    }

    @Test
    public void testTvFictionMethod(){
        tvSeries tvSeriesTest = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Fiction was not the same", "True", tvSeriesTest.getFiction());
    }

    @Test
    public void testTvDirectorMethod(){
        tvSeries tvSeriesTest = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Director was not the same", "Vince Gilligan", tvSeriesTest.getDirector());
    }

    @Test
    public void testTvAgeRatingMethod(){
        tvSeries tvSeriesTest = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Age rating was not the same", 18, tvSeriesTest.getAgeRating());
    }

    @Test
    public void testTvEpisodeCountMethod(){
        tvSeries tvSeriesTest = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        assertEquals("The Episode count was not the same", 62, tvSeriesTest.getEpisodeCount());
    }
}
