import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int count = 0;
        int sum = 0;
        
        // Array of stick lengths
        int[] arr = {64, 32, 16, 8, 4, 2, 1};
        
        for (int stick : arr) {
            if (sum + stick <= X) { // Only add stick if it doesn't exceed X
                sum += stick;
                count++;
            }
            if (sum == X) break; // Stop early if the sum matches X
        }
        
        System.out.println(count);
    }
}
