package day02_dataTurleri_virable;

public class C03_primitiveDataTurleri {

    public static void main(String[] args) {

        // 1- bolean : mantıksal degerler olan true ve false kabul eder
        // boolean sadece  true veya false atayabiliyoruz.
        // true (doğru)
        // false (yanlış)
        
        boolean bl1=true;
        boolean bl2=false;

        // char '' icinde yazılır ve sadece 1 karakter kabul eder
        char ch1 = 'a';
        char ch2 = '2';
        char ch3 = '/';
        char ch4 = ' ';


        // tam sayı kabul eden virable türleri
        // 3- byte, 4- short, 5- int, 6- long

        // türkiye'de şehir nüfüslarını tutmak istiyoruz
        // data turu aynı olan variale'ların degerleri ne olursa olsun
        // hafızada kapladıkları alan aynıdır.
        int nufus = 2834250;
        int nufusBilecik = 30000;

        // bir şehirdeki noter sayısını tutacagız
        short noterSayisiIstanbul = 456;


        float fl1 = 20f;
        float fl2 = 6f;

        float fl3 = fl1 / fl2;

        System.out.println(fl3); // 3,3333333

        double db1 = 20;
        double db2 = 6;
        double db3 = db1 / db2;

        System.out.println(db3); // 3.3333333333333335

        // double bolme islemlerinde 0,00000000000001 gibi bir hata yapabilir
        // 20 / 5 = 3,9999999999999999

        String str = "Hello World";

        System.out.println(str); // variable degerini ekrana yazdırdı : Hello World

        System.out.println("true ve false");

        System.out.println("str"); // çift tırnak içerisinde ne yazarsanız onu ekrana yazar

        // verilen iki sayiyi carpıp sonucu yazdırın

        int sayi1 = 10;
        int sayi2 = 20;


        System.out.println(sayi1*sayi2);
        System.out.println("Verilan iki sayinin çarpımı : " + sayi1*sayi2);
        // Açıklama kısmını " " içinde yazarız variable kısımlarını direk kendisini yazarız.
        // variable kısmı örnek + sayi1*sayi2
    }
}
