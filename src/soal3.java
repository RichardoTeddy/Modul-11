import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        int n = sc.nextInt();
        for (double z = -4; z <= 4; z = z + 0.5) {
            int jumBintang = normal(n, z);
            bintang(jumBintang);}
        System.out.println("Program ini dibuat Oleh Richardo Teddy_215314015");}

    static int normal(int n, double z) {
        double e = 2.71828;
        double hitungPangkat = -0.5 * Math.pow(z, 2);
        double f = 1 / (Math.sqrt(2 * 3.14)) * Math.pow(e, hitungPangkat);
        return (int) Math.round(n * f);}

    static void bintang(int m) {
        for (int i = 1; i <= m; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
