import java.util.Scanner;

public class tugasAkhir{
    public static void main(String[] args){
        boolean runApp = true;
        while(runApp == true){
            Scanner input = new Scanner(System.in);
            System.out.println("==========Silahkan Pilih Rumus==========");
            System.out.println("Pilih 1 untuk Luas Segitiga");
            System.out.println("Pilih 2 untuk Volume Balok");
            System.out.println("Pilih 3 untuk Volume Prisma Segitiga");
            System.out.println("Pilih 4 untuk Volume Kerucut");
            System.out.println("Pilih 5 untuk Keluar");
            int x = input.nextInt();
            switch(x){
                case 1:
                System.out.print("Masukan nilai Alas = "); double a = input.nextDouble();
                System.out.print("Masukan nilai Tinggi = "); double t = input.nextDouble();
                System.out.println("Hasilnya Adalah = "+rumus.hitungLuasSegitiga(a,t));
                System.out.println("Tekan 1 untuk kembali ke menu"); int menu1 = input.nextInt();
                break;
                case 2:
                System.out.print("Masukan nilai Sisi 1 = "); int a1 = input.nextInt();
                System.out.print("Masukan nilai Sisi 2 = "); int a2 = input.nextInt();
                System.out.print("Masukan nilai Sisi 3 = "); int a3 = input.nextInt();
                System.out.println("Hasilnya Adalah = "+rumus.volumeBalok(a1,a2,a3));
                System.out.println("Tekan 1 untuk kembali ke menu"); int menu2 = input.nextInt();
                break;
                case 3:
                System.out.print("Masukan nilai Panjang = "); int t1 = input.nextInt();
                System.out.print("Masukan nilai Lebar = "); int t2 = input.nextInt();
                System.out.print("Masukan nilai Tinggi = "); int t3 = input.nextInt();
                System.out.println("Hasilnya Adalah = "+rumus.volumePrismaSegitiga(t1,t2,t3));
                System.out.println("Tekan 1 untuk kembali ke menu"); int menu3 = input.nextInt();
                break;
                case 4:
                System.out.print("Masukan nilai Jari Jari = "); double r = input.nextDouble();
                System.out.print("Masukan nilai Tinggi = "); double rt = input.nextDouble();
                System.out.println("Hasilnya Adalah = "+rumus.hitungLuasSegitiga(r,rt));
                System.out.println("Tekan 1 untuk kembali ke menu"); int menu4 = input.nextInt();
                break;
                default:
                System.out.println("Kamu Pilih 5");
                runApp = false;
                break;
            } 

        }
    }
}
class rumus{
    public static double hitungLuasSegitiga(double alas, double tinggi){
        double luas = (alas*tinggi)/2;
        return luas;
    }
    public static int volumeBalok(int sisi1, int sisi2, int sisi3){
        int volume = sisi1*sisi2*sisi3;
        return volume;
    }
    public static double volumePrismaSegitiga(double panjang, double lebar, double tinggi){
        double volume = (panjang*lebar*tinggi)/2;
        return volume;
    }
    public static double volumeKerucut(double r, double t){
        final double pi = 3.14;
        double volume = (r*r*t*pi)/3;
        return volume;
    }
}