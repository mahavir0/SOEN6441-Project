package BusinessLogic;

import businesslogic.SearchPhrase;
import businesslogic.Session;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


/**
 * @author Group Task
 * <p>This class tests all the methods of the class Session</p>
 */
public class SessionTest extends Mockito {

    @Mock
    Session session;

    /**
     * <p>This method initializes wordStats object with a mock class before running the test</p>
     */
    @Before
    public void setup(){
        session = new Session();
    }

    /**
     * <p>This method tests the getSession method and checks the session id</p>
     */
    @Test
    public void testGetSession(){
        SearchPhrase ss = new SearchPhrase();
        session.getSession("vbnm741g",ss);
        assertEquals(ss,session.getSession("vbnm741g",ss));
    }

    /**
     * <p>This method tests the setSession method by matching the session id</p>
     */
    @Test
    public void testSetSession(){
        SearchPhrase ss = new SearchPhrase();
        session.setSession("cs646e2w",ss);
        assertEquals(ss,session.getSession("cs646e2w",ss));
    }
}
