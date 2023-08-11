package day07_İfStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        // kullanıcıdan notunu isteyin
        // 50 ve üzeri ise sınıfı geçtin
        // degilse malesef kaldın yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >= 50) System.out.println("Sınıfı geçti");
        if (not < 50) System.out.println("Malesef kaldın");

        /*
            Eger bir şart için sadece 2 durum söz konusu ise
            iki durumu ayrı ayrı kontrol etmek yerine
            tek bir kontrol ile yapabiliriz

            Bagımsız if cümlelerinden farklı olarak
            if else cümlelerinde
            ya if body'si, ya else body'si calışır

            İKİSİNİN BİRDEN çalışması mümkün olmadıgı gibi,
            İKİSİNİN DE ÇALIŞMAMASI mümkün değildir.
         */

        if (not >= 50) {
            System.out.println("Sınıfı geçtin");
        } else {
            System.out.println("Malesef kaldın");
        }
    }
}
