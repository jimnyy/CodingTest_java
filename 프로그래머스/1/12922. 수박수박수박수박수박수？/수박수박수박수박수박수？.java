class Solution {
    public String solution(int n) {
        String wm = "수박";
        String answer = "";
        if (n % 2 == 0) {
            answer = wm.repeat(n / 2);
        } else {
            answer = wm.repeat(n / 2) + "수";
        }
        return answer;
    }
}