class Solution {
    public long solution(int n) {
        long answer = 1;
        //dp문제
        // n=3 : 3, n=4 : 5, n=5 : 8, n=6 : 18
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            if(i<2) arr[i] = i+1;
            else{
                arr[i] = (arr[i-2]+arr[i-1])%1234567;
            }
        }
        answer = arr[n-1];
        
        return answer;
    }
}