package orneksoru4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int toplam = 0;
        for (int i=0;i<35;i++){
            System.out.println("Lütfen maaşınızı giriniz");
            int maas = a.nextInt();
            toplam = toplam + maas;
        }
        System.out.println( "Toplam maaş :"+toplam);
    }
}
