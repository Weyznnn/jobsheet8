import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i+=2) {
            System.out.print("*");
        }
    }
}
