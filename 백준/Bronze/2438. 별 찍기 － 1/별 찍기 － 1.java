import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int answer = sc.nextInt();

         for(int i = 1; i < answer+1; i++){
             String result = "*".repeat(i);
             System.out.println(result);

         }
    }
}