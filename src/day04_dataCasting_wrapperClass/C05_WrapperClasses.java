package day04_dataCasting_wrapperClass;

public class C05_WrapperClasses {

    public static void main(String[] args) {


        String str = "Java Candir";

        System.out.println(str.charAt(3)); // Sonuç a

        int sayi = 20;

        /*
            Java primitive data türleri için hazır metot oluşturamaz
            ANCAK
            Primitive data türleri için de hazır metotlar kullanabilecek
            Wrapper class'lar oluşturmuştur

            int ==> Integer
            char ==> Character

            short ==> Short
            double ==> Double ....

            Wrapper Class'lar primitive data türleri ile hiç problemsiz atama yapılabilir
         */

        int sayi2 = 5;

        Integer sayi3 = sayi2;
        int sayi4 = sayi3;

        System.out.println(Integer.MIN_VALUE); // Sonuç  -2147483648
        System.out.println(Integer.MAX_VALUE); // Sonuç   2147483647

        // Short sayi5 = (Short)sayi3; Wrapper Class'lar arasında casting OLMAZ

        System.out.println(Short.MIN_VALUE); // Sonuç -32768

        // İçinde sadece sayısal ifadeler bulunan bir String verildiginde
        // Matematiksel işlem yapmanız gerekirse
        // Integer.parseInt() ile int'a çevirebilirsiniz

        String str1 = "22";
        String str2 = "33";

        // Bu degerleri toplayip yazdırın

        System.out.println(str1 + str2); // Sonuç 2233

        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2)); // Sonuç 55

        char ch1 = '7';

        System.out.println(Character.isDigit(ch1)); // Sonuç True yani Doğru
        System.out.println(Character.isLetter(ch1)); // Sonuç False yani yanlış
        System.out.println(Character.isWhitespace(ch1)); // Sonuç False yani yanlış





    }
}
