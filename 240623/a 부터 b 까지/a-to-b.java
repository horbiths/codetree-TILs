import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int num = a;

        System.out.print(num + " ");
        while(num < b) {
            if (num % 2 == 0) {
                num += 3;
                System.out.print(num + " ");
            } else {
                num *= 2;
                System.out.print(num + " ");
            }

            if (num > b) {
                break;
            }
        }
    }
}