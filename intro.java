public class intro{
    public static void main(String[] args){//menjalankan prosedur
        hitungLuasSegitiga(15, 4);
        hitungLuasSegitiga(2, 5);
        hitungLuasLingkaran(6);
    }
    //membuat prosedur
    public static void hitungLuasSegitiga(int alas, int tinggi){//ini adalah prosedur alas dan tinggi adalah parameter
        double luas = (alas*tinggi)/2;
        System.out.println(luas);
    }
    public static double hitungLuasLingkaran(double r){//ini adalah function
        final double pi = 3.14;
        double luas = r*r*pi;
        return luas;
    }
}