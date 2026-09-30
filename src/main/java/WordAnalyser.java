import java.util.List;
import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Map; 

public class WordAnalyser {

    //METHOD 1
    public List<String> findLongestWords(String text) {

        String[] words = text.split(" ");
        List<String> longestWords = new ArrayList<>();
    
        int longestLength = words[0].length();
        
        for (String word : words) {

            if (word.length() > longestLength) {

                longestLength = word.length();
                longestWords.clear();
                longestWords.add(word);


            } else if ( word.length() == longestLength) {
                longestWords.add(word);
            }
        } 
        return longestWords;
    }

    //METHOD 2
    public Map<Character, Integer> calculateLetterFrequency(String text) {

        Map<Character, Integer> frequency = new HashMap<>();

       char[] letters = text.toLowerCase().toCharArray();

       for (char letter : letters) {
        //skips when space 
        if (letter == ' ') {
            continue;
        }

        if (frequency.containsKey(letter)) {
                //increment++ value of each entry by 1 if already existing  
                frequency.put(letter, frequency.get(letter) + 1);

        } else {
            //creating new entry at value 1 
            frequency.put(letter, 1);
            }
        }
        return frequency; 
    }
}