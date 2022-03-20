package businesslogic;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

/**
 * <p>This class is used to find the Flesch Readability Index of a project</p>
 * @author Hiren Parmar
 */
public class SearchFleschIndex {
    long wordCount;
    long sentenceCount;
    long syllableCount;

    /**
     * <p>The method calls the getFleschindex and getFkgl methods</p>
     * @param desc Description of a project
     * @return LinkedHashMap containing Flesch Readability Index and FKGL of a project description
     */
    public CompletionStage<LinkedHashMap<String, String>> getResult(String desc){
        List<String> description = new ArrayList<String>();
        LinkedHashMap<String, String> resultmap = new LinkedHashMap<String, String>();
        description.add(desc);
        Integer FlIndex = this.getFleshIndex(description);
        resultmap.put("FleshIndex",FlIndex.toString());
        resultmap.put("FKGL",Float.toString(this.getFkgl(FlIndex)));
        return CompletableFuture.completedFuture(resultmap);
    }

    /**
     * <p>The method calculates the Flesch Readability Index of a project description</p>
     * @param desc Description of the project
     * @return Flesch Readability Index of a description
     */
    public Integer getFleshIndex(List<String> desc) {

        wordCount = desc.stream()
                .map(w -> w.replaceAll("\\p{Punct}", "").split(" "))
                .flatMap(Arrays::stream)
                .count();
        System.out.println(wordCount);

        sentenceCount = desc.stream()
                .map(w -> w.split("[!?.:]+"))
                .flatMap(Arrays::stream)
                .count();
        System.out.println(sentenceCount);

        List<String> syllable = desc.stream()
                .map(o -> o.replaceAll("[!?.:;]+", "").split(" "))
                .flatMap(Arrays::stream)
                .map(o -> o.replace("[0-9]",""))
                .map(o -> {if(o.length()<=3) o = "a"; return o;})
                .map(o -> o.toLowerCase().replaceAll("le$","lex").replaceAll("es$|ed$|e$","").replaceAll("[aeiou]{2,}", "a").replaceAll("[^aeiou]",""))
                .collect(Collectors.toList());

        syllableCount = syllable.stream()
                .map(o -> o.length())
                .reduce(0, (a,b) -> a+b);

        float fleshIndex = (float) (206.835 - 84.6 *(syllableCount / wordCount) - 1.015 * (wordCount / sentenceCount));
        return Math.round(fleshIndex);

    }

    /**
     * <p>This method calculates the Flesch Kincaid Grade Level of the description of the project</p>
     * @param fleschIndex FLesch Readability Index of the project
     * @return Flesch Kincaid Grade Level
     */
    public float getFkgl(int fleschIndex){
        float fkgl = (float)(0.39*(wordCount/sentenceCount)+ 11.8 * (syllableCount/wordCount)-15.59);
        return fkgl;
    }

    /**
     * <p>This method finds the Education Level required by the user to easily read the description</p>
     * @param fleschIndex Flesch Readability Index
     * @return Education level required for user
     */
    public String getEducationLevel(int fleschIndex) {
        if (fleschIndex > 100) {
            return "Early";
        } else if (fleschIndex > 91) {
            return "5th grade";
        } else if (fleschIndex > 81) {
            return "6th grade";
        } else if (fleschIndex > 71) {
            return "7th grade";
        } else if (fleschIndex > 66) {
            return "8th grade";
        } else if (fleschIndex > 61) {
            return "9th grade";
        } else if (fleschIndex > 51) {
            return "High School";
        } else if (fleschIndex > 31) {
            return "Some College";
        } else if (fleschIndex > 0) {
            return "College Graduate";
        } else if (fleschIndex <= 0) {
            return "Law School Graduate";
        }else {
            return "";
        }
    }
}