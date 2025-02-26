import java.util.Scanner;

public class MataKuliah03 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah03() {

    }

    public MataKuliah03(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kode mata kuliah: ");
        this.kode = input.nextLine();
        
        System.out.print("Masukkan nama mata kuliah: ");
        this.nama = input.nextLine();
        
        System.out.print("Masukkan jumlah SKS: ");
        this.sks = input.nextInt();
        
        System.out.print("Masukkan jumlah jam: ");
        this.jumlahJam = input.nextInt();
    }
    public void cetakInfo() {
        System.out.println("\n--- Informasi Mata Kuliah ---");
        System.out.println("Kode      : " + this.kode);
        System.out.println("Nama      : " + this.nama);
        System.out.println("SKS       : " + this.sks);
        System.out.println("Jumlah Jam: " + this.jumlahJam);
    }
}