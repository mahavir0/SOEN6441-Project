package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * <p>This model class stores the information to be displayed on Employer's Profile Page</p>
 * @author Harshal
 */
public class Profile
{
    String id;
    String username;
    String displayname;
    String publicname;
    private LinkedHashMap<String, String> skills =null;
    String hourylyrate;
    String title;
    String profiledescription;
    String recommendations;
    String country;
    String city;
    String company;
    private LinkedHashMap<String, String> qualifications =null;
    String role;
    String registrationdate;
    String chosenrole;
    String primarylanguage;
    String limitedaccount;
    String code;
    String sign;
    String emailverified;
    String currencyname;
    String timezone;
    List<projectInfo> projects =null;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the Registration Date of the project
     */
    public String getRegistrationdate(){return registrationdate;}
    /**
     * @param  registrationdate Registration Date to set
     */
    public void setRegistrationdate(String registrationdate) {   this.registrationdate = registrationdate;}

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return Chosen Role
     */
    public String getChosenrole() {
        return chosenrole;
    }

    /**
     * @param chosenrole Role chosen by employer
     */
    public void setChosenrole(String chosenrole) {
        this.chosenrole = chosenrole;
    }

    /**
     * @return Primary Language
     */
    public String getPrimarylanguage() {
        return primarylanguage;
    }

    /**
     * @param primarylanguage Primary Language of the employer
     */
    public void setPrimarylanguage(String primarylanguage) {
        this.primarylanguage = primarylanguage;
    }

    /**
     * @return Limited Account
     */
    public String getLimitedaccount() {
        return limitedaccount;
    }

    /**
     * @param limitedaccount If the account is limited or not
     */
    public void setLimitedaccount(String limitedaccount) {
        this.limitedaccount = limitedaccount;
    }

    /**
     * @return Code of the project
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code Code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return Sign of the project
     */
    public String getSign() {
        return sign;
    }

    /**
     * @param sign Sign of the project
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * @return Email is verified or not
     */
    public String getEmailverified() {
        return emailverified;
    }

    /**
     * @param emailverified If email is verified or not
     */
    public void setEmailverified(String emailverified) {
        this.emailverified = emailverified;
    }

    /**
     * @return Name of the currency
     */
    public String getCurrencyname() {
        return currencyname;
    }

    /**
     * @param currencyname Name of the currency
     */
    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname;
    }

    /**
     * @return Time Zone of the project
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @param timezone Time zone of the employer
     */
    public void setTimezone(String timezone) {
        this.timezone    = timezone;
    }
    /**
     * @return the username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * @return the displayname
     */
    public String getDisplayname() {
        return displayname;
    }
    /**
     * @param displayname the displayname to set
     */
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    /**
     * @return the publicname
     */
    public String getPublicname() {
        return publicname;
    }
    /**
     * @param publicname the publicname to set
     */
    public void setPublicname(String publicname) {
        this.publicname = publicname;
    }
    /**
     * @return the skills
     */
    public HashMap<String, String> getSkills() {
        return skills;
    }

    /**
     * @param skills Skills of the employer
     */
    public void setSkills(LinkedHashMap<String, String> skills) {
      this.skills =   new LinkedHashMap<String, String>();
      this.skills = skills;
    }
   /**
     * @return the hourylyrate
     */
    public String getHourylyrate() {
        return hourylyrate;
    }
    /**
     * @param hourylyrate the hourylyrate to set
     */
    public void setHourylyrate(String hourylyrate) {
        this.hourylyrate = hourylyrate;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the profiledescription
     */
    public String getProfiledescription() {
        return profiledescription;
    }
    /**
     * @param profiledescription the profiledescription to set
     */
    public void setProfiledescription(String profiledescription) {
        this.profiledescription = profiledescription;
    }
    /**
     * @return the recommendations
     */
    public String getRecommendations() {
        return recommendations;
    }
    /**
     * @param recommendations the recommendations to set
     */
    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }
    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }
    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }
    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }
    /**
     * @return the qualification
     */
    public HashMap<String, String> getQualifications() {
        return qualifications;
    }

    /**
     * @param qualifications Qualifications of the employer
     */
    public void setQualifications(LinkedHashMap<String, String>  qualifications) {
        this.qualifications = new LinkedHashMap<String, String>();
        this.qualifications = qualifications;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }
    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * @return the projects
     */
    public List<projectInfo> getProjects() {
        return projects;
    }
    /**
     * @param projects the projects to set
     */
  public void setProjects(List<projectInfo> projects) {
        this.projects = projects;
    }

}
