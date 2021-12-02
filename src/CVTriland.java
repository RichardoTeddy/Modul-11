
import java.util.Arrays;
import java.util.Scanner;

public class CVTriland {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] harga = new int[]{0, 0, 0, 0, 0};
        String[] alamat={"","","","",""};
        System.out.println("List Pilihan");
        System.out.println("1. Daerah & Tanah");
        System.out.println("2. Pembayaran");
        System.out.println("3. Laporan");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Anda: ");
        int opsi = in.nextInt();
        switch(opsi){
            case 1: daerah(); break;
        }
        System.out.println("hai adi");
        pembayaran(tanah(harga,alamat));
    }

    static void daerah() {
                
        System.out.println("List Daerah  ");
        System.out.println("1. Daerah Godean");
        System.out.println("2. Daerah Sleman");
        System.out.println("3. Daerah Depok");
        System.out.println("4. Daerah Cangkringan");
        System.out.println("5. Daerah Prambanan");

    }

    static int[] tanah(int [] harga, String[] alamat) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Daerah yang ingin dipilih : ");
        
        int daerah = in.nextInt();
        switch (daerah) {
            case (1):
                alamat = new String[]{"Godean, Jl Setran, Jl Ringroad Barat, Godean, Sleman", "Ringroad Barat Demakijo Yogyakarta, Godean, Sleman, DI Yogyakarta", "Jl Kabupaten, Godean, Sleman, Godean, Sleman, DI Yogyakarta", "Jalan Semboja, Godean, Sleman, DI Yogyakarta", "Jalan Pahlawan, Godean, Sleman, DI Yogyakarta"};
                String[] Ukuran = {"{13x10)", "(22x10)", "(12x10)", "(12x10)", "(13x10)"};
                harga = new int[]{300000000, 380000000, 210000000, 450000000, 480000000};
                for (int i = 0; i < alamat.length; i++) {
                    System.out.println((i+1) + "." + " " + alamat[i] + "  " + Ukuran[i] + "  " + harga[i] + " Juta");
                }
                break;
            case (2):
                alamat = new String[]{"Jalan Sidomulyo, Mlati, Sleman, DI Yogyakarta", "Yogyakarta, Ngaglik, Sleman, DI Yogyakarta", "Berbah, Sleman, Yogyakarta, Berbah, Sleman, DI Yogyakarta", "Cangkringan, Sleman Kab., Yogyakarta D.I., Cangkringan, Sleman, DI Yogyakarta", "Jl. Wates Km.9, Gamping, Sleman, DI Yogyakarta"};
                String[] Ukuran1 = {"{13x10)", "(22x10)", "(12x10)", "(12x10)", "(13x10)"};
                int[] Harga1 = {300, 380, 210, 450, 480};
                for (int a = 1; a < alamat.length; a++) {
                    System.out.println(a + "." + " " + alamat[a] + "  " + Ukuran1[a] + "  " + Harga1[a] + " Juta");
                }

                break;
            case (3):
                String[] Alamat2 = {"Jl. Dulwanih, Sawangan, Bedahan, Kota Depok, Sawangan, Depok, Jawa Barat", "Duren Seribu, Bojongsari, Bojongsari, Depok, Jawa Barat", "Jalan Raya Bedahan Sawangan Kota Depok, Sawangan, Depok, Jawa Barat", "jl. Puri Bukit Depok, Citayam, Depok, Jawa Barat", "Jl. Raya Meruyung, Limo Depok, Limo, Depok, Jawa Barat"};
                String[] Ukuran2 = {"(10x10)", "(10x10)", "(11x10)", "(10x10)", "(14x10)"};
                int[] Harga2 = {460, 650, 340, 240, 450};
                for (int o = 0; o < Harga2.length; o++) {
                    System.out.println(o + "." + " " + Alamat2[o] + "  " + Ukuran2[o] + "  " + Harga2[o] + " Juta");
                }
                break;
            case (4):
                String[] Alamat3 = {"Cangkringan, Cangkringan, Sleman, DI Yogyakarta", "Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta", "Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta", "Jl Merapi Golf Cangkringan Sleman, Cangkringan, Sleman, DI Yogyakarta", "Kampus UII, Cangkringan, Sleman, DI Yogyakarta"};
                String[] Ukuran3 = {"(25x10)", "(26x10)", "(20x10)", "(32x12)", "(16x10)"};
                int[] Harga3 = {430, 560, 620, 520, 345};
                for (int u = 0; u < Harga3.length; u++) {
                    System.out.println(u + "." + " " + Alamat3[u] + "  " + Ukuran3[u] + "  " + Harga3[u] + " Juta");
                }
                break;
            case (5):
                String[] Alamat4 = {"Prambanan, Sleman, DI Yogyakarta", "Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta", "Tanah Murah Sleman prambanan", "Bokoharjo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta", "Nogosaren Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta"};
                String[] Ukuran4 = {"(10x10)", "(15x20)", "(19x10)", "(32x21)", "(20x10)"};
                int[] Harga4 = {780, 430, 320, 980, 450};
                for (int y = 0; y < Harga4.length; y++) {
                    System.out.println(y + "." + " " + Alamat4[y] + "  " + Ukuran4[y] + "  " + Harga4[y] + " Juta");
                }
                break;

        }
        return harga;
    }

    static void pembayaran(int[] harga) {
        Scanner in=new Scanner(System.in);
        System.out.println("Harga"+harga[0]);
       System.out.print("Masukkan Rumah yang ingin dipilih : ");
        int lokasi = in.nextInt();
    }
}
