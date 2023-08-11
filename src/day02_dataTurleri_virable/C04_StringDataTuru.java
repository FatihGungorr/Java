package day02_dataTurleri_virable;

public class C04_StringDataTuru {

    public static void main(String[] args) {

        int sayi= 20;

        System.out.println(sayi);

        String isim = "Berk Yılmaz";

        System.out.println(isim.toUpperCase()); // Yazılan Berk yılmazı büyük harflere çevirdi
        System.out.println(isim.toLowerCase()); // Buda küçük harflerle berk yılmaz yazdı

        System.out.println(isim);

        String str1 = "Java";
        String str2 = "Candir";

        System.out.println(str1 + str2);
        // iki tane string + işareti ile toplanmaya çalışırsa
        // Java o iki String'i BİRLEŞTİRİR
        // JavaCandir Eger boşluk bırakmak isterseniz
        // Üst kısımda Javanın sonuna veya Candir başına boşluk bırakabiliriz

        String str3 = "30";
        String str4 = "40";

        System.out.println(str3 + str4);  // Sonuç : 3040 yapar
        // iki tane string + işareti ile toplanmaya çalışırsa ne yazarsanız yazın BİRLEŞTİRİR


        // Verilen isim ve soyismi
        // Girilen Ramazan Tatar database'e kaydedildi
        // Şeklinde yazdırın

        String adi = "Ramazan";
        String soyadi = "Tatar";

        // Ramazan variable dan gelicek yani adi kısmı
        // Tatar variable dan gelicek yani soyadi kısmı
        // Geriye kalanlar açıklama cümleleri

        // Girilen boşluktan sonra isim gelcek yani adi - adi 1 variable oldugu için " " içine almıyorum
        // Adi dan sonra arada bir boşluk var bizimde o boşlugu eklememiz lazım çift tırnak içinde 1 boşluk
        // Tatar yerine soyadi gelcek yani açıklama " data base'e kaydedildi"

        System.out.println("Girilen " + adi + " " + soyadi +" database'e kaydedildi");

        // " " arasindaki boşuklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birikilan bosluklar metne yansımaz
        // System.out.println("Girilen " + adi + " " + soyadi +" database'e kaydedildi");






    }
}
