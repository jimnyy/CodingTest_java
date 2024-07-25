class Solution {
    public int[] solution(long n) {

        String arry = String.valueOf(n);
        int[] answer = new int[arry.length()];
            for(int i =0; i < answer.length; i++){
                answer[i] = Integer.parseInt(arry.substring(answer.length-1-i, answer.length-i));
            }
                return answer;
        }
    }