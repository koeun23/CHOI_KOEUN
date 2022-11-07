class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int num = number.length()-k; //4자리
        
        int start = 0;
        for(int i=0; i<num; i++){
            int max = 0;
            for(int j=start; j<=k+i; j++){

            if(max<number.charAt(j)-'0'){
               max = number.charAt(j)-'0';
               start = j+1;
            }
            }
            sb.append(max);
            //answer+=max+"";
        }
        return sb.toString();
    }
}