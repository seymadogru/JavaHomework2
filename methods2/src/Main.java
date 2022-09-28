public class Main {
    public static void main(String[] args){
        String yeniMesaj = sehirVer();
        int toplananSayi = topla(5,7);
        System.out.println(toplananSayi);
        int toplam = topla(2,7,8);
        System.out.println(toplam);
    }
    public static void ekle(){
        System.out.println("Eklendi.");
    }
    public static void sil(){
        System.out.println("Silindi.");
    }
    public static void guncelle(){
        System.out.println("Güncellendi.");
    }
    public static int topla(int sayi1, int sayi2){  //bu fonksiyon int tipinde bir değer return eder.
        return sayi1+sayi2;
    }
    public static int topla(int... sayilar){
        int toplam=0;
        for (int sayi: sayilar){
            toplam+=sayi;

        }
        return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
