package day08_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {
       // Ögrenciden notunu isteyen ve harf olarak başarı notunu yazdırın
       // Ögrencinin notu 85 ve üstü ise AA,
       //(85 ve üstü değilse) 65 ve üstü ise BB,
       //(65 ve üstü de değilse) 50 ve üstü ise CC,
       //(geriye kalanlar) DD

       /*
            Bir if - else if - else... statement else ile bitmek zorunda değildir.
            else ile biten kodlar, her durum için mutlaka bir sonuç üretirler
            else ile bitmezse tüm durumları kapsamaz
            yani bazı degerler için sonuç üretmeyebilir
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not>=85){
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }
    }
}
