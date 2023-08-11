package day03_scanner;

import java.util.Scanner;

public class C08_Swap {

    public static void main(String[] args) {

        // Kullanıcıdan iki sayıyı alıp, ücüncü bir degişken kullanmadan
        //              ikisinin degerlerini degiştirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz : ");

        int ilkSayi = scanner.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz : ");

        int ikinciSayi = scanner.nextInt();

        System.out.println("\nSonuç : Birinci sayının yeni degeri : " + (ilkSayi + ikinciSayi - ilkSayi));
        System.out.println("        İkinci sayının yeni degeri : " + (ikinciSayi + ilkSayi - ikinciSayi));


    }
}
