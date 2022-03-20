/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>This model stores results of search phrase and list of project descriptions</p>
 * @author Group Task
 */
public class Resultlist {

	private List<Searchphraseresult> result = new ArrayList<Searchphraseresult>();
	private List<String> descriptions = new ArrayList<String>();
	private String edLevel;
	private int fleschIndex;
	private float fkgl;

	/**
	 * @param descriptions
	 */
	public void setDescriptions(List<String> descriptions) {
		this.descriptions = descriptions;
	}

	/**
	 * @return List of descriptions
	 */
	public List<String> getDescriptions() {
		return descriptions;
	}

	/**
	 * @return Flesh Index
	 */
	public int getFleschIndex() {
		return fleschIndex;
	}

	/**
	 * @param fleschIndex
	 */
	public void setFleschIndex(int fleschIndex) {
		this.fleschIndex = fleschIndex;
	}

	/**
	 * @return Flesch Kincaid Grade Level
	 */
	public float getFkgl() {
		return fkgl;
	}

	/**
	 * @param fkgl
	 */
	public void setFkgl(float fkgl) {
		this.fkgl = fkgl;
	}

	/**
	 * @return Education Level
	 */
	public String getEdLevel() {
		return edLevel;
	}

	/**
	 * @param edLevel
	 */
	public void setEdLevel(String edLevel) {
		this.edLevel = edLevel;
	}

	/**
	 * @return List of all elements of Searchphraseresult class
	 */
	public List<Searchphraseresult> getResult() {
		return result;
	}

	/**
	 * @param result
	 */
	public void setResult(List<Searchphraseresult> result) {
		this.result = result;
	}
}
