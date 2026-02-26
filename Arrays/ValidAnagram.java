package Arrays;

public class ValidAnagram {
     public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
       }

       int[] freq = new int[26];

       for(int i = 0; i < s.length(); i++){
        freq[s.charAt(i) - 'a']++;
       }

       for(int i = 0; i < t.length(); i++){
        freq[t.charAt(i) - 'a']--;
       }

       for(int count : freq){
        if(count != 0){
            return false;
        }
       }
       return true;
    }
}

/* Naive Approach - Using Character Arrays 
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
*/

