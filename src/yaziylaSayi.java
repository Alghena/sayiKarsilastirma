import java.util.Scanner;

public class yaziylaSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yazılması istediğiniz iki basamaklı sayıyı giriniz: ");
        int sayi=scan.nextInt();

        int onlar=sayi/10;
        int birler=sayi%10;

        switch (onlar){
            case 1:
                System.out.println("0n");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;
            case 6:
                System.out.println("altmış");
                break;
            case 7:
                System.out.println("yetmiş");
                break;
            case 8:
                System.out.println("seksen");
                break;
            case 9:
                System.out.println("doksan");
                break;
        }
        switch (birler){
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("dokuz");
                break;
            case 9:
                System.out.println("doksan");
                break;

        }



    }
}
