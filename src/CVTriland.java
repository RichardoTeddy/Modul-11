
import java.util.Scanner;

public class CVTriland {

    public static int option() {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>_____________________<<<<<<<<<<<<<<");
        System.out.println("\t   \"Welcome To Our Company\"");
        System.out.println("\t         \"CV Triland\"");
        System.out.println("\t          \"Est 2021\"");
        System.out.println(">>>>>>>>>>>>>_____________________<<<<<<<<<<<<<<");
        System.out.println("List Pilihan");
        System.out.println("1. Harga-harga tanah");
        System.out.println("2. Pembayaran");
        System.out.println("3. Laporan");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Anda: ");
        int opt = sc.nextInt();
        return opt;
    }

    public static String[] harga() {
        Scanner sc = new Scanner(System.in);
        String[] alamat = {"", "", "", "", ""};
        String[] nas = {"", "", "", "", ""};
        String[] Ukuran = {"", "", "", "", ""};
        String[] nohp = {"", "", "", "", ""};
        int[] harga = new int[]{0, 0, 0, 0, 0};

        System.out.println("List Daerah  ");
        System.out.println("1. Daerah Godean");
        System.out.println("2. Daerah Sleman");
        System.out.println("3. Daerah Depok");
        System.out.println("4. Daerah Cangkringan");
        System.out.println("5. Daerah Prambanan");
        System.out.print("Pilih daerah:");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                alamat = new String[]{"Godean, Jl Setran, Jl Ringroad Barat, Godean, Sleman", "Ringroad Barat Demakijo Yogyakarta, Godean, Sleman, DI Yogyakarta", "Jl Kabupaten, Godean, Sleman, Godean, Sleman, DI Yogyakarta", "Jalan Semboja, Godean, Sleman, DI Yogyakarta", "Jalan Pahlawan, Godean, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"{13x10)", "(22x10)", "(12x10)", "(12x10)", "(13x10)"};
                harga = new int[]{300000000, 380000000, 210000000, 450000000, 480000000};
                nas = new String[]{"Ranti", "Alek", "Leni", "Febi", "Jisung"};
                nohp = new String[]{"081343432335", "084619382932", "08318643194", "083816482639", "083461364232"};
                break;
            case 2:
                alamat = new String[]{"Jalan Sidomulyo, Mlati, Sleman, DI Yogyakarta", "Yogyakarta, Ngaglik, Sleman, DI Yogyakarta", "Berbah, Sleman, Yogyakarta, Berbah, Sleman, DI Yogyakarta", "Cangkringan, Sleman Kab., Yogyakarta D.I., Cangkringan, Sleman, DI Yogyakarta", "Jl. Wates Km.9, Gamping, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"{13x10)", "(22x10)", "(12x10)", "(12x10)", "(13x10)"};
                harga = new int[]{300000000, 380000000, 210000000, 450000000, 480000000};
                nas = new String[]{"Ri", "Chardo", "Ted", "Dy", "richar"};
                nohp = new String[]{"088090654736", "087987678567", "082134562765", "087645345624", "089675412345"};
                break;
            case 3:
                alamat = new String[]{"Jl. Dulwanih, Sawangan, Bedahan, Kota Depok, Sawangan, Depok, Jawa Barat", "Duren Seribu, Bojongsari, Bojongsari, Depok, Jawa Barat", "Jalan Raya Bedahan Sawangan Kota Depok, Sawangan, Depok, Jawa Barat", "jl. Puri Bukit Depok, Citayam, Depok, Jawa Barat", "Jl. Raya Meruyung, Limo Depok, Limo, Depok, Jawa Barat"};
                Ukuran = new String[]{"(10x10)", "(10x10)", "(11x10)", "(10x10)", "(14x10)"};
                harga = new int[]{460000000, 650000000, 340000000, 240000000, 450000000};
                nas = new String[]{"adi", "lie", "kris", "rista", "hersa"};
                nohp = new String[]{"0880906547456", "087987678589", "082134562905", "087645345904", "089675412895"};
                break;
            case 4:
                alamat = new String[]{"Cangkringan, Cangkringan, Sleman, DI Yogyakarta", "Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta", "Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta", "Jl Merapi Golf Cangkringan Sleman, Cangkringan, Sleman, DI Yogyakarta", "Kampus UII, Cangkringan, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"(25x10)", "(26x10)", "(20x10)", "(32x12)", "(16x10)"};
                harga = new int[]{430000000, 560000000, 620000000, 520000000, 345000000};
                nas = new String[]{"wiragana", "davino", "vino", "sherli", "dimas"};
                nohp = new String[]{"0880906547678", "0879876785903", "082134562785", "087645345692", "089675412890"};
                break;
            case 5:
                alamat = new String[]{"Prambanan, Sleman, DI Yogyakarta", "Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta", "Tanah Murah Sleman prambanan", "Bokoharjo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta", "Nogosaren Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta"};
                Ukuran = new String[]{"(10x10)", "(15x20)", "(19x10)", "(32x21)", "(20x10)"};
                harga = new int[]{780000000, 430000000, 320000000, 980000000, 450000000};
                nas = new String[]{"wiragana", "davino", "vino", "sherli", "dimas"};
                nohp = new String[]{"0880906547678", "0879876785903", "082134562785", "087645345692", "089675412890"};
                break;
        }
        for (int i = 0; i < alamat.length; i++) {
            System.out.println((i + 1) + "." + " " + alamat[i] + "  " + Ukuran[i] + "  " +"Rp"+String.format("%,d",harga[i]));
            System.out.println("Data Diri Pemilik Nasabah: " + nas[i] + " " + nohp[i]);
            System.out.println("");
        }
        System.out.print("Pilih rumah yang dipilih:");
        int opt2=sc.nextInt();
        
        String[] dataLengkap=new String[]{alamat[opt2],Ukuran[opt2],String.valueOf(harga[opt2]),nas[opt2],nohp[opt2]};
        return dataLengkap;
    }
    
    public static int pembayaran(int harga){
        Scanner sc=new Scanner(System.in);
        int total=harga;
        
        System.out.println("Metode Pembayaran");
        System.out.println("1.Cash");
        System.out.println("2.DP");
        System.out.print("Masukan Metode Pembayaran:");
        int metode = sc.nextInt();
        
        switch(metode){
            case 2:
                System.out.println("1. 25% dan akan dikenakan bunga sebesar 20%");
                System.out.println("2. 50% dan akan dikenakan bunga sebesar 10%");
                System.out.print("Masukan pilihan anda: ");
                int dp = sc.nextInt();
                switch (dp) {
                    case 1: {
                        total=(int) ((harga*0.25)*1.2);
                        break;
                    }
                    case 2: {
                        total=(int) ((harga*0.5)*1.1);
                        break;
                    } 
                }
                break;
        }
        System.out.println("Total yang harus anda bayar yaitu: " +"Rp"+ String.format("%,d",total));
        return total;
    }
    
    public static void laporan(String[] data,int bayar){
        System.out.println("Rangkuman pembelian:");
        System.out.println("Daerah yang dipilih: "+data[0]
                +"\nAlamat yang dipilih: "+data[1]
                +"\nYang harus dibayarkan: "+"Rp"+String.format("%,d",bayar)
                +"\nContact person: "+data[3]
                +"\nNo. HP:"+data[4]);
    }
    public static void main(String[] args) {
        String[] data=new String[]{"", "", "0", "", ""};
        int bayar=0;
        int opt;
        do {
            opt=option();
            switch (opt) {
                case 1:
                    data=harga();
                    break;
                case 2:
                    bayar=pembayaran(Integer.parseInt(data[2]));
                    data[2]=String.valueOf(bayar);
                    break;
                case 3:
                    laporan(data,bayar);                    
            }   

        } while (opt!= 4);
    }

}
