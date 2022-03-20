package model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>Test class for testing all the methods of model Resultlist</p>
 */
public class ResultlistTest {


    List<String> descriptions = Arrays.asList(new String[]{"hello world"});
    List<Searchphraseresult> result = Arrays.asList(new Searchphraseresult[]{});
    Resultlist rl;
    int fleschIndex = 106;
    float fkgl = 20;

    /**
     * <p>It initializes the object of Resultlist class</p>
     */
    @Before
    public void setup(){rl = new Resultlist();}

    /**
     * <p>Test case to match description</p>
     */
    @Test
    public void testDescription(){
        rl.setDescriptions(descriptions);
        assertEquals(descriptions , rl.getDescriptions());
    }

    /**
     * <p>Test case to match result</p>
     */
    @Test
    public void testResult(){
        rl.setResult(result);
        assertEquals(result , rl.getResult());
    }

    /**
     * <p>Test case to match Flesch Index</p>
     */
    @Test
    public void testFleschIndex() {
        rl.setFleschIndex(fleschIndex);
        assertEquals(106, rl.getFleschIndex(), 0);
    }

    /**
     * <p>Test case to match FKGL</p>
     */
    @Test
    public void testFkgl() {
        rl.setFkgl(fkgl);
        assertEquals(fkgl, rl.getFkgl(), 0);
    }

    /**
     * <p>Test case to match Education Level</p>
     */
    @Test
    public void testEdLevel() {
        rl.setEdLevel("Early");
        assertEquals("Early", rl.getEdLevel());
    }

}
