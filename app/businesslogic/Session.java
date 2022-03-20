package businesslogic;

import java.util.HashMap;


/**
 * <p>This class is used to manage sessions</p>
 * @author Group Task
 */
public class Session {
    public HashMap<String, SearchPhrase> sessionmap = new HashMap<String, SearchPhrase>();

    /**
     * <p>This method adds the unique session id and the search phrase results into sessionmap</p>
     * @param id Session ID
     * @param object Object of SearchPhrase results
     */
    public void setSession(String id, SearchPhrase object){
        sessionmap.put(id,object);
    }

    /**
     * @param id Session ID
     * @param object Object of SearchPhrase results
     * @return It returns the search phrase results for a given session id
     */
    public SearchPhrase getSession(String id,SearchPhrase object){
        if(sessionmap.containsKey(id))
            return sessionmap.get(id);
        else{
            sessionmap.put(id,object);
            return sessionmap.get(id);
        }
    }
}
