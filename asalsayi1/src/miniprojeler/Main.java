package miniprojeler;
import java.util.Scanner;
public class Main {
    public static boolean asalmi (int sayi) {

        for (int i =2;i<sayi;i++){

            if (sayi%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = input.nextInt();
        for (int i = 2;i<sayi;i++){

            if (asalmi(i)){
                System.out.println(i);
            }
        }

    }
}
