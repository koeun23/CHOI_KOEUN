import java.util.*;

public class Solution {
    public int[] solution(int []arr) { //1,1,3,3,0,1,1 -> 1,3,0,1
   int firstnum = 0;
	        int count = 0;
	        int[] test = new int [arr.length];
	        
	        for(int i=0; i<arr.length; i++){
	            if(i==0){ //맨 처음 시작할때 값 설정
	                firstnum = arr[i];
	                test[i] = arr[i];
	                count++;
	            }
	            else{
	                if(arr[i]==firstnum){
	                    continue;
	                }
	                else{
	                    firstnum  = arr[i];
	                    test[count] = firstnum;
	                    count++;
	                }
	                
	            }
	                
	        }
	        
	           int[] answer = new int[count];
	           
	        for(int j=0; j<count; j++) {
	        	answer[j] = test[j];
	        }
	       
	        return answer;
	    }
	    
    }
