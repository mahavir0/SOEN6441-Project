package model;

/**
 * <p>This model class stores the information of an Employer's projects</p>
 */
public class projectInfo
{
    String title;
    String description;
    String submitdate;
    String projectid;

    /**
     * @return Title of the project
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Description of the project
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Submit date of the project
     */
    public String getSubmitdate() {
        return submitdate;
    }

    /**
     * @param submitdate
     */
    public void setSubmitdate(String submitdate) {
        this.submitdate = submitdate;
    }

    /**
     * @return Project Id
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

}

