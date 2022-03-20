package model;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * <p>This class contains test cases for model class Profile</p>
 */
public class ProfileTest {

    String id = "112233";
    String username = "Webcaptain";
    String displayname = "webcap";
    String publicname = "webcaptain";
    LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();;
    String hourylyrate ="23";
    String title = "Hiring for java";
    String profiledescription = " I have depth knowledge in java ";
    String recommendations = "90";
    String country = "India";
    String city = "Ahmedabad";
    String company = "softvan";
    LinkedHashMap<String, String> qualifications = new LinkedHashMap<String, String>();;
    String role ="Freelancer";
    String registrationdate ="12 March 2022";
    String chosenrole = "Employer";
    String primarylanguage = "english";
    String limitedaccount = "Closed";
    String code = "ind";
    String sign ="xyz";
    String emailverified= "yes";
    String currencyname = "rupees";
    String timezone = "asian";
    List<projectInfo> projects = Arrays.asList(new projectInfo[]{});

    Profile p ;

    /**
     * <p>It initializes the project object</p>
     */
    @Before
    public void setup(){
        p = new Profile();
    }

    /**
     * <p>Test case to match id</p>
     */
    @Test
    public void testId(){
        p.setId(id);
        assertEquals(id , p.getId());
    }

    /**
     * <p>Test case to match username</p>
     */
    @Test
    public void testUsername(){
        p.setUsername(username);
        assertEquals(username, p.getUsername());
    }

    /**
     * <p>Test case to match Display Name</p>
     */
    @Test
    public void testDisplayname(){
        p.setDisplayname(displayname);
        assertEquals(displayname , p.getDisplayname());
    }

    /**
     * <p>Test case to match public name</p>
     */
    @Test
    public void testPublicname(){
        p.setPublicname(publicname);
        assertEquals(publicname , p.getPublicname());
    }

    /**
     * <p>Test case to match hourly rate</p>
     */
    @Test
    public void testHourlyrate(){
        p.setHourylyrate(hourylyrate);
        assertEquals(hourylyrate , p.getHourylyrate());
    }

    /**
     * <p>Test case to match title</p>
     */
    @Test
    public void testTitle(){
        p.setTitle(title);
        assertEquals(title ,p.getTitle());
    }

    /**
     * <p>Test case to match profile description</p>
     */
    @Test
    public void testProfiledescription(){
        p.setProfiledescription(profiledescription);
        assertEquals(profiledescription , p.getProfiledescription());
    }

    /**
     * <p>Test case to match recommendations</p>
     */
    @Test
    public void testRecommendations(){
        p.setRecommendations(recommendations);
        assertEquals(recommendations , p.getRecommendations());
    }

    /**
     * <p>Test case to match country</p>
     */
    @Test
    public void testCountry(){
        p.setCountry(country);
        assertEquals(country , p.getCountry());
    }

    /**
     * <p>Test case to match city</p>
     */
    @Test
    public void testCity(){
        p.setCity(city);
        assertEquals(city , p.getCity());
    }

    /**
     * <p>Test case to match code</p>
     */
    @Test
    public void testCode(){
        p.setCode(code);
        assertEquals(code , p.getCode());
    }

    /**
     * <p>Test case to match company</p>
     */
    @Test
    public void testCompany(){
        p.setCompany(company);
        assertEquals(company , p.getCompany());
    }

    /**
     * <p>Test case to match sign</p>
     */
    @Test
    public void testSign(){
        p.setSign(sign);
        assertEquals(sign , p.getSign());
    }

    /**
     * <p>Test case to match role</p>
     */
    @Test
    public void testRole(){
        p.setRole(role);
        assertEquals(role , p.getRole());
    }

    /**
     * <p>Test case to match chosen role</p>
     */
    @Test
    public void testChosenrole(){
        p.setChosenrole(chosenrole);
        assertEquals(chosenrole, p.getChosenrole());
    }

    /**
     * <p>Test case to match Registration Date</p>
     */
    @Test
    public void testRegistrationdate(){
        p.setRegistrationdate(registrationdate);
        assertEquals(registrationdate , p.getRegistrationdate());
    }

    /**
     * <p>Test case to match Limited Account</p>
     */
    @Test
    public void testLimitedAccount(){
        p.setLimitedaccount(limitedaccount);
        assertEquals(limitedaccount , p.getLimitedaccount());
    }

    /**
     * <p>Test case to match primary language</p>
     */
    @Test
    public void testPrimarylanguage(){
        p.setPrimarylanguage(primarylanguage);
        assertEquals(primarylanguage , p.getPrimarylanguage());
    }

    /**
     * <p>Test case to match if email is verified or not</p>
     */
    @Test
    public void testEmailverified(){
        p.setEmailverified(emailverified);
        assertEquals(emailverified , p.getEmailverified());
    }

    /**
     * <p>Test case to match currency name</p>
     */
    @Test
    public void testCurrencyname(){
        p.setCurrencyname(currencyname);
        assertEquals(currencyname , p.getCurrencyname());
    }

    /**
     * <p>Test case to match time zone</p>
     */
    @Test
    public void testTimezone(){
        p.setTimezone(timezone);
        assertEquals(timezone , p.getTimezone());
    }

    /**
     * <p>Test case to match projects</p>
     */
    @Test
    public void testProjects(){
        p.setProjects(projects);
        assertEquals(projects , p.getProjects());
    }

    /**
     * <p>Test case to match skills</p>
     */
    @Test
    public void testSkills(){
        skills.put("3","php");
        skills.put("4","java");
        p.setSkills(skills);
        assertEquals(skills, p.getSkills());
    }

    /**
     * <p>Test case to match qualification</p>
     */
    @Test
    public void testQualification(){
        qualifications.put("4" , "java");
        p.setQualifications(qualifications);
        assertEquals(qualifications , p.getQualifications());
    }

}
