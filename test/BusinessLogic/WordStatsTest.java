package BusinessLogic;

import businesslogic.WordStats;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Kevin Pandya
 * <p>This class tests all the methods of the class WordStats</p>
 */
public class WordStatsTest extends Mockito {

    @Mock
    WordStats wordStatsMock;
    /**
     * <p>This method initializes wordStats object with a mock class before running the test</p>
     */
    @Before
    public void setup() {
        wordStatsMock = new WordStats();
    }

    /**
     * @throws IOException
     * <p>This method tests the getResult method of the class</p>
     */
    @Test
    public void statsTest(){
        WordStats ws = wordStatsMock;
        List<String> desc = new ArrayList<String>();
        desc.add("I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD");
        assertNotEquals("", ws.getResult("php" ,desc));
    }

    /**
     * @throws IOException
     * <p>This method tests the getIndStats method of the class</p>
     */
    @Test
    public void indstatsTest(){
        WordStats ws = wordStatsMock;
        assertNotEquals("", ws.getStatResult("I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD"));
    }
}
