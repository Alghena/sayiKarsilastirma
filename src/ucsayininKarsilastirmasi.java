import java.util.Scanner;

public class ucsayininKarsilastirmasi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.sayiyi gir");
        int sayi1=scan.nextInt();
        System.out.println("2.sayıyı gir");
        int sayi2=scan.nextInt();
        System.out.println("3.sayıyı gir");
        int sayi3=scan.nextInt();
        if (sayi1>sayi2&&sayi1>sayi3){
            System.out.println("1.sayı en büyük");
        } else if (sayi2>sayi3&&sayi2>sayi1) {
            System.out.println("2.sayı en büyük");

        }else
            System.out.println("3.sayı en büyük");
    }
}
