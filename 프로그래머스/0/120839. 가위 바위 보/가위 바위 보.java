


class Solution {
    public String solution(String rsp) {

                String[] a = rsp.split("");
                String answer = "";

                for (int i = 0; i < a.length; i++) {
                    if (a[i].equals("2")) {
                        answer += "0";
                    } else if (a[i].equals("0")) {
                        answer +="5";
                    } else {
                        answer +="2";
                    }

                } return answer;
            }
        }