import java.util.Scanner;

public class alfabeMi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter girin");
        char karakter=scan.nextLine().charAt(0);
        if (karakter>='A'&& karakter<='Z'){
            System.out.println("büyük harf girdiniz");
        } else if (karakter>='a' && karakter<= 'z') {
            System.out.println("küçük harf girdiniz");
        } else if (karakter>='0'&& karakter<='9') {
            System.out.println("rakam girdiniz");

        }else System.out.println("özel karakter girdiniz");
    }
}
