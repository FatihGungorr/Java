package day07_İfStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // Soru 3- Kullanıcıdan bir tamsayı alın,
        //         sayi 3 ile bolunuyorsa "Üç ile bölünebilen sayı",
        //         5 ile bölünebibliyorsa "Beş ile bölünebilen sayı" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0){
            System.out.println("3 ile bölünebilen tamsayı");
        }

        if (girilenSayi % 5 == 0){
            System.out.println("5 ile bölünebilen sayı");
        }
    }
}
