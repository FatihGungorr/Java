package day03_scanner;

public class C01_NamingConvention {

    public static void main(String[] args) {

        // Java case sensitive(büyük kücük harf duyarlı'dır.
        int sayi = 10;

        // int sayi = 20;
        // long sayi = 345;

        int Sayi = 25;
        int SAYI = 23;
        int sAYi = 45;

        System.out.println(sAYi); // 45
        System.out.println(SAYI); // 23

        // Variable isimleri küçük harfle başlar
        // büyük harfle başlarsanız Java kabul eder
        // ancak geneel kullanıma aykırıdır


        // int sa yi = 34;   Bu olmaz
        // int sa&yi = 45; Bunuda kabul etmez

        int say_i = 34;
        int sayi12345 = 12345;
        int sa$yi = 21;
        // int sa.yi = 65;

        // $ ve _ isimde kullanılabilir ama ilk harf olarak kullanılması
        // noming convention'a uygun değildir.
        int _sayi = 75;
        int $sayi = 87;
        // int 45sayi = 67;

        // birden fazla keilimeden oluşan bir isim varsa camelCase kullanılır
        int sinifinEnYuksekNotu = 99;
        int maxSayi = 23;





    }
}
