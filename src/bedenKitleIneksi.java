import java.util.Scanner;

public class bedenKitleIneksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu girin lütfen:");
        double boy=scan.nextDouble();
        System.out.println("kionuzu girin lütfen:");
        double kilo=scan.nextDouble();

        double kitleIndeksi=(kilo/Math.pow(boy,2));
        if (kitleIndeksi<18){
            System.out.println("zayıf");
        } else if (kitleIndeksi<25) {
            System.out.println("normal");

        }else System.out.println("obez");


    }
}
