import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double  sum = 0;
        double  average = 0;
        int max = 0;
        
        for(int i =0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
          }
        }
        
        for(int i : arr) {
            sum += (double) i/max*100;
            average = sum / N;
        }
        
        System.out.println(average);
    }
}