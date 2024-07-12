import java.util.*;

public class Solution {
    int answer;
    public int solution(int n) {
            while(n > 0) {
	        answer = answer + (n % 10); //a = 3, 2, 1
                n = n / 10;
            
    }       return answer;
  }
}