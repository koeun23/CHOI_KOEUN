import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if( c=='('){
                stack.push(c);
            }
            else if(c==')' && stack.size()>0){
                    stack.pop();
            }
            else{
                answer = false;
                break;
            }
        }
        if(!stack.empty()){
            answer= false;
        }
        return answer;
    }
}