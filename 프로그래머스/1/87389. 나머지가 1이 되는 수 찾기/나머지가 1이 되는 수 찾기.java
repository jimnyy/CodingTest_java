class Solution {
    public int solution(int n) {
        int answer = 0;
        int result = 0;
        int i = 0;
        
        while(result != 1){
            
         result = n % (2+i);
            if(result == 1){
                answer = 2+i;
            } else {
                i++;
            }
        }  return answer;
    }
}

