import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();

            X = X - (price * num);
        }

        if(X == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}