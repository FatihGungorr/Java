package day05_matematikselıslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {


        // Kullanıcıdan 3 basamaklı bir sayı alıp
        // sayının rakamlarını toplayıp, yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        // ilk sayı için birler basamagını bulalım

        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        // birler basamagındaki sayıyı aldıki, artık ondan kurtulalım
        girilenSayi = girilenSayi / 10 ;

        // Bu satıra geldigimizde girilen sayıyı 2 basmaklı hale dönüştürdük

        birlerBasamagi = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;


        // buraya geldigimzde artık sayımız tek basamaklı

        birlerBasamagi = girilenSayi % 10;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        System.out.println("Rakamlar toplamı : " + rakamlarToplami);
    }
}
