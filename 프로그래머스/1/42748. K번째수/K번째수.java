import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] result = new int[commands.length]; //commands길이만큼 return배열 크기 초기화
        for(int i =0; i < commands.length; i++){
            int[] copyArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyArray); //오름차순 정렬
            result[i] = copyArray[commands[i][2]-1];
        } return result;
    }
}