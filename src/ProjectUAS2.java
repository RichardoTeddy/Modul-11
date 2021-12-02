import java.util.Scanner;
public class ProjectUAS2 {
    public static void main(String[] args) {
        daerah();
    }

    static void daerah() {
        Scanner p = new Scanner(System.in);
        System.out.println("Masukkan Daerah yang ingin dipilih: ");
        System.out.println("1. Daerah Godean");
        System.out.println("2. Daerah Sleman");
        System.out.println("3. Daerah Depok");
        System.out.println("4. Daerah Cangkringan");
        System.out.println("5. Daerah Prambanan");
        System.out.print("Masukan pilihan anda: ");
        int wilayah = p.nextInt();
        switch (wilayah) {
            case 1:
                System.out.println("A.Pemukiman Warga(Strategis)");
                System.out.println("B.Persawahan(Tidak Stategis)");
                System.out.print("Masukan kondisi tanah yang anda inginkan: ");
                String rumah = p.next();
                switch (rumah) {
                    case "A":
                        System.out.println("Pemukiman Warga(Strategis)");
                        System.out.println("A.(VIP 1)Jl Godean, Jl Setran, Jl Ringroad Barat, Godean, Sleman, DI Yogyakarta(3,2jt)(200m2)");
                        System.out.println("B.(VIP 2)Ringroad Barat Demakijo Yogyakarta, Godean, Sleman, DI Yogyakarta(3,2jt)(180m2)");
                        System.out.println("C.(VIP 3)Jl Kabupaten, Godean, Sleman, Godean, Sleman, DI Yogyakarta(4,9jt)(130m2) ");
                        break;
                    case "B":
                        System.out.println("Persawahan(Tidak Stategis)");
                        System.out.println("D (VIP 4)Jalan Semboja, Godean, Sleman, DI Yogyakarta(4,5jt)(135m2) ");
                        System.out.println("E.(VIP 5)Jalan Pahlawan, Godean, Sleman, DI Yogyakarta(1,8jt)(140m2) ");
                        break;
                }
                break;
            case 2:
                System.out.println("A.Pemukiman Warga(Strategis)");
                System.out.println("B.Persawahan(Tidak Stategis)");
                System.out.print("Masukan kondisi tanah yang anda inginkan: ");
                String rumah1 = p.next();
                switch (rumah1) {
                    case "A":
                        System.out.println("Pemukiman Warga(Strategis)");
                        System.out.println("A.(VIP 1)Jalan Sidomulyo, Mlati, Sleman, DI Yogyakarta(2,30)(130m) ");
                        System.out.println("B (VIP 2)Yogyakarta, Ngaglik, Sleman, DI Yogyakarta(5,6)(220m) ");
                        System.out.println("C.(VIP 3)Berbah, Sleman, Yogyakarta, Berbah, Sleman, DI Yogyakarta(1,5)(120m) ");
                        break;
                    case "B":
                        System.out.println("Persawahan(Tidak Stategis)");
                        System.out.println("D.(VIP 4)Cangkringan, Sleman Kab., Yogyakarta D.I., Cangkringan, Sleman, DI Yogyakarta(1,0)(120m) ");
                        System.out.println("E.(VIP 5)Jl. Wates Km.9, Gamping, Sleman, DI Yogyakarta(3,2)(130m) ");
                        break;
                }
                break;
            case 3:
                System.out.println("A.Pemukiman Warga(Strategis)");
                System.out.println("B.Persawahan(Tidak Stategis)");
                System.out.print("Masukan kondisi tanah yang anda inginkan: ");
                String rumah2 = p.next();
                switch (rumah2) {
                    case "A":
                        System.out.println("Pemukiman Warga(Strategis)");
                        System.out.println("A.(VIP 1)Jl. Dulwanih, Sawangan, Bedahan, Kota Depok, Sawangan, Depok, Jawa Barat(2 jt)(100m)");
                        System.out.println("B.(VIP 2)Duren Seribu, Bojongsari, Bojongsari, Depok, Jawa Barat(4,10 jt)(100m)");
                        System.out.println("C.(VIP 3)Jalan Raya Bedahan Sawangan Kota Depok, Sawangan, Depok, Jawa Barat(4 jt)(110m) ");
                        break;
                    case "B":
                        System.out.println("Persawahan(Tidak Stategis)");
                        System.out.println("D.(VIP 4)Jl. Puri Bukit Depok, Citayam, Depok, Jawa Barat(5,6 jt)(100m)");
                        System.out.println("E.(VIP 5)Jl. Raya Meruyung, Limo Depok, Limo, Depok, Jawa Barat(3,5 jt)(140m) ");
                        break;
                }
                break;
            case 4:
                System.out.println("A.Pemukiman Warga(Strategis)");
                System.out.println("B.Persawahan(Tidak Stategis)");
                System.out.print("Masukan kondisi tanah yang anda inginkan: ");
                String rumah3 = p.next();
                switch (rumah3) {
                    case "A":
                        System.out.println("Pemukiman Warga(Strategis)");
                        System.out.println("A.(VIP 1)Cangkringan, Cangkringan, Sleman, DI Yogyakarta (1)(250m)");
                        System.out.println("B.(VIP 2)Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta (1) (262m)");
                        System.out.println("C.(VIP 3)Cangkringan, Sleman, Yogyakarta, Cangkringan, Sleman, DI Yogyakarta (1,2) (202m) ");
                        break;
                    case "B":
                        System.out.println("Persawahan(Tidak Stategis)");
                        System.out.println("D.(VIP 4)Jl Merapi Golf Cangkringan Sleman, Cangkringan, Sleman, DI Yogyakarta (4) (620m)");
                        System.out.println("E.(VIP 5)Kampus UII, Cangkringan, Sleman, DI Yogyakarta (1,5) (160m) ");
                }
                break;
            case 5:
                System.out.println("A.Pemukiman Warga(Strategis)");
                System.out.println("B.Persawahan(Tidak Stategis)");
                System.out.print("Masukan kondisi tanah yang anda inginkan: ");
                String rumah4 = p.next();
                switch (rumah4) {
                    case "A":
                        System.out.println("Pemukiman Warga(Strategis)");
                        System.out.println("A.((VIP 1)Prambanan, Sleman, DI Yogyakarta (2) (100m)");
                        System.out.println("B.(VIP 2)Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta (1,2) (860m)");
                        System.out.println("C.(VIP 3)Tanah Murah Sleman prambanan (1,2) (190m) ");
                        break;
                    case "B":
                        System.out.println("Persawahan(Tidak Stategis)");
                        System.out.println("D.(VIP 4)Bokoharjo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta (1,1) (840m)");
                        System.out.println("E.(VIP 5)Nogosaren Madurejo Prambanan Sleman, Prambanan, Sleman, DI Yogyakarta (1,9) (200m) ");
                }
                break;
            default:
                System.out.println("Pilihan Anda Tidak ada!!!");
                break;
        }
    }

}
