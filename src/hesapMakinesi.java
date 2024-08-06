import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı1 gir: ");
        double sayi1=scan.nextInt();
        System.out.println("sayı2 gir");
        double sayi2=scan.nextInt();
        System.out.println("işlemler");
        System.out.println("1.toplama");
        System.out.println("2.çıkarma");
        System.out.println("3.çarpma");
        System.out.println("4.bölme");
        System.out.println("istediğin işlemi seç");
        int secim=scan.nextInt();
        if (secim ==1) {
            System.out.println("toplama işlemi seçtiniz"+(sayi1+sayi2));

        } else if (secim==2) {
            System.out.println("çıkarma işlemi seçtiniz" + (sayi1 - sayi2));
        } else if (secim==3) {
            System.out.println("çarpma işlemi seçtiniz"+(sayi1*sayi2));

        } else if (secim==4) {
            System.out.println("bölme işlemi seçtiniz"+(sayi1/sayi2));


        }


    }
}
