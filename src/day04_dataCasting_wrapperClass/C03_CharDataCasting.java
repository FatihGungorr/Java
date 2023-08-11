package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {

    public static void main(String[] args) {

        /*
            char data türü özel bir data türüdür
            her ne kadar char data türü
            '' içerisinde sayı,harf,özel karakter alsa da
            ascii tablosundaki sayisal degerleride kullanabilir

            aynı şekilde
            char daha türündeki bir varaible'i
            matematiksel işlemde kullanırsanız
            ascii tablosundaki degeri ile matematiksel işleme girer

         */

        char ch1 = 'a';

        int sayi1 = ch1;

        System.out.println("ch1 : " + ch1); // Sonuç  c
        System.out.println("sayi1 : " + sayi1); // Sonuç  67

        String str1 = "Java";
        String str2 = " ";
        String str3 = "Candir";

        System.out.println(str1 + str2 + str3); // Sonuç  Java Candir

        char ch2 = 'a';
        char ch3 = 'b';

        System.out.println(ch2 + ch3); // Sonuç  97 + 98 = 195

        // verilen int bir sayının ascii tablosundaki char karşılıgını yazdırın

        int karakter = 97;
        char asciDegeri = (char)karakter;

        System.out.println("Verilen sayının ascii tablosundaki karşılıgı : " + asciDegeri);


    }
}
