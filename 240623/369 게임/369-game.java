import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int ten = i / 10;
            int one = i - (ten * 10);
            if (i % 3 == 0) {
                System.out.print("0 ");
            } else if (ten == 9 || one == 9) {
                System.out.print("0 ");
            } else if (ten == 6 || one == 6) {
                System.out.print("0 ");
            } else if (ten == 3 || one == 3) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}