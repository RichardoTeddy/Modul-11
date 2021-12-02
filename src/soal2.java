import java.util.Scanner;
public class soal2 {
    static int m;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int m = input.nextInt();
        bintang(m);
    }
    static void bintang(int m) {

		for(int i = 1; i <= m; i++) System.out.print ("*");
                System.out.println();
    }
    
}
