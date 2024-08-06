import java.util.Scanner;

public class pozitifNegatif {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen sayı girin");
        int sayi=scan.nextInt();

        if (sayi>0){
            System.out.println("sayı pozitiftir");
        } else if (sayi==0) {
            System.out.println("sayı ne negatif ne pozitif");

        }else
            System.out.println("sayı negatiftir");
    }
}
