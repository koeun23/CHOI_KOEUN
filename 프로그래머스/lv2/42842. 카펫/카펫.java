class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int [2];
        int max = brown+yellow; //12
        for(int i=3; i<brown/2; i++){
            for(int j=3; j<=i; j++){ //5*5, 최소 값 3*3
                int count = 0;
                if(i*j==max){ //4 3
                    //brown 의 갯수 새서 비교하고 맞으면 return
                    count  = i*2+(j-2)*2;
                    if(count==brown){
                        answer[0] = i;
                        answer[1] = j;
                    }
                }
                
            }
        }
        
        
        return answer;
    }
}