import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> numList = new ArrayList();
        
        for(int i =0; i < N; i++){
            numList.add(sc.nextInt());
        }
        
         int max = Collections.max(numList);
         int min = Collections.min(numList);
         int result = max * min;
        System.out.println(result);
        }
}
        