public class intro{
    public static void main(String[] args){//menjalankan prosedur
        intro2.hitungLuasSegitiga(15, 4);
        intro2.hitungLuasSegitiga(2, 5);
        intro2.System.out.println(hitungLuasLingkaran(6));
    }
}
class intro2{
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
}