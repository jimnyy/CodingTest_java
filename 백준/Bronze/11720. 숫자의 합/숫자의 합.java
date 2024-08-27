import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int count = sc.nextInt();
        String num = sc.next();
        
        char[] charNum = num.toCharArray();
        
        int sum = 0;
        for(int i =0; i < charNum.length; i++){
            sum += charNum[i] - '0';
        }
        System.out.println(sum);
    }
}