import java.util.Scanner; //Untuk Scan harus tambhahkan java.util.scanner

public class loopingWhile{
    public static void main(String[] args){
        //Membuat Input Scanner
        boolean runApp = true;//Status aplikasi sedang running
        while(runApp == true){
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih 1 untuk running aplikasi : ");
            System.out.println("Pilih 2 untuk lanjut running aplikasi : ");
            System.out.println("Pilih 3 untuk stop aplikasi");
            int x = input.nextInt();
            switch(x){
                case 1:
                System.out.println("Kamu Pilih 1");
                break;
                case 2:
                System.out.println("Kamu Pilih 2");
                break;
                default:
                runApp = false;
                break;
            }
        }
    }
}