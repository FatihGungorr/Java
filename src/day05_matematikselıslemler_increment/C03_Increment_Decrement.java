package day05_matematikselıslemler_increment;

public class C03_Increment_Decrement {

    public static void main(String[] args) {


      int sayi = 10;

      // sayı variable'nin degerini 2 katının 5 fazlası yapın


      sayi = 2 * sayi + 5;

      System.out.println(sayi);

      // 2 yöntemle yaparsak

        sayi = 10;
        sayi *= 2;
        sayi += 5;

        System.out.println(sayi);

        sayi = 10;

        sayi *= 3;  // sayi = 30

        sayi -= 3;  // sayi = 27

        sayi /= 3;  // sayi = 9

        System.out.println(sayi);

        int a = 10;
        // a'nın degerini yeni oluşturdugumuz b'ye atayıp, sonra a'nın degerini bir arttırın
        // a ve b'yi yazdırın

        int b = a;
        a ++;

        System.out.println("a : " + a + " b : " + b); // Sonuç  a : 11 b : 10

        a= b;

        // a'nın degerini bir arttırın, sonra a'nın degerini b'ye atayın

        a++;

        b = a;

        System.out.println("a : " + a + " b : " + b); // Sonuç a : 11 b : 11


    }
}
