package controllers;


import java.util.LinkedHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import play.mvc.*;


import businesslogic.*;

import model.Resultlist;
import model.Profile;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 * @author Group Task
 */
public class HomeController extends Controller {

	LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
	LinkedHashMap<String, Integer> indStats = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Profile> usermap = new LinkedHashMap<String, Profile>();
	SearchPhrase searchphrase = new SearchPhrase();
    SearchSkill searchskill = new SearchSkill();
	WordStats wordStats = new WordStats();
	SearchProfile searchprofile = new SearchProfile();
	SearchFleschIndex sfi = new SearchFleschIndex();
    Session session = new Session();

	/**
	 * An action that renders an HTML page with a welcome message.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/</code>.
	 * @param searchPhraseString Search string entered by user
	 * @return Loads the html page containing the search results
	 */
    public CompletionStage<Result> index(String searchPhraseString,String sessionId) {
		if(searchPhraseString.equals("")) {
        	searchphrase = null;
        	return CompletableFuture.completedFuture(ok(views.html.index.render(null)));
        }else {
    		if(searchphrase == null) {
				searchphrase = new SearchPhrase();
				session.setSession(sessionId,searchphrase);
			}else{
				searchphrase = session.getSession(sessionId,searchphrase);
			}
    		CompletionStage<LinkedHashMap<String, Resultlist>> res = searchphrase.getResult(searchPhraseString);
    		return res.thenApplyAsync(o -> ok(views.html.index.render(o)));
    	}
    }

	/**
	 * An action that renders an HTML page with projects list.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>skill/id/skill</code>.
	 * @param id id of the given skill
	 * @param skill name of the given skill
	 * @return Redirects to the html page containing 10 latest projects of a given skill
	 */
    public CompletionStage<Result> skill(String id,String skill) {
    	CompletionStage<LinkedHashMap<String, Resultlist>> res = searchskill.getResult(id, skill);
    	return res.thenApplyAsync(o -> ok(views.html.skill.render(o)));
    }

	/**
	 * An action that renders an HTML page with Word Stats of all the searched projects.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/wordstats/search</code>.
	 * @param search Search string entered by user
	 * @return Redirects to the html page showing Word Stats for all the searched queries
	 */
	public CompletionStage<Result> wordStat(String search) {
		CompletionStage<LinkedHashMap<String, Resultlist>> res = wordStats.getResult(search, searchphrase.resultmap.get(search).getDescriptions());
		return res.thenApplyAsync(o -> ok(views.html.stat.render(o)));
	}

	/**
	 * An action that renders an HTML page with Word Stats of an individual project.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/indvstats/search/index</code>.
	 * @param search Search string entered by the user
	 * @param index Index of the individual project
	 * @return Redirects to the html page containing word stats of an individual project
	 */
	public CompletionStage<Result> indvStat(String search, int index) {
		CompletionStage<LinkedHashMap<String, Integer>> res = wordStats.getStatResult(searchphrase.resultmap.get(search).getDescriptions().get(index));
		return res.thenApplyAsync(o -> ok(views.html.indvstat.render(o)));
	}

	/**
	 * An action that renders an HTML page with the details of an Employer.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/profile/id</code>.
	 * @param id Owner Id of the employer
	 * @return Redirects to the html page showing details of an Employer
	 */
	public CompletionStage<Result> profile(String id) {
		CompletionStage<LinkedHashMap<String, Profile>> res = searchprofile.getResult(id);
		return res.thenApplyAsync(o -> ok(views.html.profile.render(o)));
	}

	/**
	 * An action that renders an HTML page with the Flesch Readability Index of a project description.
	 * The configuration in the <code>routes</code> file means that
	 * this method will be called when the application receives a
	 * <code>GET</code> request with a path of <code>/readability/search/index</code>.
	 * @param search Search string entered by user
	 * @param index index of an individual project
	 * @return Redirects to the html page showing Flesch Readability Index of an individual project]
	 */
	public CompletionStage<Result> readability(String search, int index) {
		CompletionStage<LinkedHashMap<String, String>> res = sfi.getResult(searchphrase.resultmap.get(search).getDescriptions().get(index));
		return res.thenApplyAsync(o -> ok(views.html.readability.render(o)));
	}
}
