import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int t : tangerine){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        
        for(int w : list){
            k = k-w;
            answer++;
            if(k<1) return answer;
            
        }
        
        
        
        return answer;
    }
}