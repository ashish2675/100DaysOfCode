import java.util.HashMap;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        // Initialize variables to keep track of the maximum length and the starting index of the substring.
        int maxLength = 0;
        int start = 0;

        // Create a HashMap to store characters and their indices in the string.
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            // Check if the character at 'end' is already in the HashMap and its index is greater than or equal to 'start'.
            if (charIndexMap.containsKey(s.charAt(end)) && charIndexMap.get(s.charAt(end)) >= start) {
                // If yes, update the 'start' to the next index of the repeating character.
                start = charIndexMap.get(s.charAt(end)) + 1;
            }

            // Update the character's index in the HashMap.
            charIndexMap.put(s.charAt(end), end);

            // Calculate the current substring length (end - start + 1) and update 'maxLength' if necessary.
            maxLength = Math.max(maxLength, end - start + 1);
        }

        // Return the maximum length of the substring without repeating characters.
        return maxLength;
    }
}
