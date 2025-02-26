import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine(); 
        MataKuliah03[] arrayOfMataKuliah03 = new MataKuliah03[jumlahMK];
        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < jumlahMK; i++) {
            arrayOfMataKuliah03[i] = new MataKuliah03();  
            System.out.println("\nMasukkan Data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("SKS          : ");
            sks = sc.nextInt();
            System.out.print("Jumlah Jam   : ");
            jumlahJam = sc.nextInt();
            sc.nextLine(); 
            System.out.println("------------------------------");

            arrayOfMataKuliah03[i].kode = kode;
            arrayOfMataKuliah03[i].nama = nama;
            arrayOfMataKuliah03[i].sks = sks;
            arrayOfMataKuliah03[i].jumlahJam = jumlahJam;
        }

        System.out.println("\n=== Data Mata Kuliah ===");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Mata Kuliah Ke-" + (i + 1));
            System.out.println("Kode            : " + arrayOfMataKuliah03[i].kode);
            System.out.println("Nama            : " + arrayOfMataKuliah03[i].nama);
            System.out.println("SKS             : " + arrayOfMataKuliah03[i].sks);
            System.out.println("Jumlah Jam      : " + arrayOfMataKuliah03[i].jumlahJam);
            System.out.println("------------------------------");
        }
    }
}