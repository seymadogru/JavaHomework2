public class Main {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;  //artık customerManager da, customerManager2 de aynı adresi(cm2'nin) gösteriyor.

        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();

        //value type
        int sayi = 10;
        int sayi2 = 20;
        sayi2= sayi;
        sayi = 30;
        System.out.println(sayi2);

        //reference type
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }


}
