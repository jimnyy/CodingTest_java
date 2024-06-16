class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a)+String.valueOf(b);
        String ba = String.valueOf(b)+String.valueOf(a);
        
        Integer result1 = Integer.parseInt(ab);
        Integer result2 = Integer.parseInt(ba);
            
        if(result1 > result2){
            return result1;
        } else {
            return result2;
        }
    }
}