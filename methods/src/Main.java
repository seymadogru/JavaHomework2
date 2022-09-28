public class Main {
    public static void main(String[] args){
        sayiBulmaca();
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 10;
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                varMi = true;
            }

        }
        String mesaj ="";
        if (varMi) {
            mesaj= "Sayı mevcuttur: " +aranacak;
            mesajVer(mesaj);
        } else {
            mesaj= "Sayı mevcuttur değildir: " +aranacak;
            mesajVer(mesaj);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}
