package miniprojeler;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = klavye.nextInt();
        boolean asal = true;

        if (sayi <= 1) {
            System.out.println("sayı asal değildir");
        }
        else {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                }
            }
            if (asal) {
                System.out.println("Sayı asaldır");
            } else {
                System.out.println("sayı asal değildir");
            }
        }
    }
}