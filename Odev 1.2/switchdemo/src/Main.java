public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch(grade){
            case 'A' :
                System.out.println("Mukemmel gectiniz");
                break;
            case 'B' :
                System.out.println("Cok guzel gectiniz");
                break;
            case 'C' :
                System.out.println("Hadi yine iyi gectiniz");
                break;
            case 'D' :
                System.out.println("Az kalsin kaliyordunuz");
                break;
            case 'F' :
                System.out.println("Maalesef kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}

            //ctrl+shfit+altL ile kodu düzenler