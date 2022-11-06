class Solution {
    public int solution(int n) {
        int answer = 0;
        //n=78 result=83
        //1001110 1010011 1이4개로 같아야함
        int num1 = Integer.bitCount(n); //78의 1의 갯수
        for(int i=n+1; i<1000000; i++){
            // int num2 = calc(i);
            if(Integer.bitCount(i)==num1){
                return i;
            }
        }
        
        
        
        return answer;
    }
    // public int calc(int num){
    //     int count = 0;
    //     //num = 78
    //     String s = Integer.toBinaryString(num) + "";//1001110
    //     for(int i=0; i<s.length(); i++){
    //         if(s.charAt(i)=='1')
    //             count++;
    //     }
    // Integer.bitCount() 메소드로 대체해서 효율성 통과함
        
        
    //    return count;
    //}
}