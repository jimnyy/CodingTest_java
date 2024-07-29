import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] sort = new int[rank.length];
        
            for(int j = 0; j <rank.length; j++){
                if(attendance[j]){
                    sort[j] = rank[j]; //so = 0725400
                } else {
                    rank[j] = Integer.MAX_VALUE; //rank = 9999,7,2,5,4,9999,9999
                }
        } 
             Arrays.sort(rank);
        
        for(int i = 0; i < sort.length; i++){
            if(rank[0] == sort[i]){
                answer += i * 10000;
            } else if(rank[1] == sort[i]){
                answer += i * 100;
            } else if(rank[2] == sort[i]){
                answer += i;
            }
        }
        return answer;
    }
}