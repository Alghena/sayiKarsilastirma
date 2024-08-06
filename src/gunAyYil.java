import java.util.Scanner;

public class gunAyYil {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("günü gir");
        int gun=scan.nextInt();
        System.out.println("ayı gir");
        int ay=scan.nextInt();
        System.out.println("yılı gir");
        int yil =scan.nextInt();
        switch (gun) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;

        }
        switch (ay) {
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("şubat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayıs");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("ağustos");
                break;
            case 9:
                System.out.println("eylül");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasım");
                break;
            case 12:
                System.out.println("aralık");
                break;

        }
        switch (yil) {
            case 1:
                System.out.println("1998");
                break;
            case 2:
                System.out.println("1999");
                break;
            case 3:
                System.out.println("2000");
                break;
            case 4:
                System.out.println("2001");
                break;
            case 5:
                System.out.println("2002");
                break;
            case 6:
                System.out.println("2003");
                break;}
    }
}
