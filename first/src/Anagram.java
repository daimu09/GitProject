import java.util.Arrays;

public class Anagram {

    public static boolean isValidAnagram(String s, String t) {
        // Check if both strings have the same length
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        // Compare sorted arrays
        return Arrays.equals(charArrayS, charArrayT);
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if (isValidAnagram(s, t)) {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are valid anagrams.");
        } else {
            System.out.println("The strings \"" + s + "\" and \"" + t + "\" are not valid anagrams.");
        }
    }
}






//import java.util.*;
//
//public class Anagram {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        if (strs == null || strs.length == 0) {
//            return new ArrayList<>();
//        }
//
//        Map<String, List<String>> anagramGroups = new HashMap<>();
//
//        for (String str : strs) {
//            // Convert string to char array, sort it, and convert back to string
//            char[] charArray = str.toCharArray();
//            Arrays.sort(charArray);
//            String sortedStr = new String(charArray);
//
//            // Check if sorted string is already in the map
//            if (!anagramGroups.containsKey(sortedStr)) {
//                anagramGroups.put(sortedStr, new ArrayList<>());
//            }
//
//            // Add the original string to the anagram group
//            anagramGroups.get(sortedStr).add(str);
//        }
//
//        return new ArrayList<>(anagramGroups.values());
//    }
//
//    public static void main(String[] args) {
//        Anagram grouper = new Anagram();
//        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> groups = grouper.groupAnagrams(input);
//        
//        System.out.println("Anagram Groups:");
//        for (List<String> group : groups) {
//            System.out.println(group);
//        }
//    }
//}





//import java.util.*;
//
//public class Anagram {
//    public int countDistinctAnagrams(String s) {
//        Set<String> distinctAnagrams = new HashSet<>();
//        
//        if (s == null || s.length() == 0) {
//            return 0;
//        }
//        
//        // Map to store frequency of characters in the input string
//        Map<Character, Integer> charFreq = new HashMap<>();
//        
//        // Initialize character frequency map
//        for (char c : s.toCharArray()) {
//            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
//        }
//        
//        // Iterate through the string to find anagrams
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                // Create a substring from i to j (inclusive)
//                String substring = s.substring(i, j + 1);
//                
//                // Check if the substring is an anagram
//                if (isAnagram(substring, charFreq)) {
//                    distinctAnagrams.add(substring);
//                }
//            }
//        }
//        
//        return distinctAnagrams.size();
//    }
//    
//    // Helper method to check if a string is an anagram
//    private boolean isAnagram(String s, Map<Character, Integer> charFreq) {
//        Map<Character, Integer> tempFreq = new HashMap<>(charFreq);
//        
//        for (char c : s.toCharArray()) {
//            if (!tempFreq.containsKey(c) || tempFreq.get(c) == 0) {
//                return false;
//            }
//            tempFreq.put(c, tempFreq.get(c) - 1);
//        }
//        
//        return true;
//    }
//    
//    public static void main(String[] args) {
//        Anagram finder = new Anagram();
//        String input = "vile";
//        int distinctAnagrams = finder.countDistinctAnagrams(input);
//        
//        System.out.println("Number of distinct anagrams in the string \"" + input + "\": " + distinctAnagrams);
//    }
//}




//import java.util.ArrayList;
//import java.util.List;
//
//public class Anagram{
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> indices = new ArrayList<>();
//
//        if (s == null || p == null || s.length() < p.length()) {
//            return indices; // Return an empty list if input is invalid
//        }
//
//        int[] charCountMap = new int[26]; // Assuming input contains only lowercase English letters
//        int count = 0; // Counter for counting number of different characters
//        for (char c : p.toCharArray()) {
//            charCountMap[c - 'a']++;
//            if (charCountMap[c - 'a'] == 1) {
//                count++; // Increment count for new characters
//            }
//        }
//
//        int start = 0, end = 0; // Start and end index of the substring
//        int n = s.length(), m = p.length(); // Length of strings s and p
//
//        while (end < n) {
//            char c = s.charAt(end);
//            charCountMap[c - 'a']--;
//            if (charCountMap[c - 'a'] == 0) {
//                count--; // Decrement count if a character's count becomes 0
//            }
//            end++;
//
//            if (end - start == m) { // If length of substring equals length of p
//                if (count == 0) { // If count is 0, all characters in p are present in the substring
//                    indices.add(start);
//                }
//
//                char leftChar = s.charAt(start);
//                charCountMap[leftChar - 'a']++;
//                if (charCountMap[leftChar - 'a'] == 1) {
//                    count++; // Increment count if a character's count becomes 1
//                }
//                start++;
//            }
//        }
//
//        return indices;
//    }
//
//    public static void main(String[] args) {
//        Anagram source = new Anagram();
//        String s = "cbaebabacd";
//        String p = "abc";
//        List<Integer> indices = source.findAnagrams(s, p);
//        System.out.println(indices); // Output: [0, 6]
//    }
//}
