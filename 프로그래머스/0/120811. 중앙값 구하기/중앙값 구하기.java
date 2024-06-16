class Solution {
    public int solution(int[] array) {
        
        //int[] answer = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int result = array.length / 2;
        int s = array[result];

        return s;
    }
}