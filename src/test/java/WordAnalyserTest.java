import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordAnalyserTest {

    @Test
    @DisplayName("checks for the longest word in a text")
    void returnsTheLongestWord() {

        WordAnalyser analyser = new WordAnalyser();
        String input = "I like apple honey";

        List<String> result = analyser.findLongestWords(input);

        assertEquals(List.of("apple", "honey"), result);
    }

    @Test
    @DisplayName("calculates the frequency of each letter in a string")
    void returnsTheNumberOfLetters() {

        WordAnalyser analyser = new WordAnalyser(); 
        String input = "I like bees";

        Map<Character, Integer> result = analyser.calculateLetterFrequency(input);

        assertEquals(Map.of(
            'i', 2, 
            'l', 1, 
            'k', 1, 
            'e', 3, 
            'b', 1,
            's', 1
            ), 
        result
        );
    }
}