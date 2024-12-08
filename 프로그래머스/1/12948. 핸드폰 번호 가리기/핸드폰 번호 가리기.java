class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arry_pn = new char[phone_number.length()];
        
        for(int i =0; i < phone_number.length(); i++) { //string을 char 배열로 변환
         arry_pn[i] = phone_number.charAt(i);
        }
        
        for(int i =0; i < arry_pn.length-4; i++) {
            arry_pn[i] = '*';
        }
        
        answer = String.valueOf(arry_pn);
        return answer;
    }
}