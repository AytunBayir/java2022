public class Main {
    public static void main(String[] args) {

        int sayi1 = 25;
        int sayi2 = 25;
        int sayi3 = 2;

        String sayi = "Buyuk sayi: ";
        int buyuksayi ;


        if (sayi1 > sayi2) {
            buyuksayi = sayi1;
        }
        else if (sayi2 > sayi3) {
            buyuksayi = sayi2;
        }
        else{
            buyuksayi = sayi3;
        }
        System.out.println(sayi + buyuksayi);
    }
}