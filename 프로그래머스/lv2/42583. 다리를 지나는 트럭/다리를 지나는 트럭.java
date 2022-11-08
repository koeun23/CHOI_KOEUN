import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        for(int i=0; i<truck_weights.length; i++){
            
        while(true){
            //다리가 비었을때
            if(queue.size()==0){
                queue.add(truck_weights[i]);
                sum += truck_weights[i];
                 answer++;
                break;
            }
            //다리가 꽉찼을때
            else if(queue.size()==bridge_length){
                sum -= queue.peek();
                queue.poll();
               // answer++;
                
            }
                
            //다리가 비지 않았을때
            else{
                if(truck_weights[i]+sum <= weight){
                    queue.add(truck_weights[i]);
                    sum += truck_weights[i];
                     answer++;
                    break;
                }
                else{
                    queue.add(0);
                     answer++;
                }
            }
           
           }
        }
        
        return answer+bridge_length;
    }
}