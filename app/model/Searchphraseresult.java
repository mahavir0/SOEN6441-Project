/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * <p>This model class stores the details of a Search Result</p>
 * @author Group Task
 */
public class Searchphraseresult {

	private String owner_id;
	private String date;
	private String title;
	private int index;
	private String type;
	private String prevDesc;
	private LinkedHashMap<String, String> skills = new LinkedHashMap<String, String>();
	private LinkedHashMap<String, Integer> wordStats = new LinkedHashMap<String, Integer>();
	private int fleshIndex;

	/**
	 * @return Gets owner id
	 */
	public String getOwner_id() {
		return owner_id;
	}

	/**
	 * @param owner_id Sets owner id
	 */
	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	/**
	 * @param index Sets index
	 */
	public void setIndex(int index) {
		this.index = index;
	}


	/**
	 * @return index of the project
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @return Date of project submitted
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date Sets the date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return Title of the project
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title Sets title of the project
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return Type of project
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type Sets type of project
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return HashMap of all the skills
	 */
	public HashMap<String, String> getSkills() {
		return skills;
	}

	/**
	 * @param skills Sets skills of the project
	 */
	public void setSkills(LinkedHashMap<String, String> skills) {
		this.skills = skills;
	}

	/**
	 * @return LinkedHashMap of Word Stats
	 */
	public LinkedHashMap<String, Integer> getWordStats() {
		return wordStats;
	}

	/**
	 * @param wordStats Sets the word stats for the projects
	 */
	public void setWordStats(LinkedHashMap<String, Integer> wordStats) {
		this.wordStats = wordStats;
	}

	/**
	 * @param prevDesc Sets the preview description of the project
	 */
	public void setPrevDesc(String prevDesc) {
		this.prevDesc = prevDesc;
	}

	/**
	 * @return Preview Description of a project
	 */
	public String getPrevDesc() {
		return prevDesc;
	}
}
