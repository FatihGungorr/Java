package day05_matematikselıslemler_increment;

public class C04_Preincrement_Postincrement {

    public static void main(String[] args) {

        //  Java'da bir önceki class'da yaptıgımız gibi
        // arttırma ve atama, veya arttırma veya yazdırma beraber olabilir

        int a = 20;

        int b = 10;

        System.out.println(b = 2 * a); // Sonuç 40

        System.out.println(a = b-5);


        a= 10;

        // önce a'nın degerini b'ye atayın, sonra a'yı arttırın

        b = a++;

        System.out.println("a : " + a + " b : " + b ); // a : 11b : 10

        a=10;
        // önce a'nın degerini bir arttırın, sonra a'nin degerini b'ye atayın

        b = ++a;

        System.out.println("a : " + a + " b : " + b ); // a : 11b : 11

        /*
               Bu kullanım sadece a++ a-- --a için geçerlidir

               burada ++ veya --'yi önce mi yoksa sonra mı kullanacagımıza
               bizden istenen duruma göre karar veririz

               arttırma önce ise +aa
               arttırma sonra ise a++

         */

        a= 20;

        System.out.println(a++);

        System.out.println(a);

        a= 20;

        System.out.println(--a);

        System.out.println(a);



    }
}
