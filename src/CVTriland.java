
import java.util.Scanner;

public class CVTriland {

    public static void main(String[] args) {
        String input = "t";
        Scanner in = new Scanner(System.in);
        int[] harga = new int[]{0, 0, 0, 0, 0};
        int tanah,lokasi,metode;
        String[] alamat = {"", "", "", "", ""};
        String[] nas = {"", "", "", "", ""};
        String[] Ukuran = {"", "", "", "", ""};
        String[] nohp = {"", "", "", "", ""};
        do {
            System.out.println(">>>>>>>>>>>>>_____________________<<<<<<<<<<<<<<");
            System.out.println("\t   \"Welcome To Our Company\"");
            System.out.println("\t         \"CV Triland\"");
            System.out.println("\t          \"Est 2021\"");
            System.out.println(">>>>>>>>>>>>>_____________________<<<<<<<<<<<<<<");
            System.out.println("List Pilihan");
            System.out.println("1. Daerah & Tanah");
            System.out.println("2. Pembayaran");
            System.out.println("3. Laporan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int opsi = in.nextInt();
            switch (opsi) {
                case 1:
                    daerah();
               
                    break;
            }
            pembayaran(tanah(harga, alamat, nas, Ukuran, nohp));
            laporan();
            pilihanAkhir();
        } while (input.equalsIgnoreCase("t"));
    }

    static void daerah() {
        System.out.println("");
        System.out.println("List Daerah  ");
        System.out.println("1. Daerah Godean");
        System.out.println("2. Daerah Sleman");
        System.out.println("3. Daerah Depok");
        System.out.println("4. Daerah Cangkringan");
        System.out.println("5. Daerah Prambanan");

    }

    static int[] tanah(int[] harga, String[] alamat, String[] nas, String[] Ukuran, String[] nohp) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Daerah yang ingin dipilih : ");
        int daerah1 = in.nextInt();
        System.out.println("");
        switch (daerah1) {
            case (1):
                alamat = new String[]{"Godean, Jl Setran, Jl Ringroad Barat, Godean, Sleman", "Ringroad Barat Demakijo Yogyakarta, Godean, Sleman, DI Yogyakarta", "Jl Kabupaten, Godean, Sleman, Godean, Sleman, DI Yogyakarta", "Jalan Semboja, Godean, Sleman, DI Yogyakarta", "Jalan Pahlawan, Godean, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"{13x10)", "(22x10)", "(12x10)", "(12x10)", "(13x10)"};
                harga = new int[]{300000000, 380000000, 210000000, 450000000, 480000000};
                nas = new String[]{"Ranti", "Alek", "Leni", "Febi", "Jisung"};
                nohp = new String[]{"081343432335", "084619382932", "08318643194", "083816482639", "083461364232"};
                for (int i = 0; i < alamat.length; i++) {
                    System.out.println((i + 1) + "." + " " + alamat[i] + "  " + Ukuran[i] + "  " + harga[i] + " Juta");
                    System.out.println("Data Diri Pemilik Nasabah: " + nas[i] + " " + nohp[i]);
                    System.out.println("");
                }
                break;
            case (2):
                alamat = new String[]{"Jalan Sidomulyo, Mlati, Sleman, DI Yogyakarta", "Yogyakarta, Ngaglik, Sleman, DI Yogyakarta", "Berbah, Sleman, Yogyakarta, Berbah, Sleman, DI Yogyakarta", "Cangkringan, Sleman Kab., Yogyakarta D.I., Cangkringan, Sleman, DI Yogyakarta", "Jl. Wates Km.9, Gamping, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"{13x10)", "(22x10)", "(12x10)", "(12x10)", "(13x10)"};
                harga = new int[]{300000000, 380000000, 210000000, 450000000, 480000000};
                nas = new String[]{"Ri", "Chardo", "Ted", "Dy", "richar"};
                nohp = new String[]{"088090654736", "087987678567", "082134562765", "087645345624", "089675412345"};
                for (int a = 0; a < alamat.length; a++) {
                    System.out.println((a + 1) + "." + " " + alamat[a] + "  " + Ukuran[a] + "  " + harga[a] + " Juta");
                    System.out.println("Data Diri Pemilik Nasabah: " + nas[a] + " " + nohp[a]);
                    System.out.println("");
                }

                break;
            case (3):
                alamat = new String[]{"Jl. Dulwanih, Sawangan, Bedahan, Kota Depok, Sawangan, Depok, Jawa Barat", "Duren Seribu, Bojongsari, Bojongsari, Depok, Jawa Barat", "Jalan Raya Bedahan Sawangan Kota Depok, Sawangan, Depok, Jawa Barat", "jl. Puri Bukit Depok, Citayam, Depok, Jawa Barat", "Jl. Raya Meruyung, Limo Depok, Limo, Depok, Jawa Barat"};
                Ukuran = new String[]{"(10x10)", "(10x10)", "(11x10)", "(10x10)", "(14x10)"};
                harga = new int[]{460000000, 650000000, 340000000, 240000000, 450000000};
                nas = new String[]{"adi", "lie", "kris", "rista", "hersa"};
                nohp = new String[]{"0880906547456", "087987678589", "082134562905", "087645345904", "089675412895"};
                for (int o = 0; o < harga.length; o++) {
                    System.out.println((o + 1) + "." + " " + alamat[o] + "  " + Ukuran[o] + "  " + harga[o] + " Juta");
                    System.out.println("Data Diri Pemilik Nasabah: " + nas[o] + " " + nohp[o]);
                    System.out.println("");
                }
                break;
            case (4):
                alamat = new String[]{"Cangkringan, Cangkringan, Sleman, DI Yogyakarta", "Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta", "Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta", "Jl Merapi Golf Cangkringan Sleman, Cangkringan, Sleman, DI Yogyakarta", "Kampus UII, Cangkringan, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"(25x10)", "(26x10)", "(20x10)", "(32x12)", "(16x10)"};
                harga = new int[]{430000000, 560000000, 620000000, 520000000, 345000000};
                nas = new String[]{"wiragana", "davino", "vino", "sherli", "dimas"};
                nohp = new String[]{"0880906547678", "0879876785903", "082134562785", "087645345692", "089675412890"};
                for (int u = 0; u < harga.length; u++) {
                    System.out.println(u + "." + " " + alamat[u] + "  " + Ukuran[u] + "  " + harga[u] + " Juta");
                    System.out.println("Data Diri Pemilik Nasabah: " + nas[u] + " " + nohp[u]);
                    System.out.println("");
                }
                break;
            case (5):
                alamat = new String[]{"Prambanan, Sleman, DI Yogyakarta", "Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta", "Tanah Murah Sleman prambanan", "Bokoharjo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta", "Nogosaren Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"(10x10)", "(15x20)", "(19x10)", "(32x21)", "(20x10)"};
                harga = new int[]{780000000, 430000000, 320000000, 980000000, 450000000};
                for (int y = 0; y < harga.length; y++) {
                    System.out.println(y + "." + " " + alamat[y] + "  " + Ukuran[y] + "  " + harga[y] + " Juta");
                    System.out.println("Data Diri Pemilik Nasabah: " + nas[y] + " " + nohp[y]);
                    System.out.println("");
                }
                break;

        }
        return harga;
    }

    static void pembayaran(int[] harga) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Rumah yang ingin dipilih : ");
        int lokasi = sc.nextInt();
        System.out.println("");
        System.out.println("Metode Pembayaran");
        System.out.println("1.Cash");
        System.out.println("2.DP");
        System.out.print("Masukan Metode Pembayaran:");
        int metode = sc.nextInt();
        switch (metode) {
            case 1:
                System.out.println("Total yang harus anda bayar yaitu:" + harga[lokasi]);
                break;
            case 2:
                System.out.println("1. 25% dan akan dikenakan bunga sebesar 20%");
                System.out.println("2. 50% dan akan dikenakan bunga sebesar 10%");
                System.out.print("Masukan pilihan anda: ");
                int dp = sc.nextInt();
                switch (dp) {
                    case 1: {
                        double hasil = ((harga[lokasi] * 0.25));
                        double bunga = hasil * 0.20;
                        double total = hasil + bunga;
                        System.out.println("Total yang harus anda bayar yaitu: " + (int) total);
                        break;
                    }
                    case 2: {
                        double hasil = ((harga[lokasi] * 0.50));
                        double bunga = hasil * 0.10;
                        double total = hasil + bunga;
                        System.out.println("Total yang harus anda bayar yaitu: " + (int) total);
                        break;
                    }
                }
        }
    }

   private static void laporan(int tanah,int lokasi,int metode) {
         System.out.println("Daerah yang dipilih"+ tanah+ "alamat yang anda pilih"+lokasi+"Metode pembayaran"+metode);   
    }
   

    private static void pilihanAkhir() {
        String input = "t";
        Scanner sc = new Scanner(System.in);
        System.out.println("Apakah akan ingin melakukan survei lagi? (Y/T) ");
        input = sc.nextLine();
    }

  
}
