package BusinessLogic;

import businesslogic.SearchPhrase;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Group Task
 * This class tests all the methods of the class SearchPhrase
 */
public class SearchPhraseTest extends Mockito {

    @Mock
    SearchPhrase searchPhraseMock;

    /**
     * <p>This method initializes searchPhrase object with a mock class before running the test</p>
     */
    @Before
    public void setup(){
        searchPhraseMock = new SearchPhrase();
    }

    /**
     * <p>This method calls the test api and tests the getResults method of the SearchPhrase class</p>
     * @throws IOException
     */
    @Test
    public void phraseTest(){
        SearchPhrase sp = searchPhraseMock;
        sp.API = "https://www.freelancer-sandbox.com/api/projects/0.1/projects/active?previw_description=true&job_details=1&limit=250&compact=1&languages[]=en&query=";
        assertNotEquals("", sp.getResult("JAVA playframework"));

        sp.API = "hppts://localhost:9000";
        sp.getResult("Hello wolrd");
    }
}
