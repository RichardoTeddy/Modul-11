import java.util.Scanner;
class soal1 {
    public static void main(String[] args) {
        int n; //memesan variabel int bernama n
        Scanner sc = new Scanner(System.in); //menginput metode Scanner
        do { //melakukan
            System.out.print("Masukkan n : ");
            n = sc.nextInt();
        } while (n<=10 || n>100); //perulangan jika n lebih kecil sama dengan 10 atau n lebih besar dari 100
		
        for (double  z = -4; z <= 4; z= z+0.1) {//untuk memesan variabel double bernama z yang bernilai -4, z lebih kecil sama dengan 4, z di tambah dengan 0.1
            int jumBintang = normal(n,z); //memesan variabel int bernama jumBintang yang berisi tentang method normal(n,z)
            bintang(jumBintang); //method bintang berisi variabel jumBintang
        }

    }
    static int normal(int n, double z) { //membuat method normal, serta memesan variabel int bernama n, double bernama z
        double e = 2.71828; //memesan variabel double bernama e yang bernilai 2.71828
        double phi = 3.14; //memesan variabel double bernama phi yang bernilai 3.24
        double hitung=-0.5*Math.pow(z,2); //memesan variabel hitung yang berisi -0.5*Math.pow(z,2)
        double f = 1.0/(Math.sqrt(2*phi))*Math.pow(e,hitung); //memesan variabel double bernama f yang berisi 1.0/(Math.sqrt(2*phi))*Math.pow(e,hitung)
        return (int)Math.round(n*f); //kembali ke (int)Math.round(n*f)
    }
    static void bintang(int m) { //membuat method bintang, serta memesan variabel int bernama m

        for(int i = 1; i <= m; i++) System.out.print ("*"); //untuk memesan variabel int bernama i yang bernilai 1, i lebih kecil sama dengan m, i di tambah 1
        System.out.println();
    }
}