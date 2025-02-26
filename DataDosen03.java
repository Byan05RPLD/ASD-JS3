public class DataDosen03 {

    public static void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        int index = 0;
        for (Dosen03 dosen : arrayOfDosen) {
            dosen.tampilkanData(index);
            index++;
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen:");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }
        double rataPria = (countPria > 0) ? (double) totalUsiaPria / countPria : 0;
        double rataWanita = (countWanita > 0) ? (double) totalUsiaWanita / countWanita : 0;

        System.out.println("\nRata-rata Usia Dosen:");
        System.out.printf("Pria   : %.2f tahun\n", rataPria);
        System.out.printf("Wanita : %.2f tahun\n", rataWanita);
    }
    public static void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;

        Dosen03 tertua = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Tua ===");
        tertua.tampilkanData(0);
    }
    public static void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen03 termuda = arrayOfDosen[0];
        for (Dosen03 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("\n=== Dosen Paling Muda ===");
        termuda.tampilkanData(0);
    }
}