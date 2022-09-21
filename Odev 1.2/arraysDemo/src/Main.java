public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Mustafa";
        String ogrenci2 = "Berkecan";
        String ogrenci3 = "Engin";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Mustafa";
        ogrenciler[1]="Kemal";
        ogrenciler[2]="Tomris";
        ogrenciler[3]="Melis";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }

        System.out.println("-------------------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }
    }
}