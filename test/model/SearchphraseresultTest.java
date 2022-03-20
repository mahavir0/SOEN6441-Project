package model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;

/**
 * <p>Test class for testing all the methods of Searchphraseresult model class</p>
 */
public class SearchphraseresultTest {

    String owner_id ="112233";
    String date = "15 march 2022";
    String title ="php";
    int index = 1;
    String type = "fixed";
    String prevDesc = "I am looking to have someone build a responsive PHP page uses MYSQL to run search. I have PSD";
    LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();
    LinkedHashMap<String, Integer> wordStats = new LinkedHashMap<String, Integer>();

    Searchphraseresult spr;

    /**
     * <p>It initializes an object of Searchphraseresult class</p>
     */
    @Before
    public void setup(){
        spr = new Searchphraseresult();
    }

    /**
     * <p>Test case to match skills</p>
     */
    @Test
    public void  testSkills(){
        skills.put("3" , "php");
        skills.put("4","java");
        spr.setSkills(skills);
        assertEquals(skills,spr.getSkills());
    }

    /**
     * <p>Test case to match Word Stats</p>
     */
    @Test
    public void testWordtstats(){
        wordStats.put("hello world" , 1);
        wordStats.put("good", 2);
        spr.setWordStats(wordStats);
        assertEquals(wordStats,spr.getWordStats());

    }

    /**
     * <p>Test case to match owner id</p>
     */
    @Test
    public void testOwnerid(){
        spr.setOwner_id(owner_id);
        assertEquals(owner_id, spr.getOwner_id());
    }

    /**
     * <p>Test case to match date</p>
     */
    @Test
    public void testDate(){
        spr.setDate(date);
        assertEquals(date, spr.getDate());
    }

    /**
     * <p>Test case to match index</p>
     */
    @Test
    public void testIndex(){
        spr.setIndex(index);
        assertEquals(index , spr.getIndex());
    }

    /**
     * <p>Test case to match title</p>
     */
    @Test
    public void testTitle(){
        spr.setTitle(title);
        assertEquals(title , spr.getTitle());
    }

    /**
     * <p>Test case to match type</p>
     */
    @Test
    public void testType(){
        spr.setType(type);
        assertEquals(type , spr.getType());
    }

    /**
     * <p>Test case to match preview description</p>
     */
    @Test
    public void testPrevdesc(){
        spr.setPrevDesc(prevDesc);
        assertEquals(prevDesc , spr.getPrevDesc());
    }
}
