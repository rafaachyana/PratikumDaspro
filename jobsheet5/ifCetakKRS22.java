package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Cetak KRS Siakad ===");
        System.out.print("Apakah UKT sudah luna? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi.");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.");
            }
         // ternary operator
        String pesan = uktLunas ? "Pembayaran UKT terverifikasi.\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(pesan);        
        sc.close();
    }
}
