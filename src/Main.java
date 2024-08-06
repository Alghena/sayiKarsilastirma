import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Birici sayıyı gir: ");
        int sayi1=scan.nextInt();
        Scanner scann=new Scanner(System.in);
        System.out.println("İkinci sayıyı gir: ");
        int sayi2=scann.nextInt();
        if (sayi1>sayi2){
            System.out.println("birici sayı daha büyük");
    }
        else System.out.println("ikinci sayi daha büyük");

    }
}