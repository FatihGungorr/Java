package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {

    public static void main(String[] args) {

        // Kullanıcıdan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdırın
        // Örnek : input : a olursa output : b,c,d


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ascii tablosundan bir karakter giriniz");

        char girilenKrk = scanner.next().charAt(0);
        // scanner.nextChar() method'u olmadıgından
        // önce .next() ile String olarak alıp, sonra o String'in ilk karakterini alalım

        System.out.println("Girilen karakter : " + girilenKrk);
        System.out.println("Girilen karakter'den sonraki 3 karakter : " +
                (char)(girilenKrk+1) + ", "+
                (char)(girilenKrk+2) + ", "+
                (char)(girilenKrk+3));


    }
}
