class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer =new String[n];
      
        for(int i=0; i<n; i++){
            String st = "";
            st += Integer.toBinaryString(arr1[i] | arr2[i]) ;
           
            st = st.replace("0"," ");
            st = st.replace("1","#");
         
            while(st.length()!=n){
                st = " "+st;
            }
            
            answer[i] = st;
        }
        return answer;
    }
}