import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputN = new int[N];

        for (int i = 0; i < N; i++) {
            inputN[i] = sc.nextInt();
        }

        for (int j = 0; j < N; j++) {
            if(inputN[j] % 3 == 0) {
                System.out.println(inputN[j]);
            }
        }
    }
}