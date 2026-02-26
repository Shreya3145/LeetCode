package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        HashMap<String, Integer> map = new  HashMap<>();

        for (String s : strs) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            s = new String(ch);
            if(!map.containsKey(s)){
                map.put(s, list.size());
                list.add(new ArrayList<>());
            }
            list.get(map.get(s)).add(s);
        }

            return list;
        
    }
        
}
