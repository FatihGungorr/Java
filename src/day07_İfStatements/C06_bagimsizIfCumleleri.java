package day07_İfStatements;

import java.util.Scanner;

public class C06_bagimsizIfCumleleri {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tam sayı isteyin
        // sayı 3 veya 5 ile bölünebiliyorsa
        // "Güzel sayı" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 || girilenSayi % 5 == 0) System.out.println("Güzel sayı");

    }
}