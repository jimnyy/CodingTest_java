import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arry = {a, b, c, d};
        Arrays.sort(arry);
        
        if (arry[0] == arry[3]) {
            answer = 1111 * arry[3];
        } else if (arry[0] == arry[2] || arry[1] == arry[3]) {
            answer = (int) Math.pow(arry[1] * 10 + (arry[0] + arry[3] - arry[1]), 2);
            
            System.out.println(arry[1] + " " + arry[0] + " " + arry[3] + " ");
        } else if (arry[0] == arry[1] && arry[2] == arry[3]) {
            answer = (arry[0] + arry[2]) * Math.abs(arry[0] - arry[2]);
        } else if (arry[0] == arry[1]) {
            answer = arry[2] * arry[3];
        } else if (arry[1] == arry[2]) {
            answer = arry[0] * arry[3];
        } else if (arry[2] == arry[3]) {
            answer = arry[0] * arry[1];
        } else {
            answer = arry[0];
        }
        
        return answer;
    }
}