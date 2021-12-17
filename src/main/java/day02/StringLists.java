package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {

    public List<String > shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();

        //legrövidebb szó megkeresése
        int minLength = shortestWordLength(words);

        //legrövidebb szavak válagatása és beírása új listába
        result = searchForListShortestWords(words, minLength);
        return result;
    }

    public int shortestWordLength(List<String> words) {
        int minLength = 1000;
        for (String word : words) {
            if ( word.length() < minLength) {
                minLength = word.length();
            }
        }
        return minLength;
    }

    public List<String> searchForListShortestWords(List<String> words, int minLength) {
        List<String> result = new ArrayList<>();
        for ( String word : words) {
            if ( word.length() == minLength ) {
                result.add(word);
            }
        }
        return  result;
    }


    public static void main(String[] args) {

        StringLists stringLists = new StringLists();
        List<String > shortest1 = stringLists.shortestWords(Arrays.asList("aaa", "aa", "bb",  "cccc", "dd" ));
        System.out.println(shortest1);

        List<String > shortest2 = stringLists.shortestWords(Arrays.asList("aaa", "aa", "b",  "cccc", "dd" ));
        System.out.println(shortest2);
    }
}
