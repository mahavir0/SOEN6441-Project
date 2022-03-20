package BusinessLogic;

import businesslogic.SearchFleschIndex;
import businesslogic.WordStats;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Kevin Pandya
 * <p>This class tests all the methods of the class WordStats</p>
 */
public class SearchFleschIndexTest extends Mockito {

    @Mock
    SearchFleschIndex searchFleschIndexMock;
    /**
     * <p>This method initializes wordStats object with a mock class before running the test</p>
     */
    @Before
    public void setup() {
        searchFleschIndexMock = new SearchFleschIndex();
    }

    /**
     * <p>This method tests the getResult method of the class</p>
     */
    @Test
    public void fleschIndexTest(){
        SearchFleschIndex sfi = searchFleschIndexMock;
        assertNotNull(sfi.getResult("I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD"));
    }

    /**
     * <p>This method tests the getFkgl method of the class</p>
     */
//    @Test
//    public void fkglTest(){
//        SearchFleschIndex sfi = searchFleschIndexMock;
//        assertNotNull(sfi.getFkgl(110));
//    }

    /**
     * <p>Test case for testing getEducationLevel method</p>
     */
    @Test
    public void educationLevelTest(){
        SearchFleschIndex sfi = searchFleschIndexMock;
        assertEquals("Early", sfi.getEducationLevel(101));
        assertEquals("5th grade", sfi.getEducationLevel(95));
        assertEquals("6th grade", sfi.getEducationLevel(85));
        assertEquals("7th grade", sfi.getEducationLevel(74));
        assertEquals("8th grade", sfi.getEducationLevel(68));
        assertEquals("9th grade", sfi.getEducationLevel(64));
        assertEquals("High School", sfi.getEducationLevel(53));
        assertEquals("Some College", sfi.getEducationLevel(40));
        assertEquals("College Graduate", sfi.getEducationLevel(10));
        assertEquals("Law School Graduate", sfi.getEducationLevel(-10));
        assertEquals("Law School Graduate", sfi.getEducationLevel(0));
    }
}
