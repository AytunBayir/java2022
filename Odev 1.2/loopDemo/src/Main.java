public class Main {
    public static void main(String[] args) {
        //for
        for (int i=2; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For Dongu Bitti");

        //while
        int i=1;
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Dongusu Bitti");

        //Do-While
        int j=100;
        do{
            System.out.println(j);
            j+=2;
        }while (j<10);
        System.out.println("Do-While Dongusu Bitti");
    }
}