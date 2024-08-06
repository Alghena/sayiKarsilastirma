import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        int tutar;
        System.out.println("bakiyeniz= "+bakiye);
        System.out.println("işlemler:");
        System.out.println("1.para yatırma");
        System.out.println("2.para cekme");
        System.out.println("3.bakiye sorgulama");
        System.out.println("4.kart iadesi");
        System.out.println("işlemi seçiniz");
        int islem= scan.nextInt();
        switch (islem){
            case 1:
                System.out.println("bakiyeniz= "+bakiye);

                System.out.println("istediğin miktarı koy");
                tutar=scan.nextInt();
                bakiye+=tutar;
                System.out.println("yeni bakiyeniz= "+bakiye);
                System.out.println("kartınızı almayı unutmayın");
                break;
            case 2:
                System.out.println("bakiyeniz= "+bakiye);

                System.out.println("istediğin miktarı al");
                tutar=scan.nextInt();
                if (tutar>1000){
                    System.out.println("yetersiz bakiye");
                }
                bakiye-=tutar;
                System.out.println("yeni bakiyeniz= "+bakiye);
                break;
            case 3:
                System.out.println(bakiye);
                break;
            case 4:
                System.out.println("kartınızı almayı unutmayın");
                break;


    }
 }
}
