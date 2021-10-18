import com.softwareinstitute.training.scattergood.thomas.AudioBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AudioBookTest {
    @Test
    public void testAudioBookTitleMethod() {
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Title was not the same", "Mythos:The Greek Myths Retold", testAudioBook.getTitle());
    }

    @Test
    public void testAudioBookreleaseYearmethod() {
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Release Year was not the same", 2017, testAudioBook.getReleaseYear());
    }

    @Test
    public void testGenreMethod(){
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Genre was not the same", "Mythology", testAudioBook.getGenre());
    }

    @Test
    public void testFictionMethod(){
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Fiction was not the same", "True", testAudioBook.getFiction());
    }

    @Test
    public void testNarratorMethod(){
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Narrator was not the same", "Stephen Fry", testAudioBook.getNarrator());
    }

    @Test
    public void testAuthorMethod(){
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Author was not the same", "Stephen Fry", testAudioBook.getAuthor());
    }

    @Test
    public void testRuntimeMethod(){
        AudioBook testAudioBook = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        assertEquals("The Runtime was not the same", 925, testAudioBook.getRuntime());
    }

}