package accentureQ;

// *******Not done
public class StringFreq {
    public static String countFreq(String s) {
        int[] arr = new int[26];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                char ch = (char) (i + 97); // adding ascii value of a
                result.append(ch).append(arr[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        String result = countFreq(input);
        System.out.println(result); // Output: "a5b2c1d1r2"
    }
}
