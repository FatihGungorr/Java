package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Soru 6- Kullanicidan bir cemberin yaricapini alip,
        //         cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz : ");

        double yaricap = scanner.nextDouble();

        System.out.println("Çemberin çevresi : " + 2 * 3.14*yaricap);

        System.out.println("Dairenin alanı : " + 3.14*yaricap*yaricap);



    }
}