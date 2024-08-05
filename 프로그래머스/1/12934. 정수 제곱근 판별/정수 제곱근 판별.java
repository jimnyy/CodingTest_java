class Solution {

    public long solution(long n) {
    
        long answer = 0;
        if (Math.floor(Math.sqrt(n)) < Math.sqrt(n))
            answer = -1;
        else
            answer = (long) Math.pow((long) Math.sqrt(n) + 1, 2);

        return answer;
    }
    
}