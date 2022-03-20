package businesslogic;

import model.Profile;
import model.projectInfo;
import model.Resultlist;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.text.DateFormat;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * <p>This class fetches the information of a user's profile</p>
 * @author Harshal
 */
public class SearchProfile {
   public String API = "https://www.freelancer.com/api/users/0.1/portfolios/?limit=10&compact=true&portfolio_details=true&user_details=true&user_qualification_details=true&user_jobs=true&user_portfolio_details=true&user_recommendations=true&count=true&user_profile_description=true&users[]=";
    public String API1 ="https://www.freelancer.com/api/projects/0.1/projects/?limit=10&full_description=true&owners[]=";


    /**
     * <p>This method makes an asynchronous call to getProfileResult method</p>
     * @param id Owner id of a user
     * @return LinkedHashMap containing Search String and Profile information
     */
    public CompletionStage<LinkedHashMap<String, Profile>> getResult(String id) {
        return CompletableFuture.supplyAsync(()-> this.getProfileResult(id));
    }

    /**
     * <p>This method calls the api to fetch details of a user's profile</p>
     * @param id It is Owner Id of a user
     * @return LinkedHashMap containing the information of a user's profile
     */
    public LinkedHashMap<String, Profile> getProfileResult(String id) {
        Profile p = new Profile();
        LinkedHashMap<String, Profile> resultmap = new LinkedHashMap<String, Profile>();
        List<projectInfo> projectInfos = new ArrayList<projectInfo>();
        try {
            URL url = new URL(this.API + id);
            URL url1 = new URL(this.API1 + id);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            HttpURLConnection conn1 = (HttpURLConnection) url1.openConnection();
            conn.setRequestMethod("GET");
            conn1.setRequestMethod("GET");
            conn1.connect();
            conn.connect();
            if(conn1.getResponseCode() == 200)
            {
                Scanner scan = new Scanner(url1.openStream());
                String temp = "";
                while (scan.hasNext()) {
                    temp = temp + scan.nextLine();
                }
                JSONObject json = null;
                json = new JSONObject(temp);
                JSONObject result = null;
                result = json.getJSONObject("result");

                JSONArray temp_Projects = null;
                temp_Projects = result.getJSONArray("projects");
                for(int i=0;i<temp_Projects.length();i++){
                    JSONObject obj = temp_Projects.getJSONObject(i);
                    projectInfo pi = new projectInfo();
                    pi.setTitle(obj.get("title").toString());
                    pi.setProjectid(obj.get("id").toString());

                    pi.setDescription(obj.get("description").toString());

                    Date date = new Date(Long.parseLong(obj.get("submitdate").toString()+"000"));
                    DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
                    pi.setSubmitdate(simple.format(date));
                    projectInfos.add(pi);
                }
            }
            if (conn.getResponseCode() == 200)
            {
                Scanner scan = new Scanner(url.openStream());
                String temp = "";
                while (scan.hasNext()) {
                    temp = temp + scan.nextLine();
                }
                JSONObject json = null;
                json = new JSONObject(temp);
                JSONObject result = null;
                result = json.getJSONObject("result");

                JSONObject temp_users = null;
                temp_users =  result.getJSONObject("users");
                JSONObject users = null;
                users = temp_users.getJSONObject(id);

                JSONObject obj = null;
                obj = users;
                p.setProjects(projectInfos);
                p.setId(this.getJSONResult(obj,"id"));
                p.setUsername(this.getJSONResult(obj,"username"));
                LinkedHashMap<String, String> skillsmap = new LinkedHashMap<String, String>();
                JSONArray skills = null;
                skills = obj.getJSONArray("jobs");
                for (int j = 0; j < skills.length(); j++) {
                    JSONObject skill = null;
                    skill = skills.getJSONObject(j);
                    skillsmap.put(this.getJSONResult(skill ,"name") , this.getJSONResult(skill,"id"));
                }
                p.setSkills(skillsmap);
                p.setProfiledescription(this.getJSONResult(obj,"profile_description"));
                p.setHourylyrate(this.getJSONResult(obj,"hourly_rate"));
                Date date = new Date(Long.parseLong(this.getJSONResult(obj,"registration_date")+"000"));
                DateFormat simple = new SimpleDateFormat("dd MMM yyyy");
                p.setRegistrationdate(simple.format(date));
                p.setDisplayname(this.getJSONResult(obj,"display_name"));
                p.setPublicname(this.getJSONResult(obj,"public_name"));
                p.setCompany(this.getJSONResult(obj,"company"));
                JSONObject location = null;
                location =  obj.getJSONObject("location");
                JSONObject country = null;
                country = location.getJSONObject("country");
                JSONObject primary_currency = null;
                primary_currency = obj.getJSONObject("primary_currency");
                p.setCode(this.getJSONResult(primary_currency,"code"));
                p.setSign(this.getJSONResult(primary_currency,"sign"));
                p.setCurrencyname(this.getJSONResult(primary_currency,"name"));;
                JSONObject status = null;
                status = obj.getJSONObject("status");
                p.setEmailverified(this.getJSONResult(status,"email_verified"));
                p.setCountry(this.getJSONResult(country,"name"));
                p.setCity(this.getJSONResult(location,"city"));
                p.setRecommendations(this.getJSONResult(obj,"recommendations"));
                p.setRole(this.getJSONResult(obj,"role"));
                p.setChosenrole(this.getJSONResult(obj,"chosen_role"));
                p.setPrimarylanguage(this.getJSONResult(obj,"primary_language"));
                p.setLimitedaccount(this.getJSONResult(obj,"limited_account"));
                JSONObject timezone =null;
                timezone = obj.getJSONObject("timezone");
                p.setTimezone(this.getJSONResult(timezone,"timezone"));
                LinkedHashMap<String, String> qualificationsmap = new LinkedHashMap<String, String>();
                JSONArray qualifications = null;
                qualifications= obj.getJSONArray("qualifications");
                for (int j = 0; j < qualifications.length(); j++) {
                    JSONObject qualification = null;
                    qualification = qualifications.getJSONObject(j);
                    qualificationsmap.put(this.getJSONResult(qualification ,"name") , this.getJSONResult(qualification ,"id"));
                }
                p.setQualifications(qualificationsmap);
            }
            resultmap.put(p.getPublicname(),p);
            conn.disconnect();
            conn1.disconnect();
        } catch (Exception e) {
            System.out.println(e);

        }
        return resultmap;
    }

    /**
     * <p>This method converts JSON Object to String</p>
     * @param obj JSON Object
     * @param key key of the JSON Object
     * @return It returns the value stored with the key as String
     */
    public String getJSONResult(JSONObject obj,String key){
        String result = null;
        try{
            result = obj.get(key).toString();
        }catch(JSONException e){
            result = null;
        }
        return result;
    }
}