public class Main {
    public static void main(String[] args) {
        //220-284
        int number1 = 220;
        int number2 = 284;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < number1; i++) {
            int reminder = number1 % i;
            if (reminder == 0) {
                total1 = total1 + i;
            }
        }
        for (int i = 1; i < number2; i++) {
            int reminder = number2 % i;
            if (reminder == 0) {
                total2 = total2 + i;
            }
        }
        if (total1 == number2 & total2 == number1)  {
            System.out.println("Arkadas sayilar");
        } else {
            System.out.println("Arkadas sayi degiller");
        }

        /*Alternatif
        //Eğitmenin cevabı

        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;

        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0)
                toplam1=toplam1+i;
        }
        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0)
                toplam2=toplam2+i;
        }
        if(sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Bu iki sayi arkadastir");
        }else{
            System.out.println("Bu iki sayi arkadas değildir");
        }*/
    }
}