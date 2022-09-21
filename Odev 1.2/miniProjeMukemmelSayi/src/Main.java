public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        int number = 496;

        for (int i = 1; i < number; i++) {
            int reminder = number % i;
            if (reminder == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == number) {
            System.out.println("Sayi mukemmel");
        } else {
            System.out.println("Sayi mukemmel degil");
        }
    }
}