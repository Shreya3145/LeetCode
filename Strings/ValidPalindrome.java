package Strings;

public class ValidPalindrome{
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim().toLowerCase();

        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sb.append(s.charAt(i));
            }
        }

        
        int start = 0, end = sb.length()-1; 
        while(start < end){
            if(!(sb.charAt(start) == sb.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    } 
}