package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        // Kullanıcıdan bir tamsayı alıp, karesini yazdırın

        // Scanner ile kullanıcıdan bir bilgiyi 3 adımda alabiliriz
        // 1.adım : scanner objesi oluşturmak

       Scanner scanner = new Scanner(System.in);

        // 2.adım : Kullanıcıya ne istediginizi söyleyin
        System.out.println("Lütfen bir tamsayı giriniz");

        // 3.adım istediginiz datanın türüne uygun bir variable oluşturun
        //        ve scanner objesini kullanarak uygun method'la
        //        kullanıcının girdigi degeri alın

        int girilenSayi = scanner.nextInt();

        // artık kullanıcının girdigi sayı kod ortamımıza kaydedildi
        // bu variable ile istedigimiz şekilde kullanabiliriz

        System.out.println("Girilen sayının karesi : " +girilenSayi*girilenSayi);




    }
}

