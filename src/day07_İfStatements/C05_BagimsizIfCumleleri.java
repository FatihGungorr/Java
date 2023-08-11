package day07_İfStatements;

import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //Soru 4- Kullanıcıdan bir üçgenin 3 kenar uzunlugunu alın,
        //        üçgen eşkenar ise "Eşkenar üçken" yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        /*
            java'da 3'lü karşılaştırma OLMAZ
            ikili karşılaştırmalar yapıp
            && veya or operatörleri ile birleştirmeliyiz
         */

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0){

            System.out.println("Eşkenar üçken");

        }
    }
}
