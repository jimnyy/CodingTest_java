import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] paper = new int[100][100];
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int a = scanner.nextInt(); // 열 가로
            int b = scanner.nextInt(); // 행 세로
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    paper[k][j] = 1;
                }
            }

        }

        int res = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == 1) {
                    res += paper[i][j];
                }
            }
        }
        System.out.println(res);

    }
}