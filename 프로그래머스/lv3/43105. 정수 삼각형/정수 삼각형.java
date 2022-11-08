class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length][triangle.length];
        int max = 0;
        // 깊이 우선 탐색 숫자 다섯개를 더할건데 어느 방향으로 갈지
        for(int i=0; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(i==0 && j==0){
                    dp[i][j] = triangle[i][j];
                }
                else if(i!=0 && j!=0){
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i-1][j])+triangle[i][j];
                }
                else{
                    dp[i][j] = dp[i-1][j]+triangle[i][j];    
                }
                 
            }
            for(int k=0; k<dp[dp.length-1].length; k++){
                if(max<dp[dp.length-1][k])
                    max = dp[dp.length-1][k];
            }
                
        }
        return max;
    }
  
}