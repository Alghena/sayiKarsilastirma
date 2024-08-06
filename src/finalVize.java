import java.util.Scanner;

public class finalVize {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("vize notunu gir");
        double vize=scan.nextDouble();
        System.out.println("final notunu gir");
        double fnal=scan.nextDouble();
        double ortalama=(vize*0.4)+(fnal*0.6);
        System.out.println("ortalamanız: " +ortalama);
        if (ortalama>=0 && ortalama<50){
            System.out.println("FF kaldınız" );
        } else if (ortalama>=50 && ortalama<70) {
            System.out.println("CB ile geçtiniz");

        } else if (ortalama>=70 && ortalama<80) {
            System.out.println("BB ile geçtiniz");

        } else if (ortalama>=80 && ortalama<90 ) {
            System.out.println("BA ile geçtiniz");

        }  if (ortalama>=90&&ortalama<=100) {
            System.out.println("AA ile geçtiniz");
        }

     }


    }
