class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer1 = 0;
        int answer2 = 0;
        
        if(arr1.length > arr2.length){
            return 1;
        } else if(arr1.length < arr2.length){
            return -1;
        } else {
            for(int i =0; i< arr1.length; i++){
                 answer1 += arr1[i];
                 answer2 += arr2[i];
            }
            if (answer1 > answer2) {
                return 1;
            } else if (answer1 < answer2) {
                return -1;
            } else {
                return 0; 
            }
        }
    }
}