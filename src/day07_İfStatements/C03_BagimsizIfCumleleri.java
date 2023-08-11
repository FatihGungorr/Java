package day07_İfStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // Soru 1- Kullanıcıdan bir pozitif tamsayı isteyin.
        //          sayıyı kontrol edip 5 ile bolünebiliyorsa "Sayı 5'in tam katı" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 5 == 0) System.out.println("Sayı 5'in tam katı");
    }
}
