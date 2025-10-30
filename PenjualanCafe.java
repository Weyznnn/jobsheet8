import java.util.Scanner;

public class PenjualanCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cabangkafe, menuPelangggan;
        int totalPelanggan = 0, totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        cabangkafe = sc.nextInt();
        System.out.println("\n=== INPUT PENJUALAN CABANG ===");

        for (int i = 1; i <= cabangkafe; i++) {
            int jumlahPelangganCabang, sumItem = 0;
            System.out.println("\n--- Cabang "+i+" ---");
            
            System.out.print("Jumlah pelanggan: ");
            jumlahPelangganCabang = sc.nextInt();

            for (int j = 1; j <= jumlahPelangganCabang; j++) {
                System.out.print("-Pelanggan "+i+" memesan berapa menu ? ");
                menuPelangggan = sc.nextInt();
                sumItem += menuPelangggan;
            }

            totalPelanggan += jumlahPelangganCabang;
            totalItem += sumItem;

            System.out.println("Cabang "+i+":");
            System.out.println("-Pelanggan: "+jumlahPelangganCabang+" orang");
            System.out.println("-Item terjual: "+sumItem);
        }
        sc.close();
        
        System.out.println("\nTotal seluruh Cabang: ");
        System.out.println("Pelanggan: "+totalPelanggan);
        System.out.println("Item terjual: "+totalItem);
    }
}
