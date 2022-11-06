import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int maxnum = limit-40; // 60보다 크면 무조건 혼자 타야됨
        Arrays.sort(people);
       // int count = 0;
        int min = 0; //시작
         for(int i=people.length-1; i>=min; i--){
            if(people[i]+people[min]<=limit){
                min++;
            }
             answer++;
              
            
         }
       // if(count!=0) answer++;
        
        
        
        return answer;
    }
}