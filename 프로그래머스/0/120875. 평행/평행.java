class Solution {
    public int solution(int[][] dots) {
        
        int answer = 0;
        
        //점 1, 점 2와 점 3, 점 4를 연결한 두 직선의 기울기를 비교
        if (checkSolution(dots[0], dots[1], dots[2], dots[3])) {
            return 1;
        }
        
        //점 1, 점 3과 점 2, 점 4를 연결한 두 직선의 기울기를 비교
        if (checkSolution(dots[0], dots[2], dots[1], dots[3])) {
            return 1;
        }
        
        //점 1, 점 4와 점 2, 점 3을 연결한 두 직선의 기울기를 비교
        if (checkSolution(dots[0], dots[3], dots[1], dots[2])) {
            return 1;
        }

        return 0;
    }
    
    public boolean checkSolution(int[] dots1,int[]dots2, int[] dots3, int[]dots4){
        return (dots2[1] - dots1[1]) * (dots4[0] - dots3[0])  == (dots4[1] - dots3[1]) * (dots2[0] - dots1[0]);
            
        }
}