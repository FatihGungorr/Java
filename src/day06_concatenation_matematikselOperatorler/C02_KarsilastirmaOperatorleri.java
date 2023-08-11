package day06_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {


        int a = 10;

        int b = 20;

        // Java'da tek = işareti karşılaştırma değil, atama işaretidir (asignment)

        b = 2 * a;


        //  Java'da eşitligi kontrol etmek istersek == kullanırız

        System.out.println(b == 2*a); // 20 == 20 ==> true

        // asignment'a eşitligin sol tarafında sadece variable bulunur
        // sol tarafta matematiksel işlem olmaz
        // karşılaştırma operatörlerinde iki tarafta da işlem olabilir

        System.out.println(2*b > 5*a); // 60 > 50 ==> true


        System.out.println(b >= b-a); // 20 >= 10 ==> true


        System.out.println(a <= b-a); // 10 <= 10 == true

        // Java'da karşılaştırma operatörlerinde kullanılan ! işareti
        // boolean degeri tersine çevirir.

        System.out.println(a < b); // sonuç : true

        System.out.println(  !   (a < b)); // ! true ==> false   ! İŞARETİ TERSİNE ÇEVİRİYOR

        System.out.println(a != b); // true           NOT : ! İŞARETİ TERSİNE ÇEVİRİYOR


    }
}
