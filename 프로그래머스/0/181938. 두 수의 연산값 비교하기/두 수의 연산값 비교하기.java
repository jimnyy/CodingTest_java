class Solution {
    public int solution(int a, int b) {

        String stringA = Integer.toString(a);
        String stringB = Integer.toString(b);
        String result = stringA + stringB; // "a"+"b"
        Integer resultInteger = Integer.valueOf(result);

        if (resultInteger > 2 * a * b) {
            return resultInteger;
        } else if (resultInteger < 2 * a * b) {
            return 2 * a * b;
        } else {
            return resultInteger;
        }
    }
}