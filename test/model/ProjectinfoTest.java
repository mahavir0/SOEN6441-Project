package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * <p>Test class to test all the method of model Projectinfo</p>
 */
public class ProjectinfoTest {

    String title = "group Project";
    String description = " I need front end developer who has depth knowledge in Html and css";
    String submitdate = "11 march 2022";
    String projectid = "22022";

    projectInfo pi;

    /**
     * <p>This method initializes the object of projectInfo</p>
     */
    @Before
    public void setup(){
        pi = new projectInfo();
    }

    /**
     * <p>Test case to match title</p>
     */
    @Test
    public void testtitle(){
        pi.setTitle(title);
        assertEquals(title , pi.getTitle());
    }

    /**
     * <p>Test case to match descriptions</p>
     */
    @Test
    public void testDescription(){
        pi.setDescription(description);
        assertEquals(description , pi.getDescription());
    }

    /**
     * <p>Test case to match submit date</p>
     */
    @Test
    public void testSubmitdate(){
        pi.setSubmitdate(submitdate);
        assertEquals(submitdate , pi.getSubmitdate());
    }

    /**
     * <p>Test case to match project id</p>
     */
    @Test
    public void testProjectid(){
        pi.setProjectid(projectid);
        assertEquals(projectid , pi.getProjectid());
    }


}
