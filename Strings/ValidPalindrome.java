package Strings;

public class ValidPalindrome{
    public boolean isPalindrome(String s) {
        String palindromeString = "";
        s = s.trim().toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                palindromeString += s.charAt(i);
            }
        }
        int left = 0, right = palindromeString.length() - 1;
        while(left < right){
            if(!(palindromeString.charAt(left) == palindromeString.charAt(right))){
                return false;
            }
            left++;
            right--;

        }
        return true;
        
    }
    
}