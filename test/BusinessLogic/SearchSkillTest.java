package BusinessLogic;

import businesslogic.SearchSkill;
import org.junit.Test;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
/**
 * @author Mahavir
 * <p>This class tests all the methods of the class SearchSkill</p>
 */
public class SearchSkillTest extends Mockito {

    @Mock
    SearchSkill searchSkillMock;
    /**
     * <p>This method initializes searchSkill object with a mock class before running the test</p>
     */
    @Before
    public void setup(){
        searchSkillMock = new SearchSkill();
    }

    /**
     * @throws IOException
     * <p>This method calls the test api and tests the getSkillResult and getResult methods of the class</p>
     */
    @Test
    public void skillTest(){
        SearchSkill ss = searchSkillMock;
        ss.API = "https://www.freelancer-sandbox.com/api/projects/0.1/projects/active?previw_description=true&limit=10&job_details=true&compact=true&languages[]=en&jobs[]=";
        assertNotEquals("", ss.getResult("3","PHP"));

        ss.API = "hppts://localhost:9000";
        ss.getResult("3","PHP");
    }
}
