package day07_İfStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {
        /*
            Bagımsız if cümleleri
            ismindende anlaşılacagı üzere
            kodun kalanı ile ilgilenmez

            sadece boolean sarta odaklanır
            şartın sonucu true ise if body'si çalışır
            boolean şartın sonucu false ise
            if body'si devreye girmez

            YANİİİ

            birden fzla bagımsız if cümlesi olanbir kod çalıştıgında
            kaç tane if body'sinin çalışacaga verilen degerlere bağlıdır

            Tüm if body'leri çalışabilir
            bazları çalışabilir
            ya da hiç bir if body'si çalışmayabilir

         */

        int a = -201;
        int b = 104;

        if (a>0){ // Sonuç : false
            System.out.println("a sayısı pozitif");
        }

        if (a+b>100){ // Sonuç : false
            System.out.println("sayıların toplamı 100'den büyük");
        }

        if (b % 3 == 0){ // Sonuç : false
            System.out.println("b 3 ile tam bölünen bir tamsayıdır");
        }

        if (b<100){ // Sonuç : false
            System.out.println("b 100'den küçük bir tamsayıdır");
        }
    }
}
