import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        
        for(int i = l; i<=r; i++)
            if (isValid(i)) resultList.add(i);
        
        if (resultList.isEmpty()) return new int[]{-1};
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i<resultList.size(); i++)
            resultArray[i] = resultList.get(i);
        
        return resultArray;
    }
    
    private boolean isValid(int num){
        String str = String.valueOf(num);
        for (char c : str.toCharArray())
            if (c != '0' && c!= '5') return false;
        
        return true;
    }
}