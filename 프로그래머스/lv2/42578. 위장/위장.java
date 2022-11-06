import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String,Integer> map1 = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            if(!map1.containsKey(key)){
                map1.put(key, 1);
            }
            else{
                map1.put(clothes[i][1], map1.get(key)+1);
            }
        }
       
        Iterator<Integer> iterator = map1.values().iterator();
        while (iterator.hasNext()) {
            answer *= iterator.next().intValue()+1;
        }
       //answer +=clothes.length;
        return answer-1;
    }
}