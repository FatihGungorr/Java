package day08_IfElseStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatement {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek , K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        /*
                Birden fazla degişken varsa
                içlerinden birini birincil degişken olarak alıp
                sadece ana göre bir if - else if - else kuralım

         */

        if (cinsiyet == 'E') {

            if (yas < 0 || yas > 100) {   // 0 - dan küçükse veya işareti ( || )  100 den büyükse Geçersiz yaş girdiniz
                System.out.println("Geçersiz yaş girdiniz");
            } else if (yas >= 65) {       // 65 yaşından büyükse - Erkek emekli olabilir
                System.out.println("Erkek emekli olabilir");
            } else {                      // 65 YAŞINDAN  büyük değilse alttaki kod geçerli olucaktır
                System.out.println("emekli olmak için daha " + (65 - yas) + " yıl çalışmalısınız");
            }

        } else if (cinsiyet == 'K') {

            if (yas < 10 || yas > 80) {
                System.out.println("Geçersiz yaş girdiniz");
            } else if (yas >= 60) {
                System.out.println("Kadın emekli olabilir");
            } else {
                System.out.println("emekli olmak için daha " + (60 - yas) + " yıl çalışmalısınız");
            }

        } else {
            System.out.println("Cinsiyet hatalı girildi");

        }

    }
}


