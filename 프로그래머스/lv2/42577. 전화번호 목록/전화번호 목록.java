import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //접두사가 없으면 FALSE
        Arrays.sort(phone_book);
       // Arrays.sort(phone_book, (String s1, String s2) -> s1.length()-s2.length());
        
        for(int i=0; i<phone_book.length-1; i++){
            String str1 = phone_book[i]; //119
           // for(int j=i+1; j<phone_book.length; j++){
                String str2 = phone_book[i+1]; //97674223
                
                //if(str2.substring(0,str1.length()).equals(str1) )
                if(str2.startsWith(str1)) 
                return false;
           // }
        }
        return answer;
    }
}