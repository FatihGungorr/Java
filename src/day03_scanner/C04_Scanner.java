package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

       // Soru 3- Kullanicidan ismini, soyismini ve yasini alip
       //       asagidaki formmatta yazdirin.
       //       Isminiz : John
       //       Soyisminiz : Doe
       //       Yasiniz : 44
       //       Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isminizi yazınız : ");

        String girilenIsim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz : ");

        String girilenSoyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz : ");

        int girilenYas = scanner.nextInt();

        /*
        System.out.println("İsminiz : " + girilenIsim);
        System.out.println("Soyisminiz : "  + girilenSoyisim);
        System.out.println("Yaşınız : "  + girilenYas );
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");
        */

        // sout içerisindeki bir String'in yazdırılmasına
        // alt satırdan devam edilmesini istersiniz
        // String'in alt satıra geçmesini istediginiz kısmın başına \n yazın
        System.out.println("Isminiz : " + girilenIsim +
                        "\nSoyisminiz : " +  girilenSoyisim +
                        "\nYaşınız : " + girilenYas +
                        "\nKaydınız başarıyla tamamlanmıştır.");



    }
}
