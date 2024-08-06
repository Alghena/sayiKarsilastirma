import java.util.Scanner;

public class ornekk {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("1. sayıyı girin lütfen");
        int sayi1=scan.nextInt();
        System.out.println("2. sayıyı girin lütfen");
        int sayi2=scan.nextInt();
        System.out.println("3. sayıyı girin lütfen");
        int sayi3=scan.nextInt();
        int toplam =sayi1+sayi2+sayi3;
        System.out.println(" sayıların toplamı: "+ toplam);

    }
}
