import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        System.out.println("Hello Java");
        int num = A.length; //3
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for(int i=0; i<num; i++){
            sum += A[i]*B[num-i-1];
        }
        
        
        return sum;
    }
}