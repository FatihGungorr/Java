package day06_concatenation_matematikselOperatorler;

public class C01_Concatenation {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Candir";
        String s3 = " ";
        String s4 = "";
        int a = 3;
        int b = 5;

        // sadece yukardaki variable'ları kullanarak
        // aşagıda verilen metin'leri yazdırın

        // Java35
        System.out.println(s1+a+b); // Sonuç : "Java35"

        // Java15                      // Sonuç Java15
        System.out.println(s1+ a*b);  // Çarpmanın işlem önceligi var o yüzden a*b parantez içine almamıza gerek yok

        // 8Candir
        System.out.println(a+b+s2); // Sonuç : 8Candir

        // 53Java
        System.out.println(b+ (a+s1)); // Sonuç : 53Java

        System.out.println(s4 + b + a + s1); //  "5" + 3 ==> "53"+ "Java ==> "53Java"

        System.out.println(b + s4 + a + s1);

        // 35 Java

        System.out.println(s4 + a + b + s3 + s1); // 35 Java

    }
}
