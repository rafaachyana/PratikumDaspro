import java.util.Scanner;
public class text.txt.java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, prodi;
        int sks;
        System.out.println("=== Program Cetak KRS ===");
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Prodi: ");
        prodi = input.nextLine();
        System.out.print("Masukkan Jumlah SKS yang diambil: ");
        sks = input.nextInt();
        System.out.println("\n=== Kartu Rencana Studi (KRS) ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Prodi : " + prodi);
        System.out.println("Jumlah SKS yang diambil: " + sks);
        if (sks < 7) {
            System.out.println("Status: Anda harus mengambil minimal 7 SKS.");
        } else if (sks <= 24) {
            System.out.println("Status: KRS Anda telah dicetak.");
        } else {
            System.out.println("Status: Jumlah SKS melebihi batas maksimal (24 SKS).");
        }
        input.close();
    }
    
}

