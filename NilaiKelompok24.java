import java.util.Scanner;

public class NilaiKelompok24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai, kelompokRataTertinggi = 0;
        float totalNilai, rataNilai, rataTertinggi = 0;

        i = 1;
        while (i <= 6) {
            totalNilai = 0;
            System.out.println("Kelompok "+i);
            for (j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari kelompok penilai "+j+": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokRataTertinggi = i;
            }
            System.out.println("Kelompok "+i+": niai rata - rata = "+rataNilai);
            i++;
        }
        System.out.println("\nKelompok dengan nilai rata - rata tertinggi adalah kelompok "+kelompokRataTertinggi+" = "+rataTertinggi);
        sc.close();
    }
}
