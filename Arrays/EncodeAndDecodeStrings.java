package Arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
     public static String encode(List<String> strs) {
        String encodedString = "";
        for(String s : strs){
            encodedString += s.length() + "#" + s;
        }
        
        return encodedString;

    }
     public static List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int len = 0;
            while(str.charAt(i) != '#'){
                len = len * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            list.add(str.substring(i, i + len));

            i += len;
        }

        return list;
     }
    
}
