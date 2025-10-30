import java.util.Scanner;

public class MenghitungJumlahKuadrat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            System.out.print("n = "+i+" Jumlah kuadrat = ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j*j);
                sum += j*j;
                if (j<i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = "+sum);
        }
    }
}
