package jobsheet5;
import java.util.Scanner;
public class MasukPerpus22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Apakah membawa katu mahasiswa? (true/false): "); 
        boolean punyaKTM = sc.nextBoolean();
        System.out.println("Apakah sudah registrasi? (true/false): ");
        boolean registrasi = sc.nextBoolean();
       
        if (punyaKTM && registrasi) {
                System.out.println("Silahkan masuk");
            } else
                System.out.println("TIDAK DAPAT MASUK");
        sc.close();
    }
}
       
        
    
