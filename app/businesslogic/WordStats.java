/**
 *
 */
package businesslogic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.net.*;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

import model.Resultlist;
import model.Searchphraseresult;

/**
 * <p>This class is used to compute word stats for 250 project descriptions as well as for individual projects</p>
 * @author Kevin Pandya
 */
public class WordStats {

    /**
     * <p>Calls the getWordStats method to compute Global Stats of project descriptions</p>
     * @param searchPhrase Search string is passed as parameter
     * @param desc List of descriptions of all the projects is passed as parameter
     * @return LinkedHashMap containing search string and word stats of all the projects
     */
    public CompletionStage<LinkedHashMap<String, Resultlist>> getResult(String searchPhrase, List<String> desc) {
        return CompletableFuture.supplyAsync(()-> this.getWordStats(searchPhrase, desc));
    }

    /**
     * <p>Calls the getIndividualStats method to compute individual stats of a project description</p>
     * @param prevDesc Preview Description of a project
     * @return LinkedHashMap containing search string and word stats for an individual project
     */
    public CompletionStage<LinkedHashMap<String, Integer>> getStatResult(String prevDesc) {
        return CompletableFuture.supplyAsync(()-> this.getIndividualStats(prevDesc));
    }

    /**
     * <p>This function computes the word stats of descriptions of upto 250 projects</p>
     * @param searchPhrase Search string is passed as parameter
     * @param desc List of descriptions of all projects is passed as parameter
     * @return It returns a LinkedHashMap containing Search String & computed Word Stats
     */
    public LinkedHashMap<String, Resultlist> getWordStats(String searchPhrase, List<String> desc) {
        List<Searchphraseresult> sp = new ArrayList<Searchphraseresult>();
        LinkedHashMap<String, Resultlist> resultmap = new LinkedHashMap<String, Resultlist>();
        Resultlist r1 = new Resultlist();

        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();

        Searchphraseresult tempsr = new Searchphraseresult();
        List<String> list = desc.stream()
                .map(w -> ((String) w)
                        .replaceAll("\\p{Punct}", " ")
                        .split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));


        wordCounter.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        tempsr.setWordStats(sorted);
        sp.add(tempsr);

        r1.setResult(sp);
        resultmap.put(searchPhrase,r1);

        return resultmap;
    }
    /**
     * <p>The function computes the word stats of preview description of an individual project</p>
     * @param prevDesc Preview Description of a project
     * @return It returns a LinkedHashMap containing word stats for description of a project
     */
    public LinkedHashMap<String, Integer> getIndividualStats(String prevDesc) {

        List<String> list = Stream.of(prevDesc)
                .map(w -> ((String) w)
                        .replaceAll("\\p{Punct}", " ")
                        .split("\\s+"))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum));

        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();
        wordCounter.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> sorted.put(x.getKey(), x.getValue()));

        return sorted;
    }

}